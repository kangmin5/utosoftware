package com.utosoftware.app.controllers;

import com.utosoftware.app.components.MessengerVo;
import com.utosoftware.app.entities.Coin;
import com.utosoftware.app.services.CoinService;
import com.utosoftware.app.types.CoinDto;
import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.lang.module.ResolvedModule;
import java.util.Date;
import java.util.List;
import java.util.Optional;
@CrossOrigin(origins = "*", allowedHeaders = "*")
@Api(tags = "coins")
@RestController
@RequiredArgsConstructor
@RequestMapping("/coins")
public class CoinController {
    private final CoinService coinService;


    @PostMapping("/save") @ResponseBody
    public void save(@RequestBody CoinDto coin){
        System.out.println(" ################### ");
        System.out.println("coin.toString() : "+coin.toString());  //에러 확인
        coinService.save(coin);
    }
    @GetMapping("/count") public MessengerVo count() {
        return coinService.count();
    }
    @GetMapping("/findAll") public List<Coin> findAll(){
        return coinService.findAll();
    }
    @GetMapping("/findById") public Optional<Coin> findById(Long coinid){
        return coinService.findById(coinid);
    }
    @GetMapping("/findByMarket") public Optional<Coin> findByMarket(String market){
        return coinService.findByMarket(market);
    }
    @GetMapping("/delete") public MessengerVo delete(Coin coin){
        return coinService.delete(coin);
    }
    @GetMapping("/existsById") public MessengerVo existsById(Long coinid){
        return coinService.existsById(coinid);
    }


//        ;
//
//        Optional<Coin> findByCandleDateTimeUtc(String candleDateTimeUtc);//캔들날짜세계협정시간
//        Optional<Coin> findByCandleDateTimeKst(String candleDateTimeKst);//캔들날짜한국표준시간
//        Optional<Coin> findByOpeningPrice(Double openingPrice);//오픈가격
//        Optional<Coin> findByHighPrice(Double highPrice);//높은가격
//        Optional<Coin> findByLowPrice(Double lowPrice);//낮은가격
//        Optional<Coin> findByTradePrice(Double tradePrice);//거래가격
//        Optional<Coin> findByChangePrice(Double changePrice);//변동가격
//        Optional<Coin> findByChangeRate(Double changeRate);//변동률
//        Optional<Coin> findByTimestamp(String timestamp);//타임스탬프
//        Optional<Coin> findByCandleAccTradePrice(Double candleAccTradePrice);//캔들어카운트거래가격
//        Optional<Coin> findByCandleAccTradeVolume(Double candleAccTradeVolume);//캔들어카운트거래량
//        Optional<Coin> findByPrevClosingPrice(Double prevClosingPrice);//전종가
//        Optional<Coin> findByUnit(Integer unit);//분단위유닛


}
