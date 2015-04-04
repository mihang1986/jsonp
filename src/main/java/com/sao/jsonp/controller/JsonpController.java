package com.sao.jsonp.controller;

import com.alibaba.fastjson.JSON;
import com.sao.jsonp.aspect.JsonpAspect;
import com.sao.jsonp.bean.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Calendar;

/**
 * Created by navia on 2015/4/3.
 */
@Controller
@RequestMapping(value = "/jsonp")
public class JsonpController {
    @RequestMapping(value = "getStudent")
    @ResponseBody
    public String getStudent(@RequestParam String name, @RequestParam String callbackparam){
        Student s = new Student("这是一个牛逼的ID", name, Calendar.getInstance().getTime());
        return callbackparam + "(" + JSON.toJSONString(s) + ")";
    }
}
