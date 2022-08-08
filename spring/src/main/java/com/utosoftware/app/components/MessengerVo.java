package com.utosoftware.app.components;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Getter
@Builder
@Component
@NoArgsConstructor
@AllArgsConstructor
public class MessengerVo {
    private String message,code,token;
    private int status;
}
