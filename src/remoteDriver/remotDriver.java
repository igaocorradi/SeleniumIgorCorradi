package remoteDriver;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class remotDriver {

	@Test
	public void TesteFirefox() throws MalformedURLException{
		
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		cap.setJavascriptEnabled(true);
	      //setar onde está o chrome executável
		  //setar onde está o chrome executável
	      cap.setCapability("chrome.binary","C:/ProgramFiles(x86)/Google/Chrome/Application/chrome.exe");
	      System.setProperty("webdriver.chrome.driver","C://Users//Igor Cotta//Downloads//chromedriver.exe");
	 
	      WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), cap);     
	      driver.get("http://eliasnogueira.com/arquivos_blog/selenium/desafio/2desafio/");
	      WebDriverWait espera = new WebDriverWait(driver, 5); // espera 5 segundos

	driver.get("http://www.google.com");
	
	// RemoteWebDriver does not implement the TakesScreenshot class
	// if the driver does have the Capabilities to take a screenshot
	// then Augmenter will add the TakesScreenshot methods to the instance
	WebDriver augmentedDriver = new Augmenter().augment(driver);
	@SuppressWarnings("unused")
	File screenshot = ((TakesScreenshot)augmentedDriver).
	getScreenshotAs(OutputType.FILE);
	}
}
