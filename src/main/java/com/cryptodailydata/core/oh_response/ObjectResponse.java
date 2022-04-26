package com.cryptodailydata.core.oh_response;


import com.cryptodailydata.core.IOHResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author huseyin.poyraz at 9/14/2019
 */

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Component
@Qualifier("ohObjectResp")
public class ObjectResponse extends BaseResponse implements IOHResponse
{
    private Object data;

    public ObjectResponse(int code, Message message, Object data)
    {
        super(code, message);
        this.data = data;
    }
}
