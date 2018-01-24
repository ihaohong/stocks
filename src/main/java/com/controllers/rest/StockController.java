package com.controllers.rest;

import com.mappers.StockIndexMapper;
import com.models.StockIndex;
import com.services.StockIndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class StockController {
    @Autowired
    private StockIndexService stockIndexService;

    @RequestMapping(value = "/stock/index/{codes:[\\d|,]+}", method = {GET})
    public Map<String, Map<String, StockIndex>> stockIndexList(@PathVariable String codes) {

        String[] codesArr = codes.split(",");

        StockIndex[] stockIndices = stockIndexService.findStockIndexByCodes(codesArr);

        return stockIndexService.formatOutput(stockIndices);
    }
}
