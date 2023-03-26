package com.example.demo.server;

import com.example.demo.Bean.User;
//import com.sun.deploy.net.HttpResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Parameter;

@RestController
@Api(value = "/",description = "这个是全部的post方法")
@RequestMapping("/v1")
public class MyPsotMethod {

    private static Cookie cookie;

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @ApiOperation(value = "登录接口，成功后可以获取cookies信息",httpMethod = "POST")
    public String login(HttpServletResponse response,
                        @RequestParam(value = "userName",required = true) String userName,
                        @RequestParam(value = "passWord",required = true) String passWord){
        if (userName.equals("陈润艇")&&passWord.equals("123456")){
           cookie= new Cookie("login","true");
           response.addCookie(cookie);
           return "恭喜您登录成功！！！";
        }
        return "很遗憾登录失败！！！";
    }

    @RequestMapping(value = "/getUserList",method = RequestMethod.POST)
    @ApiOperation(value = "获取用户列表",httpMethod = "POST")
    public String getUserList(HttpServletRequest request,
                              @RequestBody User user){
        User user1;
        Cookie[] cookie=request.getCookies();
        for (Cookie cookie1 : cookie) {
            if(cookie1.getName().equals("login") && cookie1.getValue().equals("true")
             && user.getUserName().equals("陈润艇") && user.getPassWord().equals("123456")){
                user1=new User();
                user1.setName("lisi");
                user1.setAge("20");
                user1.setSex("男");
                return user1.toString();
            }
        }

        return "参数信息错误！！";
    }
}
