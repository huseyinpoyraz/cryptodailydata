package com.cryptodailydata.core.constant;


import com.cryptodailydata.core.oh_response.Message;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;


@ConfigurationProperties(prefix = "errormessages")
@Data
public class ErrorMessagesConstants
{
    private Message headerException;
    private Message notFoundException;
    private Message notReadableException;
    private Message notSupportedMethodException;
    private Message missingParameterException;
    private Message moduleNotFound;
    private Message mediaTypeNotSupported;
    private Message forgotpasswordMsg;
    private Message emptyFilterList;
    private Message methodArgumentNotValid;
    private Message parseException;
    private Message internalServerError;
    private Message generalHttpClientError;
    private Message resourceAccessException;
    private Message asyncCompletionException;
    private Message nullPointerException;
    private Message generalException;
    private Message asyncRequestTimeOutException;
    private Message vendorMessage;
    private Message arrayIndexOutOfBoundException;
    private Message noSuchStoreIdException;
    private Message notEqualException;
    private Message numberFormatException;
    private Message authenticationCredentialsNotFoundException;
    private Message httpStatusCodeError;
    private Message jacksonMappingError;
    private Message wrongLogonType;
    private Message maintenanceNotification;
    private Message accessDeniedException;
    private Message illegalSearchTermException;
    private Message emptyStringException;
    private Message tokenBadCredentials;
    private Message serviceUnavailable;
    private Message badGateway;
    private Message forbidden;
    private Message sameVersionError;
    private Message noVcRecordFound;

    public Message getHeaderException()
    {
        return headerException;
    }

    public void setHeaderException(Message headerException)
    {
        this.headerException = headerException;
    }

    public Message getNotFoundException()
    {
        return notFoundException;
    }

    public void setNotFoundException(Message notFoundException)
    {
        this.notFoundException = notFoundException;
    }

    public Message getNotReadableException()
    {
        return notReadableException;
    }

    public void setNotReadableException(Message notReadableException)
    {
        this.notReadableException = notReadableException;
    }

    public Message getNotSupportedMethodException()
    {
        return notSupportedMethodException;
    }

    public void setNotSupportedMethodException(Message notSupportedMethodException)
    {
        this.notSupportedMethodException = notSupportedMethodException;
    }

    public Message getMissingParameterException()
    {
        return missingParameterException;
    }

    public void setMissingParameterException(Message missingParameterException)
    {
        this.missingParameterException = missingParameterException;
    }

    public Message getModuleNotFound()
    {
        return moduleNotFound;
    }

    public void setModuleNotFound(Message moduleNotFound)
    {
        this.moduleNotFound = moduleNotFound;
    }

    public Message getMediaTypeNotSupported()
    {
        return mediaTypeNotSupported;
    }

    public void setMediaTypeNotSupported(Message mediaTypeNotSupported)
    {
        this.mediaTypeNotSupported = mediaTypeNotSupported;
    }

    public Message getForgotpasswordMsg()
    {
        return forgotpasswordMsg;
    }

    public void setForgotpasswordMsg(Message forgotpasswordMsg)
    {
        this.forgotpasswordMsg = forgotpasswordMsg;
    }

    public Message getEmptyFilterList()
    {
        return emptyFilterList;
    }

    public void setEmptyFilterList(Message emptyFilterList)
    {
        this.emptyFilterList = emptyFilterList;
    }

    public Message getMethodArgumentNotValid()
    {
        return methodArgumentNotValid;
    }

    public void setMethodArgumentNotValid(Message methodArgumentNotValid)
    {
        this.methodArgumentNotValid = methodArgumentNotValid;
    }

    public Message getParseException()
    {
        return parseException;
    }

    public void setParseException(Message parseException)
    {
        this.parseException = parseException;
    }

    public Message getInternalServerError()
    {
        return internalServerError;
    }

    public void setInternalServerError(Message internalServerError)
    {
        this.internalServerError = internalServerError;
    }

    public Message getGeneralHttpClientError()
    {
        return generalHttpClientError;
    }

    public void setGeneralHttpClientError(Message generalHttpClientError)
    {
        this.generalHttpClientError = generalHttpClientError;
    }

    public Message getResourceAccessException()
    {
        return resourceAccessException;
    }

    public void setResourceAccessException(Message resourceAccessException)
    {
        this.resourceAccessException = resourceAccessException;
    }

    public Message getAsyncCompletionException()
    {
        return asyncCompletionException;
    }

    public void setAsyncCompletionException(Message asyncCompletionException)
    {
        this.asyncCompletionException = asyncCompletionException;
    }

    public Message getNullPointerException()
    {
        return nullPointerException;
    }

    public void setNullPointerException(Message nullPointerException)
    {
        this.nullPointerException = nullPointerException;
    }

    public Message getGeneralException()
    {
        return generalException;
    }

    public void setGeneralException(Message generalException)
    {
        this.generalException = generalException;
    }

    public Message getAsyncRequestTimeOutException()
    {
        return asyncRequestTimeOutException;
    }

    public void setAsyncRequestTimeOutException(Message asyncRequestTimeOutException)
    {
        this.asyncRequestTimeOutException = asyncRequestTimeOutException;
    }

    public Message getVendorMessage()
    {
        return vendorMessage;
    }

    public void setVendorMessage(Message vendorMessage)
    {
        this.vendorMessage = vendorMessage;
    }

    public Message getArrayIndexOutOfBoundException()
    {
        return arrayIndexOutOfBoundException;
    }

    public void setArrayIndexOutOfBoundException(Message arrayIndexOutOfBoundException)
    {
        this.arrayIndexOutOfBoundException = arrayIndexOutOfBoundException;
    }

    public Message getNoSuchStoreIdException()
    {
        return noSuchStoreIdException;
    }

    public void setNoSuchStoreIdException(Message noSuchStoreIdException)
    {
        this.noSuchStoreIdException = noSuchStoreIdException;
    }

    public Message getNotEqualException()
    {
        return notEqualException;
    }

    public void setNotEqualException(Message notEqualException)
    {
        this.notEqualException = notEqualException;
    }

    public Message getNumberFormatException()
    {
        return numberFormatException;
    }

    public void setNumberFormatException(Message numberFormatException)
    {
        this.numberFormatException = numberFormatException;
    }
}
