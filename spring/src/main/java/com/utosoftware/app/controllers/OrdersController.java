package com.utosoftware.app.controllers;

import com.utosoftware.app.components.MessengerVo;
import com.utosoftware.app.entities.Orders;
import com.utosoftware.app.services.OrdersService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/orders")
public class OrdersController {
    private final OrdersService ordersService;

    @GetMapping("/save") public MessengerVo save(Orders orders){
        return ordersService.save(orders);
    }
    @GetMapping("/count") public MessengerVo count(){
        return ordersService.count();
    }
    @GetMapping("/findAll") public List<Orders> findAll(){
        return ordersService.findAll();
    }
    @GetMapping("/findById") public  Optional<Orders> findById(Long ordersid){
        return ordersService.findById(ordersid);
    }
    @GetMapping("/delete") public MessengerVo delete(Orders orders){
        return ordersService.delete(orders);
    }
    @GetMapping("/existById") public MessengerVo existById(Long ordersid){
        return ordersService.existById(ordersid);
    }
    //체결일자
    @GetMapping("/findByTradeDateUtc") public Optional<Orders> findByTradeDateUtc(String tradeDateUtc){
        return ordersService.findByTradeDateUtc(tradeDateUtc);
    }
    //체결시간
    @GetMapping("/findByTradeTimeUtc") public Optional<Orders> findByTradeTimeUtc(String tradeTimeUtc){
        return ordersService.findByTradeTimeUtc(tradeTimeUtc);
    }
    //매도/매수
    @GetMapping("/findByAskBid") public Optional<Orders> findByAskBid(boolean askBid){
        return ordersService.findByAskBid(askBid);
    }
    //타임스탬프
    @GetMapping("/findByTimeStamp") public Optional<Orders> findByTimeStamp(String timeStamp){
        return ordersService.findByTimeStamp(timeStamp);
    }
    //체결가격
    @GetMapping("/findByTradePrice") public Optional<Orders> findByTradePrice(long tradePrice){
        return ordersService.findByTradePrice(tradePrice);
    }
    //체결량
    @GetMapping("/findByTradeVolume") public Optional<Orders> findByTradeVolume(long tradeVolume){
        return ordersService.findByTradeVolume(tradeVolume);
    }
    //주문상태
    @GetMapping("/findByOrderState") public Optional<Orders> findByOrderState(String orderState){
        return ordersService.findByOrderState(orderState);
    }
}
