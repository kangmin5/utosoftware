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
@Table(name = "orders")
public class Orders {
    @Id
    @Column(name = "ordersid")
    @GeneratedValue private Long ordersid; //오더id
    @Column private @NotNull String tradeDateUtc; //체결일자
    @Column private @NotNull String tradeTimeUtc; //체결시각
    @Column private @NotNull String timeStamp; //타임스탬프
    @Column private @NotNull Long tradePrice; //체결가격
    @Column private @NotNull Long tradeVolume; //체결량
    @Column private @NotNull Boolean askBid; //매도/매수
    @Column private @NotNull String orderState; //주문상태

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userid")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "coinid")
    private Coin coin;
}
