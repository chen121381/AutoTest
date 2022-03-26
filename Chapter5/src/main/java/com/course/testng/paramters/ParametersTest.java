package com.course.testng.paramters;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.lang.reflect.Parameter;

public class ParametersTest {

    @Test
    @Parameters({"name","age"})
    public void parameterTest(String name,String age){
        System.out.println(name +"="+"name"+";"+age+"="+"age");
    }
}
