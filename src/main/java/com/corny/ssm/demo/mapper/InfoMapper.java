package com.corny.ssm.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.corny.ssm.demo.entity.InfoEntity;

@Mapper
public interface InfoMapper {

    @Select("SELECT * FROM info")
    List<InfoEntity> getInfoList();

}
