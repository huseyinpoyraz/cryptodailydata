package com.cryptodailydata.controller;

import com.cryptodailydata.core.IOHResponse;
import com.cryptodailydata.model.Coniun.ConiunCBoxModel;
import com.cryptodailydata.service.ConiunService;
import com.cryptodailydata.util.ResponseBuilder;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
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
@Slf4j
public class ConiunController extends BaseController
{
    @Autowired
    ConiunService coniunService;
    private String SEARCH_DATE = "2022-04-19";
    private int MIN_PASS_ID = 0;
    private int MAX_PASS_ID = 6302;

    public ConiunController(ResponseBuilder responseBuilder, ConiunService coniunService)
    {
        super(responseBuilder);
        this.coniunService = coniunService;
    }

    @GetMapping(value = "allNewNfts", produces = MediaType.APPLICATION_JSON_VALUE)
    public void getAllCboxesNFTs(@RequestHeader HttpHeaders httpHeaders)
    {
        for(int passId = MIN_PASS_ID; passId <= MAX_PASS_ID; passId++){
            coniunService.getC_BoxesNewNFTsByPassId(passId,SEARCH_DATE);
        }
    }

    @GetMapping(value = "allUnclaimedNfts", produces = MediaType.APPLICATION_JSON_VALUE)
    public void getC_BoxesAllUnclaimedNFTsByPassId(@RequestHeader HttpHeaders httpHeaders)
    {
        for(int passId = MIN_PASS_ID; passId <= MAX_PASS_ID; passId++){
            coniunService.getC_BoxesAllUnclaimedNFTsByPassId(passId);
        }
    }

}
