import { Coin } from '@/modules/types';
import Link from 'next/link';
import { Router } from 'next/router';
import React, { FC } from 'react'

export interface Props {
    item: Coin;
}
  
const CoinCard:FC<Props> = ({item}:Props) => {
  const { market, tradePrice, timestamp } = item;
  return (
    <div>
      <p>코인명 : {market }</p>
      <p>코인거래금액:{tradePrice}</p>
      <p>거래시각:{ timestamp}</p>
    </div>
  )
}

export default CoinCard