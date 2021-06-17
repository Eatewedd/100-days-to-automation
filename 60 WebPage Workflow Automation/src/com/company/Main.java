package com.company;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        //Introduce current date and time
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();

        //Introduce current date
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MMM/yyyy");
        LocalDate today = LocalDate.now();

        //Install Chrome WebDriver
        System.setProperty("webdriver.chrome.driver", "**************************");
        WebDriver driver = new ChromeDriver(); //Launch Chrome browser

        //Load the target page
        driver.get("**************************");

        //Log in, enter username
        WebElement **************************Login = driver.findElement(By.name("**************************"));
        G****ALogin.clear();
        G****ALogin.sendKeys("**************************");

        //Log in, enter password
        WebElement **************************Password = driver.findElement(By.name("**************************"));
        G****Password.clear();
        G****Password.sendKeys("**************************");

        //Click login button
        WebElement G****SignInButton = driver.findElement(By.id("**************************"));
        G****SignInButton.click();

        //Maximize the window to make the elements clickable
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //Click the "New Request" button
        WebElement NewRequest = driver.findElement(By.cssSelector("************************** "));
        NewRequest.click();

        //Enter the title of the request
        WebElement ReqTitle = driver.findElement(By.id("**************************"));
        ReqTitle.clear();
        ReqTitle.sendKeys("DN Automation Test " + dtf.format(now));

        //Enter the request description
        WebElement ReqDesc = driver.findElement(By.id("**************************"));
        ReqDesc.clear();
        ReqDesc.sendKeys("Test request description in**************************");

        //Select the "No" radio button in the field asking about activity
        WebElement isActivity = driver.findElement(By.cssSelector("************************** >**************************l"));
        isActivity.click();
        Thread.sleep(3000);

        //Skip Date Pickers as they get erased anyway when you select 
        // Enter the answer about ************************** is used
        WebElement************************** = driver.findElement(By.name("**************************"));
        Select oSelect = new Select(h**************************);
        oSelect.selectByValue("FS");
        Thread.sleep(4000);

        //Select the **************************e form the dropdown
        WebElement t**************************ce = driver.findElement(By.id("**************************"));
        t**************************e.click();
        WebElement a**************************l = driver.findElement(By.cssSelector("#**************************"));
        Thread.sleep(1000);
        a**************************al.click();
        Thread.sleep(3000);

        //Click outside the dropdown to hide it and save the previous answer
        WebElement outerClick = driver.findElement(By.cssSelector("#**************************r"));
        Thread.sleep(1000);
        outerClick.click();
        Thread.sleep(3000);

        //Scroll to the top as you can now select dates without erasing them later
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0,0);");
        Thread.sleep(3000);

        //CLick "No" on "Is activity" radio button
        WebElement isActivity2 = driver.findElement(By.cssSelector("#**************************r > fieldset > table > tbody > tr > td:nth-child(2) > span"));
        isActivity2.click();
        Thread.sleep(3000);

        //Enter the Start Date into the Date Picker
        WebElement startDate = driver.findElement(By.id("d**************************"));
        startDate.click();
        startDate.sendKeys(today.format(df));
        Thread.sleep(3000);

        //Click outside to hide the date picker
        WebElement hideStartDate = driver.findElement(By.id("**************************"));
        hideStartDate.click();

        //Enter the End Date into the Date Picker
        WebElement endDate = driver.findElement(By.id("d**************************"));
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0,70);");
        endDate.click();
        endDate.sendKeys(today.format(df));
        Thread.sleep(3000);

        //Click outside to hide the date picker
        WebElement hideEndDate = driver.findElement(By.id("**************************4"));
        hideEndDate.click();

        //Click Attach File for Letter of Request
        WebElement attachFile = driver.findElement(By.cssSelector("#**************************"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", attachFile);
        Thread.sleep(3000);
        attachFile.click();
        Thread.sleep(3000);
        //SendKeys to Upload
        WebElement attachFile3 = driver.findElement(By.cssSelector("#**************************t"));
        attachFile3.sendKeys("C:\\User**************************test.jpg");
        WebElement attachFileFinalize = driver.findElement(By.cssSelector("#**************************d"));
        attachFileFinalize.click();
        Thread.sleep(3000);

        //Scroll to and select T**************************a as it is not covered by other dropdown lists
        WebElement t**************************a = driver.findElement(By.cssSelector("#**************************e"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", th**************************a);
        therapeuticArea.click();
        WebElement ca**************************sm = driver.findElement(By.cssSelector("**************************"));
        ca**************************sm.click();
        Thread.sleep(3000);

        //Click outside to hide the previous dropdown
        WebElement outerClick2 = driver.findElement(By.cssSelector("**************************r"));
        outerClick2.click();
        Thread.sleep(4000);

        //Select the radio button about the company influence
        WebElement **************************e = driver.findElement(By.cssSelector("**************************n"));
        r**************************e.click();
        Thread.sleep(5000);
        **************************e.click();
        Thread.sleep(3000);

        //Click the "Next Step" button
        WebElement nextStep2 = driver.findElement(By.id("**************************"));
        nextStep2.click();
        Thread.sleep(5000);

        //Select the non-financial nature radio button
        WebElement no**************************l1 = driver.findElement(By.cssSelector("**************************"));
        nonFinancial1.click();

        //Enter the description of the non-financial nature
        WebElement no**************************ion = driver.findElement(By.cssSelector("**************************"));
        n**************************n.click();
        **************************n.sendKeys("test");

        //Click the "Next Step" button
        WebElement nextStep3 = driver.findElement(By.id("**************************"));
        nextStep3.click();
        Thread.sleep(3000);

        //Submit the request
        WebElement submit = driver.findElement(By.id("**************************"));
        submit.click();

        //Close the current website
        driver.close();
    }
}