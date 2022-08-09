package newFullRegister;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewRegister {
  
	WebDriver driver;
	String URL="https://phptravels.org/register.php";
	String expectedTitle="Register - PHPTRAVELS";
	String actualTitle="";
	
	 @BeforeTest
	  public void beforeTest() {
		
				
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\webdriver\\chromedriver.exe");
		 
				driver=new ChromeDriver();
				driver.get(URL);
			}
	  
	@Test
  public void CheckTitle() {
		
			actualTitle=driver.getTitle();
			if(actualTitle.contentEquals(expectedTitle)) {
				System.out.print("Pass");
			}else {
				System.out.print("Test Fail");
				System.out.print("Test Fail");
				System.out.print("Testf");
			}
		
  }
	@Test
	public void PersonalInformation()
	{
		driver.findElement(By.id("inputFirstName")).sendKeys("Ahmed");
		driver.findElement(By.id("inputLastName")).sendKeys("Abdallah");
		driver.findElement(By.id("inputEmail")).sendKeys("Ahmed.abdallah@gmail.com");
		driver.findElement(By.id("inputPhone")).sendKeys("+9622222222");
	}
 

  @AfterTest
  public void TearDownDriver() {
	 
		driver.close();	
		{}
		{}
		{}
		{}
		
		
  }

}
