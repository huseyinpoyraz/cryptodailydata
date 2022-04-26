package com.cryptodailydata.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author huseyin.poyraz at 23.05.2021
 */

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CryptoDataEntity
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String symbol;
    private String thumbnailImage;
    private String ecoSystem;
}
