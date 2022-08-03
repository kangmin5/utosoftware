package com.utosoftware.app.entities;

import com.sun.istack.NotNull;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Setter
@Entity
@Table(name = "coins")
public class Coin {
    @Id @Column(name = "coinid")
    @GeneratedValue private long coinid; //코인id
    @Column private @NotNull String market; //코인이름
    @Column private @NotNull String candleDateTimeUtc; //캔들날짜세계협정시간
    @Column private @NotNull String candleDateTimeKst; //캔들날짜한국표준시간
    @Column private @NotNull Double openingPrice; //오픈가격
    @Column private @NotNull Double highPrice; //높은가격
    @Column private @NotNull Double lowPrice; //낮은가격
    @Column private @NotNull Double tradePrice; //거래가격(시세)
    @Column private @NotNull String changePrice; //변동가격
    @Column private @NotNull String changeRate; //변동률
    @Column private @NotNull Long timestamp; //타임스탬프
    @Column private @NotNull String candleAccTradePrice; //캔들어카운트거래가격
    @Column private @NotNull String candleAccTradeVolume; //캔들어카운트거래량
    @Column private @NotNull String prevClosingPrice; //전종가
    @Column private @NotNull Integer unit; //분단위유닛

    @OneToMany(mappedBy = "coin")
    List<Setting> settings = new ArrayList<>();

    @OneToMany(mappedBy = "coin")
    List<Orders> orders = new ArrayList<>();

}
