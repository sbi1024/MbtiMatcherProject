package com.example.MbtiMatcherProject.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface SelectMapper {
    List<Map<String, Object>> selectData();
}
