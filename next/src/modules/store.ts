import { AnyAction, combineReducers, configureStore } from "@reduxjs/toolkit"
import logger from 'redux-logger'
import { HYDRATE } from "next-redux-wrapper"
import createSagaMiddleware from "redux-saga"
import coinReducer from './slices/CoinSlice'
import { TypedUseSelectorHook, useSelector } from "react-redux"
import { createWrapper } from 'next-redux-wrapper'
import rootSaga from "./sagas"

const isDev = process.env.NODE_ENV ==='development'
const sagaMiddleware = createSagaMiddleware()

const combinedReducer = combineReducers({
       
        coin: coinReducer,
        
})
const rootReducer = (
	state: ReturnType<typeof combinedReducer>,
    action: AnyAction
)  => {
    if(action.payload === HYDRATE) { 
        return{
            ...state, 
            ...action.payload 
        }
    } else {
    return combinedReducer(state,action)
    }
}
const makeStore = () =>{
    const store = configureStore({
        reducer:{ rootReducer },
        middleware: (getDefaultMiddleware) =>
        getDefaultMiddleware({serializableCheck: false})
            .prepend(sagaMiddleware)
            .concat(logger),
        devTools : isDev
    });
    
    sagaMiddleware.run(rootSaga)
   
    return store
}
const store = rootReducer; // makeStore() ==> rootReducer

export type AppState = ReturnType<typeof rootReducer>; 
export type AppDispatch = ReturnType<typeof store>["dispatch"]; 
export const useAppSelector: TypedUseSelectorHook<AppState> = useSelector;
export const wrapper = createWrapper(makeStore)
export default store;


