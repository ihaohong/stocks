package com.controllers.rest;

import com.mappers.StockIndexMapper;
import com.models.StockIndex;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class StockController {
    @Autowired
    StockIndexMapper sim;

    @RequestMapping(value = "/stock/index/{codes:[\\d|,]+}", method = {GET})
    public StockIndex[] stockIndexList(@PathVariable String codes) {

        String[] codesArr = codes.split(",");

        StockIndex[] stockIndices = sim.findItemsByCodes(codesArr);

        return stockIndices;
    }
}
