package com.jimmy.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2019/4/11/011.
 */
@Controller("/swagger")
@Api(value = "swagger", tags = "中文")//api中出现中文会导致api的接口无法点击开来
public class SwaggerController {
    @ApiOperation(value = "demmo")
    @RequestMapping(value="demo1",method = {RequestMethod.GET})
    @ResponseBody
    @ApiImplicitParam(name = "id", value = "条码", paramType = "query", dataType = "String")
    public String demo(String id) {
        return "test" + id;
    }
    @ApiOperation(value = "demmo")
    @RequestMapping(value="demo2",method = {RequestMethod.GET})
    @ResponseBody
    @ApiImplicitParam(name = "id", value = "条码", paramType = "query", dataType = "String")
    public String demo2(String id) {
        return "test" + id;
    }
}
