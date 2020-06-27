package com.quicker.testcases;

import com.quicker.Base.TestBase;
import com.quicker.pages.PopUpPage;
import com.quicker.pages.PostJobPage;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import static com.quicker.Base.TestBase.initialization;

public class PostJobTest extends TestBase {
    PostJobPage page;
    PopUpPage pop;

    public PostJobTest() {
        super();
    }

    @BeforeSuite
    public void setup() throws InterruptedException {
        initialization();
        pop = new PopUpPage();
        pop.PagePopUp();
        page = new PostJobPage();
    }

    @Test(priority = 1)
    public void VarifyQuickerJobTitle() throws InterruptedException {
        page.QuickerJObsTitle();
    }

    @Test(priority = 2)
    public void ClickOnHireCandidates() throws InterruptedException {
        page.checkQuickerPage();

    }

    @Test(priority = 3)
    public void Click() {
        page.clickonhire();
    }

    @Test(priority = 4)
    public void CreateJobPost() {
        page.JobTitle(prop.getProperty("title"));

    }

    @Test(priority = 5)
    public void varifyChcekBOx() throws InterruptedException {
        page.checkbox();

    }
    @Test(priority = 6)
    public void dropdown() throws InterruptedException {
        page.dropdown();
    }
    @Test(priority = 7)
    public void salary(){
        page.salary();
    }
    @Test(priority = 8)
    public void exp(){
        page.Experience();
    }
    @Test(priority = 9)
    public void city() {
        page.city();
        page.localities();
        page.jobdec();
        page.companyname();
    }
    @Test(priority = 10)
            public void companytype() throws InterruptedException {
        page.companytype();

    }



}
