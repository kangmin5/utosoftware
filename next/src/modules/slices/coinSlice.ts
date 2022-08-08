import { createSlice } from "@reduxjs/toolkit";
import { CoinService } from "../services/coinService";


const coinService = new CoinService()
const coinSlice = createSlice(coinService.createCoinSlice());

export const {
    saveCoinRequest,
    saveCoinSuccess,
    saveCoinFailure,
    fetchCoinRequest,
    fetchCoinSuccess,
    fetchCoinFailure
} = coinSlice.actions

const { reducer, actions } = coinSlice;
export const coinActions = actions;
export default reducer;