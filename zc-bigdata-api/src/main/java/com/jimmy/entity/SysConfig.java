package com.jimmy.entity;

import lombok.Data;

import java.sql.Date;

/**
 * Created by Administrator on 2019/4/10/010.
 */
@Data
public class SysConfig {
    private String variable;
    private String value;
    private String setBy;
    private Date setTime;
}
