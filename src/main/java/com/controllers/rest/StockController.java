package com.controllers.rest;

import com.models.StockIndex;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class StockController {
    @RequestMapping(value = "/stock/index/{code}", method = {GET})
    public StockIndex stockIndex(@PathVariable String code) {
        StockIndex si = new StockIndex();
        si.setCode(code);
        si.setIndex(22L);

        return si;
    }
}
