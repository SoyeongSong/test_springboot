package com.example.test_springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@CrossOrigin //다른 도메인에 있는 API를 호출 시 선언
@RestController
public class RestWSController {
   @Autowired
   // restReturnlist restReturnlist1;
   // @RequestMapping(value = "ws/OrganizationList")

   //RestAjaxController RestAjaxController1;
   //@RequestMapping(value = "/api/ajax", method = RequestMethod.POST)
   
   // public Object actionMethod(){
   //    Object resultObject = new Object();
   //    resultObject = RestAjaxController1.actionMethod();
   //    return resultObject;
   // }

   // public Object getParmWithAjax(){
   //    Object resultObject = new Object();
   //    // resultObject = RestAjaxController1.getParmWithAjax(paramMap);
   //    return resultObject;
   // }
 
   @RequestMapping(value = "/remote/openweather")
      public Object actionMethod() {
      RestTemplate restTemplate = new RestTemplate();
      Object tempObject = new Object();
      Object keyId = "c6409c886f8a84149e3a9f6ed5d983d9";
      Object targetUri = "https://api.openweathermap.org/data/2.5/weather?q=London,uk&appid="+keyId;
      Object resultObject = restTemplate.getForObject(targetUri, Object.class);
      return resultObject;
      } 
}


