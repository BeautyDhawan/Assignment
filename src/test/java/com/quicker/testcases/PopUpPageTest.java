package com.quicker.testcases;

import com.quicker.pages.PopUpPage;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class PopUpPageTest extends TestBase {

    PopUpPage popUpPage;

    public PopUpPageTest(){
       super();
      }

    @BeforeSuite
    public void setUp() throws InterruptedException {
        initialization();
        Thread.sleep(10000);
    }

    @Test
    public void PopUpHandle() throws InterruptedException {
        popUpPage.PagePopUp();
    }


}

