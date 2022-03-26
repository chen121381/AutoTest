package com.course.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "ter")
public class GroupsClass3 {

    public void ter1(){
        System.out.println("GroupsClass33333中的ter1111运行！！！");
    }

    public void stu2(){
        System.out.println("GroupsClass33333中的ter2222运行！！！");
    }
}
