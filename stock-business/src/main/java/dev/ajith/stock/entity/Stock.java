package dev.ajith.stock.entity;

import javax.persistence.*;

@Entity
@Table(name="tb_stock")
public class Stock {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer stockId;
    public String stockName;
    public String stockDescription;

    public Integer getStockId() {
        return stockId;
    }

    public void setStockId(Integer stockId) {
        this.stockId = stockId;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public String getStockDescription() {
        return stockDescription;
    }

    public void setStockDescription(String stockDescription) {
        this.stockDescription = stockDescription;
    }
}
