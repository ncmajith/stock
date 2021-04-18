package dev.ajith.stock.service;

import dev.ajith.stock.dao.StockDao;
import dev.ajith.stock.mapper.StockMapper;
import dev.ajith.stock.vo.StockFilterVO;
import dev.ajith.stock.vo.StockVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockServiceImpl implements StockService{
    @Autowired
    StockDao stockDao;
    @Autowired
    StockMapper stockMapper;
    @Override
    public List<StockVO> addStock(List<StockVO> stockVOList) {
        return stockDao.addStock(stockVOList);
    }

    @Override
    public List<StockVO> listStocks(StockFilterVO stockFilterVO) {
        return stockDao.listStocks(stockFilterVO);
    }
}
