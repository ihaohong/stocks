package com.mappers;

import com.models.StockIndex;
import com.models.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StockIndexMapper {

    StockIndex[] findItemsByCodes(String[] codes);

}