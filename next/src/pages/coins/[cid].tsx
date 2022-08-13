import CoinCard from '@/components/coins/CoinCard'
import { getCoinRequest } from '@/modules/slices/CoinSlice'
import axios from 'axios'
import { NextPage } from 'next'
import { useRouter } from 'next/router'
import React, { useEffect, useState } from 'react'
import { useDispatch } from 'react-redux'

const CoinDetail:NextPage = () => {
  const router = useRouter()
  const { cid } = router.query
  const [item, SetItem] = useState({});
  
  const API_URL=`http://localhost:/8080/coins/findById/${cid}:number`
  function getData() {
    axios.get(API_URL).then((res) => {
      console.log(res.data)
    })
  }

  const dispatch = useDispatch()
  useEffect(() => {
    if (cid) {
      getData();
      // dispatch(getCoinRequest)
    }
  },[cid,dispatch])

  return (
      <div>
          <h3>상세페이지{ cid}</h3>
          <div>
        <CoinCard item={item} />
          </div>
    </div>
  )
}

export default CoinDetail;