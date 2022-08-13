import { createSlice } from "@reduxjs/toolkit";
import { CoinService } from "../services/CoinService";


const coinService = new CoinService()
const CoinSlice = createSlice(coinService.createCoinSlice());

export const {
    saveCoinRequest,
    saveCoinSuccess,
    saveCoinFailure,
    fetchCoinRequest,
    fetchCoinSuccess,
    fetchCoinFailure,
    getCoinRequest,
    getCoinSuccess,
    getCoinFailure
} = CoinSlice.actions;

const { reducer, actions } = CoinSlice;
export const CoinActions = actions;
export default reducer;