package dev.ajith.stock.jparepo;

import dev.ajith.stock.entity.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StockJPARepository extends JpaRepository<Stock,Integer> {
    Optional<Stock> findByStockName(String stockName);
}
