package com.utosoftware.app.entities;

import com.sun.istack.NotNull;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
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
    @GeneratedValue private Long coinid; //코인id
    @Column private @NotNull String market; //코인이름
    @Column private  String candleDateTimeUtc; //캔들날짜세계협정시간
    @Column private  String candleDateTimeKst; //캔들날짜한국표준시간
    @Column private  Double openingPrice; //오픈가격
    @Column private  Double highPrice; //높은가격
    @Column private  Double lowPrice; //낮은가격
    @Column private @NotNull String tradePrice; //거래가격(시세)
    @Column private  Double changePrice; //변동가격
    @Column private  Double changeRate; //변동률
    @Column private String timestamp; //타임스탬프
    @Column private  Double candleAccTradePrice; //캔들어카운트거래가격
    @Column private  Double candleAccTradeVolume; //캔들어카운트거래량
    @Column private  Double prevClosingPrice; //전종가
    @Column private  Integer unit; //분단위유닛

    @OneToMany(mappedBy = "coin")
    List<Setting> settings = new ArrayList<>();

    @OneToMany(mappedBy = "coin")
    List<Orders> orders = new ArrayList<>();

}
