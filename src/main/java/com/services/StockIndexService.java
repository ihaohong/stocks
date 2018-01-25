package com.services;

import com.mappers.StockIndexMapper;
import com.models.StockIndex;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class StockIndexService {
    @Autowired
    private StockIndexMapper stockIndexMapper;

    public StockIndex[] findStockIndexByCodes(String[] codes)
    {
        return stockIndexMapper.findItemsByCodes(codes);
    }

    public Map<String, Map<String, StockIndex>> formatOutput(StockIndex[] stockIndices) {
        Map<String, StockIndex> data = new HashMap<String, StockIndex>();

        for (StockIndex stockIndex:
             stockIndices) {
            data.put("code_" + stockIndex.getCode(), stockIndex);
        }

        Map<String, Map<String, StockIndex>> result = new HashMap<String, Map<String, StockIndex>>();
        result.put("data", data);

        return result;
    }
}
