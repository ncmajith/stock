package dev.ajith.stock.service;

import dev.ajith.stock.vo.StockFilterVO;
import dev.ajith.stock.vo.StockVO;

import java.util.List;

public interface StockService {
    public List<StockVO> addStock(List<StockVO> stockVOList);
    List<StockVO> listStocks(StockFilterVO stockFilterVO);
}
