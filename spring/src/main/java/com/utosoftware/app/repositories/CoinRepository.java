package com.utosoftware.app.repositories;

import com.sun.istack.NotNull;
import com.utosoftware.app.entities.Coin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Column;
import java.util.Date;
import java.util.Optional;

@Repository
public interface CoinRepository extends JpaRepository<Coin,Long> {

    Optional<Coin> findByMarket(String market);//코인이름
    Optional<Coin> findByCandleDateTimeUtc(String candleDateTimeUtc);//캔들날짜세계협정시간
    Optional<Coin> findByCandleDateTimeKst(String candleDateTimeKst);//캔들날짜한국표준시간
    Optional<Coin> findByOpeningPrice(Double openingPrice);//오픈가격
    Optional<Coin> findByHighPrice(Double highPrice);//높은가격
    Optional<Coin> findByLowPrice(Double lowPrice);//낮은가격
    Optional<Coin> findByTradePrice(Double tradePrice);//거래가격
    Optional<Coin> findByChangePrice(Double changePrice);//변동가격
    Optional<Coin> findByChangeRate(Double changeRate);//변동률
    Optional<Coin> findByTimestamp(String timestamp);//타임스탬프
    Optional<Coin> findByCandleAccTradePrice(Double candleAccTradePrice);//캔들어카운트거래가격
    Optional<Coin> findByCandleAccTradeVolume(Double candleAccTradeVolume);//캔들어카운트거래량
    Optional<Coin> findByPrevClosingPrice(Double prevClosingPrice);//전종가
    Optional<Coin> findByUnit(Integer unit);//분단위유닛


}
