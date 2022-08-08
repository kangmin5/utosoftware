package com.utosoftware.app.serviceImpls;

import com.utosoftware.app.components.MessengerVo;
import com.utosoftware.app.entities.Orders;
import com.utosoftware.app.repositories.OrdersRepository;
import com.utosoftware.app.services.OrdersService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static com.utosoftware.app.filters.LambdaFilter.string;

@Service
@RequiredArgsConstructor
public class OrdersServiceImpl implements OrdersService {
    private final OrdersRepository ordersRepository;

    @Override
    public MessengerVo save(Orders orders) {
        ordersRepository.save(orders);
        MessengerVo messenger = new MessengerVo();
        return messenger.builder().message("SUCCESS").build() ;
    }

    @Override
    public MessengerVo count() {
        Long count = ordersRepository.count();
        MessengerVo messenger = new MessengerVo();
        return messenger.builder().message(string(count)).build();
    }

    @Override
    public List<Orders> findAll() {
        return ordersRepository.findAll();
    }

    @Override
    public Optional<Orders> findById(Long ordersid) {
        return ordersRepository.findById(ordersid);
    }

    @Override
    public MessengerVo delete(Orders orders) {
        ordersRepository.delete(orders);
        MessengerVo messenger = new MessengerVo();
        return messenger.builder().message("SUCESS").build();
    }

    @Override
    public MessengerVo existById(Long ordersid) {
        boolean exist = ordersRepository.existsById(ordersid);
        MessengerVo messenger = new MessengerVo();
        if(exist){
            messenger.builder().message("TRUE").build();
        }else{
            messenger.builder().message("FALSE").build();
        }
        return messenger;
    }

    @Override
    public Optional<Orders> findByTradeDateUtc(String tradeDateUtc) {
        return ordersRepository.findByTradeDateUtc(tradeDateUtc);
    }

    @Override
    public Optional<Orders> findByTradeTimeUtc(String tradeTimeUtc) {
        return ordersRepository.findByTradeTimeUtc(tradeTimeUtc);
    }

    @Override
    public Optional<Orders> findByTimeStamp(String timeStamp) {
        return ordersRepository.findByTimeStamp(timeStamp);
    }

    @Override
    public Optional<Orders> findByTradePrice(Long tradePrice) {
        return ordersRepository.findByTradePrice(tradePrice);
    }

    @Override
    public Optional<Orders> findByTradeVolume(Long tradeVolume) {
        return ordersRepository.findByTradeVolume(tradeVolume);
    }

    @Override
    public Optional<Orders> findByAskBid(boolean askBid) {
        return ordersRepository.findByAskBid(askBid);
    }

    @Override
    public Optional<Orders> findByOrderState(String orderState) {
        return ordersRepository.findByOrderState(orderState);
    }
}
