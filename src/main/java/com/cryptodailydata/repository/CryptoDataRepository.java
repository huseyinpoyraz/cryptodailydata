package com.cryptodailydata.repository;

import com.cryptodailydata.entity.CryptoDataEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author huseyin.poyraz at 23.05.2021
 */
public interface CryptoDataRepository extends JpaRepository<CryptoDataEntity, Long>
{

}
