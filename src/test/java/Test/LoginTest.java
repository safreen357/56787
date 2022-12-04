package Test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import page.LoginPage;

public class LoginTest {
	 
		
		WebDriver driver;
		public LoginPage lp;
		
	public  void initObject() {
			
			lp=new LoginPage(driver);
		}
		
		@BeforeClass
		public void init() {
			
			//launching
			
			
			//step-5 creating objects
			initObject();
			
			
		}
		
		@Test
		public void login() throws InterruptedException {
			//step-1 enter cred
			lp.enterCred("Admin", "admin123");
			System.out.println("user name & password entered successfully");
			
			//step-2
			lp.clickButton();
			Thread.sleep(3000);
			System.out.println("successfully clicked on button");
			
		}
		
		


}
