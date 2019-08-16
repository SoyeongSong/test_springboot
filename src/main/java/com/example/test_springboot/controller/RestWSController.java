package com.example.test_springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


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

   public Object getParmWithAjax(){
      Object resultObject = new Object();
      // resultObject = RestAjaxController1.getParmWithAjax(paramMap);
      return resultObject;

   }

   
}