package org.prog;

import org.testng.annotations.*;


public class MyTest extends BaseTest {

    @AfterSuite
    public void beforeAll(){
        System.out.println("=====END_AUTOMATED_RUN=====");
    }
    @BeforeMethod
    public void beforeTest(){
        System.out.println("=====START_BASE_TEST=====");
    }

    @Test
    public void myTest(){
        System.out.println("Hello Test!");
    }

    @Test
    public void myAnotherTest(){
        System.out.println("Hello Test!");
    }

//    @AfterMethod
//    public void afterTest(){
//        System.out.println("=====END_BASE_TEST=====");
//    }

}
