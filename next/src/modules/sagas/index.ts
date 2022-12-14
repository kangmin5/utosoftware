import { all, fork } from 'redux-saga/effects';

import {
  watchFetchCoinSaga,
  watchSaveCoinSaga,
  watchGetCoinSaga
} from './coinSaga'


// rootSaga를 만들어줘서 store에 추가해주 어야 합니다.
export default function* rootSaga() {
  yield all([
    fork(watchFetchCoinSaga),
    fork(watchSaveCoinSaga),
    fork(watchGetCoinSaga)
  ]);
}