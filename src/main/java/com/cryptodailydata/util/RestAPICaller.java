package com.cryptodailydata.util;

import com.cryptodailydata.model.Coniun.ConiunCBoxModel.ConiunCBoxModel;
import com.cryptodailydata.model.Coniun.NFTAllDetailsModel.NFTAllDetailsDataMadel;
import com.cryptodailydata.model.Coniun.NFTMetaDataModel.NFTMetaDataModel;
import com.cryptodailydata.model.CryptoRankIO.CryptoRankIOModel;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * @author huseyin.poyraz at 23.05.2021
 */

@Data
@Component
@Slf4j
public class RestAPICaller implements IRestAPICaller
{
    @Autowired
    private  URLBuilder urlBuilder;
    @Autowired
    private RestTemplate restTemplate;

    private String apiURL;

    public ResponseEntity<CryptoRankIOModel> getCryptoRankIO()
    {
        setApiURL( urlBuilder.getCryptoRankIO() );
        return getRestTemplate().getForEntity(getApiURL(), CryptoRankIOModel.class);
    }

    public ResponseEntity<ConiunCBoxModel> getAllCboxesByPassId(int passId)
    {
      //  log.info("Pass ID: " + passId + " is checking..");
        setApiURL( urlBuilder.getAllCboxes(passId) );
        return getRestTemplate().getForEntity(getApiURL(), ConiunCBoxModel.class);
    }

    public ResponseEntity<NFTMetaDataModel> getNftMetaDataByContracts(String contractId)
    {
       // log.info("Contract ID: " + contractId + " is checking..");
        setApiURL( urlBuilder.getNftMetaDataByContracts(contractId));
        return getRestTemplate().getForEntity(getApiURL(), NFTMetaDataModel.class);
    }

    public ResponseEntity<NFTAllDetailsDataMadel> getNftAllDetailsBySlug(String slug)
    {
      //  log.info("Pass ID: " + passId + " is checking..");
        setApiURL( urlBuilder.getNftAllDetailsBySlug(slug));
        return getRestTemplate().getForEntity(getApiURL(), NFTAllDetailsDataMadel.class);
    }


}

