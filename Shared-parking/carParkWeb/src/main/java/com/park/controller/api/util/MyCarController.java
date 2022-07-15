package com.park.controller.api.util;

import com.alibaba.fastjson.JSON;
import com.park.pojo.MyCar;
import com.park.pojo.Record;
import com.park.pojo.Rent;
import com.park.service.MyCarService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@Controller
public class MyCarController {

    @Autowired
    MyCarService myCarService;

    @ResponseBody
    @RequestMapping(value = "/getCarByUid", method = RequestMethod.POST,produces="application/json;charset=UTF-8")
    public String queryCarByUid(@Param("uid") String uid,HttpServletRequest request){
        List<MyCar> cars = myCarService.queryCarByUid(uid);
        String result = JSON.toJSONString(cars);
        System.out.println(result);
        return result;
    }

    //新增car
    @ResponseBody
    @RequestMapping(value = "/insertCar", method = RequestMethod.POST)
    public String insertRent(@RequestBody Map map){
        System.out.println(map.toString());
        int n = myCarService.insertCar(map);
        if(n>0){
            return "success";
        }
        return "failure";
    }

    @ResponseBody
    @RequestMapping(value = "/deleteCar", method = RequestMethod.POST)
    public String deleteCar(@RequestParam("id") int id){
        int n = myCarService.deleteCar(id);
        if(n>0){
            return "success";
        }
        return "failure";
    }
}
