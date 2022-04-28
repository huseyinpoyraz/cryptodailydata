package com.cryptodailydata.controller;

import com.cryptodailydata.service.ConiunService;
import com.cryptodailydata.util.ResponseBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author huseyin.poyraz at 23.05.2021
 */

@RestController
@Slf4j
public class ConiunController extends BaseController
{
    @Autowired
    ConiunService coniunService;
    private String SEARCH_DATE = "2022-04-26";
    private int MIN_PASS_ID = 0;
    private int MAX_PASS_ID = 6302;

    public ConiunController(ResponseBuilder responseBuilder, ConiunService coniunService)
    {
        super(responseBuilder);
        this.coniunService = coniunService;
    }

    // Herhafta coniun, pass holder'lar için c-box adı altında çekiliş yapıyor. 3 çeşit hak var. itemType: Whitelist, NFT, Fragment
    //Bu method her hafta çıkan yeni NFT'lerin metadatasını tespit eder.
    //TODO SEARCH_DATE apiye parametre olarak tasarlanabilir. ONa göre api resourceName düzenlenmelidir
    //TODO Bu kayıtlar DB'ye kaydedilmelidir.
    //TODO

    @GetMapping(value = "allNewNfts", produces = MediaType.APPLICATION_JSON_VALUE)
    public void getAllCboxesNFTs(@RequestHeader HttpHeaders httpHeaders) throws InterruptedException {
        for(int passId = MIN_PASS_ID; passId <= MAX_PASS_ID; passId++){
            coniunService.getC_BoxesNewNFTsByPassId(passId,SEARCH_DATE);
        }
    }

    //Yukarıda tespit edilen NFT'lerin detayını çeker.
    //TODO Şuan statik listeden okuyor DB'den okumalı
    //TODO opensea satıştakileri'de taglemeli

    @GetMapping(value = "allNewNftsDetails", produces = MediaType.APPLICATION_JSON_VALUE)
    public void getAllCboxesNFTsDetails(@RequestHeader HttpHeaders httpHeaders) throws InterruptedException {
        coniunService.getNftDetailDataModels();
    }

    //Coniun pass'lere çıkan NFT'lerden unclaimed statüsündekileri tespit eder.

    @GetMapping(value = "allUnclaimedNfts", produces = MediaType.APPLICATION_JSON_VALUE)
    public void getC_BoxesAllUnclaimedNFTsByPassId(@RequestHeader HttpHeaders httpHeaders)
    {
        for(int passId = MIN_PASS_ID; passId <= MAX_PASS_ID; passId++){
            coniunService.getC_BoxesAllUnclaimedNFTsByPassId(passId);
        }
    }

}
