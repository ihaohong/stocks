package com.models;

import lombok.Data;

import java.io.Serializable;

@Data
public class StockIndex implements Serializable {
    private String code;
    private String name;
    private String change;
    private String open;
    private String close;
}
