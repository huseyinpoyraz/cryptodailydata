package com.cryptodailydata.util;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author huseyin.poyraz at 23.05.2021
 */

@Data
@Component
public class URLBuilder
{
    private  URLConstants urlConstants;

    public URLBuilder(URLConstants urlConstants)
    {
        this.urlConstants = urlConstants;
    }

    //region User All Address
    public String getCryptoRankIO()
    {
        return "https://api.cryptorank.io/v0/coins?type=crypto&locale=en" ;
    }

    //region User All Address
    public String getAllCboxes(int passId)
    {
        return "https://firebase.coniun.io/functions/treasureHunt?boxIds=" + passId;
    }

    public String getNftMetaDataByContracts(String contactId)
    {
        return "https://coniun.io/api/collections/search?q=" + contactId;
    }

    public String getNftAllDetailsBySlug(String slug)
    {
        return "https://api.opensea.io/api/v1/collection/" + slug;
    }


}

