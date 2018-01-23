package com.services;

import com.mappers.StockIndexMapper;
import com.models.StockIndex;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by haohong on 24/01/2018.
 */
public class StockIndexService {
    @Autowired
    private StockIndexMapper stockIndexMapper;

    public StockIndex[] findStockIndexByCodes(String[] codes)
    {
        return stockIndexMapper.findItemsByCodes(codes);
    }
}
