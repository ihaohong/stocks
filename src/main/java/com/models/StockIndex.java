package com.models;

import lombok.Data;

@Data
public class StockIndex {
    private Long index;
    private String code;
    private String name;
    private String change;
    private String open;
}
