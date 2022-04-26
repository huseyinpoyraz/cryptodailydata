package com.cryptodailydata.core.constant;

import com.cryptodailydata.core.oh_response.Message;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author huseyin.poyraz
 */

@Data
@ConfigurationProperties(prefix = "successmessages")
public class SuccessMessagesConstants
{
    private Message logoutMsg;
    private Message changePasswordMsg;
    private Message loginMsg;
    private Message registerMsg;
    private Message forgotPasswordMsg;
    private Message updatePersonelInfoMsg;
    private Message notifyMeMsg;
    private Message filterList;
    private Message setAddressMsg;
    private Message setCargoMsg;
    private Message validateAddressMsg;
    private Message setTimeSlotMsg;
    private Message updateItemMsg;
    private Message deleteOrderNoteMsg;
    private Message validateCartMsg;
    private Message successfulCancelOrder;
    private Message successfulReturnOrder;
    private Message addItemToFavoriteList;
    private Message deleteItemFromFavoriteList;
    private Message deleteUser;
    private Message contactForm;
    private Message deleteCacheMsg;
}
