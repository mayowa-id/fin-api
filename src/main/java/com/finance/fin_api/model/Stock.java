package com.finance.fin_api.model;
import java.math.BigDecimal;

public class Stock extends Asset {
    private final String ticker;
    private final BigDecimal beta;

    public Stock(String isin, BigDecimal marketValue, String ticker, BigDecimal beta) {
        super(isin, marketValue);
        this.ticker = ticker;
        this.beta = beta;
    }

    @Override
    public BigDecimal calculateRiskScore() {
        return marketValue.multiply(beta).multiply(new BigDecimal("0.15"));
    }

    @Override
    public String getAssetType() {
        return "EQUITY";
    }
}