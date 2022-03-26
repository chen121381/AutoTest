package com.course.testng.paramters;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

    @Test(dataProvider = "data")
    public void testDataProvider(String name , int age){
        System.out.println("name = "+name+";   age = "+age);
    }

    @DataProvider(name="data")
    public Object[][] dataPro(){
        Object[][] objects = new Object[][]{
                {"张三",10},
                {"李四",40},
                {"王五",19},
        };
        return objects;
    }
}
