package com.park.service;

import com.park.pojo.MyCar;

import java.util.List;
import java.util.Map;

public interface MyCarService {
    List<MyCar> findAllCar();
    int insertCar(Map map);
    int deleteCar(int id);
    List<MyCar> queryCarByUid(String uid);


}
