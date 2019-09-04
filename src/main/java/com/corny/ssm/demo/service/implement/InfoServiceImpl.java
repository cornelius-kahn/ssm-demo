package com.corny.ssm.demo.service.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.corny.ssm.demo.entity.InfoEntity;
import com.corny.ssm.demo.mapper.InfoMapper;
import com.corny.ssm.demo.service.IInfoService;

@Service
public class InfoServiceImpl implements IInfoService {

    @Autowired
    private InfoMapper infoMapper;

    @Override
    public List<InfoEntity> getInfoList() {
        return infoMapper.getInfoList();
    }

}
