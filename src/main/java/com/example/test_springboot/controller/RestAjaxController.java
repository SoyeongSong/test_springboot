package com.example.test_springboot.controller;

import java.util.*;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Service
@RestController
public class RestAjaxController {
        // public String getParmWithAjax() {
        // return "Welcome to Hellow World !! ";
        // }
        @RequestMapping(value = "/api/ajax2")
        public String getParmWithAjax(@RequestParam Map<String, Object> paramMap) {
            String str = (String) paramMap.get("title");
            return "Welcome to Hello World !! " + str;
        }
        
}