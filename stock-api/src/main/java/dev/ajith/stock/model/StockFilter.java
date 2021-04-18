package dev.ajith.stock.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StockFilter {
    public String stockName=null;
    @JsonProperty("stock_name")
    public String getStockName() {
        return stockName;
    }
    public void setStockName(String stockName) {
        this.stockName = stockName;
    }
}
