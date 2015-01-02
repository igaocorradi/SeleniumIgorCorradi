import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.junit.Assert;



public class testLivros {
	
   @Test
  public void testeSelenium(){
  String email = "elias.nogueira@live.com";
  String senha = "selenium";
  DesiredCapabilities cap = DesiredCapabilities.android();
  cap.setJavascriptEnabled(true);
  cap.setCapability("chrome.binary","C:/ProgramFiles(x86)/Google/Chrome/Application/chrome.exe");
  System.setProperty("webdriver.chrome.driver","drirvers/chrome/chromedriver.exe");
  WebDriver driver =  new ChromeDriver(cap);    
     
  driver.get("https://lojaexemplod.lojablindada.com/customer/account/login/?SID=csu5rea7943qkhup9ru770qqo5");
  /*
  WebElement eluser = driver.findElement(By.id("email"));
  eluser.sendKeys(email);
 
  WebElement elsenha = driver.findElement(By.id("pass"));
  elsenha.sendKeys(senha);
 
  WebElement btnSend = driver.findElement(By.id("send2"));
  btnSend.click();
  System.out.println("Efetuando login");
   */
  
  driver.get("http://www.lojaexemplodelivros.com.br/?SID=csu5rea7943qkhup9ru770qqo5");
 
  WebElement btnSearch = driver.findElement(By.id("search"));
  btnSearch.sendKeys("Harry Potter");
  btnSearch.submit();
  
 
  WebElement livro = driver.findElement(
		By.partialLinkText("Harry Potter e as Relíquias da Morte"));
  livro.click();
  
  livro = driver.findElement(By.className("link-wishlist"));
  livro.click();
  
  
  org.junit.Assert.assertTrue("[PRODUTO DE EXEMPLO] - Harry Potter e as Relíquias da Morte foi adicionado a sua lista de desejos. Clique aqui para continuar comprando", false);
  
  
   }
}
