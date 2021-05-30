package com.edusystem.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class KctjSimilarity {
    private String stuedntId;

    private String studentRefId;

    private BigDecimal similarity;
    public KctjSimilarity(){};


}