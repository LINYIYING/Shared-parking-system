package com.park.service.impl;

import com.park.mapper.MyCarMapper;
import com.park.pojo.MyCar;
import com.park.service.MyCarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Service
public class MyCarServiceImpl implements MyCarService {

    @Autowired
    MyCarMapper myCarMapper;

    @Override
    public List<MyCar> findAllCar() {
        return myCarMapper.findAllCar();
    }

    @Override
    public int insertCar(Map map) {
        return myCarMapper.insertCar(map);
    }

    @Override
    public int deleteCar(int id) {
        return myCarMapper.deleteCar(id);
    }

    @Override
    public List<MyCar> queryCarByUid(String uid) {
        return myCarMapper.queryCarByUid(uid);
    }


}
