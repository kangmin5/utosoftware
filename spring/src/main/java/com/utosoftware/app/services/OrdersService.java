package com.utosoftware.app.services;

import com.utosoftware.app.components.MessengerVo;
import com.utosoftware.app.entities.Orders;

import java.util.List;
import java.util.Optional;

public interface OrdersService {
    MessengerVo save(Orders orders);
    MessengerVo count();
    List<Orders> findAll();
    Optional<Orders> findById(Long ordersid);
    MessengerVo delete(Orders orders);
    MessengerVo existById(Long ordersid);

    Optional<Orders> findByTradeDateUtc(String tradeDateUtc); //체결일자
    Optional<Orders> findByTradeTimeUtc(String tradeTimeUtc); //체결시각
    Optional<Orders> findByTimeStamp(String timeStamp); //타임스탬프
    Optional<Orders> findByTradePrice(Long tradePrice); //체결가격
    Optional<Orders> findByTradeVolume(Long tradeVolume); //체결량
    Optional<Orders> findByAskBid(boolean askBid); //매도/매수
    Optional<Orders> findByOrderState(String orderState); //주문상태
}
