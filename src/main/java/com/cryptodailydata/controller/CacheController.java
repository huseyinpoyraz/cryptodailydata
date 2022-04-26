package com.cryptodailydata.controller;

import com.cryptodailydata.core.constant.SuccessMessagesConstants;
import com.cryptodailydata.core.IOHResponse;
import com.cryptodailydata.core.CacheModel;
import com.cryptodailydata.core.oh_response.Message;
import com.cryptodailydata.service.CachingService;
import com.cryptodailydata.util.ResponseBuilder;
import com.hazelcast.core.HazelcastInstance;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author huseyin.poyraz at 18.10.2019
 */

@Api(tags = "Cache API")
@RestController
@RequestMapping("/cache")
public class CacheController extends BaseController
{
    private final SuccessMessagesConstants successMessagesConstants;
    CacheModel cacheModel;
    ResponseEntity<CacheModel> ohCacheModelResponseEntity;
    @Autowired
    CachingService cachingService;
    @Qualifier("hazelcastInstance")
    @Autowired
    HazelcastInstance hazelcastInstance;
    private Message message;

    public CacheController(RestTemplate restTemplate, ResponseBuilder responseBuilder,
                           SuccessMessagesConstants successMessagesConstants, Message message)
    {
        super(responseBuilder);
        this.successMessagesConstants = successMessagesConstants;
        this.message = message;
    }

    public ResponseEntity<CacheModel> createResponseEntity()
    {
        cacheModel = new CacheModel();
        cacheModel.setMessage(null);
        ohCacheModelResponseEntity = ResponseEntity.status(200).body(cacheModel);
        return ohCacheModelResponseEntity;
    }

    @GetMapping("clearAllCaches")
    public IOHResponse clearAllCaches()
    {
        cachingService.evictAllCaches();
        message = successMessagesConstants.getDeleteCacheMsg();
        return getResponseBuilder().createResponse(createResponseEntity(), message);
    }

    @GetMapping("clearCityCache")
    public IOHResponse clearCityCaches()
    {
        cachingService.evictAllCacheValues("cities");
        message = successMessagesConstants.getDeleteCacheMsg();
        return getResponseBuilder().createResponse(createResponseEntity(), message);
    }

    @GetMapping("clearMainContentCache")
    public IOHResponse clearMainContentCaches()
    {
        cachingService.evictAllCacheValues("mainContent");
        message = successMessagesConstants.getDeleteCacheMsg();
        return getResponseBuilder().createResponse(createResponseEntity(), message);
    }

    @GetMapping("clearVersionControlCache")
    public IOHResponse clearVersionControlCaches()
    {
        cachingService.evictAllCacheValues("versionControl");
        message = successMessagesConstants.getDeleteCacheMsg();
        return getResponseBuilder().createResponse(createResponseEntity(), message);
    }

    @GetMapping("clearAllHomePageCache")
    public IOHResponse clearHomePageCaches()
    {
        cachingService.evictAllCacheValues("marketSliderBanner");
        cachingService.evictAllCacheValues("storeSliderBanner");
        cachingService.evictAllCacheValues("categoriesFromIBM");
        cachingService.evictAllCacheValues("todaysOffer");
        cachingService.evictAllCacheValues("recommendation");
        cachingService.evictAllCacheValues("topBrowsed");
        cachingService.evictAllCacheValues("secondBanner");
        cachingService.evictAllCacheValues("thirdBanner");
        cachingService.evictAllCacheValues("lastOrder");
        cachingService.evictAllCacheValues("threeBanners");
        cachingService.evictAllCacheValues("recommendationCategoryLanding");
        message = successMessagesConstants.getDeleteCacheMsg();
        return getResponseBuilder().createResponse(createResponseEntity(), message);
    }

    //region Module Cache Clear Endpoints
    @GetMapping("clearMarketSliderBannerCache")
    public IOHResponse clearMarketSliderBanner()
    {
        cachingService.evictAllCacheValues("marketSliderBanner");
        message = successMessagesConstants.getDeleteCacheMsg();
        return getResponseBuilder().createResponse(createResponseEntity(), message);
    }

    @GetMapping("clearStoreSliderBannerCache")
    public IOHResponse clearStoreSliderBanner()
    {
        cachingService.evictAllCacheValues("storeSliderBanner");
        message = successMessagesConstants.getDeleteCacheMsg();
        return getResponseBuilder().createResponse(createResponseEntity(), message);
    }

    @GetMapping("clearCategoriesFromIBMCache")
    public IOHResponse clearCategoriesFromIBM()
    {
        cachingService.evictAllCacheValues("categoriesFromIBM");
        message = successMessagesConstants.getDeleteCacheMsg();
        return getResponseBuilder().createResponse(createResponseEntity(), message);
    }

    @GetMapping("clearTodaysOfferCache")
    public IOHResponse cleartodaysOffer()
    {
        cachingService.evictAllCacheValues("todaysOffer");
        message = successMessagesConstants.getDeleteCacheMsg();
        return getResponseBuilder().createResponse(createResponseEntity(), message);
    }

    @GetMapping("clearRecommendationCache")
    public IOHResponse clearRecommendation()
    {
        cachingService.evictAllCacheValues("recommendation");
        message = successMessagesConstants.getDeleteCacheMsg();
        return getResponseBuilder().createResponse(createResponseEntity(), message);
    }

    @GetMapping("clearTopBrowsedCache")
    public IOHResponse clearTopBrowsed()
    {
        cachingService.evictAllCacheValues("topBrowsed");
        message = successMessagesConstants.getDeleteCacheMsg();
        return getResponseBuilder().createResponse(createResponseEntity(), message);
    }

    @GetMapping("clearSecondBannerCache")
    public IOHResponse clearSecondBanner()
    {
        cachingService.evictAllCacheValues("secondBanner");
        message = successMessagesConstants.getDeleteCacheMsg();
        return getResponseBuilder().createResponse(createResponseEntity(), message);
    }

    @GetMapping("clearThirdBannerCache")
    public IOHResponse clearThirdBanner()
    {
        cachingService.evictAllCacheValues("thirdBanner");
        message = successMessagesConstants.getDeleteCacheMsg();
        return getResponseBuilder().createResponse(createResponseEntity(), message);
    }

    @GetMapping("clearLastOrderCache")
    public IOHResponse clearLastOrder()
    {
        cachingService.evictAllCacheValues("lastOrder");
        message = successMessagesConstants.getDeleteCacheMsg();
        return getResponseBuilder().createResponse(createResponseEntity(), message);
    }

    @GetMapping("clearThreeBannersCache")
    public IOHResponse clearThreeBanners()
    {
        cachingService.evictAllCacheValues("threeBanners");
        message = successMessagesConstants.getDeleteCacheMsg();
        return getResponseBuilder().createResponse(createResponseEntity(), message);
    }

    @GetMapping("clearRecommendationCLCache")
    public IOHResponse clearRecommendationCL()
    {
        cachingService.evictAllCacheValues("recommendationCategoryLanding");
        message = successMessagesConstants.getDeleteCacheMsg();
        return getResponseBuilder().createResponse(createResponseEntity(), message);
    }

    @GetMapping("clearBottomCategoryCache")
    public IOHResponse clearBottomCategoryCache()
    {
        cachingService.evictAllCacheValues("bottomCategory");
        message = successMessagesConstants.getDeleteCacheMsg();
        return getResponseBuilder().createResponse(createResponseEntity(), message);
    }

    //region Specific Module Cache Clear
//    @GetMapping("clearMarketSliderBannerCache/{catalogId}/{storeId}")
//    public IOHResponse clearSpecificMarketSliderBannerCache(@PathVariable("catalogId") String catalogId, @PathVariable("storeId") String storeId)
//    {
//        evictMarketSliderBannerCache(storeId);
//        ohMessage = successMessagesConstants.getDeleteCacheMsg();
//        return getResponseBuilder().createResponse(createResponseEntity(), ohMessage);
//    }
    //endregion
    //endregion

//    @CacheEvict(value = "marketSliderBanner", key = "#storeId")
//    public void evictMarketSliderBannerCache(String storeId)
//    {
//    }

    @GetMapping("clearCategoryLandingCache")
    public IOHResponse clearCategoryLandingCache()
    {
        cachingService.evictAllCacheValues("categoryLanding");
        message = successMessagesConstants.getDeleteCacheMsg();
        return getResponseBuilder().createResponse(createResponseEntity(), message);
    }

    @GetMapping("clearBrandsCache")
    public IOHResponse clearBrandsCache()
    {
        cachingService.evictAllCacheValues("brands");
        message = successMessagesConstants.getDeleteCacheMsg();
        return getResponseBuilder().createResponse(createResponseEntity(), message);
    }

    @GetMapping("clearAllCampaignCache")
    public IOHResponse clearallCampaignCache()
    {
        cachingService.evictAllCacheValues("allCampaign");
        message = successMessagesConstants.getDeleteCacheMsg();
        return getResponseBuilder().createResponse(createResponseEntity(), message);
    }

    @GetMapping("clearShopCartEMSCache")
    public IOHResponse clearShopCartEMSCache()
    {
        cachingService.evictAllCacheValues("shopCartEMS");
        message = successMessagesConstants.getDeleteCacheMsg();
        return getResponseBuilder().createResponse(createResponseEntity(), message);
    }

    @GetMapping("clearCampaignContentCache")
    public IOHResponse clearCampaignContentCache()
    {
        cachingService.evictAllCacheValues("campaignContent");
        message = successMessagesConstants.getDeleteCacheMsg();
        return getResponseBuilder().createResponse(createResponseEntity(), message);
    }

    @GetMapping("clearTeslimatIadeCache")
    public IOHResponse clearTeslimatIadeCache()
    {
        cachingService.evictAllCacheValues("teslimatIade");
        message = successMessagesConstants.getDeleteCacheMsg();
        return getResponseBuilder().createResponse(createResponseEntity(), message);
    }

    @GetMapping("clearShopCartBannerCache")
    public IOHResponse clearShopCartBannerCache()
    {
        cachingService.evictAllCacheValues("shopCartBanner");
        message = successMessagesConstants.getDeleteCacheMsg();
        return getResponseBuilder().createResponse(createResponseEntity(), message);
    }

    @GetMapping("clearCategoryAndBrandsCache")
    public IOHResponse clearCategoryAndBrandsCache()
    {
        cachingService.evictAllCacheValues("bottomCategoryAndBrands");
        message = successMessagesConstants.getDeleteCacheMsg();
        return getResponseBuilder().createResponse(createResponseEntity(), message);
    }

    @GetMapping("clearPLPv2")
    public IOHResponse clearPLPV2()
    {
        cachingService.evictAllCacheValues("plpv2");
        message = successMessagesConstants.getDeleteCacheMsg();
        return getResponseBuilder().createResponse(createResponseEntity(), message);
    }
}
