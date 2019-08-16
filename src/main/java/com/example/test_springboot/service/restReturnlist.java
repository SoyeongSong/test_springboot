package com.example.test_springboot.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

@Service
@RestController

public class restReturnlist {
    public Object actionMethod() {

    List<Object> resultObject = new ArrayList<Object>();
    Map<String, Object> data01 = new HashMap<String, Object>();
    data01.put("USER_NAME", "LUC_KEY");
    Map<String, Object> data02 = new HashMap<String, Object>();
    data02.put("MEMBER_ID", "293029301202");
    Map<String, Object> data03 = new HashMap<String, Object>();
    data03.put("CELLPHONE","1-3923-6940");
    Map<String, Object> data04 = new HashMap<String, Object>();
    data04.put("COUNTRY_CODE","+82");
    
    resultObject.add(data01);
    resultObject.add(data02);
    resultObject.add(data03);
    resultObject.add(data04);
    return resultObject;
   }
}

