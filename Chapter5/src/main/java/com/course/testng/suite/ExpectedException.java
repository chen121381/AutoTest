package com.course.testng.suite;

import org.testng.annotations.Test;

public class ExpectedException {

    @Test(expectedExceptions = RuntimeException.class)
    public void test(){
        System.out.println("这是异常测试");
        throw new RuntimeException();
    }
}
