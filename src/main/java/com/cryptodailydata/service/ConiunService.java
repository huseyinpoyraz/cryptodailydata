package com.cryptodailydata.service;

import com.cryptodailydata.model.Coniun.ConiunCBoxModel;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author huseyin.poyraz at 23.05.2021
 */
@Service
public interface ConiunService
{
    ResponseEntity< List<ConiunCBoxModel> > getC_BoxesByPassId(int passId);
    ResponseEntity< List<ConiunCBoxModel> > getAllC_BoxesNFTsByDate(String byDate);

    void getC_BoxesNewNFTsByPassId(int passId, String date);
    void getC_BoxesAllUnclaimedNFTsByPassId(int passId);
}
