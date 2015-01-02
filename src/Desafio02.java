import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Desafio02 {

@Test
public void testeSelenium(){
DesiredCapabilities cap = DesiredCapabilities.chrome();
 
cap.setJavascriptEnabled(true);
 //setar onde está o chrome executável
 cap.setCapability("chrome.binary","C:/ProgramFiles(x86)/Google/Chrome/Application/chrome.exe");
 System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
 
 WebDriver driver = new ChromeDriver(cap);
 driver.get("http://eliasnogueira.com/arquivos_blog/selenium/desafio/2desafio/");
 WebDriverWait espera = new WebDriverWait(driver, 5); // espera 5 segundos
 
// alterando o nome
 WebElement nomeDisplay = driver.findElement(By.id("name_rg_display_section"));
 nomeDisplay.click();
 WebElement elementoPessoa = driver.findElement(By.id("nome_pessoa"));
 elementoPessoa.clear();
 String nome = "Igor Cotta";
 elementoPessoa.sendKeys(nome);
 driver.findElement(
By.cssSelector(
 		 "#name_hv_editing_section > input[value='Salvar']"))
 		 .click();
 espera.until(ExpectedConditions.visibilityOf(nomeDisplay));
 System.out.println("Troca de nome efetuada com sucesso");


// alterando o e-mail
 WebElement emailDisplay = driver.findElement(By.id("email_rg_display_section"));
 emailDisplay.click();
 WebElement elementoEmail = driver.findElement(By.id("email_value"));
 elementoEmail.clear();
 String email = "igor.corradi01@gmail.com";
 elementoEmail.sendKeys(email);

 driver.findElement(By.cssSelector("#email_hv_editing_section > input[value='Salvar']")).click();
 espera.until(ExpectedConditions.visibilityOf(emailDisplay));
 System.out.println("Troca de email efetuada com sucesso");
 
// alterando o telefone
 WebElement telefoneDisplay = driver.findElement(By.id("phone_rg_display_section"));
 telefoneDisplay.click();
 WebElement elementoTelefone = driver.findElement(By.id("phone_value"));
 elementoTelefone.clear();
 String telefone = "+53185509902";
 elementoTelefone.sendKeys(telefone);
 driver.findElement(By.cssSelector("#phone_hv_editing_section > input[value='Salvar']")).click();
 espera.until(ExpectedConditions.visibilityOf(telefoneDisplay));
 System.out.println("Troca de telefone fetuada com sucesso");
	
	 	
// validacoes
 System.out.println("Validando");
 assertEquals(nome, driver.findElement(By.id("name_rg_display_section")).getText());
 System.out.println("Nome OK");
 assertEquals("Email: " + email, driver.findElement(By.id("email_rg_display_section")).getText());
 System.out.println("Email OK");
 assertEquals("Telefone: " + telefone, driver.findElement(By.id("phone_rg_display_section")).getText());
System.out.println("Telefone OK");
 driver.quit();
}
 
	
}