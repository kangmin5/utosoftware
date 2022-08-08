import { Coin } from '@/modules/types';
import React, { FC, useState } from 'react'

type Props = {
  
    handleChange : (e: React.FormEvent<HTMLInputElement> | any ) => void
    handleSubmit : (e: React.FormEvent<HTMLFormElement> ) => void
  }

const CoinAdd: FC<Props> = ({ handleChange,handleSubmit }) => {

  return (
    <div>
        <div>
            <h2>코인추가</h2>
        </div>
        <form onSubmit={handleSubmit}>
            <input onChange={handleChange} type="text" name="market" placeholder='코인명'/>
            <input onChange={handleChange} type="number" name="tradePrice" placeholder='거래가격(시세)'/>
            <input onChange={handleChange} type="text" name="timestamp" placeholder='타임스탬프' />
            <button >코인추가</button>  
        </form>
    </div>
  )
}

export default CoinAdd