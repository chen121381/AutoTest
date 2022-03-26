package com.course.testng;

import org.testng.annotations.*;

public class BasicAnnotation {

   //最基本的注解，标识他是一个测试方法
    @Test
    public void testCase1(){
        System.out.println("这是一个测试用例1");
    }

    @Test
    public void testCase2(){
        System.out.println("这是一个测试用例2");
    }
    @Test
    public void testCase3(){
        System.out.println("这是一个测试用例3");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.printf("Thread ID : %s%n",Thread.currentThread().getId());
        System.out.println("beforeMethod这是测试用例方法之前");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.printf("Thread ID : %s%n",Thread.currentThread().getId());
        System.out.println("afterMethod这是测试用例方法之后");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("beforeClass这是测试用例方法之前");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("afterClass这是测试用例方法之后");
    }
}
