package com.cryptodailydata.core.constant;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties("pageinformation")
public class PaginationConstants
{
    private String pageSize;
    private String pageNumber;
    private String currentPage;
    private String maximizedPageSize;
}
