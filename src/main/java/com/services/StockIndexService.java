package com.services;

import com.mappers.StockIndexMapper;
import com.models.StockIndex;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StockIndexService {
    @Autowired
    private StockIndexMapper stockIndexMapper;

    public StockIndex[] findStockIndexByCodes(String[] codes)
    {
        return stockIndexMapper.findItemsByCodes(codes);
    }
}
