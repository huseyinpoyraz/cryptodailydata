package com.cryptodailydata.service;


import com.cryptodailydata.util.RestAPICaller;
import lombok.Data;
import org.springframework.stereotype.Service;

/**
 * @author huseyin.poyraz at 9/18/2019
 */

@Data
@Service
//@SuperBuilder
public class BaseServiceImpl
{
    // Tercih edilebilecek şekilde ayarlamamız lazım burayı.
    private RestAPICaller restAPICaller;

    public BaseServiceImpl(RestAPICaller restAPICaller)
    {
        this.restAPICaller = restAPICaller;

    }

}
