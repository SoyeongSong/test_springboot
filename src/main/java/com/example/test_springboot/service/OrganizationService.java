package com.example.test_springboot.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import org.springframework.web.bind.annotation.RestController;

@Service
@RestController

public class OrganizationService {
    public Object actionMethod() {
    Map<String, Object> resultObject = new HashMap<String, Object>();
    resultObject.put("MEMBER_ID", "293029301202");
    resultObject.put("CELLPHONE","001-3923-6940");
    resultObject.put("COUNTRY_CODE","+82");
    return resultObject;
    }
}