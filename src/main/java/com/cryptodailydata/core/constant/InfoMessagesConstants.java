package com.cryptodailydata.core.constant;

import com.cryptodailydata.core.oh_response.Message;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "infomessages")
public class InfoMessagesConstants
{
    private Message iptalConfirm;
}
