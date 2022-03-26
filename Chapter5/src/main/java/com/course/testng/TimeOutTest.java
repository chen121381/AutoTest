package com.course.testng;

import org.testng.annotations.Test;

public class TimeOutTest {

    @Test(timeOut = 2000)
    public void testTimeOut() throws InterruptedException {
        Thread.sleep(1000);
    }
}
