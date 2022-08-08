package com.utosoftware.app.controllers;

import com.utosoftware.app.components.MessengerVo;
import com.utosoftware.app.entities.Setting;
import com.utosoftware.app.services.SettingService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/settings")
public class SettingController {
    private final SettingService settingService;

    @GetMapping("/save") public MessengerVo save(Setting setting) {
        return settingService.save(setting);
    }
    @GetMapping("/count") public MessengerVo count(){
        return settingService.count();
    }
    @GetMapping("/findAll") public List<Setting> findAll() {
        return settingService.findAll();
    }
    @GetMapping("/findById") public Optional<Setting> findById(Long settingid) {
        return settingService.findById(settingid);
    }
    @GetMapping("/delete") public MessengerVo delete(Setting setting) {
        return settingService.delete(setting);
    }
    @GetMapping("/existsById") public MessengerVo existsById(Long settingid) {
        return settingService.existsById(settingid);
    }
    @GetMapping("/findByAmount") public Optional<Setting> findByAmount(Long amount) {
        return settingService.findByAmount(amount);
    }
    @GetMapping("/findByProfitRatio") public  Optional<Setting> findByProfitRatio(Long profitRatio) {
        return settingService.findByProfitRatio(profitRatio);
    }
    @GetMapping("/findByLossRatio") public Optional<Setting> findByLossRatio(Long lossRatio){
        return settingService.findByLossRatio(lossRatio);
    }
}
