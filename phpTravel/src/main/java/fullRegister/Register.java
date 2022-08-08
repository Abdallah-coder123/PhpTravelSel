package fullRegister;

import java.util.concurrent.TimeUnit;

import javax.naming.ldap.Control;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register {
	WebDriver driver;
String URL="https://phptravels.org/register.php";
String expectedTitle="Register - PHPTRAVELS";
String actualTitle="";
	public void setup()
	{
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\webdriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	//test case 1
	public void CheckTitle()
	{
		actualTitle=driver.getTitle();
		if(actualTitle.contentEquals(expectedTitle)) {
			System.out.print("Pass");
		}else {
			System.out.print("Test Fail");
		}
	}
	
	//testcase 2 
	public void PersonalInformation()
	{
		driver.findElement(By.id("inputFirstName")).sendKeys("Ahmed");
		driver.findElement(By.id("inputLastName")).sendKeys("Abdallah");
		driver.findElement(By.id("inputEmail")).sendKeys("Ahmed.abdallah@gmail.com");
		driver.findElement(By.id("inputPhone")).sendKeys("+9622222222");
	}
	
	//after all Test Case finsh
	public void TearDownDriver()
	{
	driver.close();	
	}
	
	public static void main(String[]args)
	{
		Register register=new Register();
		register.setup();
		register.CheckTitle();
		register.PersonalInformation();
	}
}
