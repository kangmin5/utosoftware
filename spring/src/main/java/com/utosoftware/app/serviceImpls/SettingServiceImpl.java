package com.utosoftware.app.serviceImpls;

import com.utosoftware.app.components.MessengerVo;
import com.utosoftware.app.entities.Setting;
import com.utosoftware.app.repositories.SettingRepository;
import com.utosoftware.app.services.SettingService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static com.utosoftware.app.filters.LambdaFilter.string;

@Service
@RequiredArgsConstructor
public class SettingServiceImpl implements SettingService {
    private final SettingRepository settingRepository;

    @Override
    public MessengerVo save(Setting setting) {
        settingRepository.save(setting);
        MessengerVo messenger = new MessengerVo();
        return messenger.builder().message("SUCCESS").build();
    }

    @Override
    public MessengerVo count() {
        Long count = settingRepository.count();
        MessengerVo messenger = new MessengerVo();
        return messenger.builder().message(string(count)).build();
    }

    @Override
    public List<Setting> findAll() {
        return settingRepository.findAll();
    }

    @Override
    public Optional<Setting> findById(Long settingid) {
        return settingRepository.findById(settingid);
    }

    @Override
    public MessengerVo delete(Setting setting) {
        settingRepository.delete(setting);
        MessengerVo messenger = new MessengerVo();
        return messenger.builder().message("SUCCESS").build();
    }

    @Override
    public MessengerVo existsById(Long settingid) {
        boolean exist = settingRepository.existsById(settingid);
        MessengerVo messenger = new MessengerVo();
        if(exist) {
            messenger.builder().message("TRUE").build();
        }else{
            messenger.builder().message("FALSE").build();
        }
        return messenger;
    }

    @Override
    public Optional<Setting> findByAmount(Long amount) {
        return settingRepository.findByAmount(amount);
    }

    @Override
    public Optional<Setting> findByProfitRatio(Long profitRatio) {
        return settingRepository.findByProfitRatio(profitRatio);
    }

    @Override
    public Optional<Setting> findByLossRatio(Long lossRatio) {
        return settingRepository.findByLossRatio(lossRatio);
    }
}
