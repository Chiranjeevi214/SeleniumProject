package inline.inline.elements.and.methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import inline.diffbrowsers.Different_Browser_Drivers;

public class Elements_For_Inline extends Different_Browser_Drivers{
	
	//private click_On_SIGNIN signin;
	//private click_On_UserName un;
	//private click_On_Password pass;
	//private click_On_Login login;
	private  click_On_Webpages webpge;
	private  click_On_Inline inline;
	

	
	public class click_On_Webpages{
		
		
	   
		WebElement web_page_click = driver.findElement(By.xpath("/html/body/main/ba-sidebar/aside/div[1]/ul/li[2]/a/span"));
		
		
		
		
		

		public WebElement getWeb_page_click() {
			return web_page_click;
		}

		public void setWeb_page_click(WebElement web_page_click) {
			this.web_page_click = web_page_click;
		}

	}
	
	
	public class click_On_Inline{
		   
		//WebElement Inline_click = driver.findElement(By.xpath("/html/body/main/div/div/div/div[1]/div/div/div/div[1]/div/div/div/div/div[2]/div[2]/ol/div/div/div[1]/li[17]/div"));
		
		WebElement Inline_click = driver.findElement(By.xpath("//*[@id=\"mCSB_2_container\"]/li[17]/div/span[1]/span[2]/img[1]"));

		public WebElement getInline_click() {
			return Inline_click;
		}

		public void setInline_click(WebElement inline_click) {
			Inline_click = inline_click;
		}
	
	}
	
	
	public class click_scroll_element{
		   
		//WebElement Inline_click = driver.findElement(By.xpath("/html/body/main/div/div/div/div[1]/div/div/div/div[1]/div/div/div/div/div[2]/div[2]/ol/div/div/div[1]/li[17]/div"));
		
		//WebElement scroll_element = driver.findElement(By.xpath("//*[@id=\"mCSB_2_scrollbar_vertical\"]"));
		
		WebElement scroll_element = driver.findElement(By.xpath("/html/body/main/div/div/div/div[1]/div/div/div/div[1]/div/div/div/div/div[2]/div[2]/ol/div/div/div[1]/li[17]/ol/div/div/li[6]"));

		public WebElement getScroll_element() {
			return scroll_element;
		}

		public void setScroll_element(WebElement scroll_element) {
			this.scroll_element = scroll_element;
		}

			
	}
	
	
	
	
	public click_On_Inline getInline() {
		return inline;
	}


	public void setInline(click_On_Inline inline) {
		this.inline = inline;
	}


	

	public click_On_Webpages getWebpge() {
		return webpge;
	}


	public void setWebpge(click_On_Webpages webpge) {
		this.webpge = webpge;
	}

	
	
	
	
}
