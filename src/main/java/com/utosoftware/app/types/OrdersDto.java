package com.utosoftware.app.types;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.stereotype.Component;


@Component @Data
public class OrdersDto {
    @ApiModelProperty(position = 1) private long ordersid;
    @ApiModelProperty(position = 2) String tradeDateUtc;
    @ApiModelProperty(position = 3) String tradeTimeUtc;
    @ApiModelProperty(position = 4) String timeStamp;
    @ApiModelProperty(position = 5) String tradePrice;
    @ApiModelProperty(position = 6) String tradeVolume;
    @ApiModelProperty(position = 7) String askBid;
    @ApiModelProperty(position = 8) String orderState;
}
