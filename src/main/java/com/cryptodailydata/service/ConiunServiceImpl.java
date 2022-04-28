package com.cryptodailydata.service;


import com.cryptodailydata.model.Coniun.ConiunCBoxModel.ConiunCBoxModel;
import com.cryptodailydata.model.Coniun.ConiunCBoxModel.Item;
import com.cryptodailydata.model.Coniun.NFTAllDetailsModel.NFTAllDetailsDataMadel;
import com.cryptodailydata.model.Coniun.NFTMetaDataModel.NFTMetaDataModel;
import com.cryptodailydata.util.ConiunStaticValues;
import com.cryptodailydata.util.RestAPICaller;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

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
    public void getC_BoxesNewNFTsByPassId(int passId, String date) throws InterruptedException {

      //  Thread.sleep(5000L);
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
            ConiunStaticValues.newNFTPairs.put(Integer.valueOf(passId),nftItem );
            System.out.println("FOUND!!!..." + ConiunStaticValues.newNFTPairs);
            nftItem = null;
        }
    }

    public void getNftDetailDataModels()  {

        log.info("getNftDetailDataModels : " + ConiunStaticValues.newNFTPairs.size() );

        ConiunStaticValues.newNFTPairs.forEach((key, item) -> {

            NFTMetaDataModel nftMetaDataModel = getRestAPICaller().getNftMetaDataByContracts(item.getNftCollectionContract().toString()).getBody();

            log.info("*************************************************");
            log.info("NFT Name : "                + nftMetaDataModel.getData().get(0).getName());
            log.info("NFT Slug : "                + nftMetaDataModel.getData().get(0).getSlug());
            log.info("Pass ID  : " + key.intValue() );
            log.info("nft_collection_contract : "   + item.getNftCollectionContract());
            log.info("claimed_by : "                + item.getClaimedBy());
            try {
                NFTAllDetailsDataMadel nftAllDetailsDataMadel = getRestAPICaller().getNftAllDetailsBySlug(nftMetaDataModel.getData().get(0).getSlug()).getBody();
                log.info("floor Price : " + nftAllDetailsDataMadel.getCollection().getStats().getFloorPrice());
            }catch (Exception ex) {
            }
            log.info("*************************************************");
        });


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
            NFTMetaDataModel nftMetaDataModel = getRestAPICaller().getNftMetaDataByContracts(nftItem.getNftCollectionContract().toString()).getBody();
            NFTAllDetailsDataMadel nftAllDetailsDataMadel = getRestAPICaller().getNftAllDetailsBySlug(nftItem.getWhitelistCollectionSlug()).getBody();

            log.info("*************************************************");
            log.info("Unclaimed NFT Found!!! ");
            log.info("NFT Name : "                + nftMetaDataModel.getData().get(0).getName());
            log.info("NFT Slug : "                + nftMetaDataModel.getData().get(0).getSlug());
            log.info("Pass ID  : " + passId );
            log.info("nft_collection_contract : "   + nftItem.getNftCollectionContract());
            log.info("claimed_by : "                + nftItem.getClaimedBy());
//            try {
//                NFTAllDetailsDataMadel nftAllDetailsDataMadel = getRestAPICaller().getNftAllDetailsBySlug(nftMetaDataMadel.getData().get(0).getSlug()).getBody();
//                log.info("floor Price : " + nftAllDetailsDataMadel.getCollection().getStats().getFloorPrice());
//            }catch (Exception ex) {
//                nftItem = null;
//            }

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
