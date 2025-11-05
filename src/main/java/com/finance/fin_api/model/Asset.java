package com.finance.fin_api.model;

import java.math.BigDecimal;

public abstract class Asset {
    protected final String isin;
    protected final BigDecimal marketValue;
    public Asset(String isin, BigDecimal marketValue) {
        this.isin = isin;
        this.marketValue = marketValue;
    }
    public abstract BigDecimal calculateRiskScore();
    public abstract String getAssetType();
    public final String generateAuditLog() {
        return String.format(
                "[AUDIT] %s | ISIN: %s | Value: %s | Risk: %.3f",
                getAssetType(), isin, marketValue, calculateRiskScore()
        );
    }
    public String getIsin() { return isin; }
    public BigDecimal getMarketValue() { return marketValue; }
}