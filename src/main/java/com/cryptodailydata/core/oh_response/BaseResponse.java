package com.cryptodailydata.core.oh_response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @author serhat.akdeniz created at 9/7/2019
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class BaseResponse implements Serializable
{
    private int code = 200;
    private Message message;
}