package com.example.demo.controller;



import com.example.demo.Model.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1")
@Api(value = "v1",description = "这个是我第一个测试版本")
public class AutoStaus {

    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    @RequestMapping(value = "/test")
    public String Test(){
        return "可以放回书架";
    }
    @RequestMapping(value = "/getUserCount",method = RequestMethod.GET)
    @ApiOperation(value = "可以获取用户数量的总数",httpMethod = "GET")
    public List<Integer> getUserCount(){
        return sqlSessionTemplate.selectList("getUserCount");
    }

    @ResponseBody
    @RequestMapping(value = "/addUser ",method = RequestMethod.POST)
    public int addUser( User user){
        int end=sqlSessionTemplate.insert("addUser",user);
        return end;
    }
}
