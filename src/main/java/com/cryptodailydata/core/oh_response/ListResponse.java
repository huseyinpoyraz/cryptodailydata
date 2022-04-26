package com.cryptodailydata.core.oh_response;

import com.cryptodailydata.core.IOHResponse;
import com.cryptodailydata.core.module.OHModuleModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author huseyin.poyraz at 9/14/2019
 */

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Component
@Qualifier("ohListResp")
public class ListResponse extends BaseResponse implements IOHResponse
{
    private List<OHModuleModel> data; //IOHModule

    public ListResponse(int code, Message message, List<OHModuleModel> data)
    {
        super(code, message);
        this.data = data;
    }
}
