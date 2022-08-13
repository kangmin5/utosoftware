// import { Key } from "react";

export interface Coin {

    // id: Key | null | undefined;
    coinid?: number; //코인id
    market?: string; //코인이름
    candleDateTimeUtc?:string; //캔들날짜세계협정시간
    candleDateTimeKst?:string; //캔들날짜한국표준시간
    openingPrice?:number; //오픈가격
    highPrice?:number; //높은가격
    lowPrice?:number; //낮은가격
    tradePrice?:number; //거래가격(시세)
    changePrice?:number; //변동가격
    changeRate?:number; //변동률
    timestamp?:string; //타임스탬프
    candleAccTradePrice?:number; //캔들어카운트거래가격
    candleAccTradeVolume?:number; //캔들어카운트거래량
    prevClosingPrice?:number; //전종가
    unit?:number; //분단위유닛
}
export interface CoinState{
    data: Coin;
    status: "successed" | "loading" | "failed";
    error: null;
}
export interface Order {
    ordersid:number; //오더id
    tradeDateUtc:string; //체결일자
    tradeTimeUtc:string; //체결시각
    timeStamp:string; //타임스탬프
    tradePrice:number; //체결가격
    tradeVolume:number; //체결량
    askBid:boolean; //매도/매수
    orderState:string; //주문상태
}
export interface OrderState{
    data: Order;
    status: "successed" | "loading" | "failed";
    error: null;
}
export interface Setting  {
    settingid: number; //설정id
    amount: number; //투자금액
    profitRatio: number; //목표이익률
    lossRatio: number; //손해률
}
export interface SettingState{
    data: Setting;
    status: "successed" | "loading" | "failed";
    error: null;
}
export interface User  {
    userid:number;
    name:string;
    username:string;
    password:string;
    email:string;
    mobile:string;
    token:string;
    regDate:string;
}
export interface UserState{
    data: User;
    status: "successed" | "loading" | "failed";
    error: null;
}