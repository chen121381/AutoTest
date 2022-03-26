package com.course.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "stu")
public class GroupsClass1 {

    public void stu1(){
        System.out.println("GroupsClass11111中的stu111运行！！！");
    }

    public void stu2(){
        System.out.println("GroupsClass11111中的stu2222运行！！！");
    }
}
