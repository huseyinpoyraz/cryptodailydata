package com.cryptodailydata.controller;

import com.cryptodailydata.core.IOHResponse;
import com.cryptodailydata.entity.CryptoDataEntity;
import com.cryptodailydata.model.CryptoRankIO.CryptoRankIOModel;
import com.cryptodailydata.service.CryptoDataService;
import com.cryptodailydata.util.ResponseBuilder;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author huseyin.poyraz at 23.05.2021
 */

@RestController
public class CryptoDataController extends BaseController
{
    @Autowired
    CryptoDataService cryptoDataService;

    public CryptoDataController(ResponseBuilder responseBuilder, CryptoDataService cryptoDataService)
    {
        super(responseBuilder);
        this.cryptoDataService = cryptoDataService;
    }

    @ApiOperation("Get Main Page content")
    @Cacheable(cacheNames = "cryptoRankData")
    @GetMapping(value = "v1/cryptoes", produces = MediaType.APPLICATION_JSON_VALUE)
    public IOHResponse getAllCryptoData(@RequestHeader HttpHeaders httpHeaders) {

        ResponseEntity<CryptoRankIOModel> responseEntity = cryptoDataService.getAllCrypto(httpHeaders);
        return getResponseBuilder().createResponse(responseEntity, null);
    }

}
