package com.controllers.rest;

import com.models.StockIndex;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class StockController {
    @RequestMapping(value = "/stock/index/{codes:[\\d|,]+}", method = {GET})
    public StockIndex[] stockIndexList(@PathVariable String codes) {
        StockIndex si = new StockIndex();
        si.setCode(codes);
        si.setIndex(22L);
        si.setName("沪深300");

        StockIndex[] stockIndices = {si};
        return stockIndices;
    }
}
