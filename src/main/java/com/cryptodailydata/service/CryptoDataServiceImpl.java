package com.cryptodailydata.service;


import com.cryptodailydata.entity.CryptoDataEntity;
import com.cryptodailydata.model.CryptoRankIO.CryptoRankIOModel;
import com.cryptodailydata.repository.CryptoDataRepository;
import com.cryptodailydata.util.RestAPICaller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

/**
 * @author huseyin.poyraz at 23.05.2021
 */

@Service
public class CryptoDataServiceImpl extends BaseServiceImpl implements CryptoDataService
{
    @Autowired
    CryptoDataRepository cryptoDataRepository;

    public CryptoDataServiceImpl(RestAPICaller restAPICaller)
    {
        super(restAPICaller);
    }

    @Override
    public ResponseEntity<CryptoRankIOModel> getAllCrypto(HttpHeaders httpHeaders){

        ResponseEntity<CryptoRankIOModel> outResponseEntity = getRestAPICaller().getCryptoRankIO();
        return ResponseEntity.status(outResponseEntity.getStatusCode()).body(outResponseEntity.getBody());
    }

    @Override
    public void save(CryptoDataEntity cryptoDataEntity) {
        cryptoDataRepository.save(cryptoDataEntity);
    }

    @Override
    public boolean isExist(String cryptoName) {
        List<CryptoDataEntity> allNews = cryptoDataRepository.findAll();
        for (CryptoDataEntity cryptoData: allNews) {
            if (cryptoData.getName().equals(cryptoName)) {
                return true;
            }
        }
        return false;
    }
    @Override
    public List<CryptoDataEntity> getAllCryptoData() {
        return cryptoDataRepository.findAll();
    }
}
