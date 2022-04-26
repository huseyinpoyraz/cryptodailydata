package com.cryptodailydata.util;

import com.cryptodailydata.core.IOHResponse;
import com.cryptodailydata.core.module.OHModuleModel;
import com.cryptodailydata.core.oh_response.ListResponse;
import com.cryptodailydata.core.oh_response.Message;
import com.cryptodailydata.core.oh_response.ObjectResponse;
import com.cryptodailydata.model.CryptoRankIO.CryptoRankIOModel;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import java.util.List;


@Component
@Data
public class ResponseBuilder
{
    @Autowired
    private ObjectResponse objectResponse;

    @Autowired
    private ListResponse listResponse;

    public IOHResponse createResponse(ResponseEntity<?> ohResponseEntity, Message message)
    {
        objectResponse.setCode(ohResponseEntity.getStatusCodeValue());
        objectResponse.setMessage(message);
        objectResponse.setData(ohResponseEntity.getBody());

        return objectResponse;
    }
}
