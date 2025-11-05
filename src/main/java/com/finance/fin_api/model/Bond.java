package com.finance.fin_api.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Bond extends Asset {
    private final LocalDate maturity;

    public Bond(String isin, BigDecimal marketValue, BigDecimal couponRate, LocalDate maturity) {
        super(isin, marketValue);
        this.maturity = maturity;
    }
    @Override
    public BigDecimal calculateRiskScore() {
        long daysToMaturity = ChronoUnit.DAYS.between(LocalDate.now(), maturity);
        BigDecimal durationYears = BigDecimal.valueOf(daysToMaturity / 365.0);
        return marketValue.multiply(durationYears).multiply(new BigDecimal("0.001"));
    }
    @Override
    public String getAssetType() {
        return "BOND";
    }
}