package dev.ajith.stock.dao;

import dev.ajith.stock.entity.Stock;
import dev.ajith.stock.vo.StockFilterVO;
import dev.ajith.stock.vo.StockVO;

import java.util.List;

public interface StockDao {
    List<StockVO> addStock(List<StockVO> stockVOList);

    List<StockVO> listStocks(StockFilterVO stockFilterVO);
}
