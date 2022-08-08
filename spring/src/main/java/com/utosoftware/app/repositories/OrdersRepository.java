package com.utosoftware.app.repositories;

import com.utosoftware.app.entities.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface OrdersRepository extends JpaRepository<Orders,Long> {

    Optional<Orders> findByTradeDateUtc(String tradeDateUtc); //체결일자
    Optional<Orders> findByTradeTimeUtc(String tradeTimeUtc); //체결시각
    Optional<Orders> findByTimeStamp(String timeStamp); //타임스탬프
    Optional<Orders> findByTradePrice(Long tradePrice); //체결가격
    Optional<Orders> findByTradeVolume(Long tradeVolume); //체결량
    Optional<Orders> findByAskBid(boolean askBid); //매도/매수
    Optional<Orders> findByOrderState(String orderState); //주문상태


}
