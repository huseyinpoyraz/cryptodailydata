package com.cryptodailydata.service;


import com.cryptodailydata.model.Coniun.ConiunCBoxModel;
import com.cryptodailydata.model.Coniun.Item;
import com.cryptodailydata.util.RestAPICaller;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.net.PasswordAuthentication;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author huseyin.poyraz at 23.05.2021
 */

@Service
@Slf4j
public class ConiunServiceImpl extends BaseServiceImpl implements ConiunService
{
    private Item nftItem = null;


    public ConiunServiceImpl(RestAPICaller restAPICaller)
    {
        super(restAPICaller);
    }

    @Override
    @Async
    public void getC_BoxesNewNFTsByPassId(int passId, String date) {

        ConiunCBoxModel coniunCBoxModel = getRestAPICaller().getAllCboxesByPassId(passId).getBody();

        if (coniunCBoxModel.getItems().stream()
                .filter(item -> item.getCreatedAt().contains(date))
                .filter(item -> item.getNftTokenId() != null)
                .collect(Collectors.toList()).size() > 0 )

            nftItem = coniunCBoxModel.getItems().stream()
                    .filter(item -> item.getCreatedAt().contains(date))
                    .filter(item -> item.getNftTokenId() != null)
                    .collect(Collectors.toList()).get(0);

        if ( nftItem != null ){
            //outResponseEntityList.add(coniunCBoxModel);
            log.info("*************************************************");
            log.info("Found!!!!...Pass ID: " + passId + " has NFT ");
            log.info("whitelist_collection_slug : " + nftItem.getWhitelistCollectionSlug());
            log.info("nft_collection_contract : "   + nftItem.getNftCollectionContract());
            log.info("*************************************************");
            nftItem = null;
        }
    }
    @Override
    @Async
    public void getC_BoxesAllUnclaimedNFTsByPassId(int passId) {

        ConiunCBoxModel coniunCBoxModel = getRestAPICaller().getAllCboxesByPassId(passId).getBody();

        if (coniunCBoxModel.getItems().stream()
                .filter(item -> item.getNftTokenId() != null)
                .filter(item -> item.getClaimedBy() == null )
                .collect(Collectors.toList()).size() > 0 )

            nftItem = coniunCBoxModel.getItems().stream()
                    .filter(item -> item.getNftTokenId() != null)
                    .filter(item -> item.getClaimedBy() == null )
                    .collect(Collectors.toList()).get(0);

        if ( nftItem != null ){
            //outResponseEntityList.add(coniunCBoxModel);
            log.info("*************************************************");
            log.info("Found!!!!...Pass ID: " + passId + " has NFT ");
            log.info("claimed_by : "                + nftItem.getClaimedBy());
            log.info("whitelist_collection_slug : " + nftItem.getWhitelistCollectionSlug());
            log.info("nft_collection_contract : "   + nftItem.getNftCollectionContract());
            log.info("*************************************************");
            nftItem = null;
        }
    }


    @Override
    public ResponseEntity<List<ConiunCBoxModel>> getC_BoxesByPassId(int passId) {

        List<ConiunCBoxModel> outResponseEntityList = new ArrayList<>();

        for (int i = 3455; i <= 6302; i++){

            ConiunCBoxModel coniunCBoxModel = getRestAPICaller().getAllCboxesByPassId(passId).getBody();

            if (coniunCBoxModel.getItems().stream()
                    .filter(item -> item.getCreatedAt().contains("2022-04-19"))
                    .filter(item -> item.getNftTokenId() != null)
                    .collect(Collectors.toList()).size() > 0 )

                nftItem = coniunCBoxModel.getItems().stream()
                        .filter(item -> item.getCreatedAt().contains("2022-04-19"))
                        .filter(item -> item.getNftTokenId() != null)
                        .collect(Collectors.toList()).get(0);

            if ( nftItem != null ){
                outResponseEntityList.add(coniunCBoxModel);
                log.info("*************************************************");
                log.info("Found!!!!...Pass ID: " + i + " has NFT ");
                log.info("whitelist_collection_slug : " + nftItem.getWhitelistCollectionSlug());
                log.info("nft_collection_contract : "   + nftItem.getNftCollectionContract());
                log.info("*************************************************");
                nftItem = null;
            }

        }
        return ResponseEntity.status(HttpStatus.OK).body(outResponseEntityList);
    }

    @Override
    public ResponseEntity<List<ConiunCBoxModel>> getAllC_BoxesNFTsByDate(String date) {
        List<ConiunCBoxModel> outResponseEntityList = new ArrayList<>();

        for (int i = 3455; i <= 6302; i++){

            ConiunCBoxModel coniunCBoxModel = getRestAPICaller().getAllCboxesByPassId(i).getBody();

            if (coniunCBoxModel.getItems().stream()
                    .filter(item -> item.getCreatedAt().contains(date))
                    .filter(item -> item.getNftTokenId() != null)
                    .collect(Collectors.toList()).size() > 0 )

                nftItem = coniunCBoxModel.getItems().stream()
                        .filter(item -> item.getCreatedAt().contains(date))
                        .filter(item -> item.getNftTokenId() != null)
                        .collect(Collectors.toList()).get(0);

            if ( nftItem != null ){
                outResponseEntityList.add(coniunCBoxModel);
                log.info("*************************************************");
                log.info("Found!!!!...Pass ID: " + i + " has NFT ");
                log.info("whitelist_collection_slug : " + nftItem.getWhitelistCollectionSlug());
                log.info("nft_collection_contract : "   + nftItem.getNftCollectionContract());
                log.info("*************************************************");
                nftItem = null;
            }

        }
        return ResponseEntity.status(HttpStatus.OK).body(outResponseEntityList);
    }

}
