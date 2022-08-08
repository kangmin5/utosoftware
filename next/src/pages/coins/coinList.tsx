import CoinList from '@/components/coins/CoinList'
import { coinController } from '@/modules/controllers/coinController';
import { Coin } from '@/modules/types';
import { NextPage } from 'next';
import React, { useEffect, useState } from 'react'
import { useDispatch } from 'react-redux';

const CoinListPage:NextPage = () => {
  const dispatch = useDispatch()
  const [data, setData] = useState<Coin[]>([]);
  useEffect(() => {
    const coinApi = new coinController();
    coinApi.readList().then(response => {
      setData(response);
    })
  },[])

  return (
    <div>
      <CoinList datas={data}/>
    </div>
  )
}

export default CoinListPage