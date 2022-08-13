import { Coin } from '@/modules/types';
import Link from 'next/link';
import React, { FC } from 'react'

export interface Props {
  datas: Coin[];
}

const CoinList:FC<Props> = ({datas}:Props) => {
  return (
    <div>
      <table >
        <thead>
              <tr>
                <td>종목명</td>
                <td>거래금액(시세)</td>
                <td>타임스탬프</td>
            </tr>
        </thead>
        <tbody>
              { datas.map((data) =>
                <tr key={data.coinid}>
                  <td><Link href={`/coins/${data.coinid}`}><a>{data.market}</a></Link></td>
                  <td>{data.tradePrice}</td>
                  <td>{data.timestamp}</td>
                </tr>
              )}
        </tbody>
        </table>
    </div>
  )
}

export default CoinList