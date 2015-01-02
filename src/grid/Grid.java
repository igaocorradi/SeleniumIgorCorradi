package grid;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Grid {

  @Test
  public void testLogin() {
    DesiredCapabilities cap = DesiredCapabilities.chrome();
    cap.setJavascriptEnabled(true);
    cap.setCapability("chrome.binary","C:/ProgramFiles(x86)/Google/Chrome/Application/chrome.exe"); 
    System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
    WebDriver driver = new ChromeDriver(cap);
    driver.get("http://jira.base2.com.br/login.jsp");
    WebElement element = driver.findElement(By.id("login-form-username"));
    element.sendKeys("igor.cotta");
    element = driver.findElement(By.id("login-form-password"));
    element.sendKeys("1234abcdef");
    element = driver.findElement(By.id("login-form-submit"));
    element.submit();

  }

}
