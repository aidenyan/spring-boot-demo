package com.jimmy.mapper;

import com.jimmy.entity.Db;
import com.jimmy.entity.DbKey;
import org.apache.ibatis.annotations.Mapper;

@Mapper//与配合使用可以是根据xml进行实例化生成bean
public interface DbMapper {
    int deleteByPrimaryKey(DbKey key);

    int insert(Db record);

    int insertSelective(Db record);

    Db selectByPrimaryKey(DbKey key);

    int updateByPrimaryKeySelective(Db record);

    int updateByPrimaryKey(Db record);
}