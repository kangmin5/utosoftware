import CoinAdd from '@/components/coins/CoinAdd'
import CoinList from '@/components/coins/CoinList'
import { saveCoinRequest } from '@/modules/slices/coinSlice'
import { Coin } from '@/modules/types'
import { NextPage } from 'next'
import Router from 'next/router'
import React, { useState } from 'react'
import { useDispatch } from 'react-redux'

const CoinAddPage: NextPage = () => {

    const [coinData, setCoinData] = useState<Coin>({ market: '', tradePrice: 0, timestamp: '' })
    const dispatch = useDispatch();
    const handleChange = (e: React.FormEvent<HTMLInputElement>) => {
      e.preventDefault()
      const {name, value} = e.currentTarget
      setCoinData({...coinData, [name]: value})
    }
    const handleSubmit = (e:React.FormEvent<HTMLFormElement>) => {
        e.preventDefault();
        dispatch(saveCoinRequest(coinData))
        Router.push('/coins/coinList')
    }
  return (
      <div>
      <CoinAdd handleChange={handleChange} handleSubmit={handleSubmit} />
      </div>
  )
}

export default CoinAddPage