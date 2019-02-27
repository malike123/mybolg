package com.malike.bolg.repository;

import com.malike.bolg.model.Messageboard;

public interface MessageboardMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Messageboard record);

    int insertSelective(Messageboard record);

    Messageboard selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Messageboard record);

    int updateByPrimaryKeyWithBLOBs(Messageboard record);

    int updateByPrimaryKey(Messageboard record);
}