package com.course.testng.groups;


import org.testng.annotations.Test;

@Test(groups = "stu")
public class GroupsClass2 {

    public void stu1(){
        System.out.println("GroupsClass22222中的stu111运行！！！");
    }

    public void stu2(){
        System.out.println("GroupsClass22222中的stu2222运行！！！");
    }
}
