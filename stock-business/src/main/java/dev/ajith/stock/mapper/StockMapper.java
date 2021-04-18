package dev.ajith.stock.mapper;

import dev.ajith.stock.entity.Stock;
import dev.ajith.stock.model.StockFilter;
import dev.ajith.stock.model.StockModel;
import dev.ajith.stock.vo.StockFilterVO;
import dev.ajith.stock.vo.StockVO;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper(componentModel = "spring")
public interface StockMapper {
    List<StockVO> constructStockVO(List<StockModel> stockModel);

    List<Stock> constructStockEntity(List<StockVO> stockVOList);

    StockVO constructStockVOObject(Stock addedStock);
    List<StockModel> constructStockModel(List<StockVO> stockModel);

    StockFilterVO constructStockFilterVO(StockFilter stockFilter);
    List<StockVO> constructStockListList(List<Stock> stockList);

}
