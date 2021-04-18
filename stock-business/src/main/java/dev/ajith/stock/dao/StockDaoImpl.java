package dev.ajith.stock.dao;

import dev.ajith.stock.entity.Stock;
import dev.ajith.stock.jparepo.StockJPARepository;
import dev.ajith.stock.mapper.StockMapper;
import dev.ajith.stock.vo.StockFilterVO;
import dev.ajith.stock.vo.StockVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Repository
public class StockDaoImpl implements StockDao{
    @Autowired
    StockJPARepository stockJPARepository;
    @Autowired
    StockMapper stockMapper;
    @Override
    public List<StockVO> addStock(List<StockVO> stockVOList) {
        List<StockVO> returnList=new ArrayList<>();
        stockMapper.constructStockEntity(stockVOList).forEach(stock->{
            Optional<Stock> existingStock=stockJPARepository.findByStockName(stock.getStockName());
            if(!existingStock.isPresent()){
                Stock addedStock=stockJPARepository.save(stock);
                returnList.add(stockMapper.constructStockVOObject(addedStock));
            }
        });
        return returnList;
    }

    @Override
    public List<StockVO> listStocks(StockFilterVO stockFilterVO) {
        if(null!=stockFilterVO.stockName){
            Optional<Stock> existingStock=stockJPARepository.findByStockName(stockFilterVO.getStockName());
            if(existingStock.isPresent()) return  stockMapper.constructStockListList(Arrays.asList(existingStock.get()));
            else return new ArrayList<>();
        }
        else{
            return stockMapper.constructStockListList(stockJPARepository.findAll());
        }
    }
}
