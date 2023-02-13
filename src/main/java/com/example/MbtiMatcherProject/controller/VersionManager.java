package com.example.MbtiMatcherProject.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class VersionManager {
    @GetMapping("/version")
    public String versionConfirm(){
        log.info("[23.02.13 (월) 서보인]]");
        String returnData = "[23.02.11 (월) 서보인]]";
        return returnData;
    }
}
