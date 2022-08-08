package com.utosoftware.app.serviceImpls;

import com.utosoftware.app.components.MessengerVo;
import com.utosoftware.app.entities.Coin;
import com.utosoftware.app.repositories.CoinRepository;
import com.utosoftware.app.services.CoinService;
import com.utosoftware.app.types.CoinDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import static com.utosoftware.app.filters.LambdaFilter.string;

@Service
@RequiredArgsConstructor
public class CoinServiceImpl implements CoinService {
    private final CoinRepository repository;


    @Override
    public void save(CoinDto coinDto) {
            repository.save(Coin.builder()
                    .market(coinDto.getMarket())
                    .tradePrice(coinDto.getTradePrice())
                    .timestamp(coinDto.getTimestamp())
                    .build());

    }

    @Override
    public MessengerVo count() {
        Long count = repository.count();
        MessengerVo messenger = new MessengerVo();
        return messenger.builder().message(string(count)).build();
    }

    @Override
    public List<Coin> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Coin> findById(Long coinid) {

        return repository.findById(coinid);
    }

    @Override
    public Optional<Coin> findByMarket(String market) {

        return repository.findByMarket(market);
    }

    @Override
    public MessengerVo delete(Coin coin) {
        repository.delete(coin);
        MessengerVo messenger = new MessengerVo();
        return messenger.builder().message("SUCCESS").build();
    }

    @Override
    public MessengerVo existsById(Long coinid) {
        boolean exist = repository.existsById(coinid);
        MessengerVo messenger = new MessengerVo();
        if(exist){
            messenger.builder().message("TRUE").build();
        }else{
            messenger.builder().message("FALSE").build();
        }
        return messenger;
    }

    @Override
    public Optional<Coin> findByCandleDateTimeUtc(String candleDateTimeUtc) {
        return repository.findByCandleDateTimeUtc(candleDateTimeUtc);
    }

    @Override
    public Optional<Coin> findByCandleDateTimeKst(String candleDateTimeKst) {
        return repository.findByCandleDateTimeKst(candleDateTimeKst);
    }


    @Override
    public Optional<Coin> findByOpeningPrice(Double openingPrice) {
        return repository.findByOpeningPrice(openingPrice);
    }

    @Override
    public Optional<Coin> findByHighPrice(Double highPrice) {
        return repository.findByHighPrice(highPrice);
    }

    @Override
    public Optional<Coin> findByLowPrice(Double lowPrice) {
        return repository.findByLowPrice(lowPrice);
    }

    @Override
    public Optional<Coin> findByTradePrice(Double tradePrice) {
        return repository.findByTradePrice(tradePrice);
    }

    @Override
    public Optional<Coin> findByChangePrice(Double changePrice) {
        return repository.findByChangePrice(changePrice);
    }

    @Override
    public Optional<Coin> findByChangeRate(Double changeRate) {
        return repository.findByChangeRate(changeRate);
    }

    @Override
    public Optional<Coin> findByTimestamp(String timestamp) {
        return repository.findByTimestamp(timestamp);
    }

    @Override
    public Optional<Coin> findByCandleAccTradePrice(Double candleAccTradePrice) {
        return repository.findByCandleAccTradePrice(candleAccTradePrice);
    }

    @Override
    public Optional<Coin> findByCandleAccTradeVolume(Double candleAccTradeVolume) {
        return repository.findByCandleAccTradeVolume(candleAccTradeVolume);
    }

    @Override
    public Optional<Coin> findByPrevClosingPrice(Double prevClosingPrice) {
        return repository.findByPrevClosingPrice(prevClosingPrice);
    }

    @Override
    public Optional<Coin> findByUnit(Integer unit) {
        return repository.findByUnit(unit);
    }
}
