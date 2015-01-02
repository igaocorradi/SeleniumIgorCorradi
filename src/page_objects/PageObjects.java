package page_objects;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.internal.annotations.ExpectedExceptionsAnnotation;

import com.google.common.base.Predicate;


public class PageObjects {
  
  @Test
    public void testLogin() throws MalformedURLException {
    DesiredCapabilities cap = DesiredCapabilities.chrome();
    cap.setJavascriptEnabled(true);
    cap.setCapability("chrome.binary","C:/ProgramFiles(x86)/Google/Chrome/Application/chrome.exe");
    System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
    WebDriver driver = new ChromeDriver(cap);
    WebElement elementWait;
    
    //logar no gira
    driver.get("http://jira.base2.com.br/login.jsp");
    WebElement element = driver.findElement(By.id("login-form-username"));
    element.sendKeys("igor.cotta");
    element = driver.findElement(By.id("login-form-password"));
    element.sendKeys("1234abcdef");
    element = driver.findElement(By.id("login-form-submit"));
    element.submit();
    
    //especifica qual projeto está
    driver.get("http://jira.base2.com.br/browse/RH-462");
    
    
    driver.get("http://jira.base2.com.br/secure/TempoAddHours!default.jspa?key=RH-462");

    new WebDriverWait(driver,5000);
    element = driver.findElement(By.id("time-popup"));
    element.sendKeys("4h 0m");
    
    element = driver.findElement(By.id("issue-add-button"));
    element.submit();
    
    element = driver.findElement(By.id("header-details-user-fullname"));
    element.submit();
    
    element = driver.findElement(By.id("log_out"));
    element.submit();

    new WebDriverWait(driver,10000);
    Assert.assertTrue(driver.getCurrentUrl().contains("Logout!default"));
    
  }
}
