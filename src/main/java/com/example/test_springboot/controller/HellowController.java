package com.example.test_springboot.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin //다른 도메인에 있는 API를 호출 시 선언
@RestController

public class HellowController {
 @RequestMapping(value = "/resthellow")
 public String hellow() {
 return "Welcome Hello My Funny World!! ";
 }
}