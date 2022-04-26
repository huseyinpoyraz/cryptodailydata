package com.cryptodailydata.controller;

import com.cryptodailydata.util.ResponseBuilder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author huseyin.poyraz at 9/18/2019
 */

@Data
@Controller
@NoArgsConstructor
@Slf4j
public class BaseController
{
    private ResponseBuilder responseBuilder;

    public BaseController(ResponseBuilder responseBuilder)
    {
        this.responseBuilder = responseBuilder;
    }
}
