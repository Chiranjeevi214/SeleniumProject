package inline.methods_for_signin_signout;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;

import inline.diffbrowsers.Different_Browser_Drivers;
import inline.elements_for_signin_signout.Elements_For_SignIn_SignOut;
import inline.elements_for_signin_signout.Elements_For_SignIn_SignOut.*;

public class Methods_For_SignIn_SignOut extends Different_Browser_Drivers {

	Elements_For_SignIn_SignOut signin_signout = new Elements_For_SignIn_SignOut();

	@BeforeClass
	public void signin_signout() throws InterruptedException, AWTException {
		Thread.sleep(5000);
	
		String myWindowHandle = driver.getWindowHandle();
		driver.switchTo().window(myWindowHandle);
		
		Thread.sleep(5000);
		
		/*((JavascriptExecutor) driver).executeScript(
				"arguments[0].setAttribute('style', 'background: Orange; border: 2px solid red;');",
				driver.findElement(By.xpath("//*[@id=\"test\"]/div[1]")));
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript(
				"arguments[0].setAttribute('style', 'background: none; border: none;');",
				driver.findElement(By.xpath("//*[@id=\"test\"]/div[1]")));
		driver.findElement(By.xpath("//*[@id=\"test\"]/div[1]")).click();
		Thread.sleep(2000);
		// Clickon SIGNIN
		click_On_SIGNIN signIn = signin_signout.new click_On_SIGNIN();
		((JavascriptExecutor) driver).executeScript(
				"arguments[0].setAttribute('style', 'background: Orange; border: 2px solid red;');",
				signIn.getEle_signin());
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript(
				"arguments[0].setAttribute('style', 'background: none; border: none;');", signIn.getEle_signin());
		signIn.getEle_signin().click();
		Thread.sleep(1000);
*/
		// CLick on Username
		/*click_On_UserName un = signin_signout.new click_On_UserName();
		un.getEle_username().click();
		Thread.sleep(2000);
		un.getEle_username().sendKeys("netstellar");
		Thread.sleep(2000);
*/
		// Click On Password
		/*click_On_Password password = signin_signout.new click_On_Password();
		password.getEle_Pass().click();
		Thread.sleep(2000);
		password.getEle_Pass().sendKeys("sr020501");
		Thread.sleep(2000);
*/

		
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("netstellar");
		Thread.sleep(3000);
		
		

        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("sr020391");
		Thread.sleep(3000);
		
		// Click on submit
		
		click_On_Login Login = signin_signout.new click_On_Login();
		((JavascriptExecutor) driver).executeScript(
				"arguments[0].setAttribute('style', 'background: Orange; border: 2px solid red;');",  
				Login.getEle_Login());
		Thread.sleep(5000);
		/*((JavascriptExecutor) driver).executeScript(
				"arguments[0].setAttribute('style', 'background: none; border: none;');", submit.getEle_Submit());*/
		Login.getEle_Login().click();
		Thread.sleep(30000);

		// compare Account is match or not
		/*compare_AccountNumber number = signin_signout.new compare_AccountNumber();
		String account_Number = number.getEle_CAN().getText();
		System.out.println("Compare Account Number is::::::::::" + account_Number);
		//Assert.assertEquals(account_Number, "78228");
		Thread.sleep(5000);*/
	}
	
	
	
	public void signin1() throws InterruptedException, AWTException {
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath(".//*[@id='rcorners2']/div/form/div[1]/div[1]/input")).sendKeys("netstellar");  




		Robot robot = new Robot();
		robot.keyPress((KeyEvent.VK_TAB));
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(".//*[@id='rcorners2']/div/form/div[1]/div[3]/input")).sendKeys("p1a20362");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath(".//*[@id='repeatSelect']")).sendKeys("cgq1.sitesuite.netstellar.com");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath(".//*[@id='rcorners2']/div/form/div[3]/button")).click();
		
		Thread.sleep(5000);
		


	}
	
	
	
		/*public void signOut() throws InterruptedException {
			
		  Actions action = new Actions(driver);
		  action.moveToElement(driver.findElement(By.xpath("//*[@id=\"logg2img\"]"))).build().perform();
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/ul/li[11]/div/a")).click();
		 
		}*/

}
