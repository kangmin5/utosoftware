import { call, put, takeLatest } from "redux-saga/effects";
import { CoinController } from "..";
import { CoinActions } from "../slices/CoinSlice";
import { Coin } from "../types";

function* fetchCoinSaga(action: { payload: any }) {
    const { fetchCoinSuccess, fetchCoinFailure } = CoinActions;
    try {
      yield call(action.payload);
      yield put(fetchCoinSuccess);
    } catch (error) {
      yield put(fetchCoinFailure)
    }
}

function* getCoinSaga(action: { payload: any }) {
  const { getCoinSuccess, getCoinFailure } = CoinActions;
  try {
     yield call(getCoin, action.payload);
    yield put(getCoinSuccess)
  } catch (err) {
    yield put(getCoinFailure)
  }
}
  
function* saveCoinSaga(action: { payload: Coin }) {
  const { saveCoinSuccess, saveCoinFailure } = CoinActions;
  const coinController = new CoinController();
  try {
    // alert(' >> saveCoinSaga >> 진입 ')
    yield call(coinController.saveCoin, action.payload); //controller(Api호출)
    yield put(saveCoinSuccess());
    
  } catch (error) {
    yield put(saveCoinFailure())
  }
}

export function* watchFetchCoinSaga() {
      yield takeLatest(CoinActions.fetchCoinRequest,fetchCoinSaga)
}
export function* watchSaveCoinSaga() {
      yield takeLatest(CoinActions.saveCoinRequest,saveCoinSaga)
}
export function* watchGetCoinSaga() {
    yield takeLatest(CoinActions.getCoinRequest, getCoinSaga)
}

function* getCoin(getCoin: any, payload: any) {
  throw new Error("Function not implemented.");
}
