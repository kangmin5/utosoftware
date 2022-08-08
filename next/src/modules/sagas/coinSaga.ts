
import { call, put, takeLatest } from "redux-saga/effects";
import { coinController } from "../controllers/coinController";
import { coinActions } from "../slices/coinSlice";
import { Coin } from "../types";

function* fetchCoinSaga(action: { payload: any }) {
    const { fetchCoinSuccess, fetchCoinFailure } = coinActions;
    try {
      const response: Coin = yield call(action.payload);
      yield put(fetchCoinSuccess(response));
    } catch (error) {
      yield put(fetchCoinFailure(error))
    }
}
  
function* saveCoinSaga(action: { payload: Coin }) {
  const { saveCoinSuccess, saveCoinFailure } = coinActions;
  const coinSaga = new coinController();
  try {
    yield call(coinSaga.saveCoin, action.payload);
    yield put(saveCoinSuccess());
    
  } catch (error) {
    yield put(saveCoinFailure())
  }
}

export function* watchFetchCoinSaga() {
      yield takeLatest(coinActions.fetchCoinRequest,fetchCoinSaga)
}
export function* watchSaveCoinSaga() {
      yield takeLatest(coinActions.saveCoinRequest,saveCoinSaga)
}