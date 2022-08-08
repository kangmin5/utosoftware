package com.utosoftware.app.types;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class SettingDto {
    @ApiModelProperty(position = 1) private Long settingid;
    @ApiModelProperty(position = 2) private Long amount;
    @ApiModelProperty(position = 3) private Long profitRatio;
    @ApiModelProperty(position = 4) private Long lossRatio;

}
