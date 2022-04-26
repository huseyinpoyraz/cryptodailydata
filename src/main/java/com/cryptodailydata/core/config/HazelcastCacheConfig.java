package com.cryptodailydata.core.config;

import com.hazelcast.config.Config;
import com.hazelcast.config.MapConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HazelcastCacheConfig
{
    @Bean
    public Config hazelcastConfig()
    {
        // Problem var

        return new Config().setInstanceName("hazelcast-instance")
                .addMapConfig(new MapConfig().setName("configuration")
                     //   .setMaxSizeConfig(new MaxSizeConfig(300, MaxSizeConfig.MaxSizePolicy.FREE_HEAP_SIZE))
                     //   .setEvictionPolicy(EvictionPolicy.LRU)
                        .setTimeToLiveSeconds(86400))
                .setProperty("hazelcast.health.monitoring.level","OFF");
    }
}
