package com.example.MbtiMatcherProject.service;


import com.example.MbtiMatcherProject.mapper.SelectMapper;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Slf4j
@Service
public class MbtiService implements MbtiServiceImpl {


    private final SelectMapper selectMapper;

    @Autowired
    public MbtiService(SelectMapper selectMapper) {
        this.selectMapper = selectMapper;
    }

    @Override
    public List<Map<String, Object>> selectData() {
        log.info("######## selectData start...!!");
        List<Map<String, Object>> returnData = selectMapper.selectData();
        return returnData;
    }
}
