package dev.ajith.stock.webapi;

import dev.ajith.stock.model.StockFilter;
import dev.ajith.stock.model.StockModel;

import java.util.List;

public interface StockWebApi {
    public List<StockModel> addStock(List<StockModel> stockModelList);
    public List<StockModel> listStocks(StockFilter stockFilter);
}
