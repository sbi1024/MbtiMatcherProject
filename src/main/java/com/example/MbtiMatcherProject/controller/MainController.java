package com.example.MbtiMatcherProject.controller;

import com.example.MbtiMatcherProject.service.MbtiServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

import java.util.List;
import java.util.Map;



@Slf4j
@Controller
public class MainController {
    private final MbtiServiceImpl mbtiServiceImpl;

    @Autowired
    public MainController(MbtiServiceImpl mbtiServiceImpl) {
        this.mbtiServiceImpl = mbtiServiceImpl;
    }

    @GetMapping("/test")
    public List<Map<String, Object>> mainAction() {
        log.info("mainAction start...!!");
        List<Map<String, Object>> returnData = new ArrayList<>();
        try {
            returnData = mbtiServiceImpl.selectData();
        } catch (Exception e) {
            e.printStackTrace();
            e.getMessage();
        }
        return returnData;
    }
}
