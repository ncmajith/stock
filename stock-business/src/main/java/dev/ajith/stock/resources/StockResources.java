package dev.ajith.stock.resources;

import dev.ajith.stock.mapper.StockMapper;
import dev.ajith.stock.model.StockFilter;
import dev.ajith.stock.model.StockModel;
import dev.ajith.stock.service.StockService;
import dev.ajith.stock.webapi.StockWebApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StockResources implements StockWebApi {
    @Autowired
    public StockService stockService;
    @Autowired
    public StockMapper stockMapper;
    @PostMapping("/addStock")
    public List<StockModel> addStock(@RequestBody List<StockModel> stockModelList){
        return stockMapper.constructStockModel(stockService.addStock(stockMapper.constructStockVO(stockModelList)));
    }

    @PostMapping("listStocks")
    public List<StockModel> listStocks(@RequestBody StockFilter stockFilter) {
        return  stockMapper.constructStockModel(stockService.listStocks(stockMapper.constructStockFilterVO(stockFilter)));
    }
}
