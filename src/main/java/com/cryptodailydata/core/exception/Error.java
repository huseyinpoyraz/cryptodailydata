package com.cryptodailydata.core.exception;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "message",
    "type"
})
public class Error {

    @JsonProperty("message")
    private String message;
    @JsonProperty("type")
    private String type;
    @JsonProperty("reason")
    private String reason;
    @JsonProperty("subject")
    private String subject;
    @JsonProperty("subjectType")
    private String subjectType;

    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    @JsonProperty("message")
    public void setMessage(String message) {
        this.message = message;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("reason")
    public String getReason()
    {
        return reason;
    }

    @JsonProperty("reason")
    public void setReason(String reason)
    {
        this.reason = reason;
    }

    @JsonProperty("subject")
    public String getSubject()
    {
        return subject;
    }

    @JsonProperty("subject")
    public void setSubject(String subject)
    {
        this.subject = subject;
    }

    @JsonProperty("subjectType")
    public String getSubjectType()
    {
        return subjectType;
    }

    @JsonProperty("subjectType")
    public void setSubjectType(String subjectType)
    {
        this.subjectType = subjectType;
    }
}
