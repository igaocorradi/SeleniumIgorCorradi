import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;



public class Medio {
	public static WebDriver driver;
	
	@BeforeTest
	public static void setUp() throws Exception{
	 DesiredCapabilities cap = DesiredCapabilities.chrome();
	  
	  cap.setJavascriptEnabled(true);
	  //setar onde está o chrome executável
	  cap.setCapability("chrome.binary","C:/ProgramFiles(x86)/Google/Chrome/Application/chrome.exe");
	  System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
	
	  //abre chrome
	  driver =  new ChromeDriver(cap);
	   }

    
   @AfterTest
   public void tearDown(){
      driver.close();
   }
}