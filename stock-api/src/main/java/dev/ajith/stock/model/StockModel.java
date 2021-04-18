package dev.ajith.stock.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StockModel {
    public String stockName=null;
    public String stockDescription=null;
    @JsonProperty("stock_name")
    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }
    @JsonProperty("stock_description")
    public String getStockDescription() {
        return stockDescription;
    }

    public void setStockDescription(String stockDescription) {
        this.stockDescription = stockDescription;
    }
}
