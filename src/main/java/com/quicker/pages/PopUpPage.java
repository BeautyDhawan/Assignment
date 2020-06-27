package com.quicker.pages;

import com.quicker.Base.TestB;

import com.quicker.Base.TestBase;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Iterator;
import java.util.List;

public class PopUpPage extends TestBase {
@FindBy(css=".wpn_modal_actionButton")
WebElement clickOnNotNow;

    public PopUpPage() {
        PageFactory.initElements(driver, this);

    }

    public void PagePopUp() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 20);
      String msg =   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(), 'Would you like to receive notifications and updates from Quikr? Subscribe and get')]"))).getText();
   // String msg = driver.findElement(By.xpath("//*[contains(text(), 'Would you like to receive notifications and updates from Quikr? Subscribe and get')]")).getText();
    System.out.println(msg);
    Thread.sleep(3000);
    driver.findElement(By.cssSelector(".wpn_modal_actionButton")).click();
    }




}
