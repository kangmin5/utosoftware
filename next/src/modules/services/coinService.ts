import { Coin, CoinState } from "../types";
import { createSlice, PayloadAction } from "@reduxjs/toolkit";

export class CoinService {
  public createCoinSlice() {
    const initialState: CoinState = {
      data: {
        coinid: 0, //코인id
        market: "", //코인이름
        candleDateTimeUtc: "", //캔들날짜세계협정시간
        candleDateTimeKst: "", //캔들날짜한국표준시간
        openingPrice: 0, //오픈가격
        highPrice: 0, //높은가격
        lowPrice:0, //낮은가격
        tradePrice:0, //거래가격(시세)
        changePrice:0, //변동가격
        changeRate:0, //변동률
        timestamp:"", //타임스탬프
        candleAccTradePrice:0, //캔들어카운트거래가격
        candleAccTradeVolume:0, //캔들어카운트거래량
        prevClosingPrice:0, //전종가
        unit:0 //분단위유닛
      },
      status: "loading",
      error: null,
    }; 
    return {
      name: "coinService",
      initialState,
      reducers: {
        saveCoinRequest: (state: any, action: PayloadAction<Coin>) => {
          alert(`코인 저장 액션 요청`);
          console.log(action);
          state.data = action.payload;
          state.status = "loading";
          console.log(
            `코인저장 Request ${JSON.stringify(state.data)}`
          );
        },
        saveCoinSuccess: (state: any, action: PayloadAction) => {
          console.log(`코인 저장 Success`);
          state.status = "successed";
        },
        saveCoinFailure: (state: any, action: PayloadAction) => {
          alert(`코인저장 실패`);
          state.status = "failed";
        },

        fetchCoinRequest: (state: any) => {
          console.log(`코인전체 불러오기 - 리듀서`);
          state.status = "loading";
        },
        fetchCoinSuccess: (state: any, { payload }: any) => {
          state.data = payload;
          state.status = "successed";
          console.log(
            `코인전체 불러오기 성공 - 리듀서 ${JSON.stringify(state.data)}`
          );
        },
        fetchCoinFailure: (state: any, { payload }: any) => {
          console.log(`코인전체 불러오기 실패 - 리듀서`);
          state.error = payload;
          state.status = "failed";
        },

        getCoinRequest: (state: any, action: PayloadAction<Coin>) => {
          state.data = action.payload;
          state.status = "loading";
          console.log(`getCoinRequest 성공+${state.data}`)
        },
        getCoinSuccess: (state: any, action:PayloadAction<Coin>) => {
          state.data = action.payload;
          state.status = "successed";
        },
        getCoinFailure: (state: any, action: PayloadAction<Coin>) => {
          state.error = action.payload;
          state.status = "failure";
        },

        deleteCoin: (state: any, action: PayloadAction<Coin>) => {
          console.log(`게시글 삭제하기 - 리듀서`);
          state.status = "loading";
          state.data = action.payload;
        },

      },
    };
  }
}