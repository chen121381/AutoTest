package com.course.testng.groups;

import com.sun.javaws.security.AppContextUtil;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsTest {
//    @Test(groups = "server")
//    public void testServer1(){
//        System.out.println("这是服务端的测试组11111");
//    }
//    @Test(groups = "server")
//    public void testServer2(){
//        System.out.println("这是服务端的测试组22222");
//    }


    @Test(groups = "client")
    public void testClient3(){
        System.out.println("这是客户端的测试组333333");
    }
    @Test(groups = "client")
    public void testClient4(){
        System.out.println("这是客户端的测试组4444444");
    }
    @Test(groups = "server")
    public void testServer1(){
        System.out.println("这是服务端的测试组11111");
    }
    @Test(groups = "server")
    public void testServer2(){
        System.out.println("这是服务端的测试组22222");
    }
    @BeforeGroups("client")
    public void beforeGroupClient1(){
        System.out.println("客户端的测试组开始运行！！！！！");
    }

    @AfterGroups("client")
    public void afterGroupClient2(){
        System.out.println("客户端的测试组运行结束！！！！！");
    }
    @BeforeGroups("server")
    public void beforeGroupsServer1(){
        System.out.println("服务端的测试组开始运行！！！！！");
    }

    @AfterGroups("server")
    public void afterGroupsServer2(){
        System.out.println("服务端的测试组运行结束！！！！！");
    }


//    @BeforeGroups("client")
//    public void beforeGroupClient1(){
//        System.out.println("客户端的测试组开始运行！！！！！");
//    }
//
//    @AfterGroups("client")
//    public void afterGroupClient2(){
//        System.out.println("客户端的测试组运行结束！！！！！");
//    }
}
