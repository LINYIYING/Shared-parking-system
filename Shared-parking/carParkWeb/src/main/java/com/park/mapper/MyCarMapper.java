package com.park.mapper;

import com.park.pojo.MyCar;
import com.park.pojo.Record;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface MyCarMapper {
    List<MyCar> findAllCar();
    int insertCar(Map map);
    int deleteCar(int id);
    List<MyCar> queryCarByUid(String uid);
}
