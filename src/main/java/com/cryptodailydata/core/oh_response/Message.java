package com.cryptodailydata.core.oh_response;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @author huseyin.poyraz at 30.10.2019
 */

@NoArgsConstructor
@Component
public class Message implements Serializable
{
    @Getter
    @Setter
    private String type;

    @Getter
    @Setter
    private String title;

    private String content;

    @Getter
    @Setter
    private String action;

    @JsonIgnore
    private String reason = "";

    @JsonIgnore
    @Getter
    @Setter
    private Boolean alterMsg = false;

    public Message(String type, String title, String content, String action)
    {
        this.type = type;
        this.title = title;
        this.content = content;
        this.action = action;
    }

    public Message(String type, String title, String content, String action, Boolean alterMsg)
    {
        this.type = type;
        this.title = title;
        this.content = content;
        this.action = action;
        this.alterMsg = alterMsg;
    }

    public void setReason(String reason)
    {
        if(reason == null )
            reason = " ";
        this.reason = reason;
    }

    public String getContent()
    {
        if (alterMsg == null)
        {
            return content;
        } else if (alterMsg)
        {
            return reason + content;
        } else
        {
            return content + reason;
        }
    }

    public void setContent(String tempContent)
    {
        if (tempContent == null)
        {
            alterMsg = null;
            content = null;
        } else
        {
            content = tempContent;
        }
    }
}
