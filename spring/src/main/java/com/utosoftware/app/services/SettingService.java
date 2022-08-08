package com.utosoftware.app.services;

import com.utosoftware.app.components.MessengerVo;
import com.utosoftware.app.entities.Setting;

import java.util.List;
import java.util.Optional;

public interface SettingService {
    MessengerVo save(Setting setting);
    MessengerVo count();
    List<Setting> findAll();
    Optional<Setting> findById(Long settingid);
    MessengerVo delete(Setting setting);
    MessengerVo existsById(Long settingid);

    Optional<Setting> findByAmount(Long amount); //투자금액
    Optional<Setting> findByProfitRatio(Long profitRatio); //목표이익률
    Optional<Setting> findByLossRatio(Long lossRatio); //손해률
}
