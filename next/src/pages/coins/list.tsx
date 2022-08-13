import CoinList from '@/components/coins/CoinList'
import { CoinController } from '@/modules/controllers/CoinController';
import { Coin } from '@/modules/types';
import { NextPage } from 'next';
import React, { useEffect, useState } from 'react'
import { useDispatch } from 'react-redux';

const ListPage:NextPage = () => {
  const dispatch = useDispatch()
  const [data, setData] = useState<Coin[]>([]);
  useEffect(() => {
    const coinApi = new CoinController();
    coinApi.readList().then(response => {
      setData(response);
    })
  },[])

  return (
    <div>
      <CoinList datas={data}  />
    </div>
  )
}

export default ListPage