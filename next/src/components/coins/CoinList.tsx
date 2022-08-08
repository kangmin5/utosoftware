import { Coin } from '@/modules/types';
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
              { datas.map((data,idx) =>
                <tr key={idx}>
                  <td>{data.market}</td>
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