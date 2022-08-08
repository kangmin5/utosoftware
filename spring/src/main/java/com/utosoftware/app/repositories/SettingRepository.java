package com.utosoftware.app.repositories;

import com.sun.istack.NotNull;
import com.utosoftware.app.entities.Setting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Column;
import java.util.Optional;

@Repository
public interface SettingRepository extends JpaRepository<Setting,Long> {

    Optional<Setting> findByAmount(Long amount); //투자금액
    Optional<Setting> findByProfitRatio(Long profitRatio); //목표이익률
    Optional<Setting> findByLossRatio(Long lossRatio); //손해률

}
