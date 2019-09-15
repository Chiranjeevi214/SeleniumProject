package inline.elements_for_signin_signout;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import inline.diffbrowsers.Different_Browser_Drivers;

public class Elements_For_SignIn_SignOut extends Different_Browser_Drivers{
	
	
	//Dev Console Login Credidentials
	
	
	
	
	
	//private click_On_SIGNIN signin;
	private click_On_UserName un;
	private click_On_Password pass;
	private click_On_Login login;
	//private compare_AccountNumber can;
	
	
	/*public class click_On_SIGNIN{
		
		WebElement ele_signin = driver.findElement(By.xpath("//*[@id=\"sign_in\"]"));

		public WebElement getEle_signin() {
			return ele_signin;
		}

		public void setEle_signin(WebElement ele_signin) {
			this.ele_signin = ele_signin;
		}
	
		
		
	}
*/	

	
	public class click_On_UserName{
		
		//WebElement ele_AN = driver.findElement(By.xpath("//*[@id=\"acc\"]"));
		
		WebElement ele_username = driver.findElement(By.xpath("//*[@id=\"username\"]"));
		
		public WebElement getEle_username() {
			return ele_username;
		}

		public void setEle_username(WebElement ele_username) {
			this.ele_username = ele_username;
		}

					
	}
	
	
	
	public class click_On_Password{
		
		
		WebElement ele_Pass = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		
		public WebElement getEle_Pass() {
			return ele_Pass;
		}

		public void setEle_Pass(WebElement ele_Pass) {
			this.ele_Pass = ele_Pass;
		}
		
	}
	
	
	
	public class click_On_Login{
	   
		//WebElement ele_Login = driver.findElement(By.xpath("/html/body/div/form/div/div[5]/button"));
		
		                                                   
		
		WebElement ele_Login = driver.findElement(By.xpath("/html/body/div/form/div[5]/button")); 

		public WebElement getEle_Login() {
			return ele_Login;
		}

		public void setEle_Login(WebElement ele_Login) {
			this.ele_Login = ele_Login;
		}
		

	}
	
		
	/*public click_On_SIGNIN getSignin() {
		return signin;
	}
	public void setSignin(click_On_SIGNIN signin) {
		this.signin = signin;
	}
	*/
	
	
	public click_On_UserName getUn() {
		return un;
	}
	public void setUn(click_On_UserName un) {
		this.un = un;
	}
	public click_On_Password getPass() {
		return pass;
	}
	public void setPass(click_On_Password pass) {
		this.pass = pass;
	}
	public click_On_Login getLogin() {
		return login;
	}
	public void setLogin(click_On_Login login) {
		this.login = login;
	}
	
	
	
	/*public compare_AccountNumber getCan() {
		return can;
	}
	public void setCan(compare_AccountNumber can) {
		this.can = can;
	}
	*/
	
	
	
	
	
	
}
