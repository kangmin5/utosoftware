package com.utosoftware.app.entities;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;


@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Setter
@Entity
@Table(name = "settings")
public class Setting {
    @Id
    @Column(name = "settingid")
    @GeneratedValue private Long settingid; //설정id
    @Column private @NotNull Long amount; //투자금액
    @Column private Long profitRatio; //목표이익률
    @Column private Long lossRatio; //손해률

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userid")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "coinid")
    private Coin coin;
}