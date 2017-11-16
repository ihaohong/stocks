package com.mappers;

import com.models.City;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CityMapper {

    City findByState(String state);

}