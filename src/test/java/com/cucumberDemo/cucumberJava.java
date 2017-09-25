package com.cucumberDemo;

import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.firefox.FirefoxDriver;
// import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

/**
 * Created by quentin on 9/23/2017.
 */
public class cucumberJava {
    // Potential problems:
    // 1. If the feature written by PM doesn't make sense, for example, the Given clause cannot be translated to valid code, what happens then?
    //
    // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    // For Paul's demo, Create three features
    // 1. A java API feature, create a dumb class that returns something simple
    // 2. A REST API feature, use the CAS purge feature as an example
    // 3. A web GUI feature, as an example for the Ambulatory project. Use the Test REST api web site and selenium
    //

    WebDriver driver;

    @Given("^I have opened the browser$")
    public void openBrowser() {
        //System.setProperty("webdriver.chrome.driver", "/Users/quentin/Downloads/chromedriver_win32/chromedriver.exe");
        driver = new HtmlUnitDriver();
    }

    @When("^I open Facebook website$")
    public void goToFacebook() {
        //driver.navigate().to("https://www.facebook.com/");
        driver.get("https://www.facebook.com/");
    }

    @Then("^Login button exists$")
    public void loginButton() {
        Assert.assertTrue(driver.findElement(By.id("u_0_v")).isEnabled());
        System.out.println("Login button exists");
    }

    @And("^User name field exists$")
    public void userNameField() {
        Assert.assertTrue(driver.findElement(By.id("email")).isDisplayed());
        System.out.println("User name field exists");
    }

    @And("^Password field exists$")
    public void passwordField() {
        Assert.assertTrue(driver.findElement(By.id("pass")).isDisplayed());
        System.out.println("Password field exists");
    }

    @After
    public void tearDown() {
        System.out.println("CLOSING QQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQ: ");
        driver.close();
    }
}