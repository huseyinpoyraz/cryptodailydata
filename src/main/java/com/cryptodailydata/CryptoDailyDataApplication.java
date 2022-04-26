package com.cryptodailydata;

import com.cryptodailydata.core.constant.*;
import com.cryptodailydata.util.URLConstants;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableConfigurationProperties({
		LogHeaderValues.class,
		ErrorMessagesConstants.class,
		SuccessMessagesConstants.class,
		URLConstants.class,
		//OHBaseConfigConstants.class,
		PaginationConstants.class,
		StaticValuesConstants.class,
		SecurityConstants.class,
		InfoMessagesConstants.class
})
@SpringBootApplication
@EnableScheduling
@EntityScan
@EnableCaching
public class CryptoDailyDataApplication
{
	public static void main(String[] args) {
		SpringApplication.run(CryptoDailyDataApplication.class, args);
	}
}
