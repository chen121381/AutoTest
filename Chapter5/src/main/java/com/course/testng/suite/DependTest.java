package com.course.testng.suite;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DependTest {

    @Test
    public void test1(){
        System.out.println("test1 run");
    }

    @Test(dependsOnMethods = {"test1"})
    public void test2(){
        System.out.println("test2 run");
    }



    @DataProvider(name = "data")
    public Object[][] test3(){
     return    new Object[][]{
                {"张仨",2},
                {"李四",3},
        };
    }


    @Test(dataProvider = "data")
    public void test4(String name, int age){
        System.out.println("name = "+name+";   age = "+age);
    }


}
