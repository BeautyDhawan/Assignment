package com.quicker.pages;
import com.quicker.Base.TestB;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class PostJobPage extends TestB {

    @FindBy(css = ".btnHire")
    WebElement ClickOnHire;
    @FindBy(css = ".jsCompanyQuestion li:nth-child(1) a")
    WebElement companytypess;
    @FindBy(css = ".postad-btn")
    WebElement PostJobbtn;

    @FindBy(css = ".jsCharLimit:nth-child(3)")
    WebElement JobTitle;

    @FindBy(css = ".273")
    WebElement Checkbox1;

    public PostJobPage() {

        PageFactory.initElements(driver, this);
    }

    public void QuickerJObsTitle() throws InterruptedException {

        WebElement element = driver.findElement(By.cssSelector(".row .logo-sprite.q-jobs-logo"));
        element.getText();
        element.click();
        Thread.sleep(3000);
    }

    public void checkQuickerPage() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 15);
        String msg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(), 'Welcome to QuikrJobs')]"))).getText();
        System.out.println(msg);
    }

    public void clickonhire() {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOf(ClickOnHire)).click();
        wait.until(ExpectedConditions.visibilityOf(PostJobbtn)).click();
    }

    public void JobTitle(String str) {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        WebElement el = wait.until(ExpectedConditions.visibilityOf(JobTitle));
        el.click();
        el.sendKeys(str);


    }

    public void checkbox() throws InterruptedException {
        List<WebElement> list = driver.findElements(By.xpath("//input[@name='jobTypeNew' and @type='radio']"));
        for (int i = 0; i < list.size(); i++) {
            WebElement ll = list.get(i);
            String value = ll.getAttribute("data-value");
            System.out.println(value);

//       if(value.equalsIgnoreCase("Full Time Jobs")){
//           ll.click();
//       }
        }

    }

    public void dropdown() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        WebElement el = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"postad-role\"]")));
        el.click();
        el.sendKeys("Driver");
        Thread.sleep(2000);
        WebElement elnw = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[5]/div[3]/div/div[1]/form/div/div[2]/div[3]/div/div[3]/div[1]/div/ul/li[223]/a")));
        elnw.click();


    }

    public void salary() {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        WebElement el = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("postad-salary-min")));
        el.sendKeys("5000");
        WebElement el1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("postad-salary-max")));
        el1.clear();
        el1.sendKeys("8000");


    }

    public void Experience() {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        WebElement el = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("postad-experience-min")));
        el.sendKeys("1");
        WebElement el1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("postad-experience-max")));
        el1.sendKeys("2");

    }
    public void city() {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        WebElement el = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("postad-city")));
        el.sendKeys("Bangalore");
        WebElement el1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#li_2 > a:nth-child(1)")));
        el1.click();
    }
    public void localities() {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        WebElement el = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("postad-locality-freetext")));
        el.sendKeys("Jp Nagar");
        WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#locality_list_id-672")));
        e.click();


    }
    public void jobdec() {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        WebElement el = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("postad-desc")));
        el.sendKeys("this job is full time job with good salary");
    }
    public void companyname() {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        WebElement el = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("postad-hiring-companyname")));
        el.sendKeys("aarna infotech");
    }
    public void companytype() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement el = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("postad-company-type")));
        el.click();

        JavascriptExecutor je = convertToJsExecutor(driver);
       je.executeScript("arguments[0].scrollIntoView();",companytypess);
        WebElement el1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".jsCompanyQuestion li:nth-child(1) a")));

       el1.click();

    }
    public void email() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement el = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("postad-email")));
        el.sendKeys("dhawanbeauty@gmail.com");
    }
    public void phone() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement el1=  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("postad-privacy")));
        el1.click();
        WebElement el = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("postad-mobile")));
        el.sendKeys("8871510250");
    }
    public void Radiobtn() {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        WebElement el1=  wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".radio-custom-label")));
        el1.click();

    }
    public void postbtn() {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        WebElement el = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("postAdStepOne")));
        el.click();
    }


}


