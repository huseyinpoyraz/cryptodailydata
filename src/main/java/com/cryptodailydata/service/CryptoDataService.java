package com.cryptodailydata.service;

import com.cryptodailydata.entity.CryptoDataEntity;
import com.cryptodailydata.model.CryptoRankIO.CryptoRankIOModel;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author huseyin.poyraz at 23.05.2021
 */
@Service
public interface CryptoDataService
{
    ResponseEntity<CryptoRankIOModel> getAllCrypto(HttpHeaders httpHeaders);
    public void save(CryptoDataEntity cryptoDataEntity);
    public boolean isExist(String cryptoName);
    public List<CryptoDataEntity> getAllCryptoData();
}
