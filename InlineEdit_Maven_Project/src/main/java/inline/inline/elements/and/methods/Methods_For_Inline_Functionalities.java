package inline.inline.elements.and.methods;

import java.awt.AWTException;
import java.awt.Toolkit;

import org.eclipse.jetty.util.log.Log;
import org.openqa.selenium.JavascriptExecutor; 

import java.awt.Robot;

import org.openqa.selenium.Keys;



import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.internal.Locatable;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;




//import com.sun.jna.platform.FileUtils;

import inline.diffbrowsers.Different_Browser_Drivers;
import inline.elements_for_signin_signout.Elements_For_SignIn_SignOut;
import inline.elements_for_signin_signout.Elements_For_SignIn_SignOut.*;
import inline.inline.elements.and.methods.Elements_For_Inline.click_On_Inline;
import inline.inline.elements.and.methods.Elements_For_Inline.click_On_Webpages;
import inline.inline.elements.and.methods.Elements_For_Inline.click_scroll_element;



public class Methods_For_Inline_Functionalities extends Different_Browser_Drivers {


	Elements_For_Inline inline_ele = new Elements_For_Inline();
	
	
	
	//Webpage Click
	
	public void webpage_click() throws InterruptedException, AWTException {
		
		
        JavascriptExecutor js = (JavascriptExecutor) driver;
        
        

        js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
        		 driver.findElement(By.xpath("/html/body/main/ba-sidebar/aside/div[1]/ul/li[2]/a/span")));
        
        
        driver.findElement(By.xpath("/html/body/main/ba-sidebar/aside/div[1]/ul/li[2]/a/span")).click();
		
        
        
		
		click_On_Webpages webpage = inline_ele.new click_On_Webpages();
		

		js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
				webpage.getWeb_page_click());
		
		webpage.getWeb_page_click().click();
        

		Thread.sleep(2000);
		
		String winHandleBefore = driver.getWindowHandle();
		
		
		Thread.sleep(2000);
		// Create instance of Javascript executor
		 
		JavascriptExecutor je = (JavascriptExecutor) driver;
		
		Actions action = new Actions(driver);
		
		
        Thread.sleep(3000);
        
        js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');", 
        		driver.findElement(By.xpath("/html/body/main/div/div/div/div[1]/div/div/div/div[1]/div/div/div/div/div[2]/div[2]/ol/div/li[13]/div/span/span")));
		
		Actions action1 = new Actions(driver); 
		

		  //Web Page CLick
		action1.doubleClick(driver.findElement(By.xpath("/html/body/main/div/div/div/div[1]/div/div/div/div[1]/div/div/div/div/div[2]/div[2]/ol/div/li[13]/div/span/span"))).build().perform();

		
		//Thread.sleep(15000);

		Thread.sleep(15000);
		
	
		//Switch
		
		ArrayList< String> tabs = new ArrayList<String>(driver.getWindowHandles());
	    driver.switchTo().window(tabs.get(1));
	    
	    
	    Thread.sleep(7000);
		
		//Switch to new window opened
				/*for(String winHandle : driver.getWindowHandles()){
				    driver.switchTo().window(winHandle);
				}*/
								
	}
	
	
	//Web Page Click
	
public void webpage_click1() throws InterruptedException, AWTException {
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
		
        	Thread.sleep(4000);
        
	        //Switch
	
			ArrayList< String> tabs = new ArrayList<String>(driver.getWindowHandles());
		    driver.switchTo().window(tabs.get(0));
		    

		Thread.sleep(2000);
		// Create instance of Javascript executor
	
		Actions action = new Actions(driver);
		
		
		
		js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');", 
				driver.findElement(By.xpath("/html/body/main/div/div/div/div[1]/div/div/div/div[1]/div/div/div/div/div[2]/div[2]/ol/div/li[13]/div/span/span")));
		
		
		
        Thread.sleep(3000);         
		
		Actions action1 = new Actions(driver);
		action1.doubleClick(driver.findElement(By.xpath("/html/body/main/div/div/div/div[1]/div/div/div/div[1]/div/div/div/div/div[2]/div[2]/ol/div/li[13]/div/span/span"))).build().perform(); 
		

		Thread.sleep(5000);
		
		/*ArrayList< String> tabs1 = new ArrayList<String>(driver.getWindowHandles());
	    driver.switchTo().window(tabs1.get(1));*/
	    
		

		/*// Switch to new window opened
				for(String winHandle : driver.getWindowHandles()){
				    driver.switchTo().window(winHandle);
				}*/
								
	}


public void webpage_click2() throws InterruptedException, AWTException {
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
		
        	Thread.sleep(4000);
        
	        //Switch
	
			ArrayList< String> tabs = new ArrayList<String>(driver.getWindowHandles());
		    driver.switchTo().window(tabs.get(0));
		    

		Thread.sleep(2000);
		// Create instance of Javascript executor
	
		Actions action = new Actions(driver);
		
		
		
		js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');", 
				driver.findElement(By.xpath("/html/body/main/div/div/div/div[1]/div/div/div/div[1]/div/div/div/div/div[2]/div[2]/ol/div/li[9]/div/span/span")));
		
		
		
        Thread.sleep(3000);         
		
		Actions action1 = new Actions(driver);
		action1.doubleClick(driver.findElement(By.xpath("/html/body/main/div/div/div/div[1]/div/div/div/div[1]/div/div/div/div/div[2]/div[2]/ol/div/li[9]/div/span/span"))).build().perform(); 
		

		Thread.sleep(10000);
		
		ArrayList< String> tabs1 = new ArrayList<String>(driver.getWindowHandles());
	    driver.switchTo().window(tabs1.get(1));
	    
		

		/*// Switch to new window opened
				for(String winHandle : driver.getWindowHandles()){
				    driver.switchTo().window(winHandle);
				}*/
								
	}
	
	
	
	

   //Inline Enable for static
	
	
	public void Inline_Enable1() throws InterruptedException, AWTException {
		
		
		Thread.sleep(6000);
		
		//static_edit();
		
		
		Actions action = new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		
		WebElement para1 = driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div/div[2]/p/de"));
		
		action.moveToElement(para1).perform();
		
		 Thread.sleep(2000);
         
         action.click(para1).sendKeys("hello").perform();
         
         Thread.sleep(5000);
		
		
		
	
		           for (int k=1; k<11 ; k++) {  
		        	   
		        	   
		        	   WebElement para = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div[1]/div/section/div[1]/div[1]/div[1]/p["+ k + "]/de"));
		        	   
		       
			
								js.executeScript("arguments[0].scrollIntoView(true);",para);
		        	   
								 action.moveToElement(para).perform();
								 
								 String BeforeEdit = para.getText();
								 
								 
		        	            
		        	             Thread.sleep(2000);
		        	            
		        	            action.click(para).sendKeys("hello").perform();
		        	            
		        	            String AfterEdit = para.getText();
		        	            
		        	            Thread.sleep(4000);
		        	            
		        	            if ( BeforeEdit != AfterEdit){
		        	            	
		        	            	System.out.println("Inline Editing Enabled");
		        	  
		        	            }
		        	            
		        	            
		        	            else 
		        	            	
		        	            {
		        	      
		        	            	System.out.println("Inline Editing not Enabled");
		        	            }
		        	            

								/*action.moveToElement(para)
								
								.clickAndHold()
						        .moveByOffset(0, 0)
						        .release()
						        .perform();*/
						        
                             

		           }
		           
		           
			  }
			  
			  
			 

	
	

	
	public void static_edit() throws InterruptedException {
		
		Actions action = new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		

       WebElement para = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div[1]/div/section/div[1]/div[1]/div[1]/de/p"));
		        	   
		       
			
								js.executeScript("arguments[0].scrollIntoView(true);",para);
		        	   
								 action.moveToElement(para).perform();
								 
								 String BeforeEdit = para.getText();
								 
								 
		        	            
		        	             Thread.sleep(2000);
		        	            
		        	            action.click(para).sendKeys("hello").perform();
		        	            
		        	            String AfterEdit = para.getText();
		        	            
		        	            Thread.sleep(4000);
		        	            
		        	            if ( BeforeEdit != AfterEdit){
		        	            	
		        	            	System.out.println("Inline Editing Enabled");
		        	  
		        	            }
		        	            
		        	            
		        	            else 
		        	            	
		        	            {
		        	      
		        	            	System.out.println("Inline Editing not Enabled");
		        	            }
		        	            

								/*action.moveToElement(para)
								
								.clickAndHold()
						        .moveByOffset(0, 0)
						        .release()
						        .perform();*/
                                

		           }
		

		      
	
	public void static_Inline() throws InterruptedException, AWTException {
		
		

		//WebElement para = driver.findElement(By.cssSelector("de p"));     
		
		WebElement para1 = driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/div[1]/p/de")); 
		
		WebElement para2 = driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/div[2]/p[1]/de"));
		
		WebElement para3 = driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/div[2]/p[2]"));
		
		
		Actions action = new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		

		
		/*int sizeOfAllLinks = para1.size();
		System.out.println(sizeOfAllLinks);
		*/
		
		
            //Para 1 		

			js.executeScript("arguments[0].scrollIntoView(true);",para1);
			
			//js.executeScript("arguments[0].scrollIntoView(true);",para2);
			
			
			 action.moveToElement(para1).perform();
			 
			 String BeforeEdit = para1.getText();
			 
			 System.out.println(BeforeEdit);
			 

             Thread.sleep(2000);
            
            action.click(para1).sendKeys("hello").perform();
            
            String AfterEdit = para1.getText();
            System.out.println(AfterEdit);
            
            Thread.sleep(4000);
            
            if (!BeforeEdit.equals(AfterEdit))
            	
            {
            	
            	System.out.println("Inline Editing Enabled");
  
            }
            
            
            else 
            	
            {
      
            	System.out.println("Inline Editing as required disabled");
            }
            
            Thread.sleep(2000);
			
          //Para 2
			
js.executeScript("arguments[0].scrollIntoView(true);",para2);
			
			//js.executeScript("arguments[0].scrollIntoView(true);",para2);
			
			
			 action.moveToElement(para2).perform();
			 
			 String BeforeEdit1 = para2.getText();
			 
			 System.out.println(BeforeEdit1);
			 

             Thread.sleep(2000);
            
            action.click(para2).sendKeys("hello").perform();
            
            String AfterEdit1 = para2.getText();
            System.out.println(AfterEdit1);
            
            Thread.sleep(4000);
            
            if (!BeforeEdit1.equals(AfterEdit1))
            {
            
            	
            	System.out.println("Inline Editing Enabled");
  
            }
            
            
            else 
            	
            {
      
            	System.out.println("Inline Editing as required disabled");
            }
            
		
       
		//driver.close();
		//webpage_click1(); 
		
          //Para 3
            
            Thread.sleep(2000);
js.executeScript("arguments[0].scrollIntoView(true);",para3);
			
			//js.executeScript("arguments[0].scrollIntoView(true);",para2);
			
			
			 action.moveToElement(para3).perform();
			 
			 String BeforeEdit2 = para3.getText();
			 
			 System.out.println(BeforeEdit2);
			 

             Thread.sleep(2000);
            
            action.click(para3).sendKeys("hello").perform();
            
            String AfterEdit2 = para3.getText();
            System.out.println(AfterEdit2);
            
            Thread.sleep(4000);
            
            if (!BeforeEdit2.equals(AfterEdit2))
            {
            	
            	System.out.println("Inline Editing Enabled");
  
            }
            
            
            else 
            	
            {
      
            	System.out.println("Inline Editing as required disabled");
            }
            
		
}
	
	
	
public void static_Inline1() throws InterruptedException, AWTException {
		
		

		//WebElement para = driver.findElement(By.cssSelector("de p"));     
		
		WebElement para1 = driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/div[1]/p/de")); 
		
		WebElement para2 = driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/div[2]/p[1]"));
		
		WebElement para3 = driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/div[2]/p[2]"));
		
		
		Actions action = new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		

		
		/*int sizeOfAllLinks = para1.size();
		System.out.println(sizeOfAllLinks);
		*/
		
		
            //Para 1 		

			js.executeScript("arguments[0].scrollIntoView(true);",para1);
			
			//js.executeScript("arguments[0].scrollIntoView(true);",para2);
			
			
			 action.moveToElement(para1).perform();
			 
			 String BeforeEdit = para1.getText();
			 
			 System.out.println(BeforeEdit);
			 

             Thread.sleep(2000);
            
            action.click(para1).sendKeys("hello").perform();
            
            String AfterEdit = para1.getText();
            System.out.println(AfterEdit);
            
            Thread.sleep(4000);
            
            if (!BeforeEdit.equals(AfterEdit))
            	
            {
            	
            	System.out.println("Inline Editing Enabled");
  
            }
            
            
            else 
            	
            {
      
            	System.out.println("Inline Editing Disabled");
            }
            
            Thread.sleep(2000);
			
          //Para 2
			
js.executeScript("arguments[0].scrollIntoView(true);",para2);
			
			//js.executeScript("arguments[0].scrollIntoView(true);",para2);
			
			
			 action.moveToElement(para2).perform();
			 
			 String BeforeEdit1 = para2.getText();
			 
			 System.out.println(BeforeEdit1);
			 

             Thread.sleep(2000);
            
            action.click(para2).sendKeys("hello").perform();
            
            String AfterEdit1 = para2.getText();
            System.out.println(AfterEdit1);
            
            Thread.sleep(4000);
            
            if (!BeforeEdit1.equals(AfterEdit1))
            {
            
            	
            	System.out.println("Inline Editing Enabled");
  
            }
            
            
            else 
            	
            {
      
            	System.out.println("Inline Editing Disabled");
            }
            
		
       
		//driver.close();
		//webpage_click1(); 
		
          //Para 3
            
            Thread.sleep(2000);
js.executeScript("arguments[0].scrollIntoView(true);",para3);
			
			//js.executeScript("arguments[0].scrollIntoView(true);",para2);
			
			
			 action.moveToElement(para3).perform();
			 
			 String BeforeEdit2 = para3.getText();
			 
			 System.out.println(BeforeEdit2);
			 

             Thread.sleep(2000);
            
            action.click(para3).sendKeys("hello").perform();
            
            String AfterEdit2 = para3.getText();
            System.out.println(AfterEdit2);
            
            Thread.sleep(4000);
            
            if (!BeforeEdit2.equals(AfterEdit2))
            {
            	
            	System.out.println("Inline Editing Enabled");
  
            }
            
            
            else 
            	
            {
      
            	System.out.println("Inline Editing Disabled");
            }
            
		
}
	




      //Replace Image and Edit for Banner Image

      public void static_image() throws InterruptedException, AWTException {
    	  
    	  
    	  
    	  //Replace Image Code
    	  
    	  //WebElement image = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div[2]/div[2]/div[2]/div[1]/img"));
    	  
    	  WebElement image = driver.findElement(By.xpath("/html/body/div[2]/div/section/div/div/img"));  
    	  
    	  
    	  
    	  
   
    	  Actions action = new Actions(driver);
  		  JavascriptExecutor js = (JavascriptExecutor) driver;
  		  
  		  
  		  js.executeScript("arguments[0].scrollIntoView(true);",image);
    	  
    	  action.moveToElement(image).contextClick().build().perform();
    	  Thread.sleep(5000);
    	  
    	  //Replace Click
    	  
    	  js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
    			  driver.findElement(By.xpath("/html/body/div[12]/ul/li[1]").className("replace")));
    	  
    	  
    	  
    	  driver.findElement(By.xpath("/html/body/div[12]/ul/li[1]").className("replace")).click();  
    	  
    	  Thread.sleep(3000);
    	  

    	  //Select an Image
    	  
    	  
    	  String imagepath1 = driver.findElement(By.xpath("//*[@id='dataSourceTree_6_a']")).getAttribute("href").toString();
    	  
    	  
    
    	  
    	  driver.findElement(By.xpath("//*[@id='dataSourceTree_6_a']")).click();
    	  
    	  Thread.sleep(2000);
    	  
    	  
    	  //Click the Choose
    	  
    	  js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
    			  driver.findElement(By.xpath("//*[@id='save']")));
    	  
    	  
    	  driver.findElement(By.xpath("//*[@id='save']")).click();
    	  
    	  
    	  //Verify the Path of Selected Image
    	  
    	  //String imagepath2 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div[2]/div[2]/div[2]/div[1]/img")).getAttribute("src").toString();
    	  
    	  String imagepath2 = driver.findElement(By.xpath("/html/body/div[2]/div/section/div/div/img")).getAttribute("src").toString();
    	  
    	 
    	  
    	  
    	  if (imagepath1.equals(imagepath2))
          {
          	
          	System.out.println("Replace Image with Existing One Got Successfully");

          }
    	  
    	  
    	  else
    		  
    	  {
    		  
    		  System.out.println("Replace Image With Existing One Got Failed");
    		  
    	  }
    	  
    	  Thread.sleep(3000);
    	  
    	  
          js.executeScript("arguments[0].scrollIntoView(true);",image);
    	  
    	  action.moveToElement(image).contextClick().build().perform();
    	  Thread.sleep(5000);
    	  
    	  //Replace Click
    	  
    	  js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
    			  driver.findElement(By.xpath("/html/body/div[12]/ul/li[1]").className("replace")));
    	  
    	  
    	  driver.findElement(By.xpath("/html/body/div[12]/ul/li[1]").className("replace")).click();  
    	  
    	  Thread.sleep(3000);
    	  
    	  
    	  //Upload an Image
    	  
    	  js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
    			  driver.findElement(By.xpath("//*[@id='ssUploadBtn_dataSourceTree_1']")));
    	  
    	  driver.findElement(By.xpath("//*[@id='ssUploadBtn_dataSourceTree_1']")).click();
    	  Thread.sleep(3000);
    	  
    	  //C:\Users\chiranjeevi.t\Desktop\Garden.png
    	  
    	//put path to your image in a clipboard
    	    StringSelection ss = new StringSelection("C:\\Users\\QA Team\\Desktop\\Rome.jpeg"); 
    	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

    	    //imitate mouse events like ENTER, CTRL+C, CTRL+V
    	    Robot robot = new Robot();
    	    robot.keyPress(KeyEvent.VK_ENTER);
    	    robot.keyRelease(KeyEvent.VK_ENTER);
    	    robot.keyPress(KeyEvent.VK_CONTROL);
    	    robot.keyPress(KeyEvent.VK_V);
    	    robot.keyRelease(KeyEvent.VK_V);
    	    robot.keyRelease(KeyEvent.VK_CONTROL);
    	    robot.keyPress(KeyEvent.VK_ENTER);
    	    robot.keyRelease(KeyEvent.VK_ENTER);
    	  
    	    Thread.sleep(3000);
    	    
    	    
    	    driver.findElement(By.xpath("/html/body/div[13]/div[2]/div[2]/div[2]/div[2]/div[2]/button[1]")).click();
    	    
    	    Thread.sleep(9000);
    	    
    	    //Click Close Button
    	    
    	    driver.findElement(By.xpath("/html/body/div[13]/div[2]/div[2]/div[2]/div[2]/div[2]/button[2]")).click();
    	    
    	    Thread.sleep(3000);
    	    
    	    
    	    
    	    //select uploaded Image
    	    
    	    String imagepath3 = driver.findElement(By.xpath("//*[@id='dataSourceTree_22_a']")).getAttribute("href").toString();
      	  
      	  
        	//*[@id="dataSourceTree_2_a"]
        	  
    	    
    	    
    	    driver.findElement(By.xpath("//*[@id='dataSourceTree_22_a']")).click();    
    	    
    	    Thread.sleep(2000);
    	    
    	    //Click Set Button
    	    
    	    js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
    	    		driver.findElement(By.xpath("//*[@id='save']")));
    	    driver.findElement(By.xpath("//*[@id='save']")).click(); 
    	    
    	    
    	    String imagepath4 = driver.findElement(By.xpath("/html/body/div[2]/div/section/div/div/img")).getAttribute("src").toString();
    	    
 
    	    if (imagepath3.equals(imagepath4))
            {
            	
            	System.out.println("Replace Image Using Upload Button Got Successfully");

            }
      	  
      	  
      	  else
      		  
      	  {
      		  
      		  System.out.println("Replace Image using Upload Button Failed");
      		  
      	  }
    	    
  

    	    //Edit Properties
    	    
    	    
    	    WebElement image1 = driver.findElement(By.xpath("/html/body/div[2]/div/section/div/div/img"));
    	    
    
    	    
    	    action.moveToElement(image1).contextClick().build().perform();
        	  Thread.sleep(5000);
 
        	  
        	  js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
          			  driver.findElement(By.xpath("/html/body/div[12]/ul/li[4]").className("edit-properties")));
    	    
    	    
        	  driver.findElement(By.xpath("/html/body/div[12]/ul/li[4]").className("edit-properties")).click();
        	  
        	  Thread.sleep(2000);
        	  
        	  //Enter Margin Value
        	  
        	  WebElement margin = driver.findElement(By.xpath("//*[@id='margin_IMG_1']"));
        	  js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
        			  margin);
        	  
        	  action.moveToElement(margin);
        	  action.click();
        	  margin.clear();
        	  Thread.sleep(1000);
        	  margin.sendKeys("5px 5px 5px 5px");
        	  
        	  
        	  js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid white;');",
        			  margin);


        	  //Enter Float
        	  
        	  
        	  WebElement Float = driver.findElement(By.xpath("//*[@id='float_IMG_2']")); 
        	  action.moveToElement(Float);
			  action.click().build().perform();
			  Thread.sleep(3000);
			  
			  
			  //Select Float as Right 
			  WebElement selectFloat =  driver.findElement(By.xpath("/html/body/div[13]/table/tbody/tr/td/table/tr[2]/td[2]/select/option[2]"));
			  
			  js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
						selectFloat);
			  
			  Thread.sleep(2000);
			  selectFloat.click();
			  

        	  
        	  //Enter Width
        	  
        	  Thread.sleep(2000);
    
        	  WebElement width = driver.findElement(By.xpath("//*[@id='width_IMG_3']"));
        	  js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
        			  width);
        	  
        	  action.moveToElement(width);
        	  action.click();
        	  width.clear();
        	  Thread.sleep(1000);
        	  width.sendKeys("1000px");
        	  
        	  
        	  js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid white;');",
        			  width);
        	  
        	
        	  Thread.sleep(2000);
        	  
     
        	  //Enter Height
        	  
        	  WebElement height = driver.findElement(By.xpath("//*[@id='height_IMG_4']"));   
        	  js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
        			  height);
        	  
        	  action.moveToElement(height);
        	  action.click();
        	  height.clear();
        	  Thread.sleep(1000);
        	  height.sendKeys("275px");
        	  
        	  
        	  js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid white;');",
        			  height);


        	  Thread.sleep(2000);
        	  

        	  driver.findElement(By.xpath("//*[@id='save']")).click(); 
        	  
        	  
        	  Thread.sleep(3000);
        	  
        	  /*driver.findElement(By.xpath("/html/body/div[4]/button[1]")).click(); 
        	  
        	  
        	  Thread.sleep(10000);
*/
        	  //Click Again Edit Properties
        	  
        	  
        	  
        	  
        	  
        	  

        	  //WebElement EditedImage = driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div/div/img"));
        	  
        	  
        	  System.out.println("Again Click Edit Properties");
        	  
        	  
        	  for(int i=0; i<=2;i++){
        		  try{
        			  
        			 action.contextClick(driver.findElement(By.xpath("/html/body/div[2]/div/section/div/div/img"))).perform(); 
        		     break;
        		  }
        		  catch(Exception e){
        			  System.out.println(e.getMessage());
        		  }
        		}
        	  
        	  
  
          	  Thread.sleep(5000);
          	  	 
  
          	  js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
            			  driver.findElement(By.xpath("/html/body/div[12]/ul/li[4]").className("edit-properties")));  
      	    
      	    
          	  driver.findElement(By.xpath("/html/body/div[12]/ul/li[4]").className("edit-properties")).click();
          	  
          	  Thread.sleep(2000);
          	  
          	
          	  
          	  //Margin
          	for(int i=0; i<=2;i++){
          		
          		try {
          			
          			
          			String Margin = driver.findElement(By.xpath("//*[@id='margin_IMG_1']")).getAttribute("value");
          			
          			System.out.println("The Margin value is" + Margin );
          			
          			if (Margin.equals("5px 5px 5px 5px"))
          			
          			
          					
          					{
          				
          				System.out.println("Successfully Changed Margin Values");
                    	  
          		            }
          		            
          		            else
          		            {
          		          	  
          		          	  System.out.println("Failed in Changing Margin Values");
          		          	  
          		            }
          					break;
          					
          					
          			
          		}
          		
          		catch(Exception e){
         			  System.out.println(e.getMessage());
         		  }
          			
          			
          		}
          	
          	  
          	
          	//Float
          	
          	
for(int i=0; i<=2;i++){
          		
          		try {
          			
          			
          			String floaat  = driver.findElement(By.xpath("//*[@id='float_IMG_2']")).getAttribute("value");
          			
          			System.out.println("The Float value is" + floaat );
          			
          			if (floaat.equals("right"))
          			
          			
          					
          					{
          				
          				System.out.println("Successfully Changed Float Values");
                    	  
          		            }
          		            
          		            else
          		            {
          		          	  
          		          	  System.out.println("Failed in Changing Float Values");
          		          	  
          		            }
          					break;
          					
          					
          			
          		}
          		
          		catch(Exception e){
         			  System.out.println(e.getMessage());
         		  }
          			
          			
          		}
          	
          	
          
        //Width

for(int i=0; i<=2;i++){
		
		try {
			
			
			String Width  = driver.findElement(By.xpath("//*[@id='width_IMG_3']")).getAttribute("value");
			
			System.out.println("The Width value is" + Width );
			
			if (Width.equals("1000px"))
			
			
			{
				
				System.out.println("Successfully Changed Width Values");
        	  
		            }
		            
		            else
		            {
		          	  
		          	  System.out.println("Failed in Changing Width Values");
		          	  
		            }
					break;
					
					
			
		}
		
		catch(Exception e){
			  System.out.println(e.getMessage());
		  }
			
			
		}
	


   //Height


for(int i=0; i<=2;i++){
	
	try {
		
		
		String Height   = driver.findElement(By.xpath("//*[@id='height_IMG_4']")).getAttribute("value");
		
		System.out.println("The Width value is" + Height );
		
		if (Height.equals("275px"))
		
		
				
				{
			
			System.out.println("Successfully Changed Height Values");
    	  
	            }
	            
	            else
	            {
	          	  
	          	  System.out.println("Failed in Changing Height Values");
	          	  
	            }
				break;
				
				
		
	}
	
	catch(Exception e){
		  System.out.println(e.getMessage());
	  }
		
		
	}


Thread.sleep(1000);
 driver.findElement(By.xpath("//*[@id='cancel']")).click();


 
 
 
      // Remove

     Thread.sleep(3000);


	//js.executeScript("window.scrollTo(0, -document.body.scrollHeight);");

	WebElement image2 = driver.findElement(By.xpath("/html/body/div[2]/div/section/div/div/img"));
	String imagepath5 = driver.findElement(By.xpath("/html/body/div[2]/div/section/div/div/img")).getAttribute("src").toString();


	action.moveToElement(image2).contextClick().build().perform();
	Thread.sleep(5000);


	//Remove Image
	js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
		  driver.findElement(By.xpath("/html/body/div[12]/ul/li[3]").className("remove")));

	driver.findElement(By.xpath("/html/body/div[12]/ul/li[3]").className("remove")).click();
	Thread.sleep(3000);

	
//
//	boolean ImagePresence = image2.isDisplayed();
//	
//	if (ImagePresence==true )
//	{
//	
//	              System.out.println("Image Not Removed");
//	            
//	}
//	
//	
//	else
//	{
//		           System.out.println("Image Removed");
//		
//	}
//
	
	
	boolean present;
	try {
		driver.findElement(By.xpath("/html/body/div[2]/div/section/div/div/img")); 
	   present = true;
	   System.out.println("Image Not Removed:" + present);
	   
	} catch (NoSuchElementException e) {
	   present = false;
	   System.out.println("Image Removed :" +present);
	}
	
	
    }
      

      
      //Replace Image and Edit for Categories Images
      
      public void static_image1() throws InterruptedException, AWTException {
    	  
          //Replace Image Code
    	  
    	  //WebElement image = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div[2]/div[2]/div[2]/div[1]/img"));
    	  
    	  Thread.sleep(3000);
    	  
    	  WebElement image = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div[2]/div[2]/div[2]/div[1]/img"));  
    	  
    	
   
    	  Actions action = new Actions(driver);
  		  JavascriptExecutor js = (JavascriptExecutor) driver;
  		  
  		  
  		  js.executeScript("arguments[0].scrollIntoView(true);",image);
  		  
  		 Thread.sleep(4000);
  		 
  		 
  		for(int i=0; i<=2;i++){
  		  try{
  			  
  			action.moveToElement(image).contextClick().build().perform();
  		     break;
  		  }
  		  catch(Exception e){
  			  System.out.println(e.getMessage());
  		  }
  		}
    	  
    	  //action.moveToElement(image).contextClick().build().perform();
    	  Thread.sleep(5000);
    	  
    	  //Replace Click
    	  
    	  js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
    			  driver.findElement(By.xpath("/html/body/div[12]/ul/li[1]").className("replace")));
   
    	  driver.findElement(By.xpath("/html/body/div[12]/ul/li[1]").className("replace")).click();  
    	  
    	  Thread.sleep(3000);
    	  

    	  //Select an Image
    	  
    	  
    	  String imagepath1 = driver.findElement(By.xpath("//*[@id='dataSourceTree_6_a']")).getAttribute("href").toString();
    	  

    	  driver.findElement(By.xpath("//*[@id='dataSourceTree_6_a']")).click();
    	  
    	  Thread.sleep(2000);
    	  
    	  
    	  //Click the Choose
    	  
    	  js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
    			  driver.findElement(By.xpath("//*[@id='save']")));
    	  
    	  
    	  driver.findElement(By.xpath("//*[@id='save']")).click();
    	  
    	  
    	  //Verify the Path of Selected Image
    	  
    	  //String imagepath2 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div[2]/div[2]/div[2]/div[1]/img")).getAttribute("src").toString();
    	  
    	  String imagepath2 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div[2]/div[2]/div[2]/div[1]/img")).getAttribute("src").toString();
    	  

    	  if (imagepath1.equals(imagepath2))
          {
          	
          	System.out.println("Replace Image with Existing One Got Successfully");

          }
    	  
    	  
    	  else
    		  
    	  {
    		  
    		  System.out.println("Replace Image With Existing One Got Failed");
    		  
    	  }
    	  
    	  Thread.sleep(3000);
    	  
    	  
          js.executeScript("arguments[0].scrollIntoView(true);",image);
    	  
    	  action.moveToElement(image).contextClick().build().perform();
    	  Thread.sleep(5000);
    	  
    	  //Replace Click
    	  
    	  js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
    			  driver.findElement(By.xpath("/html/body/div[12]/ul/li[1]").className("replace")));
    	  
    	  
    	  driver.findElement(By.xpath("/html/body/div[12]/ul/li[1]").className("replace")).click();  
    	  
    	  Thread.sleep(3000);
    	  
    	  
    	  //Upload an Image
    	  
    	  js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
    			  driver.findElement(By.xpath("//*[@id='ssUploadBtn_dataSourceTree_1']")));
    	  
    	  driver.findElement(By.xpath("//*[@id='ssUploadBtn_dataSourceTree_1']")).click();
    	  Thread.sleep(3000);
    	  
    	  //C:\Users\chiranjeevi.t\Desktop\Garden.png
    	  
    	//put path to your image in a clipboard
    	    StringSelection ss = new StringSelection("C:\\Users\\chiranjeevi.t\\Desktop\\Garden.png");
    	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

    	    //imitate mouse events like ENTER, CTRL+C, CTRL+V
    	    Robot robot = new Robot();
    	    robot.keyPress(KeyEvent.VK_ENTER);
    	    robot.keyRelease(KeyEvent.VK_ENTER);
    	    robot.keyPress(KeyEvent.VK_CONTROL);
    	    robot.keyPress(KeyEvent.VK_V);
    	    robot.keyRelease(KeyEvent.VK_V);
    	    robot.keyRelease(KeyEvent.VK_CONTROL);
    	    robot.keyPress(KeyEvent.VK_ENTER);
    	    robot.keyRelease(KeyEvent.VK_ENTER);
    	  
    	    Thread.sleep(3000);
    	    
    	    
    	    driver.findElement(By.xpath("/html/body/div[13]/div[2]/div[2]/div[2]/div[2]/div[2]/button[1]")).click();
    	    
    	    Thread.sleep(9000);
    	    
    	    //Click Close Button
    	    
    	    driver.findElement(By.xpath("/html/body/div[13]/div[2]/div[2]/div[2]/div[2]/div[2]/button[2]")).click();
    	    
    	    Thread.sleep(3000);
    	    
    	    
    	    
    	    //select uploaded Image
    	    
    	    String imagepath3 = driver.findElement(By.xpath("//*[@id='dataSourceTree_22_a']")).getAttribute("href").toString();
      	  
      	  
        	//*[@id="dataSourceTree_2_a"]
        	  
    	    
    	    
    	    driver.findElement(By.xpath("//*[@id='dataSourceTree_22_a']")).click();    
    	    
    	    Thread.sleep(2000);
    	    
    	    //Click Set Button
    	    
    	    js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
    	    		driver.findElement(By.xpath("//*[@id='save']")));
    	    driver.findElement(By.xpath("//*[@id='save']")).click(); 
    	    
    	    
    	    String imagepath4 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div[2]/div[2]/div[2]/div[1]/img")).getAttribute("src").toString();
    	    
 
    	    if (imagepath3.equals(imagepath4))
            {
            	
            	System.out.println("Replace Image Using Upload Button Got Successfully");

            }
      	  
      	  
      	  else
      		  
      	  {
      		  
      		  System.out.println("Replace Image using Upload Button Failed");
      		  
      	  }


      }
      

//This Code for all Inline Edit Scenarions for Our Team Page
      
//This Code for all Inline Edit Scenarions for Our Team Page
      
      public void fontfamily_clck() throws InterruptedException, AWTException {
  

for (int k=1; k<17; k++) {
	
	
	



  WebElement Text1 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div[1]/de/p[1]"));
  
  


 	Actions action = new Actions(driver);
 	JavascriptExecutor js = (JavascriptExecutor) driver;
 	
 	//Scroll to the Element

 	js.executeScript("arguments[0].scrollIntoView(true);",Text1);
 	
 	System.out.println(Text1.getSize());
 	

 	
 	Robot bot = new Robot(); 
 	bot.mouseMove(Text1.getLocation().x,Text1.getLocation().x); 
 	bot.mousePress(InputEvent.BUTTON1_MASK); bot.mouseRelease(InputEvent.BUTTON1_MASK); 
 	bot.mousePress(InputEvent.BUTTON1_MASK); bot.mouseRelease(InputEvent.BUTTON1_MASK); 
 	bot.mousePress(InputEvent.BUTTON1_MASK); bot.mouseRelease(InputEvent.BUTTON1_MASK);
 	
 
 	action.moveToElement(Text1).contextClick().perform();
 	


Thread.sleep(3000);

//Iterate the Elements

	WebElement fontproper = driver.findElement(By.xpath("/html/body/div[13]/ul/li[4]"));  
	
	action.moveToElement(fontproper).build().perform();
	
	Thread.sleep(3000);


List<WebElement> listsize = driver.findElements(By.xpath("/html/body/div[12]/ul/li[4]/ul/li"));	

String[] FontFamily = { "Verdana", "Helvetica", "Sans-Serif", "Muli", "Lato", "Arial", "Cormorant Garamond", "Calibri"  };

/*
 * 
 * 
String FontFamily[] = new String[8];

FontFamily[1] = "Verdana";
FontFamily[2] = "Helvetica";
FontFamily[3] = "Sans-Serif";
FontFamily[4] = "Muli";
FontFamily[5] = "Lato";
FontFamily[6] = "Arial";
FontFamily[7] = "Cormorant Garamond";
FontFamily[8] = "Calibri";
FontFamily[9] = "CenturyGhotic";
FontFamily[10] = "Tahoma";
FontFamily[11] = "Georgia";
FontFamily[12] = "Courier";
FontFamily[13] = "Futura";
FontFamily[14] = "Gill Sans";
FontFamily[15] = "Times New Roman";
FontFamily[16] = "Comic Sans MS"; */

 for(int m=1;m<=listsize.size();m++){
	 
	

 
 String compare = driver.findElement(By.xpath("/html/body/div[12]/ul/li[4]/ul/li["+ m +"]/div")).getText();  
 System.out.println("the Value of Compare" + compare);


if(FontFamily[m].equals(compare)){
	
	
	
 WebElement elementLocator = driver.findElement(By.xpath("/html/body/div[12]/ul/li[4]/ul/li["+ m +"]/div"));
 action.click(elementLocator).perform();
 
	}
 


	 
 
 }
 
 



if ( k >= 9) {

try {

if ( k == 9)

{


WebElement showall = driver.findElement(By.cssSelector("li.dont-close:nth-child(10) > em:nth-child(1)"));	


 /*WebElement showall =  driver.findElement(By.xpath("/html/body/div[12]/ul/li[4]/ul/li[10]/em")); */

js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
   	showall);
   	Thread.sleep(1000);
   	
   	js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid white;');",
   	showall);
showall.click();


}

else {                                                       

WebElement showall = driver.findElement(By.cssSelector("li.dont-close:nth-child(11) > em:nth-child(1)"));



//WebElement showall =  driver.findElement(By.xpath("/html/body/div[13]/ul/li[4]/ul/li[10]/em"));


    // WebElement showall =  driver.findElement(By.xpath("/html/body/div[12]/ul/li[4]/ul/li[9]")); 

js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
   	showall);
   	Thread.sleep(1000);
   	
   	js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid white;');",
   	showall);
showall.click();

}


List<WebElement> listsize1 = driver.findElements(By.xpath("/html/body/div[12]/ul/li[4]/ul/li"));	

String[] FontFamily1 = { "CenturyGhotic", "Tahoma", "Georgia", "Courier", "Futura", "Gill Sans", "Times New Roman", "Comic Sans MS"  };


for(int f=10;f<=listsize.size();f++){

 

String compare = driver.findElement(By.xpath("/html/body/div[13]/ul/li[4]/ul/li["+ f +"]/div")).getText(); 


System.out.println(compare);
if(FontFamily[f].equals(compare)){



WebElement elementLocator = driver.findElement(By.xpath("/html/body/div[13]/ul/li[4]/ul/li["+ f +"]/div"));


action.click(elementLocator).perform();


}

}







   	Thread.sleep(3000);
k =k +1;

WebElement fontselect = driver.findElement(By.xpath("/html/body/div[13]/ul/li[4]/ul/li["+k+"]"));  
String fontFamilyText = driver.findElement(By.xpath("/html/body/div[13]/ul/li[4]/ul/li["+k+"]/div")).getCssValue("font-family");
  
  System.out.println("The selected Font Family Value is  is "+fontFamilyText);
   
   
   js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
   	fontselect);
   Thread.sleep(3000);
   
   fontselect.click();

action.moveToElement(Text1).perform();
action.click(Text1).perform();

k = k-1;

String fontfamily = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div[1]/de/p[1]/font")).getCssValue("font-family");
System.out.println("The Paragraph Font Family is "+fontfamily);

if (fontFamilyText.equals(fontfamily))

{

System.out.println(fontfamily + " " + "Applied to Text");

}

else

{

System.out.println(fontfamily + " " +"Not Applied to Text");
}



}

catch( Exception e)

{

System.out.println("Exception has been handled" + e);
//throw(e);



}

 }



else
   	
   {


try{
   	


WebElement fontselect = driver.findElement(By.xpath("/html/body/div[13]/ul/li[4]/ul/li["+k+"]")); 



if ( k == 6)
	
{
	
	String fontFamilyText = driver.findElement(By.xpath("/html/body/div[13]/ul/li[4]/ul/li["+k+"]/b")).getCssValue("font-family");
	
	System.out.println("The selected Font Family Value is  is "+fontFamilyText);

	   
	   js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
	   	fontselect);
	   Thread.sleep(3000);
	   
	   fontselect.click();

	action.moveToElement(Text1).perform();
	action.click(Text1).perform();
	Thread.sleep(2000);
	
	
	String fontfamily = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div[1]/de/p[1]/font")).getCssValue("font-family");


	   System.out.println("The Paragraph font Family is "+fontfamily);
	   
	   if (fontFamilyText.equals(fontfamily))

	{

	System.out.println(fontfamily + " " +"Applied to Text");

	}

	else

	{

	System.out.println(fontfamily + " " +"Not Applied to Text");
	}
	
}



else {
   	
   	//Get the Text of the font Family
  String fontFamilyText = driver.findElement(By.xpath("/html/body/div[13]/ul/li[4]/ul/li["+k+"]/div")).getCssValue("font-family");
  
  
  
  System.out.println("The selected Font Family Value is  is "+fontFamilyText);

   
   js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
   	fontselect);
   Thread.sleep(3000);
   
   fontselect.click();

action.moveToElement(Text1).perform();
action.click(Text1).perform();
Thread.sleep(2000);

 /*if (fontFamilyText.equals("Muli"))
 
 {
 System.out.println(fontFamilyText + "Not Applied"); 
 
 }
*/

String fontfamily = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div[1]/de/p[1]/font")).getCssValue("font-family");


   System.out.println("The Paragraph font Family is "+fontfamily);
   
   if (fontFamilyText.equals(fontfamily))

{

System.out.println(fontfamily + " " +"Applied to Text");

}

else

{

System.out.println(fontfamily + " " +"Not Applied to Text");
}
   
   
 }

}
 


catch( Exception e)

{

System.out.println("Exception has been handled" + e);
//throw(e);



}

}

        
   Thread.sleep(5000);


}
   


      }
      
      

      //Font Size verify in Our Team Page
      
      public void fontsize_clck() throws InterruptedException, AWTException {
  

  for (int j=1; j<11; j++) {
  
  WebElement Text1 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div[1]/de/p[2]")); 
  Actions action = new Actions(driver);
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	//Scroll to the Element

	js.executeScript("arguments[0].scrollIntoView(true);",Text1);
	
	System.out.println(Text1.getSize());
	

	
	Robot bot = new Robot(); 
	bot.mouseMove(Text1.getLocation().x,Text1.getLocation().x); 
	bot.mousePress(InputEvent.BUTTON1_MASK); bot.mouseRelease(InputEvent.BUTTON1_MASK); 
	bot.mousePress(InputEvent.BUTTON1_MASK); bot.mouseRelease(InputEvent.BUTTON1_MASK); 
	bot.mousePress(InputEvent.BUTTON1_MASK); bot.mouseRelease(InputEvent.BUTTON1_MASK);
	

	action.moveToElement(Text1).contextClick().perform();
    System.out.println(Text1.getSize());

  
   Thread.sleep(3000);
  
  
     //Mouse over on font size


     
     WebElement fontsize1 = driver.findElement(By.cssSelector("li.submenu:nth-child(5)"));  
     
     action.moveToElement(fontsize1).build().perform();
  
  Thread.sleep(3000);
  
  
   if ( j >= 8) {
   
   try {
     	
  WebElement set =  driver.findElement(By.cssSelector("li.submenu:nth-child(5) > ul:nth-child(2) > li:nth-child(9) > em:nth-child(1)"));
  
     	//WebElement set =  driver.findElement(By.xpath("/html/body/div[13]/ul/li[5]/ul/li[9]/em"));  
     	js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
     	set);
     	Thread.sleep(1000);
     	
     	js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid white;');",
     	set);
     	
     	
     	set.click();
     	
     	
     	Thread.sleep(5000);
     	
     
       int l =j +13;
     	
       System.out.println("The L Value for custome font size is  is "+l);
     	
     	//Select the Input Box to enter the custome font size
     //WebElement Customfontsize = driver.findElement(By.xpath("/html/body/div[14]/ul/li[4]/ul/li["+k+"]")); 
     
     WebElement Customfontsize = driver.findElement(By.cssSelector("li.submenu:nth-child(5) > ul:nth-child(2) > li:nth-child(9) > input:nth-child(2)"));
     
   
     
   //li.submenu:nth-child(5) > ul:nth-child(2) > li:nth-child(9)
     
     //Enter the Font Size
     Customfontsize.sendKeys(String.valueOf(l));
     Thread.sleep(4000);
     
     Robot robot = new Robot();
     robot.keyPress(KeyEvent.VK_ENTER);
     robot.keyRelease(KeyEvent.VK_ENTER);
     
     Thread.sleep(4000);
  
     
     
     
     //String fontsize2 = driver.findElement(By.cssSelector("#about_us > div:nth-child(2) > p:nth-child("+j+") > font")).getCssValue("font-size");
     
     
     //

     String fontsize2 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div[1]/de/p[2]/font")).getCssValue("font-size");
     
     
     
   
     
     System.out.println("The Paragraph fontsize is "+fontsize2);
     
     
   if (fontsize2.equals(String.valueOf(l)+"px"))
  
  {
  
  System.out.println(fontsize2 + " " +"Applied to Text");
  
  }
     
     else
     
     {
     
    System.out.println(fontsize2 + " " +"Not Applied to Text");
     }    
     

     /*Assert.assertEquals(l+"px", fontsize2);
     System.out.println("Successfully Compared Font Size");
  */
  }
    
   catch( Exception e)
  
  {
   
   System.out.println("The error Message is " + e);
   
  

  /*System.out.println("Exception has been handled" + e);
  
  System.out.println("The error Message is " + e);*/
  
  }
   
   }
   

   else {
   
   
   try {
   
  
    //WebElement selectfontsize = driver.findElement(By.xpath("/html/body/div[13]/ul/li[5]/ul/li["+j+"]")); 
  WebElement selectfontsize = driver.findElement(By.cssSelector("li.submenu:nth-child(5) > ul:nth-child(2) > li:nth-child("+j+")"));
    
  
  
    
    //Get the Text of the font size
    String fontsizetext = selectfontsize.getText();
    
    System.out.println("The selected Font size text is  is "+fontsizetext);
    

   js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
  selectfontsize);
     Thread.sleep(3000);
     
    selectfontsize.click();

    
     String fontsize2 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div[1]/de/p[2]/font")).getCssValue("font-size");
     
     System.out.println("The Paragraph fontsize is "+fontsize2);
     
     
   if (fontsize2.equals(fontsizetext))

{

System.out.println(fontsize2+ " " +"Applied to Text");

}
   
   else
   
   {
   
  System.out.println(fontsize2+ " " +"Not Applied to Text");
   }
     

        /*Assert.assertEquals(fontsizetext, fontsize2);
    System.out.println("Successfully Compared Font Size");*/

   }
   
   catch( Exception e)
  
  {
  
     
   System.out.println("The error Message is " + e);
   
   
   

  /*System.out.println("Exception has been handled" + e);
  
  System.out.println("The error Message is " + e);*/
  
  }
   
   

    
  }
   

   
  
  
  }
  
  
  }	
  
     
      
  public void fontcolor_clck() throws InterruptedException, AWTException {
  
  for (int i=1; i<27; i++) {
  
  
  try {
  
           
  
  // Font-Color Starts
  
  WebElement Text1 = driver.findElement(By.xpath("/html/body/div[2]/div/section[4]/div/div/div[1]/de/p")); 
  Actions action = new Actions(driver);
  JavascriptExecutor js = (JavascriptExecutor) driver;
	
	//Scroll to the Element

	js.executeScript("arguments[0].scrollIntoView(true);",Text1);
	
	System.out.println(Text1.getSize());
	

	
	Robot bot = new Robot(); 
	bot.mouseMove(Text1.getLocation().x,Text1.getLocation().x); 
	bot.mousePress(InputEvent.BUTTON1_MASK); bot.mouseRelease(InputEvent.BUTTON1_MASK); 
	bot.mousePress(InputEvent.BUTTON1_MASK); bot.mouseRelease(InputEvent.BUTTON1_MASK); 
	bot.mousePress(InputEvent.BUTTON1_MASK); bot.mouseRelease(InputEvent.BUTTON1_MASK);
	

	action.moveToElement(Text1).contextClick().perform();
     	
       System.out.println(Text1.getSize());
  
    
  Thread.sleep(3000);
     
     
     //Mouse over on font color
     
  
  
     //WebElement color2 = driver.findElement(By.xpath("/html/body/div[13]/ul/li[6]"));
  
                 WebElement color2 = driver.findElement(By.cssSelector("li.submenu:nth-child(6)"));  
     
     action.moveToElement(color2).build().perform();
  
  Thread.sleep(5000);
  
  
  
  if ( i >=22) {
  
  try {
	  
	  if ( (i == 22) ) {
  
  WebElement morecolors = driver.findElement(By.xpath("/html/body/div[13]/ul/li[6]/ul/li[22]/em")); 
  

  
  js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
  morecolors);
  
  Thread.sleep(3000);
  
  morecolors.click();
  
	  }
	  
	  
	  else 
		  
		  if (i == 23)
			  
		  {
			  
			  WebElement morecolors = driver.findElement(By.xpath("/html/body/div[13]/ul/li[6]/ul/li[23]/em")); 
			  

			  
			  js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
			  morecolors);
			  
			  Thread.sleep(3000);
			  
			  morecolors.click(); 
			  
		  }
	  
	  
	  else {
		  
		  WebElement morecolors = driver.findElement(By.xpath("/html/body/div[13]/ul/li[6]/ul/li[24]/em")); 
		  

		  
		  js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
		  morecolors);
		  
		  Thread.sleep(3000);
		  
		  morecolors.click();
		    
		  
	  }
  
  
  
  //Select the color
     
   //int m = i + 2;
  
    WebElement colorpick = driver.findElement(By.xpath("/html/body/div[13]/ul/li[6]/ul/li["+i+"]"));
    
   
    
    
  //Get the Text of the font color
    //String fontcolorvalue = colorpick.getCssValue("color");
    
   String fontcolorvalue = colorpick.getCssValue("background-color");
    
    
    System.out.println("The selected Font color value is  is "+fontcolorvalue);
    
    
   js.executeScript("arguments[0].setAttribute('style', 'border: 0.5px solid red;');",
  colorpick);
     Thread.sleep(3000);
     
    colorpick.click();
    
Thread.sleep(1000);
    
    action.moveToElement(Text1, 0, 0)
    .clickAndHold()
    .moveByOffset(0, 0)
    .release()
    .perform();
    
    
    Thread.sleep(2000);
    

     String fontcolor1 = driver.findElement(By.cssSelector(".mass-explanation-component > div:nth-child(2) > div:nth-child(1) > de:nth-child(1) > p:nth-child(1) > font:nth-child(1)")).getCssValue("color");
     
     System.out.println("The Paragraph color is "+fontcolor1);
     
  
     if (fontcolor1.equals(fontcolorvalue))
    
    {
    
    System.out.println(fontcolor1 + " " +"Applied to Text");
    
    }
       
       else
       
       {
       
      System.out.println(fontcolor1+ " " +"Not Applied to Text");
       }    
       
     
    
    
  }
    
  catch( Exception e)
  
  {
  
  
  System.out.println("The error Message is " + e);
  throw(e);
  
  
  
  }
  
  

     
    Thread.sleep(3000);
  
  
  }	 
  
  
  
  else {
  
  
  try {
    
     //Select the color
     
  
    //WebElement colorpick = driver.findElement(By.xpath("/html/body/div[13]/ul/li[6]/ul/li["+i+"]"));
  
  WebElement colorpick = driver.findElement(By.cssSelector("li.box-color:nth-child("+i+")"));
  
  
  
  
  //Get the Text of the font color
    //String fontcolorvalue = colorpick.getCssValue("color");
    
   String fontcolorvalue = colorpick.getCssValue("background-color");
    
    
    System.out.println("The selected Font color value is  is "+fontcolorvalue);
    
    
    
    
   js.executeScript("arguments[0].setAttribute('style', 'border: 0.5px solid red;');",
  colorpick);
     Thread.sleep(3000);
     
    colorpick.click();
    
    
    Thread.sleep(1000);
    
    action.moveToElement(Text1, 0, 0)
    .clickAndHold()
    .moveByOffset(0, 0)
    .release()
    .perform();
    
    
  
    Thread.sleep(2000);
    
 if (fontcolorvalue.equals("rgb(10, 10, 10)"))
    	
    {
    	
    	System.out.println(fontcolorvalue + " " +"not applying");
    }
    

    else {
     
     String fontcolor1 = driver.findElement(By.cssSelector(".mass-explanation-component > div:nth-child(2) > div:nth-child(1) > de:nth-child(1) > p:nth-child(1) > font:nth-child(1)")).getCssValue("color");
     
     
     
  
  
     System.out.println("The Paragraph color is "+fontcolor1);
  
  if (fontcolor1.equals(fontcolorvalue))
    
          {
    
    System.out.println(fontcolor1 + " " +"Applied to Text");
    
         }
       
       else
       
       {
       
      System.out.println(fontcolor1+ " " +"Not Applied to Text");
       }    
     
  
    }
     
     
    }
    
  catch( Exception e)
  
  {
  
  
  System.out.println("The error Message is " + e);
  throw(e);
  
  
  }

     
    Thread.sleep(3000);
    
  }}
   catch( Exception e)
  
  {
  
  
  System.out.println("The error Message is " + e);
  throw(e);
  
  
  }
    
    
  
  
  
  }
  
  }
  
  
  
  
  public void fonttype_clck() throws InterruptedException, AWTException {
	  

	// Font type Starts
			
					for (int j=1; j<5; j++) {
					

					WebElement Text1 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div[1]/de/p[1]")); 
					
					

					Actions action = new Actions(driver);
					JavascriptExecutor js = (JavascriptExecutor) driver;
		
					//Scroll to the Element

					js.executeScript("arguments[0].scrollIntoView(true);",Text1);
					
					Thread.sleep(2000);
		

		Robot bot = new Robot(); 
		bot.mouseMove(Text1.getLocation().x,Text1.getLocation().x); 
		bot.mousePress(InputEvent.BUTTON1_MASK); bot.mouseRelease(InputEvent.BUTTON1_MASK); 
		bot.mousePress(InputEvent.BUTTON1_MASK); bot.mouseRelease(InputEvent.BUTTON1_MASK); 
		bot.mousePress(InputEvent.BUTTON1_MASK); bot.mouseRelease(InputEvent.BUTTON1_MASK);
		

		action.moveToElement(Text1).contextClick().perform();
		

						  if ( j == 4)
							  
						  {
			
					
							  try {
								
								
						
								  	Thread.sleep(3000);
								    
								    
								    //Mouse over on font type
								    
								    WebElement fonttype1 = driver.findElement(By.xpath("/html/body/div[13]/ul/li[7]")); 
								    
								    action.moveToElement(fonttype1).build().perform();
									 
									 Thread.sleep(5000);
									 
									 int m = j + 1; 
									 
				  
											   WebElement selectfonttype = driver.findElement(By.xpath("/html/body/div[13]/ul/li[7]/ul/li["+m+"]"));
											   
					
											   
											   //Get the Text of the font type
											   String fonttypetext = selectfonttype.getText();
											   
											   System.out.println("The selected Font type text is "+fonttypetext);
											   
											   
												
											   
											  js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
													  selectfonttype);
											    Thread.sleep(3000);
											    
											    selectfonttype.click();
							
											   
											    
											    action.moveToElement(Text1, 0, 0)
										        .clickAndHold()
										        .moveByOffset(0, 0)
										        .release()
										        .perform();
											    
											   Thread.sleep(2000);	
											   
          String Strike = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div[1]/de/p[1]/span")).getCssValue("text-decoration");
          
          System.out.println("Strike Through is "+Strike);
          
          if (Strike.equals("line-through"))
        	  
          {
        	  
        	  System.out.println(Strike+" "+"Applied to text"); 
        	  
          }
          
          else {
        	  
        	  System.out.println(Strike+" "+"Not Applied to text"); 
        	  
          }
											   




							  }
							  
							  catch( Exception e)
								
								{
								
									System.out.println("Exception has been handled" + e);
									System.out.println("The error Message is " + e);
									throw(e);
									
									
								}
							  
							  
						  }
						
						  
						  
						  else {
							  
							 
							
							
							try {
							
							
						
							    //Mouse over on font type
							    
							    WebElement fonttype1 = driver.findElement(By.xpath("/html/body/div[13]/ul/li[7]"));  
							    
							    action.moveToElement(fonttype1).build().perform();
								 
								 Thread.sleep(3000);
								 
								
										   WebElement selectfonttype = driver.findElement(By.xpath("/html/body/div[13]/ul/li[7]/ul/li["+j+"]"));
										   
										   
										   
										   
										   //Get the Text of the font type
										   String fonttypetext = selectfonttype.getText();
										   
										   System.out.println("The selected Font type text is "+fonttypetext);
										   
										   JavascriptExecutor js1 = (JavascriptExecutor) driver;
											
										   
										  js1.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
												  selectfonttype);
										    Thread.sleep(3000);
										    
										    selectfonttype.click();
										   
										    
										    action.moveToElement(Text1, 0, 0)
									        .clickAndHold()
									        .moveByOffset(0, 0)
									        .release()
									        .perform();
										    
										    Thread.sleep(2000);
										    
										    
										    try {
										    
										    String[] FontType = { "b", "i", "u" };

										    for (int m=0; m<=2; m++) {

										    List<WebElement> options = Text1.findElements(By.tagName(FontType[m]));
										    System.out.println(options);
										    
										   
										    	
										    	//Get theSub String of the options Output
											    String opt1 = options.toString().substring(152);
					
										    
										    //Get Charcter of font type
										    char first = opt1.charAt(0);
										    
										    //Convert Character to String
										    String fonttype = Character.toString(first);
										    
										    
										    
										    
										    System.out.println("Char of the string"+" "+ first);
										    
				
										    //System.out.println("Char of the string"+" "+ opt1);
 
										    for (WebElement option : options)
										            {
										    	
										    	

										    if (FontType[m].equals(fonttype))
										                {
										                    System.out.println(FontType[m] + " " +"Applied to Text");

										                }

										    else
										    {

										     System.out.println(FontType[m] + " " +"Not Applied to Text");


										    }

	    
										    
										 // Assert tag name of bold text
											//String tagName= driver.findElement(By.id("bold1")).getTagName()
										    
										    

										            }}
										    
							
							
							
							}
										    
										    catch (StringIndexOutOfBoundsException e) {
								                System.out.println("StringIndexOutOfBoundsException is handled. ");
								            }
							
							
							}		
										
							  
							  catch( Exception e)
								
								{
								
									
									System.out.println("The error Message is " + e);
									throw(e);
									
									
								}
								 		    
								 		    
						  }		
									
									
									}

		}
  
  
  
  
  public void textalign_clck() throws InterruptedException, AWTException {
		
		// Font Size Starts

		
		for (int j=1; j<5; j++) {
			
			
				try {
				
				
             WebElement Text1 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div[1]/de/p[2]")); 
					
					
					Actions action = new Actions(driver);
					JavascriptExecutor js = (JavascriptExecutor) driver;
		
					//Scroll to the Element

					js.executeScript("arguments[0].scrollIntoView(true);",Text1);
					
					Thread.sleep(2000);
		

		Robot bot = new Robot(); 
		bot.mouseMove(Text1.getLocation().x,Text1.getLocation().x); 
		bot.mousePress(InputEvent.BUTTON1_MASK); bot.mouseRelease(InputEvent.BUTTON1_MASK); 
		bot.mousePress(InputEvent.BUTTON1_MASK); bot.mouseRelease(InputEvent.BUTTON1_MASK); 
		bot.mousePress(InputEvent.BUTTON1_MASK); bot.mouseRelease(InputEvent.BUTTON1_MASK);
		

		action.moveToElement(Text1).contextClick().perform();
		
		Thread.sleep(3000);
				    
				    
				    //Mouse over on Text Align
				    
				    WebElement textalign1 = driver.findElement(By.xpath("/html/body/div[13]/ul/li[9]"));
				    
				    action.moveToElement(textalign1).build().perform();
					 
					Thread.sleep(5000);
					
					
					
				
				   WebElement selecttextalign = driver.findElement(By.xpath(" /html/body/div[13]/ul/li[9]/ul/li["+j+"]"));
				   
				
				   
				   //Get the Text of the text Alignment
				   String aligntext = selecttextalign.getText().toLowerCase();
				   
				   System.out.println("The selected align text is  "+aligntext);
				   
		
				  js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
						  selecttextalign);
				    Thread.sleep(3000);
				    
				    selecttextalign.click();
				    
			
				   
				    
				    action.moveToElement(Text1, 0, 0)
			        .clickAndHold()
			        .moveByOffset(0, 0)
			        .release()
			        .perform();
				    
				   Thread.sleep(2000);
				   
				   
				    
				    String textalign2 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div[1]/de/p[2]")).getCssValue("text-align");
				    
				    String ExtractAlign = textalign2.substring(5);
				   
				    System.out.println("The Paragraph text-align is "+textalign2);
				    
				    if (aligntext.equals(ExtractAlign))

				    {

				    System.out.println(aligntext +" "+"Applied to Text");

				    }

				    else

				    {
				    	
				       if (aligntext.equals(textalign2) ) {
				    	   
				    	   
				    	   System.out.println(aligntext +" "+"Applied to Text");
				       }
				       
				       else {
				    	

				    System.out.println(aligntext +" "+"Not Applied to Text");
				    
				       }
				    }
					    
				    
				   
					
					}
				   
				  catch( Exception e)
					
					{
					
						
						System.out.println("The error Message is " + e);
						throw(e);
						
						
						
					}
				  

				
			}
			
		}
		
		
	  
  

public void hyperlink_clck_for_New() throws InterruptedException, AWTException {
			
			// Hyperlink Starts
	
			      try{
		
						WebElement Text1 = driver.findElement(By.xpath("/html/body/div[2]/div/section[4]/div/div/div[1]/de/p")); 
	
					Actions action = new Actions(driver);
					JavascriptExecutor js = (JavascriptExecutor) driver;
		
					//Scroll to the Element

					js.executeScript("arguments[0].scrollIntoView(true);",Text1);
					
					Thread.sleep(2000);
		

		Robot bot = new Robot(); 
		bot.mouseMove(Text1.getLocation().x,Text1.getLocation().x); 
		bot.mousePress(InputEvent.BUTTON1_MASK); bot.mouseRelease(InputEvent.BUTTON1_MASK); 
		bot.mousePress(InputEvent.BUTTON1_MASK); bot.mouseRelease(InputEvent.BUTTON1_MASK); 
		bot.mousePress(InputEvent.BUTTON1_MASK); bot.mouseRelease(InputEvent.BUTTON1_MASK);
		

		action.moveToElement(Text1).contextClick().perform();
		
									
									 Thread.sleep(3000);
								    
								    
								    //Mouse over on HyperLink
								    
								    WebElement hyperlink = driver.findElement(By.xpath("/html/body/div[13]/ul/li[13]"));  
									
									
								    
								    js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
								    		hyperlink);
								    
								    Thread.sleep(3000);
								    
								    hyperlink.click();
								    
								   
									Thread.sleep(5000);
	
								   WebElement hreflink = driver.findElement(By.xpath(" //*[@id=\"href_A_1\"]"));     
								   WebElement target = driver.findElement(By.xpath(" //*[@id=\"target_A_2\"]"));
								   WebElement alt = driver.findElement(By.xpath(" //*[@id=\"alt_A_3\"]"));
								   
								   
								   
								   
								   String link = "www.netrovert.net";
								   
								   
								   
								   hreflink.sendKeys("www.netrovert.net");
								   Thread.sleep(2000);							 
								   target.sendKeys("_parent");
								   Thread.sleep(2000);
								   alt.sendKeys("company");
								   Thread.sleep(2000);
								 
								   System.out.println("The selected href text is "+link);
								   
								   Thread.sleep(2000);
								   
								   WebElement set = driver.findElement(By.xpath("//*[@id=\"save\"]"));
								   
								   js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
								    		set);
								   
								   Thread.sleep(3000);
						
								   set.click();
								   
								 /* js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
										  selecttextalign);
								    Thread.sleep(3000);
								    
								    selecttextalign.click();*/
								    
							
								   
								    
								    action.moveToElement(Text1, 0, 0)
							        .clickAndHold()
							        .moveByOffset(0, 0)
							        .release()
							        .perform();
								    
								   Thread.sleep(2000);
								    
								    String hrefvalue = driver.findElement(By.xpath("//html/body/div[2]/div/section[4]/div/div/div[1]/de/p/a")).getAttribute("href");
								    
					
								    System.out.println("The href value is "+hrefvalue);
								    
								    
								    String hrefsplit = hrefvalue.substring(7).split("/")[1];
								    
								    System.out.println("The Splitted Href URl is "+hrefsplit);
								    
								
								   if ( hrefsplit.equals(link))
								   {
								   
								   System.out.println(hrefsplit+" "+"Applied to Text" );
								   
								   }
								   
								   else {
								   
								   System.out.println(hrefsplit+" "+"Not Applied to Text" );
								   
								   }
								
								
								   Thread.sleep(2000);
								   
								   
			      }
			      
			      catch( Exception e)
					
					{
					
						
						System.out.println("The error Message is " + e);
						throw(e);
						
						
						
					}
			      
		
								   //Edit the Hyperlink
			      
			      
			        try{ 
								   
								   WebElement Text1 = driver.findElement(By.xpath("//html/body/div[2]/div/section[4]/div/div/div[1]/de/p")); 
	
					Actions action = new Actions(driver);
					JavascriptExecutor js = (JavascriptExecutor) driver;
		
					//Scroll to the Element

					js.executeScript("arguments[0].scrollIntoView(true);",Text1);
					
					Thread.sleep(2000);
		

		Robot bot = new Robot(); 
		bot.mouseMove(Text1.getLocation().x,Text1.getLocation().x); 
		bot.mousePress(InputEvent.BUTTON1_MASK); bot.mouseRelease(InputEvent.BUTTON1_MASK); 
		bot.mousePress(InputEvent.BUTTON1_MASK); bot.mouseRelease(InputEvent.BUTTON1_MASK); 
		bot.mousePress(InputEvent.BUTTON1_MASK); bot.mouseRelease(InputEvent.BUTTON1_MASK);
		

		action.moveToElement(Text1).contextClick().perform();
		
									
									 Thread.sleep(3000);
										 
										 
										 //Click the Edit Hyperlink Button  
										 WebElement edithyperlink = driver.findElement(By.xpath("/html/body/div[13]/ul/li[14]"));  
										    
										    js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
										    		edithyperlink);
										    
										    Thread.sleep(3000);
										    
										    edithyperlink.click();
									    
									    	   
										    WebElement hreflinkbox = driver.findElement(By.xpath("//*[@id=\"href_A_3\"]")); 
										    
										    String link1 = "www.google.com";
										    
										    hreflinkbox.clear();
										    Thread.sleep(2000);
										    hreflinkbox.sendKeys(link1);
										    
										    
                                   WebElement updatebutton = driver.findElement(By.xpath("//*[@id=\"save\"]"));  
										    
										    js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
										    		updatebutton);
										    Thread.sleep(3000);
										    
										    updatebutton.click();
										  //*[@id="save"]
								   
										    
										    action.moveToElement(Text1, 0, 0)
									        .clickAndHold()
									        .moveByOffset(0, 0)
									        .release()
									        .perform();
										    
										   Thread.sleep(2000);
										    
										    String hrefvalue1 = driver.findElement(By.xpath("/html/body/div[2]/div/section[4]/div/div/div[1]/de/p/a")).getAttribute("href");
										    
										    
										    
										    System.out.println("The href value is "+hrefvalue1);
										    
										    
										    String hrefsplit1 = hrefvalue1.substring(7).split("/")[1];
										    
										    System.out.println("The Splitted Href URl is "+hrefsplit1);
										    
											if (hrefsplit1.equals(link1))
											{
											
											System.out.println(link1+" "+"Replaced with Existing one");
											
											}
											
											else {
											
											System.out.println(link1+" "+"Not Replaced with Existing one");
											}
											
	
										   Thread.sleep(3000);
										   
										   
										   
			        }
			        
			        catch( Exception e)
					
					{
					
						
						System.out.println("The error Message is " + e);
						throw(e);
						
						
						
					}
										   

										   
										 //Remove The Hyperlink
										   
			        
			                        try {
			                        	
			                        	
			                        	WebElement Text1 = driver.findElement(By.xpath("/html/body/div[2]/div/section[4]/div/div/div[1]/de/p")); 
	
					Actions action = new Actions(driver);
					JavascriptExecutor js = (JavascriptExecutor) driver;
		
					//Scroll to the Element

					js.executeScript("arguments[0].scrollIntoView(true);",Text1);
					
					Thread.sleep(2000);
		

		Robot bot = new Robot(); 
		bot.mouseMove(Text1.getLocation().x,Text1.getLocation().x); 
		bot.mousePress(InputEvent.BUTTON1_MASK); bot.mouseRelease(InputEvent.BUTTON1_MASK); 
		bot.mousePress(InputEvent.BUTTON1_MASK); bot.mouseRelease(InputEvent.BUTTON1_MASK); 
		bot.mousePress(InputEvent.BUTTON1_MASK); bot.mouseRelease(InputEvent.BUTTON1_MASK);
		

		action.moveToElement(Text1).contextClick().perform();
		
									
									 Thread.sleep(3000);
												 
												 
												 //Click the Remove Hyperlink Button   
												 WebElement remhyperlink = driver.findElement(By.xpath("/html/body/div[13]/ul/li[13]"));   
												    
												    js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
												    		remhyperlink);
												    
												    Thread.sleep(3000);
												    
												    remhyperlink.click();
												    
												    
												    action.moveToElement(Text1, 0, 0)
											        .clickAndHold()
											        .moveByOffset(0, 0)
											        .release()
											        .perform();
												    
												   Thread.sleep(2000);
												   
												   
												   
												   //WebElement hrefcheck = driver.findElement(By.xpath("/html/body/div[2]/div/section[4]/div/div/div[1]/de/p/a"));
												   
												   Boolean iselementpresent = driver.findElements(By.xpath("html/body/div[2]/div/section[4]/div/div/div[1]/de/p/a")).size()!= 0;
												    
												    //String hrefvalue2 = driver.findElement(By.xpath("/html/body/div[2]/div/section[4]/div/div/div[1]/de/p/a")).getAttribute("href");
												    
												    //System.out.println("The href value is "+hrefvalue2);
												   
							
												   if (iselementpresent == true)
												   {
												    System.out.print("Element Is Present On The Page"+ "\n");
												   }
												   else
												   {
												    System.out.print("Element Not Present On The Page"+ "\n");
												    
												   }
												   
			                        
		}
			
			
			
			catch( Exception e)
			
			{
			
				
				System.out.println("The error Message is " + e);
				throw(e);
				
				
				
			}
												    
			
									}
								   
	  




public void hyperlink_clck_for_Exist() throws InterruptedException, AWTException {
			
			// Hyperlink Starts
	
			     
								   //Edit the Hyperlink
			      
			      
			        try{ 
								   
								   WebElement Text1 = driver.findElement(By.xpath("/html/body/div[2]/div/section[4]/div/div/div[1]/de/div/a")); 
	
					Actions action = new Actions(driver);
					JavascriptExecutor js = (JavascriptExecutor) driver;
		
					//Scroll to the Element

					js.executeScript("arguments[0].scrollIntoView(true);",Text1);
					
					Thread.sleep(2000);
		

		/*Robot bot = new Robot(); 
		bot.mouseMove(Text1.getLocation().x,Text1.getLocation().x); 
		bot.mousePress(InputEvent.BUTTON1_MASK); bot.mouseRelease(InputEvent.BUTTON1_MASK); 
		bot.mousePress(InputEvent.BUTTON1_MASK); bot.mouseRelease(InputEvent.BUTTON1_MASK); 
		bot.mousePress(InputEvent.BUTTON1_MASK); bot.mouseRelease(InputEvent.BUTTON1_MASK);*/
		

		action.moveToElement(Text1).contextClick().perform();
		
		
		//Switch to new window opened
				for(String winHandle : driver.getWindowHandles()){
				    driver.switchTo().window(winHandle);
				}
		
									
									 Thread.sleep(3000);
										 
										 
										 //Click the Edit Hyperlink Button  
										 WebElement edithyperlink = driver.findElement(By.xpath("/html/body/div[13]/ul/li[14]"));  
										    
										    js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
										    		edithyperlink);
										    
										    Thread.sleep(3000);
										    
										    edithyperlink.click();
										    
										    Thread.sleep(1000);
										  
									    
									    	   
										    WebElement hreflinkbox = driver.findElement(By.xpath("//*[@id=\"href_A_1\"]")); //*[@id=\"href_A_1\"]
										    WebElement alt = driver.findElement(By.xpath(" //*[@id=\"alt_A_2\"]")); 
											WebElement target = driver.findElement(By.xpath(" //*[@id=\"target_A_3\"]")); 
											
										    
										    
										    String link1 = "www.google.com";
										    
										    hreflinkbox.clear();
										    hreflinkbox.sendKeys(link1);
										    Thread.sleep(2000);
										    target.clear();
										    target.sendKeys("_parent");
											Thread.sleep(2000);
											alt.clear();
											alt.sendKeys("company");
											Thread.sleep(2000);
										    
										    
                                   WebElement updatebutton = driver.findElement(By.xpath("//*[@id=\"save\"]"));  
										    
										    js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
										    		updatebutton);
										    Thread.sleep(3000);
										    
										    updatebutton.click();
										  //*[@id="save"]
								   
										    
										   /* action.moveToElement(Text1, 0, 0)
									        .clickAndHold()
									        .moveByOffset(0, 0)
									        .release()
									        .perform();*/
										    
										   Thread.sleep(2000);
										    
										    String hrefvalue1 = driver.findElement(By.xpath("/html/body/div[2]/div/section[4]/div/div/div[1]/de/div/a")).getAttribute("href");
										    
										    
										    
										    System.out.println("The href value is "+hrefvalue1);
										    
										    
										    String hrefsplit1 = hrefvalue1.substring(7).split("/")[1];
										    
										    System.out.println("The Splitted Href URl is "+hrefsplit1);
										    
											if (hrefsplit1.equals(link1))
											{
											
											System.out.println(link1+" "+"Replaced with Existing one");
											
											}
											
											else {
											
											System.out.println(link1+" "+"Not Replaced with Existing one");
											}
											
	
										   Thread.sleep(3000);
										   
										   
										   
			        }
			        
			        catch( Exception e)
					
					{
					
						
						System.out.println("The error Message is " + e);
						throw(e);
						
						
						
					}
										   

										   
										 //Remove The Hyperlink
										   
			        
			                        try {
			                        	
			                        	
			                        	WebElement Text1 = driver.findElement(By.xpath("/html/body/div[2]/div/section[4]/div/div/div[1]/de/div/a")); 
	
					Actions action = new Actions(driver);
					JavascriptExecutor js = (JavascriptExecutor) driver;
		
					//Scroll to the Element

					js.executeScript("arguments[0].scrollIntoView(true);",Text1);
					
					Thread.sleep(2000);
		

		/*Robot bot = new Robot(); 
		bot.mouseMove(Text1.getLocation().x,Text1.getLocation().x); 
		bot.mousePress(InputEvent.BUTTON1_MASK); bot.mouseRelease(InputEvent.BUTTON1_MASK); 
		bot.mousePress(InputEvent.BUTTON1_MASK); bot.mouseRelease(InputEvent.BUTTON1_MASK); 
		bot.mousePress(InputEvent.BUTTON1_MASK); bot.mouseRelease(InputEvent.BUTTON1_MASK);*/
		

		action.moveToElement(Text1).contextClick().perform();
		
		//Switch to new window opened
		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		}

		
									
									 Thread.sleep(3000);
												 
												 
												 //Click the Remove Hyperlink Button   
												 //WebElement remhyperlink = driver.findElement(By.xpath("/html/body/div[13]/ul/li[13]"));  
									 
									           WebElement remhyperlink = driver.findElement(By.cssSelector(".remove-hyperlink"));
												 
					
												    js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
												    		remhyperlink);
												    
												    Thread.sleep(3000);
												    
												    remhyperlink.click();
												    
												    
												    /*action.moveToElement(Text1, 0, 0)
											        .clickAndHold()
											        .moveByOffset(0, 0)
											        .release()
											        .perform();*/
												    
												   Thread.sleep(2000);
												   
												   
												   
												   Boolean iselementpresent = driver.findElements(By.xpath("/html/body/div[2]/div/section[4]/div/div/div[1]/de/div/a")).size()!= 0;
												    
												    //String hrefvalue2 = driver.findElement(By.xpath("/html/body/div[2]/div/section[4]/div/div/div[1]/de/p/a")).getAttribute("href");
												    
												    //System.out.println("The href value is "+hrefvalue2);
												   
							
												   if (iselementpresent == true)
												   {
												    System.out.print("Element Is Present On The Page"+ "\n");
												   }
												   else
												   {
												    System.out.print("Element Not Present On The Page"+ "\n");
												    
												   }
												   
												   Thread.sleep(3000);
                 
			                        
		}
			
			
			
			catch( Exception e)
			
			{
			
				
				System.out.println("The error Message is " + e);
				throw(e);
				
				
				
			}
												    
}


public void EnterActns() throws InterruptedException, AWTException {
	

	WebElement Text1 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div[1]/de/h2/strong"));
	

	Actions actions = new Actions(driver);
	JavascriptExecutor js = (JavascriptExecutor) driver;

	//Scroll to the Element

	//js.executeScript("arguments[0].scrollIntoView(true);",Text1);
	
	Thread.sleep(2000);
	
	Robot bot = new Robot(); 
	/*bot.mouseMove(Text1.getLocation().x,Text1.getLocation().x); 
	bot.mousePress(InputEvent.BUTTON1_MASK); bot.mouseRelease(InputEvent.BUTTON1_MASK); */
	//bot.mousePress(InputEvent.BUTTON1_MASK); bot.mouseRelease(InputEvent.BUTTON1_MASK); 
	/*bot.mousePress(InputEvent.BUTTON1_MASK); bot.mouseRelease(InputEvent.BUTTON1_MASK);*/

	
	Thread.sleep(3000);
	
	//actions.moveToElement(Text1).click().sendKeys(Keys.ARROW_DOWN);
	
	//actions.moveToElement(Text1).click().send_keys(Text1, :END).perform();
	
	bot.keyPress(KeyEvent.VK_END);
	
	Thread.sleep(3000);
	

	/*Robot rb1 = new Robot(); */
	/*rb1.keyPress(KeyEvent.VK_CONTROL);
	rb1.keyPress(KeyEvent.VK_C);
	rb1.keyRelease(KeyEvent.VK_CONTROL);
	rb1.keyRelease(KeyEvent.VK_C);*/
	
	
	
	Thread.sleep(4000);

	Robot robot = new Robot();
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);

	Thread.sleep(3000);

	 
	// Paragraph Option in Right Click
		WebElement selectPara = driver.findElement(By.xpath("/html/body/div[13]/ul/li[1]")); 
	
	
	js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
			selectPara );
	Thread.sleep(1000);

	//selectPara.click();
	
	selectPara.click();
	
	
	
	/*
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);*/
	
	Thread.sleep(3000);
	
	/*String text = "Hello World";*/
	/*StringSelection stringSelection = new StringSelection(text);
	Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
	clipboard.setContents(stringSelection, stringSelection);

	
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_CONTROL);*/
	
	//actions.sendKeys("Hello Word");
	
	robot.keyPress(KeyEvent.VK_H);
	robot.keyRelease(KeyEvent.VK_H);
	robot.keyPress(KeyEvent.VK_E);
	robot.keyRelease(KeyEvent.VK_E);
	robot.keyPress(KeyEvent.VK_L);
	robot.keyRelease(KeyEvent.VK_L);
	robot.keyPress(KeyEvent.VK_L);
	robot.keyRelease(KeyEvent.VK_L);
	robot.keyPress(KeyEvent.VK_O);
	robot.keyRelease(KeyEvent.VK_O);
	
	Thread.sleep(4000);
	
	
	
	//Select Line Break
	
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);

	Thread.sleep(3000);
	
	// Line Break option 
	WebElement linebreak = driver.findElement(By.xpath("/html/body/div[13]/ul/li[2]")); 
	
	js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
			linebreak );
	Thread.sleep(1000);
	
	//selectLine Break;
	
	
	linebreak.click();
	
		/*robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);*/
		
		Thread.sleep(1000);

		/*robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);*/
		
		robot.keyPress(KeyEvent.VK_H);
		robot.keyRelease(KeyEvent.VK_H);
		robot.keyPress(KeyEvent.VK_E);
		robot.keyRelease(KeyEvent.VK_E);
		robot.keyPress(KeyEvent.VK_L);
		robot.keyRelease(KeyEvent.VK_L);
		robot.keyPress(KeyEvent.VK_L);
		robot.keyRelease(KeyEvent.VK_L);
		robot.keyPress(KeyEvent.VK_O);
		robot.keyRelease(KeyEvent.VK_O);
		
		Thread.sleep(4000);
		
		

	//Select heading 1
		
		
		try {
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(3000);
		
		WebElement head1 = driver.findElement(By.className("max-large-heading-<i>(&lt;h1&gt;)</i>"));  
		
		

		
		js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
				head1 );
		Thread.sleep(1000);
		
		//select h1
		
		head1.click();
		
		/*robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);*/
		
		Thread.sleep(1000);

		/*robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);*/
		
		robot.keyPress(KeyEvent.VK_H);
		robot.keyRelease(KeyEvent.VK_H);
		robot.keyPress(KeyEvent.VK_E);
		robot.keyRelease(KeyEvent.VK_E);
		robot.keyPress(KeyEvent.VK_L);
		robot.keyRelease(KeyEvent.VK_L);
		robot.keyPress(KeyEvent.VK_L);
		robot.keyRelease(KeyEvent.VK_L);
		robot.keyPress(KeyEvent.VK_O);
		robot.keyRelease(KeyEvent.VK_O);
		robot.keyPress(KeyEvent.VK_H);
		robot.keyRelease(KeyEvent.VK_1);
		
		Thread.sleep(4000);
		

		//Validate Font Size of Heading 1
		String fontsize = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div[1]/de/h1")).getCssValue("font-size");
		System.out.println("The Heading(h1) fontsize is "+fontsize);

	    if (fontsize.equals("32px"))
	    {
	    
	    	System.out.println("Heading H1" + " " +"Applied Successfully");
	  
	    }
	     
	     else
	     
	     {
	    	 
	     System.out.println("Heading H1" + " " +" Not Applied Successfully");
	     
	     }    
	    
		}
		
		catch( Exception e)
		
		{
		
			
			System.out.println("The error Message is " + e);
			throw(e);
			
			
			
		}
	     
		
  //Select heading 2
		
		try {
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(3000);
		
		WebElement head2 = driver.findElement(By.xpath("/html/body/div[13]/ul/li[5]"));
		//WebElement head2 = driver.findElement(By.cssSelector(".default-option"));    
		
		js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
				head2 );
		Thread.sleep(1000);
		
		//select h2
		
		/*robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		*/
		
		head2.click();
		
		Thread.sleep(1000);

		/*robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);*/
		
		robot.keyPress(KeyEvent.VK_H);
		robot.keyRelease(KeyEvent.VK_H);
		robot.keyPress(KeyEvent.VK_E);
		robot.keyRelease(KeyEvent.VK_E);
		robot.keyPress(KeyEvent.VK_L);
		robot.keyRelease(KeyEvent.VK_L);
		robot.keyPress(KeyEvent.VK_L);
		robot.keyRelease(KeyEvent.VK_L);
		robot.keyPress(KeyEvent.VK_O);
		robot.keyRelease(KeyEvent.VK_O);
		robot.keyPress(KeyEvent.VK_H);
		robot.keyRelease(KeyEvent.VK_2);
		
		Thread.sleep(4000);
		
		//Validate Font Size of Heading 2
				String fontsize1 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div[1]/de/h2")).getCssValue("font-size");
				System.out.println("The Heading(h2) fontsize is "+fontsize1);

			    if (fontsize1.equals("22px"))
			    {
			    
			    	System.out.println("Heading H1" + " " +"Applied Successfully");
			  
			    }
			     
			     else
			     
			     {
			    	 
			     System.out.println("Heading H1" + " " +" Not Applied Successfully");
			     
			     }    
			    
			    
		}
		
		catch( Exception e)
		
		{
		
			
			System.out.println("The error Message is " + e);
			throw(e);
			
			
			
		}
		
		
//Select Heading 3	
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(3000);
		
		WebElement head3 = driver.findElement(By.className("medium-large-heading-<i>(&lt;h3&gt;)</i>"));
		
		js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
				head3 );
		Thread.sleep(1000);
		
		//select h2
		
		/*robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);*/
		
		head3.click();
		
		Thread.sleep(1000);

		/*robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);*/
		
		robot.keyPress(KeyEvent.VK_H);
		robot.keyRelease(KeyEvent.VK_H);
		robot.keyPress(KeyEvent.VK_E);
		robot.keyRelease(KeyEvent.VK_E);
		robot.keyPress(KeyEvent.VK_L);
		robot.keyRelease(KeyEvent.VK_L);
		robot.keyPress(KeyEvent.VK_L);
		robot.keyRelease(KeyEvent.VK_L);
		robot.keyPress(KeyEvent.VK_O);
		robot.keyRelease(KeyEvent.VK_O);
		robot.keyPress(KeyEvent.VK_H);
		robot.keyRelease(KeyEvent.VK_3);
		
		
		
		Thread.sleep(4000);
		
		
//Select Heading 4
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(3000);
		
		WebElement head4 = driver.findElement(By.className("medium-heading-<i>(&lt;h4&gt;)</i>"));
		
		js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
				head4 );
		Thread.sleep(1000);
		
		//select h4
		
		/*robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);*/
		
		head4.click();
		
		Thread.sleep(1000);

		/*robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);*/
		
		robot.keyPress(KeyEvent.VK_H);
		robot.keyRelease(KeyEvent.VK_H);
		robot.keyPress(KeyEvent.VK_E);
		robot.keyRelease(KeyEvent.VK_E);
		robot.keyPress(KeyEvent.VK_L);
		robot.keyRelease(KeyEvent.VK_L);
		robot.keyPress(KeyEvent.VK_L);
		robot.keyRelease(KeyEvent.VK_L);
		robot.keyPress(KeyEvent.VK_O);
		robot.keyRelease(KeyEvent.VK_O);
		robot.keyPress(KeyEvent.VK_H);
		robot.keyRelease(KeyEvent.VK_4);
		
		Thread.sleep(4000);
		
		
//Select Heading 5	
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(3000);
		
		WebElement head5 = driver.findElement(By.className("medium-small-heading-<i>(&lt;h5&gt;)</i>"));
		
		js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
				head5 );
		Thread.sleep(1000);
		
		//select h5
		
		/*robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);*/
		
		head5.click();
		
		Thread.sleep(1000);

		/*robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);*/
		
		robot.keyPress(KeyEvent.VK_H);
		robot.keyRelease(KeyEvent.VK_H);
		robot.keyPress(KeyEvent.VK_E);
		robot.keyRelease(KeyEvent.VK_E);
		robot.keyPress(KeyEvent.VK_L);
		robot.keyRelease(KeyEvent.VK_L);
		robot.keyPress(KeyEvent.VK_L);
		robot.keyRelease(KeyEvent.VK_L);
		robot.keyPress(KeyEvent.VK_O);
		robot.keyRelease(KeyEvent.VK_O);
		robot.keyPress(KeyEvent.VK_H);
		robot.keyRelease(KeyEvent.VK_5);
		
		Thread.sleep(4000);
		
//Select Heading 6
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(3000);
		
		WebElement head6 = driver.findElement(By.className("small-heading-<i>(&lt;h6&gt;)</i>"));
		
		js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
				head6 );
		Thread.sleep(1000);
		
		//select h6
		
		/*robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);*/
		
		head6.click();
		
		Thread.sleep(1000);

		/*robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);*/
		
		robot.keyPress(KeyEvent.VK_H);
		robot.keyRelease(KeyEvent.VK_H);
		robot.keyPress(KeyEvent.VK_E);
		robot.keyRelease(KeyEvent.VK_E);
		robot.keyPress(KeyEvent.VK_L);
		robot.keyRelease(KeyEvent.VK_L);
		robot.keyPress(KeyEvent.VK_L);
		robot.keyRelease(KeyEvent.VK_L);
		robot.keyPress(KeyEvent.VK_O);
		robot.keyRelease(KeyEvent.VK_O);
		robot.keyPress(KeyEvent.VK_H);
		robot.keyRelease(KeyEvent.VK_6);
		
		Thread.sleep(4000);
		
		
		
		
		
	
	
	/*
	for (int j=1; j<7; j++) {
		
		
		
		if ( j == 1) {
			
		
			WebElement h1 = driver.findElement(By.cssSelector("#about_us > div:nth-child(2) > h1"));  
			Robot rb = new Robot(); 
			rb.keyPress(KeyEvent.VK_CONTROL);
			rb.keyPress(KeyEvent.VK_V);
			rb.keyRelease(KeyEvent.VK_CONTROL);
			rb.keyRelease(KeyEvent.VK_V);
			WebElement descriptionEle = h1.findElement(By.tagName("h1"));

			  String descriptionText = descriptionEle.getText();
			  System.out.println(descriptionText);
			
			
			
		}
		
		else if ( j == 2 ) {
			
			WebElement h2 = driver.findElement(By.cssSelector("#about_us > div:nth-child(2) > h2")); 
			Robot rb = new Robot(); 
			rb.keyPress(KeyEvent.VK_CONTROL);
			rb.keyPress(KeyEvent.VK_V);
			rb.keyRelease(KeyEvent.VK_CONTROL);
			rb.keyRelease(KeyEvent.VK_V);
		}
		
		
       else if ( j == 3 ) {
			
			WebElement h3 = driver.findElement(By.cssSelector("#about_us > div:nth-child(2) > h3")); 
			Robot rb = new Robot(); 
			rb.keyPress(KeyEvent.VK_CONTROL);
			rb.keyPress(KeyEvent.VK_V);
			rb.keyRelease(KeyEvent.VK_CONTROL);
			rb.keyRelease(KeyEvent.VK_V);
		}
		
       else if ( j == 4 ) {
			
			WebElement h4 = driver.findElement(By.cssSelector("#about_us > div:nth-child(2) > h4")); 
			Robot rb = new Robot(); 
			rb.keyPress(KeyEvent.VK_CONTROL);
			rb.keyPress(KeyEvent.VK_V);
			rb.keyRelease(KeyEvent.VK_CONTROL);
			rb.keyRelease(KeyEvent.VK_V);
		}
		
       else if ( j == 5 ) {
			
			WebElement h5 = driver.findElement(By.cssSelector("#about_us > div:nth-child(2) > h5")); 
			Robot rb = new Robot(); 
			rb.keyPress(KeyEvent.VK_CONTROL);
			rb.keyPress(KeyEvent.VK_V);
			rb.keyRelease(KeyEvent.VK_CONTROL);
			rb.keyRelease(KeyEvent.VK_V);
		}
		
       else if ( j == 6 ) {
    	   
    
			WebElement h5 = driver.findElement(By.cssSelector("#about_us > div:nth-child(2) > h6")); 
			Robot rb = new Robot(); 
			rb.keyPress(KeyEvent.VK_CONTROL);
			rb.keyPress(KeyEvent.VK_V);
			rb.keyRelease(KeyEvent.VK_CONTROL);
			rb.keyRelease(KeyEvent.VK_V);
		}
		
		
		
		else {
		

		WebElement para1 = driver.findElement(By.cssSelector("#about_us > div:nth-child(2) > p:nth-child("+j+")"));
		
		Robot rb = new Robot(); 
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		
		}
		
       if ( j == 20 ) {
    	   
    	   Robot rb = new Robot(); 
    	   rb.keyRelease(KeyEvent.VK_CONTROL);
			rb.keyRelease(KeyEvent.VK_V); 
       }
		
       
       else {
	
					
					Thread.sleep(5000);

	
		Robot robot1 = new Robot();
		robot1.keyPress(KeyEvent.VK_ENTER);
		robot1.keyRelease(KeyEvent.VK_ENTER);
		
		
		if ( j >=14 )
			
			
		{
			
			
			int k = j -10;
			
			
			
			WebElement Enteroptions = driver.findElement(By.xpath("/html/body/div[14]/ul/li["+k+"]"));  

			js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
					Enteroptions );
						    	Thread.sleep(1000);
						    	
						    	Enteroptions.click();

			
								Thread.sleep(5000);
		
			
		}
		
		
		
		else {
		
		int k = j -11;
		
		
		
		WebElement Enteroptions = driver.findElement(By.xpath("/html/body/div[14]/ul/li["+k+"]"));  

		js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
				Enteroptions );
					    	Thread.sleep(1000);
					    	
					    	Enteroptions.click();

		//selectPara.click();
					    	
					    	robot.keyPress(KeyEvent.VK_ENTER);
							robot.keyRelease(KeyEvent.VK_ENTER);
							
							Thread.sleep(5000);
		
		
		//para1.sendKeys(Keys.chord(Keys.CONTROL, "v"));
		

		//para1.sendKeys(Keys.CONTROL+ "v");

       }
							
							
							
							
       }}
	
	
	*/


}

  



public void InlineSave() throws InterruptedException, AWTException {
	
	Thread.sleep(4000);
	
    driver.findElement(By.xpath("/html/body/div[4]/button[1]")).click();
	
}



//Validate the Inline Values





/*public void InlineSave() throws InterruptedException, AWTException {
	
	Thread.sleep(4000);
	
    driver.findElement(By.xpath("/html/body/div[4]/button[1]")).click();
	
}*/



//Validate the Inline Values





public void InlineValidate_save() throws InterruptedException, AWTException {


//Font Family Click

WebElement Text1 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div[1]/de/p[1]"));

Actions action = new Actions(driver);
 	JavascriptExecutor js = (JavascriptExecutor) driver;
 	
 	//Scroll to the Element

 	js.executeScript("arguments[0].scrollIntoView(true);",Text1);
	
	Robot bot = new Robot(); 
 	bot.mouseMove(Text1.getLocation().x,Text1.getLocation().x); 
 	bot.mousePress(InputEvent.BUTTON1_MASK); bot.mouseRelease(InputEvent.BUTTON1_MASK); 
 	bot.mousePress(InputEvent.BUTTON1_MASK); bot.mouseRelease(InputEvent.BUTTON1_MASK); 
 	bot.mousePress(InputEvent.BUTTON1_MASK); bot.mouseRelease(InputEvent.BUTTON1_MASK);
	
	action.moveToElement(Text1).contextClick().perform();
	
	Thread.sleep(3000);
	
	WebElement fontproper = driver.findElement(By.xpath("/html/body/div[13]/ul/li[4]"));  
	
	action.moveToElement(fontproper).build().perform();
	
	Thread.sleep(3000);
	
	WebElement fontselect = driver.findElement(By.xpath("/html/body/div[13]/ul/li[4]/ul/li[1]"));

    String fontFamilyText = driver.findElement(By.xpath("/html/body/div[13]/ul/li[4]/ul/li[1]/div")).getCssValue("font-family");
	
	System.out.println("The selected Font Family Value is  is "+fontFamilyText);
   
   
   js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
   	fontselect);
   Thread.sleep(3000);
   
   fontselect.click();

  Thread.sleep(3000);
  String fontfamily = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div[1]/de/p[1]/font")).getCssValue("font-family");
  
  
  Thread.sleep(1000);
  
  action.moveToElement(Text1, 0, 0)
  .clickAndHold()
  .moveByOffset(0, 0)
  .release()
  .perform();
  

 // Font Size click 
 
 WebElement Text2 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div[1]/de/p[2]")); 
 


	
	//Scroll to the Element

	js.executeScript("arguments[0].scrollIntoView(true);",Text2);
	

	bot.mouseMove(Text2.getLocation().x,Text2.getLocation().x); 
	bot.mousePress(InputEvent.BUTTON1_MASK); bot.mouseRelease(InputEvent.BUTTON1_MASK); 
	bot.mousePress(InputEvent.BUTTON1_MASK); bot.mouseRelease(InputEvent.BUTTON1_MASK); 
	bot.mousePress(InputEvent.BUTTON1_MASK); bot.mouseRelease(InputEvent.BUTTON1_MASK);
	
	action.moveToElement(Text2).contextClick().perform();
	
	Thread.sleep(3000);
	
	//Mouse over on font size

    WebElement fontsize1 = driver.findElement(By.cssSelector("li.submenu:nth-child(5)"));  
    action.moveToElement(fontsize1).build().perform();
  
    Thread.sleep(3000);
	
	 WebElement selectfontsize = driver.findElement(By.cssSelector("li.submenu:nth-child(5) > ul:nth-child(2) > li:nth-child(1)"));
	 
	 //Get the Text of the font size
     String fontsizetext = selectfontsize.getText();
    
    System.out.println("The selected Font size text is  is "+fontsizetext);
    
    js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
    selectfontsize);
     
	Thread.sleep(3000);
    selectfontsize.click();
	
	String fontsize2 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div[1]/de/p[2]/font")).getCssValue("font-size");
     
     System.out.println("The Paragraph fontsize is "+fontsize2);
     
     Thread.sleep(1000);
     
     action.moveToElement(Text2, 0, 0)
     .clickAndHold()
     .moveByOffset(0, 0)
     .release()
     .perform();
     

  // Font Color Click
   
   WebElement Text3 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div[1]/de/p[2]")); 

   
   //Scroll to the Element

   js.executeScript("arguments[0].scrollIntoView(true);",Text3);
   
  
	bot.mouseMove(Text1.getLocation().x,Text1.getLocation().x); 
	bot.mousePress(InputEvent.BUTTON1_MASK); bot.mouseRelease(InputEvent.BUTTON1_MASK); 
	bot.mousePress(InputEvent.BUTTON1_MASK); bot.mouseRelease(InputEvent.BUTTON1_MASK); 
	bot.mousePress(InputEvent.BUTTON1_MASK); bot.mouseRelease(InputEvent.BUTTON1_MASK);
	
	action.moveToElement(Text3).contextClick().perform();
	
	Thread.sleep(3000);
	
	//Mouse over on font color
	
	WebElement color2 = driver.findElement(By.cssSelector("li.submenu:nth-child(6)"));  
     
     action.moveToElement(color2).build().perform();
  
     Thread.sleep(3000);
	 
	 WebElement colorpick = driver.findElement(By.cssSelector("li.box-color:nth-child(4)"));
	 
	 //Get the Text of the font color
	 
	 String fontcolorvalue = colorpick.getCssValue("background-color");
    
    
    System.out.println("The selected Font color value is  is "+fontcolorvalue);
    

   js.executeScript("arguments[0].setAttribute('style', 'border: 0.5px solid red;');",
  colorpick);
     Thread.sleep(3000);
     
    colorpick.click();
	
	Thread.sleep(1000);
    
    action.moveToElement(Text3, 0, 0)
    .clickAndHold()
    .moveByOffset(0, 0)
    .release()
    .perform();
	
	 String fontcolor1 = driver.findElement(By.cssSelector("div.large-6:nth-child(1) > de:nth-child(1) > p:nth-child(4) > font:nth-child(1)")).getCssValue("color");
	 
	 
	 
	 System.out.println("The Paragraph color is "+fontcolor1);
	 
	  
	  
	 //Font type Click
	 
	 
	 for (int j=1; j<2; j++) {
	 

	 WebElement Text4 = driver.findElement(By.xpath("/html/body/div[2]/div/section[4]/div/div/div[1]/de/p")); 
	 
	
		
	 //Scroll to the Element

	 js.executeScript("arguments[0].scrollIntoView(true);",Text4);
					
	 Thread.sleep(2000);
	 

		bot.mouseMove(Text4.getLocation().x,Text4.getLocation().x); 
		bot.mousePress(InputEvent.BUTTON1_MASK); bot.mouseRelease(InputEvent.BUTTON1_MASK); 
		bot.mousePress(InputEvent.BUTTON1_MASK); bot.mouseRelease(InputEvent.BUTTON1_MASK); 
		bot.mousePress(InputEvent.BUTTON1_MASK); bot.mouseRelease(InputEvent.BUTTON1_MASK);
		
		action.moveToElement(Text4).contextClick().perform();
		
		//Mouse over on font type
							    
		WebElement fonttype1 = driver.findElement(By.xpath("/html/body/div[13]/ul/li[7]")); 
		
		action.moveToElement(fonttype1).build().perform();
								 
		Thread.sleep(3000);
								 
		WebElement selectfonttype = driver.findElement(By.xpath("/html/body/div[13]/ul/li[7]/ul/li["+j+"]"));
		
		//Get the Text of the font type
		String fonttypetext = selectfonttype.getText();
		
		System.out.println("The selected Font type text is "+fonttypetext);
										   
										   JavascriptExecutor js1 = (JavascriptExecutor) driver;
											
										   
										  js1.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
												  selectfonttype);
										    Thread.sleep(3000);
										    
										    selectfonttype.click();
										   
										    
										    action.moveToElement(Text4, 0, 0)
									        .clickAndHold()
									        .moveByOffset(0, 0)
									        .release()
									        .perform();
										    
										    Thread.sleep(2000);
										   
		
    }
	 
	 
		// Text Alignment
		
		WebElement Text5 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div[1]/de/p[2]"));

	    js.executeScript("arguments[0].scrollIntoView(true);",Text5);
						
						Thread.sleep(2000);

	    bot.mouseMove(Text5.getLocation().x,Text5.getLocation().x); 
			bot.mousePress(InputEvent.BUTTON1_MASK); bot.mouseRelease(InputEvent.BUTTON1_MASK); 
			bot.mousePress(InputEvent.BUTTON1_MASK); bot.mouseRelease(InputEvent.BUTTON1_MASK); 
			bot.mousePress(InputEvent.BUTTON1_MASK); bot.mouseRelease(InputEvent.BUTTON1_MASK);	

	  action.moveToElement(Text5).contextClick().perform();


	  Thread.sleep(3000);

	//Mouse over on Text Align
					    
					    WebElement textalign1 = driver.findElement(By.xpath("/html/body/div[13]/ul/li[9]"));
					    
					    action.moveToElement(textalign1).build().perform();
						 
						Thread.sleep(2000);  
						
						WebElement selecttextalign = driver.findElement(By.xpath(" /html/body/div[13]/ul/li[9]/ul/li[1]"));
						
						//Get the Text of the text Alignment
					   String aligntext = selecttextalign.getText().toLowerCase();
					   
					   System.out.println("The selected align text is  "+aligntext);
					   
			
					  js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
							  selecttextalign);
					    Thread.sleep(3000);
					    
					    selecttextalign.click();
						
						action.moveToElement(Text5, 0, 0)
				        .clickAndHold()
				        .moveByOffset(0, 0)
				        .release()
				        .perform();
					    
					   Thread.sleep(2000);
					   
					   String textalign2 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div[1]/de/p[2]")).getCssValue("text-align");
					    
					    String ExtractAlign = textalign2.substring(5);
					   
					    System.out.println("The Paragraph text-align is "+textalign2);
	 
					    
					    
					    //HYperlink
					    

							WebElement Text6 = driver.findElement(By.xpath("/html/body/div[2]/div/section[4]/div/div/div[1]/de/p")); 
						
										
							
										//Scroll to the Element

										js.executeScript("arguments[0].scrollIntoView(true);",Text6);
										
										Thread.sleep(2000);
							

							
							bot.mouseMove(Text6.getLocation().x,Text6.getLocation().x); 
							bot.mousePress(InputEvent.BUTTON1_MASK); bot.mouseRelease(InputEvent.BUTTON1_MASK); 
							bot.mousePress(InputEvent.BUTTON1_MASK); bot.mouseRelease(InputEvent.BUTTON1_MASK); 
							bot.mousePress(InputEvent.BUTTON1_MASK); bot.mouseRelease(InputEvent.BUTTON1_MASK);
							

							action.moveToElement(Text6).contextClick().perform();
							
														
														 Thread.sleep(3000);
													    
													    
													    //Mouse over on HyperLink
													    
													    WebElement hyperlink = driver.findElement(By.xpath("/html/body/div[13]/ul/li[13]"));  
														
														
													    
													    js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
													    		hyperlink);
													    
													    Thread.sleep(3000);
													    
													    hyperlink.click();
													    
													   
														Thread.sleep(5000);
						
													   WebElement hreflink = driver.findElement(By.xpath(" //*[@id=\"href_A_1\"]"));     
													   WebElement target = driver.findElement(By.xpath(" //*[@id=\"target_A_2\"]"));
													   WebElement alt = driver.findElement(By.xpath(" //*[@id=\"alt_A_3\"]"));
													   
													   
													   
													   
													   String link = "www.netrovert.net";
													   
													   
													   
													   hreflink.sendKeys("www.netrovert.net");
													   Thread.sleep(2000);							 
													   target.sendKeys("_parent");
													   Thread.sleep(2000);
													   alt.sendKeys("company");
													   Thread.sleep(2000);
													 
													   System.out.println("The selected href text is "+link);
													   
													   Thread.sleep(2000);
													   
													   WebElement set = driver.findElement(By.xpath("//*[@id=\"save\"]"));
													   
													   js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
													    		set);
													   
													   Thread.sleep(3000);
											
													   set.click();
													   
													 /* js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
															  selecttextalign);
													    Thread.sleep(3000);
													    
													    selecttextalign.click();*/
													    
						
													    action.moveToElement(Text6, 0, 0)
												        .clickAndHold()
												        .moveByOffset(0, 0)
												        .release()
												        .perform();
													    
													   Thread.sleep(2000);
													    
													    String hrefvalue = driver.findElement(By.xpath("//html/body/div[2]/div/section[4]/div/div/div[1]/de/p/a")).getAttribute("href");
													    
										
													    System.out.println("The href value is "+hrefvalue);
													    
													    
													    String hrefsplit = hrefvalue.substring(7).split("/")[1];
													    
													    System.out.println("The Splitted Href URl is "+hrefsplit);
														
														Thread.sleep(2000);
	 

	   // Click Save 

  Thread.sleep(4000);
	
	
	WebElement Save = driver.findElement(By.xpath("/html/body/div[4]/button[1]")); 

	
	//Scroll to the Element

	js.executeScript("arguments[0].scrollIntoView(true);",Save);
	
	js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
     Save);
	 Thread.sleep(3000);
  
     Save.click();
     
     Thread.sleep(15000);
 
														
														

	   //Validate Font Family
	 
	 
	//js.executeScript("arguments[0].scrollIntoView(true);",Text1);
	 Thread.sleep(3000);
	 
	 
	 String fontfamily1 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div[1]/de/p[1]/font")).getCssValue("font-family");
	   
	   
	   if (fontFamilyText.equals(fontfamily1))

	{

	System.out.println(fontfamily1 + " " + "Applied to Text successfully");

	}

	else

	{

	System.out.println(fontfamily1 + " " +"Not Applied to Text");
	}
	 
	   
	 Thread.sleep(1000);
 
    //Validate Font Size
	
	 //js.executeScript("arguments[0].scrollIntoView(true);",Text2);
	 Thread.sleep(3000);
	 
	 String fontsize21 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div[1]/de/p[2]/font")).getCssValue("font-size");
	 
	 
	   
	if (fontsize21.equals(fontsizetext))

	{

	System.out.println(fontsize21+ " " +"Applied to Text successfully");

	}
   
	else
   
   {
   
	System.out.println(fontsize21+ " " +"Not Applied to Text");
	
   }
   
   
   //Validate Font Color
	
	Thread.sleep(1000);
	
	/*js.executeScript("arguments[0].scrollIntoView(true);",Text3);*/
	
	String fontcolor11 = driver.findElement(By.cssSelector("div.large-6:nth-child(1) > de:nth-child(1) > p:nth-child(4) > font:nth-child(1)")).getCssValue("color");
   
   
   if (fontcolor11.equals(fontcolorvalue))
    
          {
    
    System.out.println(fontcolor11 + " " +"Applied to Text successfully");
    
         }
       
       else
       
       {
       
      System.out.println(fontcolor11+ " " +"Not Applied to Text ");
       
	   }  
   
   
   //Validate Text Alignment
   
   if (aligntext.equals(ExtractAlign))

   {

   System.out.println(aligntext +" "+"Applied to Text successfully");

   }


  else {
   	

   System.out.println(aligntext +" "+"Not Applied to Text");
   
      }		
   
   
   //Validate Hyperlink
   
   
   String hrefvalue1 = driver.findElement(By.xpath("//html/body/div[2]/div/section[4]/div/div/div[1]/de/p/a")).getAttribute("href");
   

   
   
   String hrefsplit1 = hrefvalue.substring(7).split("/")[1];
   
   if ( hrefsplit1.equals(link))
   {
   
   System.out.println(hrefsplit1+" "+"Applied to Text successfully" );
   
   }

   else {
   
   System.out.println(hrefsplit1+" "+"Not Applied to Text" );
   
   }

   
   //  Validate Font Type
   
   /*try {
   
   String[] FontType = { "b", "i", "u" };

										    for (int m=0; m<=2; m++) {
										    	
										    WebElement Text4 = driver.findElement(By.xpath("/html/body/div[2]/div/section[4]/div/div/div[1]/de/p"));

										    List<WebElement> options = Text4.findElements(By.tagName(FontType[m]));
										    System.out.println(options);
										    
										   
										    	
										    	//Get theSub String of the options Output
											    String opt1 = options.toString().substring(152);
					
										    
										    //Get Charcter of font type
										    char first = opt1.charAt(0);
										    
										    //Convert Character to String
										    String fonttype = Character.toString(first);
										    
										    
										    
										    
										    System.out.println("Char of the string"+" "+ first);
										    
				
										    //System.out.println("Char of the string"+" "+ opt1);
 
										    for (WebElement option : options)
										            {
										    	
										    	

										    if (FontType[m].equals(fonttype))
										                {
										                    System.out.println(FontType[m] + " " +"Applied to Text");

										                }

										    else
										    {

										     System.out.println(FontType[m] + " " +"Not Applied to Text");


										    }

										            }
										    
										    }
										    
}
   
   
   catch (StringIndexOutOfBoundsException e) {
       System.out.println("StringIndexOutOfBoundsException is handled. ");
   }
   */
   
   
   
 
    
}


public void InlineValidate_rollback() throws InterruptedException, AWTException {


	//Font Family Click

	WebElement Text1 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div[1]/de/p[1]"));

	Actions action = new Actions(driver);
	 	JavascriptExecutor js = (JavascriptExecutor) driver;
	 	
	 	//Scroll to the Element

	 	js.executeScript("arguments[0].scrollIntoView(true);",Text1);
		
		Robot bot = new Robot(); 
	 	bot.mouseMove(Text1.getLocation().x,Text1.getLocation().x); 
	 	bot.mousePress(InputEvent.BUTTON1_MASK); bot.mouseRelease(InputEvent.BUTTON1_MASK); 
	 	bot.mousePress(InputEvent.BUTTON1_MASK); bot.mouseRelease(InputEvent.BUTTON1_MASK); 
	 	bot.mousePress(InputEvent.BUTTON1_MASK); bot.mouseRelease(InputEvent.BUTTON1_MASK);
		
		action.moveToElement(Text1).contextClick().perform();
		
		Thread.sleep(3000);
		
		WebElement fontproper = driver.findElement(By.xpath("/html/body/div[13]/ul/li[4]"));  
		
		action.moveToElement(fontproper).build().perform();
		
		Thread.sleep(3000);
		
		WebElement fontselect = driver.findElement(By.xpath("/html/body/div[13]/ul/li[4]/ul/li[1]"));

	    String fontFamilyText = driver.findElement(By.xpath("/html/body/div[13]/ul/li[4]/ul/li[1]/div")).getCssValue("font-family");
		
		System.out.println("The selected Font Family Value is  is "+fontFamilyText);
	   
	   
	   js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
	   	fontselect);
	   Thread.sleep(3000);
	   
	   fontselect.click();

	  Thread.sleep(3000);
	  String fontfamily = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div[1]/de/p[1]/font")).getCssValue("font-family");
	  
	  
	  Thread.sleep(1000);
	  
	  action.moveToElement(Text1, 0, 0)
	  .clickAndHold()
	  .moveByOffset(0, 0)
	  .release()
	  .perform();
	  

	 // Font Size click 
	 
	 WebElement Text2 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div[1]/de/p[2]")); 
	 


		
		//Scroll to the Element

		js.executeScript("arguments[0].scrollIntoView(true);",Text2);
		

		bot.mouseMove(Text2.getLocation().x,Text2.getLocation().x); 
		bot.mousePress(InputEvent.BUTTON1_MASK); bot.mouseRelease(InputEvent.BUTTON1_MASK); 
		bot.mousePress(InputEvent.BUTTON1_MASK); bot.mouseRelease(InputEvent.BUTTON1_MASK); 
		bot.mousePress(InputEvent.BUTTON1_MASK); bot.mouseRelease(InputEvent.BUTTON1_MASK);
		
		action.moveToElement(Text2).contextClick().perform();
		
		Thread.sleep(3000);
		
		//Mouse over on font size

	    WebElement fontsize1 = driver.findElement(By.cssSelector("li.submenu:nth-child(5)"));  
	    action.moveToElement(fontsize1).build().perform();
	  
	    Thread.sleep(3000);
		
		 WebElement selectfontsize = driver.findElement(By.cssSelector("li.submenu:nth-child(5) > ul:nth-child(2) > li:nth-child(1)"));
		 
		 //Get the Text of the font size
	     String fontsizetext = selectfontsize.getText();
	    
	    System.out.println("The selected Font size text is  is "+fontsizetext);
	    
	    js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
	    selectfontsize);
	     
		Thread.sleep(3000);
	    selectfontsize.click();
		
		String fontsize2 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div[1]/de/p[2]/font")).getCssValue("font-size");
	     
	     System.out.println("The Paragraph fontsize is "+fontsize2);
	     
	     Thread.sleep(1000);
	     
	     action.moveToElement(Text2, 0, 0)
	     .clickAndHold()
	     .moveByOffset(0, 0)
	     .release()
	     .perform();
	     

	  // Font Color Click
	   
	   WebElement Text3 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div[1]/de/p[2]")); 

	   
	   //Scroll to the Element

	   js.executeScript("arguments[0].scrollIntoView(true);",Text3);
	   
	  
		bot.mouseMove(Text1.getLocation().x,Text1.getLocation().x); 
		bot.mousePress(InputEvent.BUTTON1_MASK); bot.mouseRelease(InputEvent.BUTTON1_MASK); 
		bot.mousePress(InputEvent.BUTTON1_MASK); bot.mouseRelease(InputEvent.BUTTON1_MASK); 
		bot.mousePress(InputEvent.BUTTON1_MASK); bot.mouseRelease(InputEvent.BUTTON1_MASK);
		
		action.moveToElement(Text3).contextClick().perform();
		
		Thread.sleep(3000);
		
		//Mouse over on font color
		
		WebElement color2 = driver.findElement(By.cssSelector("li.submenu:nth-child(6)"));  
	     
	     action.moveToElement(color2).build().perform();
	  
	     Thread.sleep(3000);
		 
		 WebElement colorpick = driver.findElement(By.cssSelector("li.box-color:nth-child(4)"));
		 
		 //Get the Text of the font color
		 
		 String fontcolorvalue = colorpick.getCssValue("background-color");
	    
	    
	    System.out.println("The selected Font color value is  is "+fontcolorvalue);
	    

	   js.executeScript("arguments[0].setAttribute('style', 'border: 0.5px solid red;');",
	  colorpick);
	     Thread.sleep(3000);
	     
	    colorpick.click();
		
		Thread.sleep(1000);
	    
	    action.moveToElement(Text3, 0, 0)
	    .clickAndHold()
	    .moveByOffset(0, 0)
	    .release()
	    .perform();
		
		 String fontcolor1 = driver.findElement(By.cssSelector("div.large-6:nth-child(1) > de:nth-child(1) > p:nth-child(4) > font:nth-child(1)")).getCssValue("color");
		 
		 
		 
		 System.out.println("The Paragraph color is "+fontcolor1);
		 
		  
		  
		 //Font type Click
		 
		 
		 for (int j=1; j<2; j++) {
		 

		 WebElement Text4 = driver.findElement(By.xpath("/html/body/div[2]/div/section[4]/div/div/div[1]/de/p")); 
		 
		
			
		 //Scroll to the Element

		 js.executeScript("arguments[0].scrollIntoView(true);",Text4);
						
		 Thread.sleep(2000);
		 

			bot.mouseMove(Text4.getLocation().x,Text4.getLocation().x); 
			bot.mousePress(InputEvent.BUTTON1_MASK); bot.mouseRelease(InputEvent.BUTTON1_MASK); 
			bot.mousePress(InputEvent.BUTTON1_MASK); bot.mouseRelease(InputEvent.BUTTON1_MASK); 
			bot.mousePress(InputEvent.BUTTON1_MASK); bot.mouseRelease(InputEvent.BUTTON1_MASK);
			
			action.moveToElement(Text4).contextClick().perform();
			
			//Mouse over on font type
								    
			WebElement fonttype1 = driver.findElement(By.xpath("/html/body/div[13]/ul/li[7]")); 
			
			action.moveToElement(fonttype1).build().perform();
									 
			Thread.sleep(3000);
									 
			WebElement selectfonttype = driver.findElement(By.xpath("/html/body/div[13]/ul/li[7]/ul/li["+j+"]"));
			
			//Get the Text of the font type
			String fonttypetext = selectfonttype.getText();
			
			System.out.println("The selected Font type text is "+fonttypetext);
											   
											   JavascriptExecutor js1 = (JavascriptExecutor) driver;
												
											   
											  js1.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
													  selectfonttype);
											    Thread.sleep(3000);
											    
											    selectfonttype.click();
											   
											    
											    action.moveToElement(Text4, 0, 0)
										        .clickAndHold()
										        .moveByOffset(0, 0)
										        .release()
										        .perform();
											    
											    Thread.sleep(2000);
											   
			
	    }
		 
		 
			// Text Alignment
			
			WebElement Text5 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div[1]/de/p[2]"));

		    js.executeScript("arguments[0].scrollIntoView(true);",Text5);
							
							Thread.sleep(2000);

		    bot.mouseMove(Text5.getLocation().x,Text5.getLocation().x); 
				bot.mousePress(InputEvent.BUTTON1_MASK); bot.mouseRelease(InputEvent.BUTTON1_MASK); 
				bot.mousePress(InputEvent.BUTTON1_MASK); bot.mouseRelease(InputEvent.BUTTON1_MASK); 
				bot.mousePress(InputEvent.BUTTON1_MASK); bot.mouseRelease(InputEvent.BUTTON1_MASK);	

		  action.moveToElement(Text5).contextClick().perform();


		  Thread.sleep(3000);

		//Mouse over on Text Align
						    
						    WebElement textalign1 = driver.findElement(By.xpath("/html/body/div[13]/ul/li[9]"));
						    
						    action.moveToElement(textalign1).build().perform();
							 
							Thread.sleep(2000);  
							
							WebElement selecttextalign = driver.findElement(By.xpath(" /html/body/div[13]/ul/li[9]/ul/li[1]"));
							
							//Get the Text of the text Alignment
						   String aligntext = selecttextalign.getText().toLowerCase();
						   
						   System.out.println("The selected align text is  "+aligntext);
						   
				
						  js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
								  selecttextalign);
						    Thread.sleep(3000);
						    
						    selecttextalign.click();
							
							action.moveToElement(Text5, 0, 0)
					        .clickAndHold()
					        .moveByOffset(0, 0)
					        .release()
					        .perform();
						    
						   Thread.sleep(2000);
						   
						   String textalign2 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div[1]/de/p[2]")).getCssValue("text-align");
						    
						    String ExtractAlign = textalign2.substring(5);
						   
						    System.out.println("The Paragraph text-align is "+textalign2);
		 
						    
						    
						    //HYperlink
						    

								WebElement Text6 = driver.findElement(By.xpath("/html/body/div[2]/div/section[4]/div/div/div[1]/de/p")); 
							
											
								
											//Scroll to the Element

											js.executeScript("arguments[0].scrollIntoView(true);",Text6);
											
											Thread.sleep(2000);
								

								
								bot.mouseMove(Text6.getLocation().x,Text6.getLocation().x); 
								bot.mousePress(InputEvent.BUTTON1_MASK); bot.mouseRelease(InputEvent.BUTTON1_MASK); 
								bot.mousePress(InputEvent.BUTTON1_MASK); bot.mouseRelease(InputEvent.BUTTON1_MASK); 
								bot.mousePress(InputEvent.BUTTON1_MASK); bot.mouseRelease(InputEvent.BUTTON1_MASK);
								

								action.moveToElement(Text6).contextClick().perform();
								
															
															 Thread.sleep(3000);
														    
														    
														    //Mouse over on HyperLink
														    
														    WebElement hyperlink = driver.findElement(By.xpath("/html/body/div[13]/ul/li[13]"));  
															
															
														    
														    js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
														    		hyperlink);
														    
														    Thread.sleep(3000);
														    
														    hyperlink.click();
														    
														   
															Thread.sleep(5000);
							
														   WebElement hreflink = driver.findElement(By.xpath(" //*[@id=\"href_A_1\"]"));     
														   WebElement target = driver.findElement(By.xpath(" //*[@id=\"target_A_2\"]"));
														   WebElement alt = driver.findElement(By.xpath(" //*[@id=\"alt_A_3\"]"));
														   
														   
														   
														   
														   String link = "www.netrovert.net";
														   
														   
														   
														   hreflink.sendKeys("www.netrovert.net");
														   Thread.sleep(2000);							 
														   target.sendKeys("_parent");
														   Thread.sleep(2000);
														   alt.sendKeys("company");
														   Thread.sleep(2000);
														 
														   System.out.println("The selected href text is "+link);
														   
														   Thread.sleep(2000);
														   
														   WebElement set = driver.findElement(By.xpath("//*[@id=\"save\"]"));
														   
														   js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
														    		set);
														   
														   Thread.sleep(3000);
												
														   set.click();
														   
														 /* js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
																  selecttextalign);
														    Thread.sleep(3000);
														    
														    selecttextalign.click();*/
														    
							
														    action.moveToElement(Text6, 0, 0)
													        .clickAndHold()
													        .moveByOffset(0, 0)
													        .release()
													        .perform();
														    
														   Thread.sleep(2000);
														    
														    String hrefvalue = driver.findElement(By.xpath("//html/body/div[2]/div/section[4]/div/div/div[1]/de/p/a")).getAttribute("href");
														    
											
														    System.out.println("The href value is "+hrefvalue);
														    
														    
														    String hrefsplit = hrefvalue.substring(7).split("/")[1];
														    
														    System.out.println("The Splitted Href URl is "+hrefsplit);
															
															Thread.sleep(2000);
		 

		   					
															// Rollback
															
														WebElement Rollback = driver.findElement(By.xpath("/html/body/div[4]/button[5]")); 

															
															//Scroll to the Element

															js.executeScript("arguments[0].scrollIntoView(true);",Rollback);
															
															js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
																	Rollback);
															 Thread.sleep(3000);
														  
															 Rollback.click();
															
															
															 Thread.sleep(15000);
		   

		   //Validate Font Family
		 
		 
		//js.executeScript("arguments[0].scrollIntoView(true);",Text1);
		 Thread.sleep(3000);
		 
		 
		 try
		 {
		       Boolean ispresent = 
		    		   driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div[1]/de/p[1]/font")).isDisplayed();
		       if(ispresent)
		       {
		    	   System.out.println("Font Family Applied");
		        }
		      
		 }
		 catch(Exception e)
		 {
			 
			 
			 System.out.println(fontFamilyText + " " +"Not Applied to Text");
		 }
		 

		 /*String fontfamily1 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div[1]/de/p[1]/font")).getCssValue("font-family");
		 
		 
		 
		 

		if (fontFamilyText.equals(fontfamily1))

		{

		System.out.println(fontfamily1 + " " + "Applied to Text successfully");

		}

		else

		{

		System.out.println(fontfamily1 + " " +"Not Applied to Text");
		}
		
		*/
			 
		
			
			
			
			
		 
		   
		 Thread.sleep(1000);
	 
	    //Validate Font Size
		
		 //js.executeScript("arguments[0].scrollIntoView(true);",Text2);
		 Thread.sleep(3000);
		 
		
			 
		 
		 String fontsize21 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div[1]/de/p[2]/font")).getCssValue("font-size");
		 
		 
		   
		if (fontsize21.equals(fontsizetext))

		{

		System.out.println(fontsizetext+ " " +"Applied to Text successfully");

		}
	   
		else
	   
	   {
	   
		System.out.println(fontsizetext+ " " +"Not Applied to Text");
		
	   }
		
		
		 
		 
	   
	   
	   //Validate Font Color
		
		Thread.sleep(1000);
		
		/*js.executeScript("arguments[0].scrollIntoView(true);",Text3);*/
		
	
		
		String fontcolor11 = driver.findElement(By.cssSelector("div.large-6:nth-child(1) > de:nth-child(1) > p:nth-child(4) > font:nth-child(1)")).getCssValue("color");
	   
	   
	   if (fontcolor11.equals(fontcolorvalue))
	    
	          {
	    
	    System.out.println(fontcolorvalue + " " +"Applied to Text successfully");
	    
	         }
	       
	       else
	       
	       {
	       
	      System.out.println(fontcolorvalue+ " " +"Not Applied to Text ");
	       
		   }  
	   
		
		
		
	   
	   //Validate Text Alignment
	   
	   
	   String textalign21 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div[1]/de/p[2]")).getCssValue("text-align");
	    
	    String ExtractAlign1 = textalign21.substring(5);
		
		
	   
	   if (aligntext.equals(ExtractAlign1))

	   {

	   System.out.println(aligntext +" "+"Applied to Text successfully");

	   }


	  else {
	   	

	   System.out.println(aligntext +" "+"Not Applied to Text");
	   
	      }	
	   
		
	   
	   
	   //Validate Hyperlink
	   
	   
	   try
		 {
		       Boolean ispresent = 
		    		   driver.findElement(By.xpath("//html/body/div[2]/div/section[4]/div/div/div[1]/de/p/a")).isDisplayed();
		       if(ispresent)
		       {
		    	   System.out.println("Hyperlink Applied");
		        }
		       
		 }
		 catch(Exception e)
		 {
			 System.out.println(link+" "+"Not Applied to Text" );
		 }
	   
		
		
	   
	   /*String hrefvalue1 = driver.findElement(By.xpath("//html/body/div[2]/div/section[4]/div/div/div[1]/de/p/a")).getAttribute("href");
	   

	   
	   
	   String hrefsplit1 = hrefvalue.substring(7).split("/")[1];
	   
	   if ( hrefsplit1.equals(link))
	   {
	   
	   System.out.println(hrefsplit1+" "+"Applied to Text successfully" );
	   
	   }

	   else {
	   
	   System.out.println(hrefsplit1+" "+"Not Applied to Text" );
	   
	   }
*/	   
		
		
		
}




	


	
		////////These Code is for all Inline Edit Scenarios for test Page
	
	
	//
	public void fontfamily_click() throws InterruptedException, AWTException {
		

		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		click_On_Webpages webpage = inline_ele.new click_On_Webpages();
		js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
				webpage.getWeb_page_click());
		
		webpage.getWeb_page_click().click();
		
		Thread.sleep(7000);
		
		String winHandleBefore = driver.getWindowHandle();
		
		//driver.findElement(By.xpath("//*[@id=\"mCSB_2_container\"]/li[17]/div/span[1]/span[2]/img[1]")).click();
		
		//driver.findElement(By.xpath("/html/body/main/div/div/div/div[1]/div/div/div/div[1]/div/div/div/div/div[2]/div[2]/ol/div/div/div[1]/li[17]/div/span[1]/span[2]/img[1]")).click();
		
		
		
		
		/*WebElement scroll = driver.findElement(By.xpath("//*[@id=\"tree-root\"]/ol"));
		
		js.executeScript("window.scrollBy(0,200)", scroll );
		*/
		
		
		
		
		
		// Enable the Code as per the Requirement
		
		
		
		Thread.sleep(7000);
		// Create instance of Javascript executor
		 
		JavascriptExecutor je = (JavascriptExecutor) driver;
		
		Actions action = new Actions(driver);
		
		/*
		

		driver.findElement(By.xpath("//*[@id=\"tree-root\"]/ol/div/li[18]/div/span[1]/span[2]/img[1]")).click(); */
		
		
		// End to  (Enable the Code as per the Requirement)
		
		
		
		
		//driver.findElement(By.xpath("//*[@id=\"tree-root\"]/ol/div/li[17]/div/span[1]/span[2]/img[1]")).click();
		
		//*[@id="url1072"]/li[7]/div/span/span
		
		
		
		//*[@id="tree-root"]/ol/div/li[17]/ol/div/li[1]/div/span/span
		Thread.sleep(5000);         
		
		Actions action1 = new Actions(driver);
		action1.doubleClick(driver.findElement(By.xpath(".//*[@id='tree-root']/ol/div/li[6]/div/span"))).build().perform(); 
		
		//action1.doubleClick(driver.findElement(By.xpath("//*[@id=\"tree-root\"]/ol/div/li[17]/ol/div/li[1]/div/span/span"))).build().perform();
		
		//action1.doubleClick(driver.findElement(By.xpath("//*[@id=\"tree-root\"]/ol/div/li[6]/div"))).build().perform();
		

		//action1.doubleClick(driver.findElement(By.xpath("//*[@id=\"mCSB_2_container\"]/li[17]/div/span/span"))).build().perform();
		Thread.sleep(10000);
		 
		/*	//Identify the WebElement which will appear after scrolling down  
		 
		WebElement testpage = driver.findElement(By.xpath("//*[@id=\"url1072\"]/li[6]/div")); //*[@id="url1072"]/li[6]/div/span/span
		 
		 // now execute query which actually will scroll until that element is not appeared on page.
		 
		action.doubleClick(testpage).perform();
		
		//driver.close();
		Thread.sleep(40000);*/
		
		
		// Switch to new window opened
		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		}
		
		//copy_paste();
		
		
		//js.executeScript("window.scrollBy(0,200)");
		

		List <WebElement> para1 = driver.findElements(By.tagName("p"));
		
		
		
		
		
		
		//List <WebElement> para = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/section/div")).findElements(By.tagName("p"));
		int sizeOfAllLinks = para1.size();
		System.out.println(sizeOfAllLinks);
		
		//List<WebElement> para = ((WebDriver) para1).findElements(By.xpath(".//*"));
		
		
		
		
		Thread.sleep(7000);
		
		
				
				//for (int k=1; k<13; k++) {
		
		for (int k=1; k<13; k++) {
					
					
					
					try {
						
						
						
						
						//List <WebElement> para = driver.findElements(By.tagName("p"));
						
						
	
						je.executeScript("arguments[0].scrollIntoView(true);",para1.get(k));
						
						
						
						

	
					//Font Family Starts
					
					

			//Find the Paragraph Element in Webpage
			//WebElement para = driver.findElement(By.cssSelector("#about_us > p:nth-child("+k+")"));
			//WebElement para = driver.findElement(By.cssSelector("#about_us > div:nth-child(2) > p:nth-child("+k+")"));
						
					
						
						/*int offsetX = (para.get(k).getLocation().x + (para.get(k).getSize().width / 2));
						int offsetY = (para.get(k).getLocation().y + (para.get(k).getSize().height / 2));
						*/

						
						
						// moveToElement* method moves to the middle of element, so we'll also move on half of element and click on the 3rd pix from the bottom
						 
						
						
						
						/* System.out.println("The X offset is  "+offsetX);
						 System.out.println("The Y offset is "+offsetY);
						*/ 
						 //System.out.println("The Y offset is "+offsetY);
						
						
						/*Dimension d = para.get(k).getSize();
				        //Get width of element.
				        int ImageWidth = d.getWidth();
				        System.out.println("Image width Is "+ImageWidth+" pixels");
				        
				        //Get height of element.
				        int ImageHeight = d.getHeight();        
				        System.out.println("Image height Is "+ImageHeight+" pixels");
						*/
						
						
						
						
						
			//scroll to the element
				
						
							
	
			//Select the Paragraph Text
						
						
						 action.moveToElement(para1.get(k), 0, 0)
					        .clickAndHold()
					        //.moveByOffset(1100, 0)
					        .moveByOffset(0, 0)
					        .release()
					        .perform();
						
						
			//action.moveToElement(para, 0, 0)
						//action.moveToElement(para.get(k), 0, 0).clickAndHold()
	        //.moveByOffset(1150, 0)
	        
	        //.moveToElement(para.get(k), naturalWidth2, naturalHeight2)
	        
	        
	        //.moveByOffset(ImageWidth, ImageHeight)
	        
	        //.moveToElement(para.get(k), para.get(k).getSize().getWidth(), para.get(k).getSize().getHeight())
	       
	        //.release()
	        //.perform();


			 Thread.sleep(10000);

			 action.moveToElement(para1.get(k)).contextClick().build().perform();
			
			 
			 //Right Click the Element for menu options
			 //action.contextClick(para).build().perform();
			 
			 
		
			 //action.contextClick().build().perform();
			 
			 //action.contextClick(para.get(k)).build().perform();
			 
			 
			 //action.contextClick(para.get(k)).build().perform();
			 
			 Thread.sleep(5000);
			 
			//Mouse over on font Family  
	
	
			 WebElement fontproper = driver.findElement(By.xpath("/html/body/div[19]/ul/li[4]"));    
			
			 
			 action.moveToElement(fontproper).build().perform();
			 
			 Thread.sleep(5000);

			    //Select font Family Properties

			 
			    if ( k >= 4) {
			    	
			   	 try {
			    	
			    	
			    	WebElement showall =  driver.findElement(By.xpath("/html/body/div[19]/ul/li[4]/ul/li[5]/em"));
			    	
		
			    	js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
			    			showall);
			    	Thread.sleep(1000);
			    	
			    	js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid white;');",
			    			showall);
			    	
			    	
			    	showall.click();
			    	
			    	
			    	Thread.sleep(5000);
			    	
			    
			    k =k +1;
			    	
			    WebElement fontselect = driver.findElement(By.xpath("/html/body/div[19]/ul/li[4]/ul/li["+k+"]"));
			    
			    //Get the Text of the font size
			  //Get the Text of the font Family
				   String fontFamilyText = driver.findElement(By.xpath("/html/body/div[19]/ul/li[4]/ul/li["+k+"]/div")).getCssValue("font-family");
				   
				   System.out.println("The selected Font Family Value is  is "+fontFamilyText);
			    
			    
			    js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
			    		fontselect);
			    Thread.sleep(3000);
			    
			    fontselect.click();
			    
			    
			    
			    //action.moveToElement(para, 0, 0)
			    action.moveToElement(para1.get(k), 0, 0)
		        .clickAndHold()
		        .moveByOffset(0, 0)
		        .release()
		        .perform();
			    
			    Thread.sleep(2000);
			    
			    k = k-1;
			    
			    //String fontfamily = driver.findElement(By.cssSelector("#about_us > div:nth-child(2) > p:nth-child("+k+") > font")).getCssValue("font-family");
			    
			    String fontfamily = para1.get(k).getCssValue("font-family");
			    
			    
			    
			    
			    
			    System.out.println("The Paragraph Font Family is "+fontfamily);
			    
			    
        
				    
				    /*Assert.assertEquals(fontFamilyText, fontfamily);
				    
				    System.out.println("Successfully Compared Font Family");*/
				    
				
			    }
				
				catch( Exception e)
				
				{

					System.out.println("Exception has been handled" + e);
					//throw(e);
					
					

				}

		
			    Thread.sleep(5000);
			    
			    
			    }
			    
			    else
			    	
			    {
			    	
			    	try {
			    	
			    	  WebElement fontselect = driver.findElement(By.xpath("/html/body/div[19]/ul/li[4]/ul/li["+k+"]"));  
			    	
			    	 //Get the Text of the font Family
					   String fontFamilyText = driver.findElement(By.xpath("/html/body/div[19]/ul/li[4]/ul/li["+k+"]/div")).getCssValue("font-family");
					   
					   System.out.println("The selected Font Family Value is  is "+fontFamilyText);
	
				    
				    js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
				    		fontselect);
				    Thread.sleep(3000);
				    
				    fontselect.click();
				    
				    
				    
				    //action.moveToElement(para, 0, 0)
				    action.moveToElement(para1.get(k), 0, 0)
			        .clickAndHold()
			        .moveByOffset(0, 0)
			        .release()
			        .perform();
				    
				    Thread.sleep(2000);
				    
				    //String fontfamily = driver.findElement(By.cssSelector("#about_us > div:nth-child(2) > p:nth-child("+k+") > font")).getCssValue("font-family");
				    
				    //List <WebElement> para1 = driver.findElements(By.tagName("p"));
				    
				    String fontfamily = para1.get(k).getCssValue("font-family");
				    
				    System.out.println("The Paragraph font Family is "+fontfamily);

			
				    
				   /* Assert.assertEquals(fontFamilyText, fontfamily);
				    System.out.println("Successfully Compared Font Family");*/
				
				}
				
            catch( Exception e)
				
				{
				
					System.out.println("Exception has been handled" + e);
					//throw(e);
					
					
				}

				    Thread.sleep(5000);
				    
				    
				    
				    
			    }
			    	
			    
				}
			    
			    catch( Exception e)
				
				{
				

					System.out.println("Exception has been handled" + e);
					//throw(e);
					
					
				}
			  
			    
	        
				}
				
	}		
				 

		
	
	
	

	// Select the Font Size Method
	
	
	public void fontsize_click() throws InterruptedException, AWTException {
		
		// Font Size Starts
		
		
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		
		List <WebElement> para = driver.findElements(By.tagName("p"));
		int sizeOfAllLinks = para.size();
		System.out.println(sizeOfAllLinks);
		
		
		for (int j=1; j<13; j++) {
			
			Actions action = new Actions(driver);
			
      
			try {
		
		
		//WebElement para = driver.findElement(By.cssSelector("#about_us > div:nth-child(2) > p:nth-child("+j+")"));
		 
		 action.moveToElement(para.get(j), 0, 0)
	        .clickAndHold()
	       //.moveToElement(para.get(j), para.get(j).getSize().getWidth(), 0)
	        
	        .moveByOffset(para.get(j).getSize().getWidth(), para.get(j).getSize().getHeight())
	        .release()
	        .perform();


			 Thread.sleep(10000);
			 
			 //Right Click
			 action.contextClick(para.get(j)).build().perform();
			 
			 Thread.sleep(10000);
		    
		    
		    //Mouse over on font size
		    
		    WebElement fontsize1 = driver.findElement(By.xpath("/html/body/div[14]/ul/li[5]"));
		    
		    action.moveToElement(fontsize1).build().perform();
			 
			 Thread.sleep(5000);
			 
			
			  if ( j >= 8) {
				  
				  try {
			    	
			    	
			    	WebElement set =  driver.findElement(By.xpath("/html/body/div[14]/ul/li[5]/ul/li[9]/em"));
			    	js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
			    			set);
			    	Thread.sleep(1000);
			    	
			    	js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid white;');",
			    			set);
			    	
			    	
			    	set.click();
			    	
			    	
			    	Thread.sleep(5000);
			    	
			    
			      int l =j +13;
			    	
			      System.out.println("The L Value for custome font size is  is "+l);
			    	
			    	//Select the Input Box to enter the custome font size
			    //WebElement Customfontsize = driver.findElement(By.xpath("/html/body/div[14]/ul/li[4]/ul/li["+k+"]")); 
			    
			    WebElement Customfontsize = driver.findElement(By.xpath("/html/body/div[14]/ul/li[5]/ul/li[9]/input"));
			    
			    //Enter the Font Size
			    Customfontsize.sendKeys(String.valueOf(l));
			    
			    Robot robot = new Robot();
			    robot.keyPress(KeyEvent.VK_ENTER);
			    robot.keyRelease(KeyEvent.VK_ENTER);
			    
			    Thread.sleep(4000);
		
			    
			    //Deselect the paragraph
			    action.moveToElement(para.get(j), 0, 0)
		        .clickAndHold()
		        .moveByOffset(0, 0)
		        .release()
		        .perform();
			    
			    Thread.sleep(2000);
			    
			    
			    //String fontsize2 = driver.findElement(By.cssSelector("#about_us > div:nth-child(2) > p:nth-child("+j+") > font")).getCssValue("font-size");
			    
			    

			    String fontsize2 = para.get(j).getCssValue("font-size");
			    
			    
			    System.out.println("The Paragraph fontsize is "+fontsize2);
			    

				    /*Assert.assertEquals(l+"px", fontsize2);
				    System.out.println("Successfully Compared Font Size");
					*/
					}
				   
				  catch( Exception e)
					
					{
					  
					  System.out.println("The error Message is " + e);
					  
					

						/*System.out.println("Exception has been handled" + e);
						
						System.out.println("The error Message is " + e);*/
						
					}
			  
			  }
			  

			  else {
				  
				  
				  try {
				  
		 
		   WebElement selectfontsize = driver.findElement(By.xpath(" /html/body/div[14]/ul/li[5]/ul/li["+j+"]"));
		   

		   
		   //Get the Text of the font size
		   String fontsizetext = selectfontsize.getText();
		   
		   System.out.println("The selected Font size text is  is "+fontsizetext);
		   

		  js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
				 selectfontsize);
		    Thread.sleep(3000);
		    
		   selectfontsize.click();
		   
		    
		    action.moveToElement(para.get(j), 0, 0)
	        .clickAndHold()
	        .moveByOffset(0, 0)
	        .release()
	        .perform();
		    
		   Thread.sleep(2000);
		    
		    //String fontsize2 = driver.findElement(By.cssSelector("#about_us > div:nth-child(2) > p:nth-child("+j+") > font")).getCssValue("font-size");
		    
		    
		    String fontsize2 = para.get(j).getCssValue("font-size");
		    
		    System.out.println("The Paragraph fontsize is "+fontsize2);
		    
		    
		    
		       /*Assert.assertEquals(fontsizetext, fontsize2);
			   System.out.println("Successfully Compared Font Size");*/

				  }
				  
				  catch( Exception e)
					
					{
					
					    
					  System.out.println("The error Message is " + e);
					  
					  
					  

						/*System.out.println("Exception has been handled" + e);
						
						System.out.println("The error Message is " + e);*/
						
					}
				  
				  

			   
	}
			  
		}  
			  
			  catch( Exception e)
				
				{
				  System.out.println("The error Message is " + e);
				  

					/*System.out.println("Exception has been handled" + e);
					
					System.out.println("The error Message is " + e);*/
					
				}
			    
			  
	 
		}
		
		
	}		
		

		

	
	public void fontcolor_click() throws InterruptedException, AWTException {
		
		for (int i=13; i<13; i++) {
			
			
			try {
		
Actions action = new Actions(driver);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		// Font-Color Starts
		
					WebElement Fontcolor = driver.findElement(By.cssSelector("#about_us > div:nth-child(2) > p:nth-child("+i+")"));
			 		 
			 		 action.moveToElement(Fontcolor, 0, 0)
			 	        .clickAndHold()
			 	        .moveByOffset(1100, 0)
			 	        .release()
			 	        .perform();


			 			 Thread.sleep(10000);
			 			 action.contextClick(Fontcolor).build().perform();
			 			 
			 			 
			 			 Thread.sleep(10000);
			 		    
			 		    
			 		    //Mouse over on font color
			 		    
			 		    WebElement color2 = driver.findElement(By.xpath("/html/body/div[14]/ul/li[6]"));
			 		    
			 		   action.moveToElement(color2).build().perform();
						 
						 Thread.sleep(5000);
						 
						 
						 
						 if ( i >=11) {
							 
							 try {
							 
							 WebElement morecolors = driver.findElement(By.xpath("/html/body/div[14]/ul/li[6]/ul/li[14]")); 
							 
							 js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
									 morecolors);
							 
							 Thread.sleep(4000);
							 
							 morecolors.click();
							 
							 Thread.sleep(2000);
							 
							 //Select the color
					 		    
						 	  int m = i + 2;
							 
					 		   WebElement colorpick = driver.findElement(By.xpath("/html/body/div[14]/ul/li[6]/ul/li["+m+"]"));
					 		   
					 		   
					 		//Get the Text of the font color
							   //String fontcolorvalue = colorpick.getCssValue("color");
					 		   
					 		  String fontcolorvalue = colorpick.getCssValue("background-color");
							   
							   
							   System.out.println("The selected Font color value is  is "+fontcolorvalue);
					 		   
					 		   
					 		  js.executeScript("arguments[0].setAttribute('style', 'border: 0.5px solid red;');",
					 				 colorpick);
					 		    Thread.sleep(3000);
					 		    
					 		   colorpick.click();
					 		   
					 		   
					 		   
					 		   
					 		    
					 		    action.moveToElement(Fontcolor, 0, 0)
					 	        .clickAndHold()
					 	        .moveByOffset(0, 0)
					 	        .release()
					 	        .perform();
					 		    
					 		   Thread.sleep(2000);
					 		    
					 		    String fontcolor1 = driver.findElement(By.cssSelector("#about_us > div:nth-child(2) > p:nth-child("+i+") > font")).getCssValue("color");
					 		    
					 		    System.out.println("The Paragraph color is "+fontcolor1);
					 		    
					 	
					 		    Assert.assertEquals(fontcolorvalue, fontcolor1);
					 		   System.out.println("Successfully Compared Font color");
					 		    
					 		   }
					 		   
					 		 catch( Exception e)
								
								{
								
									
									System.out.println("The error Message is " + e);
									throw(e);
									
									
									
								}

					 		    
					 		   Thread.sleep(3000);
				
				
		}	 
							 
							 
	 
						 else {
							 
							 
							 try {
			 		   
			 		    //Select the color
			 		    
			 	 
			 		   WebElement colorpick = driver.findElement(By.xpath("/html/body/div[14]/ul/li[6]/ul/li["+i+"]"));
			 		   
			 		   
			 		//Get the Text of the font color
					   //String fontcolorvalue = colorpick.getCssValue("color");
			 		   
			 		  String fontcolorvalue = colorpick.getCssValue("background-color");
					   
					   
					   System.out.println("The selected Font color value is  is "+fontcolorvalue);
			 		   
			 		   
			 		   
			 		   
			 		  js.executeScript("arguments[0].setAttribute('style', 'border: 0.5px solid red;');",
			 				 colorpick);
			 		    Thread.sleep(3000);
			 		    
			 		   colorpick.click();
			 		   
			 		   
			 		   
			 		   
			 		    
			 		    action.moveToElement(Fontcolor, 0, 0)
			 	        .clickAndHold()
			 	        .moveByOffset(0, 0)
			 	        .release()
			 	        .perform();
			 		    
			 		   Thread.sleep(2000);
			 		    
			 		    String fontcolor1 = driver.findElement(By.cssSelector("#about_us > div:nth-child(2) > p:nth-child("+i+") > font")).getCssValue("color");
			 		    
			 		    System.out.println("The Paragraph color is "+fontcolor1);
			 		    
			 		 
			 		    
			 		    Assert.assertEquals(fontcolorvalue, fontcolor1);
			 		   System.out.println("Successfully Compared Font color");
			 		    
			 		   }
			 		   
			 		 catch( Exception e)
						
						{
						
							
							System.out.println("The error Message is " + e);
							throw(e);
							
							
						}

			 		    
			 		   Thread.sleep(3000);
			 		   
						 }}
			 		  catch( Exception e)
						
						{
						
							
							System.out.println("The error Message is " + e);
							throw(e);
							
							
						}
			 		   
			 		   
						 
		
						 
		}
		
	}
	
	
	public void fonttype_click() throws InterruptedException, AWTException {
		

		// Font type Starts
		
				for (int j=5; j<5; j++) {
					
					
					
					
					
					  if ( j == 4)
						  
					  {
						  
						 
						  
					
						  Actions action = new Actions(driver);
						  
						  
						  try {
							
							
							WebElement fonttype = driver.findElement(By.cssSelector("#about_us > div:nth-child(2) > p:nth-child("+j+")"));
							 
							 action.moveToElement(fonttype, 0, 0)
						        .clickAndHold()
						        .moveByOffset(1100, 0)
						        .release()
						        .perform();


								 Thread.sleep(10000);
								 action.contextClick(fonttype).build().perform();
								 
								 
								 Thread.sleep(10000);
							    
							    
							    //Mouse over on font type
							    
							    WebElement fonttype1 = driver.findElement(By.xpath("/html/body/div[14]/ul/li[7]"));
							    
							    action.moveToElement(fonttype1).build().perform();
								 
								 Thread.sleep(5000);
								 
								 int m = j + 1; 
								 
						
										   
										   WebElement selectfonttype = driver.findElement(By.xpath("/html/body/div[14]/ul/li[7]/ul/li["+m+"]"));
										   
										   
										   //Get the Text of the font type
										   String fonttypetext = selectfonttype.getText();
										   
										   System.out.println("The selected Font type text is "+fonttypetext);
										   
										   JavascriptExecutor js = (JavascriptExecutor) driver;
											
										   
										  js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
												  selectfonttype);
										    Thread.sleep(3000);
										    
										    selectfonttype.click();
										   
										    
										    action.moveToElement(fonttype, 0, 0)
									        .clickAndHold()
									        .moveByOffset(0, 0)
									        .release()
									        .perform();
										    
										   Thread.sleep(2000);	
										   
										   
						  }
						  
						  
						  catch( Exception e)
							
							{
							
								System.out.println("Exception has been handled" + e);
								System.out.println("The error Message is " + e);
								throw(e);
								
								
							}
						  
						  
					  }
					
					  
					  
					  else {
						  
						  
						  
						
						Actions action = new Actions(driver);
						
						
						try {
						
						
						WebElement fonttype = driver.findElement(By.cssSelector("#about_us > div:nth-child(2) > p:nth-child("+j+")"));
						 
						 action.moveToElement(fonttype, 0, 0)
					        .clickAndHold()
					        .moveByOffset(1100, 0)
					        .release()
					        .perform();


							 Thread.sleep(10000);
							 action.contextClick(fonttype).build().perform();
							 
							 
							 Thread.sleep(10000);
						    
						    
						    //Mouse over on font type
						    
						    WebElement fonttype1 = driver.findElement(By.xpath("/html/body/div[14]/ul/li[7]"));
						    
						    action.moveToElement(fonttype1).build().perform();
							 
							 Thread.sleep(5000);
							 
					
									   
									   WebElement selectfonttype = driver.findElement(By.xpath("/html/body/div[14]/ul/li[7]/ul/li["+j+"]"));
									   
									   
									   //Get the Text of the font type
									   String fonttypetext = selectfonttype.getText();
									   
									   System.out.println("The selected Font type text is "+fonttypetext);
									   
									   JavascriptExecutor js = (JavascriptExecutor) driver;
										
									   
									  js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
											  selectfonttype);
									    Thread.sleep(3000);
									    
									    selectfonttype.click();
									   
									    
									    action.moveToElement(fonttype, 0, 0)
								        .clickAndHold()
								        .moveByOffset(0, 0)
								        .release()
								        .perform();
									    
									   Thread.sleep(2000);	   
									   
									   /*WebElement fone2 = driver.findElement(By.xpath("//*[@id=\"about_us\"]/div[1]/p["+j+"]//*"));
									   
									   WebElement fonttype3 = driver.findElement(By.xpath(getAbsoluteXPath(fone2)));
									   
									   System.out.println("Xpath for Font type is "+fonttype3);
									   
									   
									   
									   //Splitting path
									   
									   String path = fonttype3.getText();
									   
									   System.out.println("Path Text is "+path);
									   
									   String subpath =  path.substring(path.lastIndexOf("/"));
									    
									    System.out.println("The Splitted Href URl is "+subpath);
									   */ 
									
									    
									    /*Assert.assertEquals(hrefsplit, link);
									   System.out.println("Successfully Compared Href");*/
									   
									   
									   
									   //String fonttype2 = fonttype3.getCssValue("font-weight");
									   
									   //String fonttype2 = driver.findElement(By.cssSelector("#about_us > div:nth-child(2) > p:nth-child("+j+")")).getCssValue("font-weight");
							 		    
							 		    //System.out.println("The Paragraph font type is "+fonttype2);
									   
								
						  }
						  
						  catch( Exception e)
							
							{
							
								
								System.out.println("The error Message is " + e);
								throw(e);
								
								
							}
							 		    
							 		    
					  }		
								
								
								
				    
				    //String fonttype2 = driver.findElement(By.cssSelector("#about_us > div:nth-child(2) > p:nth-child("+j+")")).getCssValue("font-weight");
				   
				   
				   
				   
				   //String fonttype2 = driver.findElement(By.xpath("//*[@id=\"about_us\"]/div[1]/p["+j+"]//*")).getCssValue("font-weight");
				   
				   
				   
				   // First Condition
				   /*if ( j == 1) {
				   
				   String fonttype2 = driver.findElement(By.xpath("//*[@id=\"about_us\"]/div[1]/p[j]//*")).getCssValue("font-weight");
				    
				    System.out.println("The Paragraph font type is "+fonttype2);
				    
				    try {
					    
				    	Assert.assertTrue(fonttype2.equals("bold") || fonttype2.equals("700"));
					    
					    //Assert.assertEquals(fonttypetext, fonttype2);
					   System.out.println("Successfully Compared Font Type as Bold");
						
						}
					   
				    catch( Exception e)
					
					{
					
						System.out.println("Exception has been handled" + e);
						
						
						
					}
				    
				   
				    Thread.sleep(3000);
					 
				    
				   }
				   
				   
				   
				   else if( j == 2){
					   
					   String fonttype2 = driver.findElement(By.xpath("//*[@id=\"about_us\"]/div[1]/p[2]//*")).getCssValue("font-weight");
					    
					    System.out.println("The Paragraph font type is "+fonttype2);
					    
					    try {
						    
					    	Assert.assertTrue(fonttype2.equals("bold") || fonttype2.equals("700"));
						    
						    //Assert.assertEquals(fonttypetext, fonttype2);
						   System.out.println("Successfully Compared Font Type as Bold");
							
							}
						   
					    catch( Exception e)
						
						{
						
							System.out.println("Exception has been handled" + e);
							
							
							
						}
					    
				  
					    Thread.sleep(3000);
						 
					    
					   
					   
				   } 	*/ 
				   
				   
				   
				    
				  /*try {
					    
					    
				    
				    Assert.assertEquals(fonttypetext, fonttype2);
				   System.out.println("Successfully Compared Font Size");
					
					}
				   
				  catch( Throwable e)
					{
						 
						
					}*/
				    
					

			}

	}
	
	
	
	public void bullets_click() throws InterruptedException, AWTException {
		
		// Bullets Starts
		
		
	                // 1. Apply Bullet disc
					WebElement Text1 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div[1]/de/h2/strong"));

					Actions action = new Actions(driver);
					 	JavascriptExecutor js = (JavascriptExecutor) driver;
					 	
					 	//Scroll to the Element

					 	js.executeScript("arguments[0].scrollIntoView(true);",Text1);
						
						Robot bot = new Robot(); 
					 	bot.mouseMove(Text1.getLocation().x,Text1.getLocation().x); 
					 	bot.mousePress(InputEvent.BUTTON1_MASK); bot.mouseRelease(InputEvent.BUTTON1_MASK); 
					 	bot.mousePress(InputEvent.BUTTON1_MASK); bot.mouseRelease(InputEvent.BUTTON1_MASK); 
					 	bot.mousePress(InputEvent.BUTTON1_MASK); bot.mouseRelease(InputEvent.BUTTON1_MASK);
						
						action.moveToElement(Text1).contextClick().perform();
						
					 
						Thread.sleep(3000);
				    
				    
						//Mouse over on Bullets
				    
						WebElement Bullets = driver.findElement(By.xpath("/html/body/div[13]/ul/li[11]"));
				    
				    action.moveToElement(Bullets).build().perform();
					 
					 Thread.sleep(5000);
					 
					 
				  
				   WebElement discbullet = driver.findElement(By.xpath("/html/body/div[13]/ul/li[11]/ul/li[1]"));
				   
				   String SelectedBullet1 = discbullet.getText();
		
				  js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",  
						  discbullet);
				    Thread.sleep(3000);
				    
				    discbullet.click();
				    
				    
				    
				    //Comparision
				    
				    WebElement Comp1 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div[1]/de[1]/ul"));
				    
				    
				    String ListName = Comp1.getAttribute("style").substring(17);
				    String ListType = ListName.substring(0, ListName.length() - 1);
				    
				    
				    System.out.println(ListName);
				    System.out.println(ListType);
				    
				    
				    if (("disc").equals(ListType)){
				    	
				    	
				    	
				    	System.out.println("Successfully Applied "+" "+ListType);
				    	
				    	
				    }
				    
				    else {
				    	
				    	System.out.println("Successfully Not Applied "+" "+ListType);
				    	
				    }
				    
				    
	  
				    Thread.sleep(2000);
				    
				    
				 // 2. Apply Bullet circle
					WebElement Text2 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div[1]/de/p[1]"));

			
					 	//Scroll to the Element

					 	js.executeScript("arguments[0].scrollIntoView(true);",Text2);
						
						
					 	bot.mouseMove(Text2.getLocation().x,Text2.getLocation().x); 
					 	bot.mousePress(InputEvent.BUTTON1_MASK); bot.mouseRelease(InputEvent.BUTTON1_MASK); 
					 	bot.mousePress(InputEvent.BUTTON1_MASK); bot.mouseRelease(InputEvent.BUTTON1_MASK); 
					 	bot.mousePress(InputEvent.BUTTON1_MASK); bot.mouseRelease(InputEvent.BUTTON1_MASK);
						
						action.moveToElement(Text2).contextClick().perform();
						
					 
						Thread.sleep(3000);
				    
				    
						//Mouse over on Bullets
	
						WebElement Bullets1 = driver.findElement(By.xpath("/html/body/div[13]/ul/li[11]"));
				    
					action.moveToElement(Bullets1).build().perform();
					 
					 Thread.sleep(5000);
					 
			
				   WebElement bulletcircle = driver.findElement(By.xpath("/html/body/div[13]/ul/li[11]/ul/li[2]"));
				   
				   String SelectedBullet2 = bulletcircle.getText();
		
				  js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",  
						  bulletcircle);
				    Thread.sleep(3000);
				    
				    bulletcircle.click();
				    
				    
				    //Comparision
				    
				    WebElement Comp2 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div[1]/de[1]/ul[2]"));
				    
				    
				    String ListName1 = Comp2.getAttribute("style").substring(17);
				    String ListType1 = ListName1.substring(0, ListName1.length() - 1);
				    
				    System.out.println(ListName1);
				    System.out.println(ListType1);
				    
				    
				    if (("circle").equals(ListType1)){
				    	
				    	
				    	
				    	System.out.println("Successfully Applied "+" "+SelectedBullet2);
				    	
				    	
				    }
				    
				    else {
				    	
				    	System.out.println("Successfully Not Applied "+" "+SelectedBullet2);
				    	
				    }
				    
				    
				    
				    
				    Thread.sleep(2000);
			
		
				    
				 // 3. Apply Bullet square
					WebElement Text3 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div[1]/de/p/font"));

			
					 	//Scroll to the Element

					 	js.executeScript("arguments[0].scrollIntoView(true);",Text3);
						
						
					 	bot.mouseMove(Text3.getLocation().x,Text3.getLocation().x); 
					 	bot.mousePress(InputEvent.BUTTON1_MASK); bot.mouseRelease(InputEvent.BUTTON1_MASK); 
					 	bot.mousePress(InputEvent.BUTTON1_MASK); bot.mouseRelease(InputEvent.BUTTON1_MASK); 
					 	bot.mousePress(InputEvent.BUTTON1_MASK); bot.mouseRelease(InputEvent.BUTTON1_MASK);
						
						action.moveToElement(Text3).contextClick().perform();
						
					 
						Thread.sleep(3000);
				    
				    
				    //Mouse over on Bullets
						
					WebElement Bullets2 = driver.findElement(By.xpath("/html/body/div[13]/ul/li[11]"));
				    
					action.moveToElement(Bullets2).build().perform();
					 
					 Thread.sleep(5000);
					 
			
				   WebElement bulletsquare = driver.findElement(By.xpath("/html/body/div[13]/ul/li[11]/ul/li[3]")); 
				   
				   String SelectedBullet3 = bulletsquare.getText();
		
				  js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",  
						  bulletsquare);
				  Thread.sleep(3000);
				    
				    bulletsquare.click();
				    
				    //Comparision
				    
				    WebElement Comp3 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div[1]/de[1]/ul[3]"));
				    String ListName2 = Comp3.getAttribute("style").substring(17);
				    String ListType2 = ListName2.substring(0, ListName2.length() - 1);
				    
				    
				    
				    System.out.println(ListName2);
				    System.out.println(ListType2);
				    
				    
				    if (("square").equals(ListType2)){
				    	
				    	
				    	
				    	System.out.println("Successfully Applied "+" "+SelectedBullet3);
				    	
				    	
				    }
				    
				    else {
				    	
				    	System.out.println("Successfully Not Applied "+" "+SelectedBullet3);
				    	
				    }
				    
				    
				    
				    Thread.sleep(2000);
				    
	    
				 // 4. Apply Bullet decimal
					WebElement Text4 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div[1]/de[2]/div/a"));

			
					 	//Scroll to the Element

					 	js.executeScript("arguments[0].scrollIntoView(true);",Text4);
					 	
					 	//Switch
						
						
						
						
					 	/*bot.mouseMove(Text4.getLocation().x,Text4.getLocation().x); 
					 	bot.mousePress(InputEvent.BUTTON1_MASK); bot.mouseRelease(InputEvent.BUTTON1_MASK); 
					 	bot.mousePress(InputEvent.BUTTON1_MASK); bot.mouseRelease(InputEvent.BUTTON1_MASK); 
					 	bot.mousePress(InputEvent.BUTTON1_MASK); bot.mouseRelease(InputEvent.BUTTON1_MASK);
						*/
						action.moveToElement(Text4).contextClick().perform();
						
						//Switch
						
						ArrayList< String> tabs1 = new ArrayList<String>(driver.getWindowHandles());
					    driver.switchTo().window(tabs1.get(1));
						
					 
						Thread.sleep(3000);
				    
				    
						//Mouse over on Bullets
						
						WebElement Bullets3 = driver.findElement(By.xpath("/html/body/div[13]/ul/li[11]"));
				    
					action.moveToElement(Bullets3).build().perform();
					 
					 Thread.sleep(5000);
					 
			
				   WebElement bulletdecimal = driver.findElement(By.xpath("/html/body/div[13]/ul/li[11]/ul/li[4]"));
				   
				   String SelectedBullet4 = bulletdecimal.getText();
		
				  js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",  
						  bulletdecimal);
				    Thread.sleep(3000);
				    
				    bulletdecimal.click();
				    
				    
				    //Comparision
				    
				    WebElement Comp4 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div[1]/de[2]/div/ul"));
				    String ListName3 = Comp4.getAttribute("style").substring(17);
				    String ListType3 = ListName3.substring(0, ListName3.length() - 1);
				    
				    System.out.println(ListName3);
				    System.out.println(ListType3);
				    
				    
				    if (("decimal").equals(ListType3)){
				    	
				    	
				    	
				    	System.out.println("Successfully Applied "+" "+SelectedBullet4);
				    	
				    	
				    }
				    
				    else {
				    	
				    	System.out.println("Successfully Not Applied "+" "+SelectedBullet4);
				    	
				    }
				    
				    
				    
				    
				    
				    Thread.sleep(2000);
				    
				    
				    
				    
				 // 5. Apply Bullet lower alpha
					WebElement Text5 = driver.findElement(By.xpath("/html/body/div[2]/div/section[3]/div/div[8]/div/de/a"));

			
					 	//Scroll to the Element

					 	js.executeScript("arguments[0].scrollIntoView(true);",Text5);
						
						
					 	/*bot.mouseMove(Text5.getLocation().x,Text5.getLocation().x); 
					 	bot.mousePress(InputEvent.BUTTON1_MASK); bot.mouseRelease(InputEvent.BUTTON1_MASK); 
					 	bot.mousePress(InputEvent.BUTTON1_MASK); bot.mouseRelease(InputEvent.BUTTON1_MASK); 
					 	bot.mousePress(InputEvent.BUTTON1_MASK); bot.mouseRelease(InputEvent.BUTTON1_MASK);*/
						
						action.moveToElement(Text5).contextClick().perform();
						
					 
						Thread.sleep(3000);
				    
				    
						//Mouse over on Bullets
						
						WebElement Bullets4 = driver.findElement(By.xpath("/html/body/div[13]/ul/li[11]"));
				    
					action.moveToElement(Bullets4).build().perform();
					 
					 Thread.sleep(5000);
					 
			
				   WebElement bulletloweralpha = driver.findElement(By.xpath("/html/body/div[13]/ul/li[11]/ul/li[5]"));
				   
				   String SelectedBullet5 = bulletloweralpha.getText();
				   
		
				  js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",  
						  bulletloweralpha);
				    Thread.sleep(3000);
				    
				    bulletloweralpha.click();
				    
				    
				    //Comparision
				    
				    WebElement Comp5 = driver.findElement(By.xpath("/html/body/div[2]/div/section[3]/div/div[8]/div/de/ul"));
				    String ListName4 = Comp5.getAttribute("style").substring(17);
				    String ListType4 = ListName4.substring(0, ListName4.length() - 1);
				    
				    System.out.println(ListName4);
				    System.out.println(ListType4);
				    
				    
				    if (("lower-alpha").equals(ListType4)){
				    	
				    	
				    	
				    	System.out.println("Successfully Applied "+" "+SelectedBullet5);
				    	
				    	
				    }
				    
				    else {
				    	
				    	System.out.println("Successfully Not Applied "+" "+SelectedBullet5);
				    	
				    }
				    
				    
				    
				    
				    Thread.sleep(2000);
				    
				    
				 // 6. Apply Bullet upper alpha
					WebElement Text6 = driver.findElement(By.xpath("/html/body/div[2]/div/section[4]/div/div/div[1]/de/p"));
					
	
					 	//Scroll to the Element

					 	js.executeScript("arguments[0].scrollIntoView(true);",Text6);
						
						
					 	bot.mouseMove(Text6.getLocation().x,Text6.getLocation().x); 
					 	bot.mousePress(InputEvent.BUTTON1_MASK); bot.mouseRelease(InputEvent.BUTTON1_MASK); 
					 	bot.mousePress(InputEvent.BUTTON1_MASK); bot.mouseRelease(InputEvent.BUTTON1_MASK); 
					 	bot.mousePress(InputEvent.BUTTON1_MASK); bot.mouseRelease(InputEvent.BUTTON1_MASK);
						
						action.moveToElement(Text6).contextClick().perform();
						
					 
						Thread.sleep(6000);
				    
				    
						//Mouse over on Bullets
						
						WebElement Bullets5 = driver.findElement(By.xpath("/html/body/div[13]/ul/li[11]"));  
					    
				    
					action.moveToElement(Bullets5).build().perform();
					 
					 Thread.sleep(5000);
					 
			
				   WebElement bulletupperalpha = driver.findElement(By.xpath("/html/body/div[13]/ul/li[11]/ul/li[6]"));
				   
				   String SelectedBullet6 = bulletupperalpha.getText();
				   
				   
		
				  js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",  
						  bulletupperalpha);
				    Thread.sleep(3000);
				    
				    bulletupperalpha.click();
				    
				    
				    //Comparision
				    
				    WebElement Comp6 = driver.findElement(By.xpath("/html/body/div[2]/div/section[4]/div/div/div[1]/de/ul"));
				    String ListName5 = Comp6.getAttribute("style").substring(17);
				    String ListType5 = ListName5.substring(0, ListName5.length() - 1);
				    
				    System.out.println(ListName5);
				    System.out.println(ListType5);
				    
				    
				    if (("upper-alpha").equals(ListType5)){
				    	
				    	
				    	
				    	System.out.println("Successfully Applied "+" "+SelectedBullet6);
				    	
				    	
				    }
				    
				    else {
				    	
				    	System.out.println("Successfully Not Applied "+" "+SelectedBullet6);
				    	
				    }
				    
				    
				    
				    Thread.sleep(2000);
				    
				    
				    // 7. Apply Bullet lower roman
					WebElement Text7 = driver.findElement(By.xpath("/html/body/div[2]/div/section[4]/div/div/div[1]/de/div/a"));
					
					

			
					 	//Scroll to the Element

					 	js.executeScript("arguments[0].scrollIntoView(true);",Text7);
						
						
					 	/*bot.mouseMove(Text7.getLocation().x,Text7.getLocation().x); 
					 	bot.mousePress(InputEvent.BUTTON1_MASK); bot.mouseRelease(InputEvent.BUTTON1_MASK); 
					 	bot.mousePress(InputEvent.BUTTON1_MASK); bot.mouseRelease(InputEvent.BUTTON1_MASK); 
					 	bot.mousePress(InputEvent.BUTTON1_MASK); bot.mouseRelease(InputEvent.BUTTON1_MASK);*/
						
						action.moveToElement(Text7).contextClick().perform();
						
					 
						Thread.sleep(3000);
				    
				    
						//Mouse over on Bullets
						
						
						WebElement Bullets6 = driver.findElement(By.xpath("/html/body/div[13]/ul/li[11]")); 
						
			
					action.moveToElement(Bullets6).build().perform();
					
					
						
					
					 
					 Thread.sleep(5000);
					 
			
				   WebElement bulletlowerroman = driver.findElement(By.xpath("/html/body/div[13]/ul/li[11]/ul/li[7]"));
				   String SelectedBullet7 = bulletlowerroman.getText();
				   
		
				  js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",  
						  bulletlowerroman);
				    Thread.sleep(3000);
				    
				    bulletlowerroman.click();
				    
				    
				    //Comparision
				    
				    WebElement Comp7 = driver.findElement(By.xpath("/html/body/div[2]/div/section[4]/div/div/div[1]/de/div/ul"));
				    String ListName6 = Comp7.getAttribute("style").substring(17);
				    String ListType6 = ListName6.substring(0, ListName6.length() - 1);
				    
				    System.out.println(ListName6);
				    System.out.println(ListType6);
				    
				    
				    if (("lower-roman").equals(ListType6)){
				    	
				    	
				    	
				    	System.out.println("Successfully Applied "+" "+SelectedBullet7);
				    	
				    	
				    }
				    
				    else {
				    	
				    	System.out.println("Successfully Not Applied "+" "+SelectedBullet7);
				    	
				    }
				    
				    Thread.sleep(2000);
				    
				    
				 // 8. Apply Bullet upper roman
					WebElement Text8 = driver.findElement(By.xpath("/html/body/div[2]/div/section[5]/div/div[2]/de[2]/div/a"));

			
					 	//Scroll to the Element

					 	js.executeScript("arguments[0].scrollIntoView(true);",Text8);
						
						
					 	/*bot.mouseMove(Text8.getLocation().x,Text8.getLocation().x); 
					 	bot.mousePress(InputEvent.BUTTON1_MASK); bot.mouseRelease(InputEvent.BUTTON1_MASK); 
					 	bot.mousePress(InputEvent.BUTTON1_MASK); bot.mouseRelease(InputEvent.BUTTON1_MASK); 
					 	bot.mousePress(InputEvent.BUTTON1_MASK); bot.mouseRelease(InputEvent.BUTTON1_MASK);*/
						
						action.moveToElement(Text8).contextClick().perform();
						
					 
						Thread.sleep(3000);
				    
				    
						//Mouse over on Bullets
						
						WebElement Bullets7 = driver.findElement(By.xpath("/html/body/div[13]/ul/li[11]")); 
				    
					action.moveToElement(Bullets7).build().perform();
					 
					 Thread.sleep(5000);
					 
			
				   WebElement bulletupperroman = driver.findElement(By.xpath("/html/body/div[13]/ul/li[11]/ul/li[8]"));
				   
				   String SelectedBullet8 = bulletupperroman.getText();
		
				  js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",  
						  bulletupperroman);
				    Thread.sleep(3000);
				    
				    bulletupperroman.click();
				    
				    

				    //Comparision
				    
				    WebElement Comp8 = driver.findElement(By.xpath("/html/body/div[2]/div/section[5]/div/div[2]/de[2]/div/ul"));
				    String ListName7 = Comp8.getAttribute("style").substring(17);
				    String ListType7 = ListName7.substring(0, ListName7.length() - 1);
				    
				    System.out.println(ListName7);
				    System.out.println(ListType7);
				    
				    
				    if (("upper-roman").equals(ListType7)){
				    	
				    	
				    	
				    	System.out.println("Successfully Applied "+" "+SelectedBullet8);
				    	
				    	
				    }
				    
				    else {
				    	
				    	System.out.println("Successfully Not Applied "+" "+SelectedBullet8);
				    	
				    }
				    
				    
				    Thread.sleep(2000);
				    
				    driver.navigate().refresh();
				    
				    Thread.sleep(5000);




	}
	
	
	
	
	
	// Apply Bullets to Paragraphs
	
	public void apply_bullets() throws InterruptedException, AWTException {
		
		
        Actions action = new Actions(driver);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		
		//First Paragraph
		  WebElement un = driver.findElement(By.cssSelector("#about_us > p:nth-child(2)"));

		//HIghlight the text
		
		
		action.moveToElement(un, 0, 0)
    .clickAndHold()
    .moveByOffset(1000, 0)
    .release()
    .perform();


		 Thread.sleep(10000);
		 action.contextClick(un).build().perform();


	    
	    //Mouse over on bullets
	    
	    WebElement family = driver.findElement(By.xpath("/html/body/div[14]/ul/li[11]"));
	    
	    int xaxis1 = family.getLocation().x;
	     
	    int yaxis1=family.getLocation().y;
	     
	    int width1 = family.getSize().width;
	    int height1= family.getSize().height;
	     
	    Robot r1=new Robot();
	    r1.mouseMove(xaxis1+width1/2, yaxis1+height1/2+70);
	    
	    Thread.sleep(10000);
		
	    
	    //Bullet Disc Pick
	    
	    WebElement discpick = driver.findElement(By.xpath(" /html/body/div[14]/ul/li[9]/ul/li[1]"));  
	     
	    js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
	    		discpick);
	    Thread.sleep(3000);
	    
	    discpick.click();
	    
	    action.moveToElement(un, 0, 0)
    .clickAndHold()
    .moveByOffset(0, 0)
    .release()
    .perform();
	    
	    
	    Thread.sleep(2000);
	    
	    String fontsize = driver.findElement(By.cssSelector("#about_us > p:nth-child(2) > font")).getCssValue("font-size");
	    
	    System.out.println("The First Paragraph fontsize is "+fontsize);
	    
	    
	    try {
	    	
	    
	    Assert.assertEquals("13px", fontsize);
	    System.out.println("Successfully Compared Font Size");
	    
	    }
	    
	    
	    catch( Throwable e)
		{
			 
			
		}
	    Thread.sleep(5000);
	    
	    
	    
	 // Second Paragraph	 
		 
		 
	 		 WebElement un1 = driver.findElement(By.cssSelector("#about_us > p:nth-child(3)"));
	 		 
	 		 action.moveToElement(un1, 0, 0)
	 	        .clickAndHold()
	 	        .moveByOffset(1190, 50)
	 	        .release()
	 	        .perform();


	 			 Thread.sleep(10000);
	 			 action.contextClick(un1).build().perform();
	 			 
	 			 
	 			 Thread.sleep(10000);
	 		    
	 		    
	 		    //Mouse over on Bullets
	 		    
	 		    WebElement family2 = driver.findElement(By.xpath("/html/body/div[14]/ul/li[11]"));
	 		    
	 		    int xaxis2 = family2.getLocation().x;
	 		     
	 		    int yaxis2=family2.getLocation().y;
	 		     
	 		    int width2 = family2.getSize().width;
	 		    int height2= family2.getSize().height;
	 		     
	 		    Robot r2=new Robot();
	 		    r2.mouseMove(xaxis2+width2/2, yaxis2+height2/2+70);
	 		    
	 		    Thread.sleep(10000);
	 		    
	 		    
	 		    //Circle Pick For Paragraph
	 		 
	 		   WebElement circlepick = driver.findElement(By.xpath(" /html/body/div[14]/ul/li[9]/ul/li[2]")); 
	 		   
	 		  js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
	 				 circlepick);
	 		    Thread.sleep(3000);
	 		    
	 		   circlepick.click();
	 		   
	 		    
	 		    action.moveToElement(un1, 0, 0)
	 	        .clickAndHold()
	 	        .moveByOffset(0, 0)
	 	        .release()
	 	        .perform();
	 		    
	 		   Thread.sleep(2000);
	 		    
	 		    String fontsize1 = driver.findElement(By.cssSelector("#about_us > p:nth-child(3) > font")).getCssValue("font-size");
	 		    
	 		    System.out.println("The Second Paragraph fontsize is "+fontsize1);
	 		    
	 		   try {
	 			    
	 			    
	 		    
	 		    Assert.assertEquals("14px", fontsize1);
	 		   System.out.println("Successfully Compared Font Size");
	 			
	 			}
	 		   
	 		  catch( Throwable e)
	 			{
	 				 
	 			  
	 			  
	 				
	 			}
	 		    
	 		   Thread.sleep(3000);
	 		    
	 		    
	 		// Third Paragraph	 
	 			 
	 			 
		 		 WebElement un2 = driver.findElement(By.cssSelector("#about_us > p:nth-child(4)"));
		 		 

		 		 
		 		 action.moveToElement(un2, 0, 0)
		 	        .clickAndHold()
		 	        .moveByOffset(1190, 50)
		 	        .release()
		 	        .perform();


		 			 Thread.sleep(10000);
		 			 action.contextClick(un2).build().perform();
		 			 
		 			 
		 			 Thread.sleep(10000);
		 		    
		 		    
		 		    //Mouse over on Bullets
		 		    
		 		    WebElement family3 = driver.findElement(By.xpath("/html/body/div[14]/ul/li[11]"));
		 		    
		 		    int xaxis3 = family3.getLocation().x;
		 		     
		 		    int yaxis3=family3.getLocation().y;
		 		     
		 		    int width3 = family3.getSize().width;
		 		    int height3= family3.getSize().height;
		 		    
		 		   
		 		    
		 		     
		 		    Robot r3=new Robot();
		 		    r3.mouseMove(xaxis3+width3/2, yaxis3+height3/2+70);
		 		    
		 		    Thread.sleep(10000);
		 		 
		 		   WebElement square = driver.findElement(By.xpath(" /html/body/div[14]/ul/li[9]/ul/li[3]")); 
		 		   
		 		  js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
		 				 square);
			 		    Thread.sleep(3000);
			 		    
			 		   square.click();
		 		   
		 		   
		 		   
		 		    
		 		    action.moveToElement(un2, 0, 0)
		 	        .clickAndHold()
		 	        .moveByOffset(0, 0)
		 	        .release()
		 	        .perform();
		 		    
		 		    
		 		   Thread.sleep(2000);
		 		    
		 		    String fontsize2 = driver.findElement(By.cssSelector("#about_us > p:nth-child(4) > font")).getCssValue("font-size");
		 		    
		 		    System.out.println("The Third Paragraph fontsize is "+fontsize2);
		 		    
		 		    
		 		   try {
		 		    
		 		    Assert.assertEquals("16px", fontsize2);
		 		   System.out.println("Successfully Compared Font Size");
		 		   
		 		   }
		 		   
		 		  catch( Throwable e)
		 			{
		 				 
		 				
		 			}
		 		    
		 		   Thread.sleep(3000);
		 		   
		
		
	}
	
	
	
	
	
	// Select the Font Alignment Method
	
	
		public void textalign_click() throws InterruptedException, AWTException {
			
			// Font Size Starts

			
			for (int j=1; j<5; j++) {
				
				
			
				JavascriptExecutor js = (JavascriptExecutor) driver;
		
					Actions action = new Actions(driver);
					
					
					try {
					
					
					WebElement para = driver.findElement(By.cssSelector("#about_us > div:nth-child(2) > p:nth-child("+j+")"));
					 
					 action.moveToElement(para, 0, 0)
				        .clickAndHold()
				        .moveByOffset(1190, 0)
				        .release()
				        .perform();


						 Thread.sleep(10000);
						 
						 //Right Click
						 action.contextClick(para).build().perform();
						 
						 
						 Thread.sleep(10000);
					    
					    
					    //Mouse over on Text Align
					    
					    WebElement textalign1 = driver.findElement(By.xpath("/html/body/div[14]/ul/li[9]"));
					    
					    action.moveToElement(textalign1).build().perform();
						 
						Thread.sleep(5000);
						
						
						
					
					   WebElement selecttextalign = driver.findElement(By.xpath(" /html/body/div[14]/ul/li[9]/ul/li["+j+"]"));
					   

					   
					   //Get the Text of the text Alignment
					   String aligntext = selecttextalign.getText().toLowerCase();
					   
					   System.out.println("The selected align text is  is "+aligntext);
					   
			
					  js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
							  selecttextalign);
					    Thread.sleep(3000);
					    
					    selecttextalign.click();
					    
				
					   
					    
					    action.moveToElement(para, 0, 0)
				        .clickAndHold()
				        .moveByOffset(0, 0)
				        .release()
				        .perform();
					    
					   Thread.sleep(2000);
					    
					    String textalign2 = driver.findElement(By.cssSelector("#about_us > div:nth-child(2) > p:nth-child("+j+")")).getCssValue("text-align");
					    
					    System.out.println("The Paragraph text-align is "+textalign2);
					    
					 
						    
					    
					    Assert.assertEquals(aligntext, textalign2);
					   System.out.println("Successfully Compared Text Alignment");
						
						}
					   
					  catch( Exception e)
						
						{
						
							
							System.out.println("The error Message is " + e);
							throw(e);
							
							
							
						}
					  
	
					
				}
				
			}
			
			

	
	
		public void hyperlink_click() throws InterruptedException, AWTException {
			
			// Hyperlink Starts
			
			
			
			      try{
			
			
						JavascriptExecutor js = (JavascriptExecutor) driver;
						
					
								Actions action = new Actions(driver);
								
			
								WebElement para = driver.findElement(By.cssSelector("#about_us > div:nth-child(2) > p:nth-child(1)"));
								 
								 action.moveToElement(para, 0, 0)
							        .clickAndHold()
							        .moveByOffset(1100, 0)
							        .release()
							        .perform();


									 Thread.sleep(10000);
									 
									 //Right Click
									 action.contextClick(para).build().perform();
									 
									 
									 Thread.sleep(10000);
								    
								    
								    //Mouse over on HyperLink
								    
								    WebElement hyperlink = driver.findElement(By.xpath("/html/body/div[14]/ul/li[15]"));  
								    
								    js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
								    		hyperlink);
								    
								    Thread.sleep(3000);
								    
								    hyperlink.click();
								    
								   
									Thread.sleep(5000);
	
								   WebElement hreflink = driver.findElement(By.xpath(" //*[@id=\"href_A_1\"]"));     
								   WebElement target = driver.findElement(By.xpath(" //*[@id=\"target_A_2\"]"));
								   WebElement alt = driver.findElement(By.xpath(" //*[@id=\"alt_A_3\"]"));
								   
								   
								   
								   
								   String link = "www.netrovert.net";
								   
								   
								   
								   hreflink.sendKeys("www.netrovert.net");
								   Thread.sleep(3000);							 
								   target.sendKeys("_parent");
								   Thread.sleep(2000);
								   alt.sendKeys("company");
								   Thread.sleep(3000);
								 
								   System.out.println("The selected href text is "+link);
								   
								   Thread.sleep(2000);
								   
								   WebElement set = driver.findElement(By.xpath("//*[@id=\"save\"]"));
								   
								   js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
								    		set);
								   
								   Thread.sleep(3000);
						
								   set.click();
								   
								 /* js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
										  selecttextalign);
								    Thread.sleep(3000);
								    
								    selecttextalign.click();*/
								    
							
								   
								    
								    action.moveToElement(para, 0, 0)
							        .clickAndHold()
							        .moveByOffset(0, 0)
							        .release()
							        .perform();
								    
								   Thread.sleep(2000);
								    
								    String hrefvalue = driver.findElement(By.cssSelector("#about_us > div:nth-child(2) > p:nth-child(1) > a")).getAttribute("href");
								    
								    
								    
								    System.out.println("The href value is "+hrefvalue);
								    
								    
								    String hrefsplit = hrefvalue.substring(7).split("/")[1];
								    
								    System.out.println("The Splitted Href URl is "+hrefsplit);
								    
								
								    
								    Assert.assertEquals(hrefsplit, link);
								   System.out.println("Successfully Compared Href");
								   
								   
								   Thread.sleep(5000);
								   
								   
			      }
			      
			      catch( Exception e)
					
					{
					
						
						System.out.println("The error Message is " + e);
						throw(e);
						
						
						
					}
			      
		
								   //Edit the Hyperlink
			      
			      
			        try{ 
								   
								   WebElement para1 = driver.findElement(By.cssSelector("#about_us > div:nth-child(2) > p:nth-child(1)"));
								   
								   JavascriptExecutor js = (JavascriptExecutor) driver;
									
									
									Actions action = new Actions(driver);
									
									 
									 action.moveToElement(para1, 0, 0)
								        .clickAndHold()
								        .moveByOffset(1100, 0)
								        .release()
								        .perform();


										 Thread.sleep(10000);
										 
										 //Right Click
										 action.contextClick(para1).build().perform();
										 
										 
										 Thread.sleep(8000);
										 
										 
										 //Click the Edit Hyperlink Button
										 WebElement edithyperlink = driver.findElement(By.xpath("/html/body/div[14]/ul/li[16]"));  
										    
										    js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
										    		edithyperlink);
										    
										    Thread.sleep(3000);
										    
										    edithyperlink.click();
									    
									    	   
										    WebElement hreflinkbox = driver.findElement(By.xpath("//*[@id=\"href_A_3\"]")); 
										    
										    String link1 = "www.google.com";
										    
										    hreflinkbox.clear();
										    Thread.sleep(2000);
										    hreflinkbox.sendKeys(link1);
										    
										    
                                   WebElement updatebutton = driver.findElement(By.xpath("//*[@id=\"save\"]"));  
										    
										    js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
										    		updatebutton);
										    Thread.sleep(3000);
										    
										    updatebutton.click();
										  //*[@id="save"]
								   
										    
										    action.moveToElement(para1, 0, 0)
									        .clickAndHold()
									        .moveByOffset(0, 0)
									        .release()
									        .perform();
										    
										   Thread.sleep(2000);
										    
										    String hrefvalue1 = driver.findElement(By.cssSelector("#about_us > div:nth-child(2) > p:nth-child(1) > a")).getAttribute("href");
										    
										    
										    
										    System.out.println("The href value is "+hrefvalue1);
										    
										    
										    String hrefsplit1 = hrefvalue1.substring(7).split("/")[1];
										    
										    System.out.println("The Splitted Href URl is "+hrefsplit1);
										    
										
										    
										    Assert.assertEquals(hrefsplit1, link1);
										   System.out.println("Successfully Compared Href2");
										   
										   
										   Thread.sleep(5000);
										   
										   
										   
			        }
			        
			        catch( Exception e)
					
					{
					
						
						System.out.println("The error Message is " + e);
						throw(e);
						
						
						
					}
										   

										   
										 //Remove The Hyperlink
										   
			        
			                        try {
			                        	
			                        	
			                        	JavascriptExecutor js = (JavascriptExecutor) driver;
			    						
			        					
										Actions action = new Actions(driver);
										
										   
										   WebElement para2 = driver.findElement(By.cssSelector("#about_us > div:nth-child(2) > p:nth-child(1)"));
											 
											 action.moveToElement(para2, 0, 0)
										        .clickAndHold()
										        .moveByOffset(1100, 0)
										        .release()
										        .perform();


												 Thread.sleep(10000);
												 
												 //Right Click
												 action.contextClick(para2).build().perform();
												 
												 
												 Thread.sleep(8000);
												 
												 
												 //Click the Remove Hyperlink Button
												 WebElement remhyperlink = driver.findElement(By.xpath("/html/body/div[14]/ul/li[15]"));   
												    
												    js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
												    		remhyperlink);
												    
												    Thread.sleep(3000);
												    
												    remhyperlink.click();
												    
												    
												    action.moveToElement(para2, 0, 0)
											        .clickAndHold()
											        .moveByOffset(0, 0)
											        .release()
											        .perform();
												    
												   Thread.sleep(2000);
												    
												    String hrefvalue2 = driver.findElement(By.cssSelector("#about_us > div:nth-child(2) > p:nth-child(1)")).getAttribute("href");
												    
												    System.out.println("The href value is "+hrefvalue2);
												    
												    
												    if ( hrefvalue2 == null ) {
												    	
												    	 System.out.println("Successfully Compared Href3");
												    }
										   
										   
			
			                        
			                        
		}
			
			
			
			catch( Exception e)
			
			{
			
				
				System.out.println("The error Message is " + e);
				throw(e);
				
				
				
			}
												    
			
									}
								   

		//Set Properties Click
		

		public void edit_properties_click() throws InterruptedException, AWTException {
			
			
			
			try {
			
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
			        //Case 1: Apply Padding For First Paragraph
			
	
					WebElement paragraph1 = driver.findElement(By.cssSelector("#about_us > div:nth-child(2) > p:nth-child(1)"));
					
	
					Actions action1 = new Actions(driver);
					 
					 action1.moveToElement(paragraph1, 0, 0)
				        .clickAndHold()
				        .moveByOffset(1100, 0)
				        .release()
				        .perform();


					 Thread.sleep(5000);
					 action1.contextClick(paragraph1).build().perform();
					 
					 common1();

				
								   
						          //Select The Padding Field
						 
								   //WebElement ApplyPadding = driver.findElement(By.xpath("*[@id=\"padding_P_1\"]"));
					 
					 WebElement Paddg = driver.findElement(By.xpath("/html/body/div[14]/table/tbody/tr/td/table/tr[1]/td[1]"));
		 				js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
		 						Paddg);
					 
					 				WebElement ApplyPadding = driver.findElement(By.cssSelector("#padding_P_1"));
					 				
					 				Actions actions1 = new Actions(driver);
					 				actions1.moveToElement(ApplyPadding);
					 				actions1.click();
					 
								   
								   ApplyPadding.clear();
								   Thread.sleep(2000);
								   
								   ApplyPadding.sendKeys("2px 3px 4px 5px");
								   
								   
								   
								   Thread.sleep(5000);
								   
								 
								   
								   WebElement save =  driver.findElement(By.xpath("//*[@id=\"save\"]"));
								   
								   
								   js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
										   save);
								   Thread.sleep(4000);
								   save.click();
								   
								   Thread.sleep(3000);
								   
								   String padding = paragraph1.getCssValue("padding");
								   
								   System.out.println("The Padding value is" + padding);
								   
								   
								   Assert.assertEquals(padding,"2px 3px 4px 5px");
								   System.out.println("Successfully Compared Padding");
								   
								   Thread.sleep(3000);
			}		   
								   
								   catch( Exception e)
									
									{
									
										
										System.out.println("The error Message is " + e);
										throw(e);
								
									}		   
								   
					   
				 //Case 2: Apply Margin For Second Paragraph
			
			
			     try {
			    	 JavascriptExecutor js = (JavascriptExecutor) driver;
			
				  WebElement paragraph2 = driver.findElement(By.cssSelector("#about_us > div:nth-child(2) > p:nth-child(2)"));
									
				  Actions action2 = new Actions(driver);
									 
				  action2.moveToElement(paragraph2, 0, 0)
								        .clickAndHold()
								        .moveByOffset(1100, 0)
								        .release()
								        .perform();


									 Thread.sleep(5000);
									 action2.contextClick(paragraph2).build().perform();
									 
									 common1();

								
												   
					//Select The Margin Field
									 
									 WebElement marg = driver.findElement(By.xpath("/html/body/div[14]/table/tbody/tr/td/table/tr[2]/td[1]"));
						 				js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
						 						marg);
										 
					WebElement ApplyMargin = driver.findElement(By.cssSelector("#margin_P_2"));
					
					Actions actions2 = new Actions(driver);
	 				actions2.moveToElement(ApplyMargin);
	 				actions2.click();
	 
					
					ApplyMargin.clear();
					   Thread.sleep(2000);
					   
												   
					ApplyMargin.sendKeys("2px 4px 3px 1px");
												   
					Thread.sleep(5000);
					
					WebElement save1 =  driver.findElement(By.xpath("//*[@id=\"save\"]"));
					
					js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
							save1);
					 Thread.sleep(4000);
					save1.click();
					   
					   Thread.sleep(3000);
					   
					   String Margin = paragraph2.getCssValue("margin");
					   
					   System.out.println("The Margin value is" + Margin);
					   
					   Assert.assertEquals(Margin,"2px 4px 3px 1px");
					   System.out.println("Successfully Margin");
					   
					   Thread.sleep(3000);
					   
					   
					   
			     }
			     
			     catch( Exception e)
					
					{
					
						
						System.out.println("The error Message is " + e);
						throw(e);
				
					}		   
				   
					
					
			     
			     
					
					//Case 3: Letter Spacing For Third Paragraph
			     
			     
			     try {
			    	 JavascriptExecutor js = (JavascriptExecutor) driver;
			    	 
			     
					  WebElement paragraph3 = driver.findElement(By.cssSelector("#about_us > div:nth-child(2) > p:nth-child(3)"));
										
					  Actions action3 = new Actions(driver);
										 
					  action3.moveToElement(paragraph3, 0, 0)
									        .clickAndHold()
									        .moveByOffset(1100, 0)
									        .release()
									        .perform();


										 Thread.sleep(5000);
										 action3.contextClick(paragraph3).build().perform();
										 
										 common1();

									
													   
						//Select The Letter Spacing
											 
										 WebElement letterspace = driver.findElement(By.xpath("/html/body/div[14]/table/tbody/tr/td/table/tr[3]/td[1]"));
							 				js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
							 						letterspace);									 
						WebElement Applylettspace = driver.findElement(By.cssSelector("#letter-spacing_P_3"));
						
						Actions actions3 = new Actions(driver);
		 				actions3.moveToElement(Applylettspace);
		 				actions3.click();
		 
						
						Applylettspace.clear();
						   Thread.sleep(2000);
													   
						Applylettspace.sendKeys("4px");
													   
						Thread.sleep(5000);
						
						
						WebElement save2 =  driver.findElement(By.xpath("//*[@id=\"save\"]"));
						
						
						js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
								save2);
						Thread.sleep(4000);
						save2.click();
						   
						   Thread.sleep(3000);
						   
						   String letterspacing = paragraph3.getCssValue("letter-spacing");
						   
						   System.out.println("The Letter Spacing value is" + letterspacing);
						   
						   Assert.assertEquals(letterspacing,"4px");
						   System.out.println("Successfully Letter Spacing");
						   
						   Thread.sleep(3000);
						   
						   
						   
						   
						   
 }
			     
			     catch( Exception e)
					
					{
					
						
						System.out.println("The error Message is " + e);
						throw(e);
				
					}		 
						   
						
						
						//Case 4: Word Spacing For Fourth Paragraph
			     
			     
			     try {
			    	 
			    	 JavascriptExecutor js = (JavascriptExecutor) driver;
						  WebElement paragraph4 = driver.findElement(By.cssSelector("#about_us > div:nth-child(2) > p:nth-child(4)"));
											
						  Actions action4 = new Actions(driver);
											 
						  action4.moveToElement(paragraph4, 0, 0)
										        .clickAndHold()
										        .moveByOffset(1100, 0)
										        .release()
										        .perform();


											 Thread.sleep(5000);
											 action4.contextClick(paragraph4).build().perform();
											 
											 common1();

										
														   
							//Select The Word Spacing
											 
											 WebElement wordspace = driver.findElement(By.xpath("/html/body/div[14]/table/tbody/tr/td/table/tr[4]/td[1]"));
								 				js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
								 						wordspace);											 
												 
							WebElement ApplyWrdspace = driver.findElement(By.cssSelector("#word-spacing_P_4"));
							
							Actions actions4 = new Actions(driver);
			 				actions4.moveToElement(ApplyWrdspace);
			 				actions4.click();
			 
							
							
							ApplyWrdspace.clear();
							   Thread.sleep(2000);
														   
							   ApplyWrdspace.sendKeys("5px");
														   
							Thread.sleep(5000);
							
							WebElement save3 =  driver.findElement(By.xpath("//*[@id=\"save\"]"));
							
							js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
									   save3);
							
							Thread.sleep(4000);
							   save3.click();
							   
							   Thread.sleep(3000);
							   
							   String wordspacing = paragraph4.getCssValue("word-spacing");
							   
							   System.out.println("The Word Spacing value is" + wordspacing);
							   
							   Assert.assertEquals(wordspacing,"5px");
							   System.out.println("Successfully Word Spacing");
							   
							   Thread.sleep(3000);
							   
							   
							   
 }
			     
			     catch( Exception e)
					
					{
					
						
						System.out.println("The error Message is " + e);
						throw(e);
				
					}		 
							   
						
					
					
							
							//Case 5: Line height For Fifth Paragraph
			     
			     try {
			    	 
			    	 JavascriptExecutor js = (JavascriptExecutor) driver;
							  WebElement paragraph5 = driver.findElement(By.cssSelector("#about_us > div:nth-child(2) > p:nth-child(5)"));
												
							  Actions action5 = new Actions(driver);
												 
							  action5.moveToElement(paragraph5, 0, 0)
											        .clickAndHold()
											        .moveByOffset(1100, 0)
											        .release()
											        .perform();


												 Thread.sleep(5000);
												 action5.contextClick(paragraph5).build().perform();
												 
												 common1();

											
															   
								//Select The Line Height
												 
												 WebElement lineheight = driver.findElement(By.xpath("/html/body/div[14]/table/tbody/tr/td/table/tr[5]/td[1]"));
									 				js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
									 						lineheight);												 
													 
								WebElement ApplyLineHeght = driver.findElement(By.cssSelector("#line-height_P_5"));
								
								
								Actions actions5 = new Actions(driver);
				 				actions5.moveToElement(ApplyLineHeght);
				 				actions5.click();
				 
								
								ApplyLineHeght.clear();
								   Thread.sleep(2000);
															   
								   ApplyLineHeght.sendKeys("25.6px");
															   
								Thread.sleep(5000);
								
								WebElement save4 =  driver.findElement(By.xpath("//*[@id=\"save\"]"));
								
								js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
										   save4);
								
								  Thread.sleep(4000);
								   save4.click();
								   
								   Thread.sleep(3000);
								   
								   String lineheigt = paragraph5.getCssValue("line-height");
								   
								   System.out.println("The Line Height value is" + lineheigt);
								   
								   Assert.assertEquals(lineheigt,"25.6px");
								   System.out.println("Successfully compared Line Height");
								   
								   
								   Thread.sleep(3000);
								   
								   
 }
			     
			     catch( Exception e)
					
					{
					
						
						System.out.println("The error Message is " + e);
						throw(e);
				
					}		 
								   
								
							
							
					
								//Case 6: Text Indent For Sixth Paragraph
			     
			     try {
			    	 
			    	 JavascriptExecutor js = (JavascriptExecutor) driver;
			    	 
			     
								  WebElement paragraph6 = driver.findElement(By.cssSelector("#about_us > div:nth-child(2) > p:nth-child(6)"));
													
								  Actions action6 = new Actions(driver);
													 
								  action6.moveToElement(paragraph6, 0, 0)
												        .clickAndHold()
												        .moveByOffset(1100, 0)
												        .release()
												        .perform();


													 Thread.sleep(5000);
													 action6.contextClick(paragraph6).build().perform();
													 
													 common1();

												
																   
									//Select The Text Indent
                                    
													 WebElement textindent = driver.findElement(By.xpath("/html/body/div[14]/table/tbody/tr/td/table/tr[6]/td[1]"));
										 				js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
										 						textindent);			 
 													 
									WebElement ApplyTxtIndent = driver.findElement(By.cssSelector("#text-indent_P_6"));
									
									Actions actions6 = new Actions(driver);
					 				actions6.moveToElement(ApplyTxtIndent);
					 				actions6.click();
					 
									
									ApplyTxtIndent.clear();
									   Thread.sleep(2000);
																   
									   ApplyTxtIndent.sendKeys("20px");
																   
									Thread.sleep(5000);	
									
									
									WebElement save5 =  driver.findElement(By.xpath("//*[@id=\"save\"]"));
									
									js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
											   save5);
									Thread.sleep(4000);
									   save5.click();
									   
									   Thread.sleep(3000);
									   
									   String txtindent = paragraph6.getCssValue("text-indent");
									   
									   System.out.println("The text indent value is" + txtindent);
									   
									   Assert.assertEquals(txtindent,"20px");
									   System.out.println("Successfully compared text Indent");
									   
									   Thread.sleep(3000);
									   
 }
			     
			     catch( Exception e)
					
					{
					
						
						System.out.println("The error Message is " + e);
						throw(e);
				
					}		 
									   
									 //Case 7: Display For Seventh Paragraph
			     
			     try {
			    	 
			    	 JavascriptExecutor js = (JavascriptExecutor) driver;
										  WebElement paragraph7 = driver.findElement(By.cssSelector("#about_us > div:nth-child(2) > p:nth-child(7)"));
															
										  Actions action7 = new Actions(driver);
															 
										  action7.moveToElement(paragraph7, 0, 0)
														        .clickAndHold()
														        .moveByOffset(1100, 0)
														        .release()
														        .perform();


															 Thread.sleep(5000);
															 action7.contextClick(paragraph7).build().perform();
															 
															 common1();

														
																		   
											//Select The Display
																 
															 WebElement display = driver.findElement(By.xpath("/html/body/div[14]/table/tbody/tr/td/table/tr[7]/td[1]"));
												 				js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
												 						display);					 
											WebElement Display = driver.findElement(By.cssSelector("#display_P_7"));
											
											Actions actions7 = new Actions(driver);
							 				actions7.moveToElement(Display);
							 				actions7.click().build().perform();
							 				
							 				Thread.sleep(5000);
							 				
							 				WebElement selectdisplay =  driver.findElement(By.xpath("//*[@id=\"display_P_7\"]/option[2]"));
							 				
							 				js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
							 						selectdisplay);
							 				
							 				
							 				Thread.sleep(5000);
							 				
							 				selectdisplay.click();
							 
											
											
											
											
											WebElement save6 =  driver.findElement(By.xpath("//*[@id=\"save\"]"));
											
											js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
													   save6);
											Thread.sleep(4000);
											   save6.click();
											   
											   Thread.sleep(3000);
											   
											  
											   
											   String disply = paragraph7.getCssValue("display");
											   
											   System.out.println("The display value is" + disply);
											   
											   Assert.assertEquals(disply,"inline");
											   System.out.println("Successfully compared Display");
											   
											   Thread.sleep(3000);
											   
 }
			     
			     catch( Exception e)
					
					{
					
						
						System.out.println("The error Message is " + e);
						throw(e);
				
					}		 
											   
										
											   
											 //Case 8: Float For Eight Paragraph
			     
			     
			     try {
			    	 
			    	 JavascriptExecutor js = (JavascriptExecutor) driver;
												  WebElement paragraph8 = driver.findElement(By.cssSelector("#about_us > div:nth-child(2) > p:nth-child(8)"));
																	
												  Actions action8 = new Actions(driver);
																	 
												  action8.moveToElement(paragraph8, 0, 0)
																        .clickAndHold()
																        .moveByOffset(1100, 0)
																        .release()
																        .perform();


																	 Thread.sleep(5000);
																	 action8.contextClick(paragraph8).build().perform();
																	 
																	 common1();

																
																				   
													//Select The Float
																	 
																	 WebElement flot = driver.findElement(By.xpath("/html/body/div[14]/table/tbody/tr/td/table/tr[8]/td[1]"));
														 				js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
														 						flot);
														 				
													WebElement Float = driver.findElement(By.cssSelector("#float_P_8"));
													
													Actions actions8 = new Actions(driver);
									 				actions8.moveToElement(Float);
									 				actions8.click().build().perform();
									 				
									 				Thread.sleep(5000);
									 				
									 				WebElement selectFloat =  driver.findElement(By.xpath("//*[@id=\"float_P_8\"]/option[1]"));
									 				
									 				js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
									 						selectFloat);
									 				
									 				Thread.sleep(5000);
									 				
									 				selectFloat.click();
									 
													
													
													
													
													WebElement save7 =  driver.findElement(By.xpath("//*[@id=\"save\"]"));
													
													js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
															   save7);
													
													Thread.sleep(4000);
													   save7.click();
													   
													   Thread.sleep(3000);
													   
													   String floaat = paragraph8.getCssValue("float");
													   
													   System.out.println("The Float value is" + floaat);
													   
													   Assert.assertEquals(floaat,"left");
													   System.out.println("Successfully compared Float");
													   
													   Thread.sleep(3000);
													   
 }
			     
			     catch( Exception e)
					
					{
					
						
						System.out.println("The error Message is " + e);
						throw(e);
				
					}		 
													   
											   
													   
													 //Case 9: Width For Ninth Paragraph
			     
			     
			     try {
			    	 
			    	 JavascriptExecutor js = (JavascriptExecutor) driver;
														  WebElement paragraph10 = driver.findElement(By.cssSelector("#about_us > div:nth-child(2) > p:nth-child(10)"));
																			
														  
														  
														  Actions action9 = new Actions(driver);
																			 
														  action9.moveToElement(paragraph10, 0, 0)
																		        .clickAndHold()
																		        .moveByOffset(1100, 0)
																		        .release()
																		        .perform();


																			 Thread.sleep(5000);
																			 action9.contextClick(paragraph10).build().perform();
																			 
																			 common1();

																		
																						   
															//Select The Width
																			 
										// For due to some float issue we are unable to give the width operation to 9th Paragraph..shifting to 10th Paragraph			 
																			 
														WebElement wdth = driver.findElement(By.xpath("/html/body/div[14]/table/tbody/tr/td/table/tr[9]/td[1]"));
																 				js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
																 						wdth);
																			    
																				 
															WebElement Width = driver.findElement(By.cssSelector("#width_P_9"));
															
															Actions actions9 = new Actions(driver);
											 				actions9.moveToElement(Width);
											 				actions9.click();
											 
															
											 				Width.clear();
															   Thread.sleep(2000);
																						   
															   Width.sendKeys("1000px");
																						   
															Thread.sleep(5000);	
															
															
															WebElement save9 =  driver.findElement(By.xpath("//*[@id=\"save\"]"));
															
															js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
																	   save9);
															
															 Thread.sleep(4000);
															   save9.click();
															   
															   Thread.sleep(3000);
															   
															   String widthh = paragraph10.getCssValue("width");
															   
															   System.out.println("The width value is" + widthh);
															   
															   Assert.assertEquals(widthh,"1000px");
															   System.out.println("Successfully compared Width");
															   
															   Thread.sleep(3000);
															   
															   
															   
															   
 }
			     
			     catch( Exception e)
					
					{
					
						
						System.out.println("The error Message is " + e);
						throw(e);
				
					}		 
															   
	   
				  }		
		
		
		
		//Edit Properties Common Method
		
		
	 
	 
		
								
		                                                     
		
		
		
		                                                
		public void editproper_all() throws InterruptedException, AWTException {
			
	
             try {
            	 
            	 
            	 Thread.sleep(5000);
            	 
     
            	 WebElement Text2 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div[1]/de[1]/p[1]"));
            	 
            	 
            	 
            	 

			 	JavascriptExecutor js = (JavascriptExecutor) driver;
			 	Actions action = new Actions(driver);
			 	js.executeScript("arguments[0].scrollIntoView(true);",Text2);
			 	
			 	Thread.sleep(8000);
		
			 	//Robot bot = new Robot();
		        /*Actions actions = new Actions(driver);*/
		        
		        //actions.moveToElement(Text2).click();
		        
		        
		        
		        /*Point p = Text2.getLocation();
                int x = p.getX();
                int y = p.getY();
                Dimension d = Text2.getSize();
                int h = d.getHeight();
                int w = d.getWidth();
                
                bot.mouseMove(x + (w/2), y+(h/2) +80);
                bot.mousePress(KeyEvent.BUTTON1_MASK);//click function
                bot.mouseRelease(KeyEvent.BUTTON1_MASK);
               
                
                Thread.sleep(5000);
                
                
                bot.keyPress(KeyEvent.VK_CONTROL);
			 	bot.keyPress(KeyEvent.VK_HOME);
			 	
			 	bot.keyRelease(KeyEvent.VK_CONTROL);*/
		        
		
			 
			    // go to the beginning of input
			    //actions.sendKeys(Keys.CONTROL).sendKeys(Keys.HOME).build().perform();
			    /*Thread.sleep(5000);
			    
			    String Query = Text2.getText();
			    int length = Query.length();
			    
			    actions.keyDown(Keys.LEFT_SHIFT);
			    for (int i = 0; i <= length; i++){
			        actions.sendKeys(Keys.ARROW_RIGHT);
			    }
			    actions.keyUp(Keys.LEFT_SHIFT);
			    //bot.keyPress(KeyEvent.VK_SHIFT);
			    bot.keyPress(KeyEvent.VK_RIGHT);
			    
	
			    actions.build().perform();
			    
			    */
			   


			 	Robot bot = new Robot();

			 	bot.keyPress(KeyEvent.VK_END);
			 	bot.keyPress(KeyEvent.VK_RIGHT);
			 
			 	bot.keyPress(KeyEvent.VK_SHIFT);
			 	bot.keyPress(KeyEvent.VK_END);
			 	Thread.sleep(3000);
			 	

                //bot.keyPress(KeyEvent.VK_SHIFT);
               
                bot.keyPress(KeyEvent.VK_END);
                bot.keyPress(KeyEvent.VK_RIGHT);
                
                
                
                //bot.keyPress(KeyEvent.VK_SHIFT);
              
                bot.keyPress(KeyEvent.VK_END);
                bot.keyPress(KeyEvent.VK_RIGHT);
                
               
                //bot.keyPress(KeyEvent.VK_SHIFT);
                bot.keyPress(KeyEvent.VK_END);
                bot.keyPress(KeyEvent.VK_RIGHT);
                
                //bot.keyPress(KeyEvent.VK_SHIFT);
                bot.keyPress(KeyEvent.VK_END);
                bot.keyPress(KeyEvent.VK_RIGHT);
                
                //bot.keyPress(KeyEvent.VK_SHIFT);
                bot.keyPress(KeyEvent.VK_END);
                bot.keyPress(KeyEvent.VK_RIGHT);
                
                //bot.keyPress(KeyEvent.VK_SHIFT);
                bot.keyPress(KeyEvent.VK_END);
                bot.keyPress(KeyEvent.VK_RIGHT);
                
                //bot.keyPress(KeyEvent.VK_SHIFT);
                bot.keyPress(KeyEvent.VK_END);
                bot.keyPress(KeyEvent.VK_RIGHT);
                
                //bot.keyPress(KeyEvent.VK_SHIFT);
                bot.keyPress(KeyEvent.VK_END);
                bot.keyPress(KeyEvent.VK_RIGHT);
                
                //bot.keyPress(KeyEvent.VK_SHIFT);
                bot.keyPress(KeyEvent.VK_END);
                bot.keyPress(KeyEvent.VK_END);
                bot.keyPress(KeyEvent.VK_END);
                
                
                bot.keyRelease(KeyEvent.VK_SHIFT);
                


                Thread.sleep(6000);
                
                Point p = Text2.getLocation();
                int x = p.getX();
                int y = p.getY();
                Dimension d = Text2.getSize();
                int h = d.getHeight();
                int w = d.getWidth();
                
                bot.mouseMove(x + (w/2), y+(h/2) +80);
                
                Thread.sleep(2000);


			    

                action.contextClick(Text2).build().perform();
        
                Thread.sleep(2000);
                

				 //Click Edit Properties
				 common1();

			
							   
					          //Select The Padding Field
					 
							   //WebElement ApplyPadding = driver.findElement(By.xpath("*[@id=\"padding_P_1\"]"));
				 
				 				WebElement Paddg = driver.findElement(By.xpath("/html/body/div[13]/table/tbody/tr/td/table/tr[1]/td[1]"));
				 				js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
				 						Paddg);
				 
				 				WebElement ApplyPadding = driver.findElement(By.cssSelector("#padding_P_1")); 
				 				

				 				Actions actions1 = new Actions(driver);
				 				actions1.moveToElement(ApplyPadding);
				 				actions1.click();
				 
							   
							   ApplyPadding.clear();
							   Thread.sleep(2000);
							   
							   ApplyPadding.sendKeys("2px 3px 4px 5px");
							   
							   
							   js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid white;');",
									   Paddg);
							   
			
							   
							   action.moveToElement(Text2,0,0).click().keyDown(Keys.SHIFT).moveToElement(Text2,200, 0).click().keyUp(Keys.SHIFT).build().perform();
							   
							   	   Thread.sleep(3000);
			
		
											   
				//Case 2: Apply Margin
							   
							   WebElement marg = driver.findElement(By.xpath("/html/body/div[13]/table/tbody/tr/td/table/tr[2]/td[1]"));
				 				js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
				 						marg);
									 
				WebElement ApplyMargin = driver.findElement(By.cssSelector("#margin_P_2"));
				
		
				Actions actions2 = new Actions(driver);
				actions2.moveToElement(ApplyMargin);
				actions2.click();

				
				ApplyMargin.clear();
				   Thread.sleep(2000);
				   
											   
				ApplyMargin.sendKeys("2px 2px 2px 2px");
				
				js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid white;');",
						marg);
				   
											   
				
				   Thread.sleep(3000);
				   
				 
				//Case 3: Apply Letter Spacing 
				   
				   WebElement letterspace = driver.findElement(By.xpath("/html/body/div[13]/table/tbody/tr/td/table/tr[3]/td[1]"));
	 				js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
	 						letterspace);
						 
					WebElement Applylettspace = driver.findElement(By.cssSelector("#letter-spacing_P_3"));
					
					
			
					Actions actions3 = new Actions(driver);
	 				actions3.moveToElement(Applylettspace);
	 				actions3.click();
	 
					
					Applylettspace.clear();
					   Thread.sleep(2000);
												   
					Applylettspace.sendKeys("4px");
					
					js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid white;');",
							letterspace);
					   
							   
					   Thread.sleep(3000);
					   
		
					//Case 4: Apply Word Spacing 
					   
					   WebElement wordspace = driver.findElement(By.xpath("/html/body/div[13]/table/tbody/tr/td/table/tr[4]/td[1]"));
		 				js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
		 						wordspace);
							 
		  				 
						WebElement ApplyWrdspace = driver.findElement(By.cssSelector("#word-spacing_P_4"));
						
					
						Actions actions4 = new Actions(driver);
		 				actions4.moveToElement(ApplyWrdspace);
		 				actions4.click();
		 
		 
						
						ApplyWrdspace.clear();
						   Thread.sleep(2000);
													   
						   ApplyWrdspace.sendKeys("5px");
						   
						   js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid white;');",
								   wordspace);
							   
													   
						
						   Thread.sleep(3000);
						   
						   

						//Case 5: Apply Line height 
						   
						   WebElement lineheight = driver.findElement(By.xpath("/html/body/div[13]/table/tbody/tr/td/table/tr[5]/td[1]"));
			 				js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
			 						lineheight);
								 
		    				 
							WebElement ApplyLineHeght = driver.findElement(By.cssSelector("#line-height_P_5"));
							
							
	
							Actions actions5 = new Actions(driver);
			 				actions5.moveToElement(ApplyLineHeght);
			 				actions5.click();
			 
							
							ApplyLineHeght.clear();
							   Thread.sleep(2000);
														   
							   ApplyLineHeght.sendKeys("25.6px");
							   
							   js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid white;');",
									   lineheight);
														   
							
							   Thread.sleep(3000);
		
				
							//Case 6: Apply Text Indent

							   WebElement textindent = driver.findElement(By.xpath("/html/body/div[13]/table/tbody/tr/td/table/tr[6]/td[1]"));
				 				js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
				 						textindent);
									 
		    	           
								WebElement ApplyTxtIndent = driver.findElement(By.cssSelector("#text-indent_P_6"));
								
								js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
										ApplyTxtIndent);
		
								
								Actions actions6 = new Actions(driver);
				 				actions6.moveToElement(ApplyTxtIndent);
				 				actions6.click();
				 
								
								ApplyTxtIndent.clear();
								   Thread.sleep(2000);
															   
								   ApplyTxtIndent.sendKeys("20px");
								   
								   js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid white;');",
										   textindent);
															   
								
								   Thread.sleep(3000);
	
	
								 //Case 7: Apply Display 
								   
								   WebElement display = driver.findElement(By.xpath("/html/body/div[13]/table/tbody/tr/td/table/tr[7]/td[1]"));
					 				js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
					 						display);
		     
										WebElement Display = driver.findElement(By.cssSelector("#display_P_7"));
										
										
										
										Actions actions7 = new Actions(driver);
						 				actions7.moveToElement(Display);
						 				actions7.click().build().perform();
						 				
						 				Thread.sleep(5000);
						 				
						 				WebElement selectdisplay =  driver.findElement(By.xpath("//*[@id=\"display_P_7\"]/option[3]"));
						 				
						 				js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
						 						selectdisplay);
						 				
						 				
						 				Thread.sleep(5000);
						 				
						 				selectdisplay.click();
						 				
						 				js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid white;');",
						 						display);
						 
										   Thread.sleep(3000);

										   
										 //Case 8: Apply Float 
		     

										   WebElement flot = driver.findElement(By.xpath("/html/body/div[13]/table/tbody/tr/td/table/tr[8]/td[1]"));
							 				js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
							 						flot);
										    
		    	                              
												WebElement Float = driver.findElement(By.cssSelector("#float_P_8"));
												
												Actions actions8 = new Actions(driver);
								 				actions8.moveToElement(Float);
								 				actions8.click().build().perform();
								 				
								 				Thread.sleep(5000);
								 				
								 				WebElement selectFloat =  driver.findElement(By.xpath("//*[@id=\"float_P_8\"]/option[3]"));
								 				
								 				js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
								 						selectFloat);
								 				
								 				Thread.sleep(5000);
								 				
								 				selectFloat.click();
								 				
								 				js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid white;');",
								 						flot);
								 
			
												   Thread.sleep(3000);
						
						
												 //Case 9: Width For Ninth Paragraph
												   
												   WebElement wdth = driver.findElement(By.xpath("/html/body/div[13]/table/tbody/tr/td/table/tr[9]/td[1]"));
									 				js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
									 						wdth);
												    
	
		    	                                    
														WebElement Width = driver.findElement(By.cssSelector("#width_P_9"));
														
														js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
																Width);
														
														
														Actions actions9 = new Actions(driver);
										 				actions9.moveToElement(Width);
										 				actions9.click();
										 
														
										 				Width.clear();
														   Thread.sleep(2000);
																					   
														   Width.sendKeys("400px");
														   
														   js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid white;');",
																   wdth);
																					   
														
														   Thread.sleep(3000);
														   
														   
														   WebElement save9 =  driver.findElement(By.xpath("//*[@id=\"save\"]"));
															
															js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
																	   save9);
															
															Thread.sleep(5000);
															   save9.click();
															   
															   Thread.sleep(5000);
															   
															   
															   
															   
															   
															   
															   //Compare the Edit Properties Values
															   
															   //WebElement Text21 =  driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div[1]/de[1]/p[1]"));
															   
															   
															   
															 	js.executeScript("arguments[0].scrollIntoView(true);",Text2);
															 	
															 	Thread.sleep(5000);
															   
															   
															   Point p1 = Text2.getLocation();
												                int x1 = p1.getX();
												                int y1 = p1.getY();
												                Dimension d1 = Text2.getSize();
												                int h1 = d1.getHeight();
												                int w1 = d1.getWidth();
												                
												                bot.mouseMove(x1 + (w1/2), y+(h1/2) +80);
												                
												                bot.mousePress(KeyEvent.BUTTON1_MASK);//click function
												                bot.mouseRelease(KeyEvent.BUTTON1_MASK);
												                
												                Thread.sleep(2000);
			
															   bot.keyPress(KeyEvent.VK_CONTROL);
															   bot.keyPress(KeyEvent.VK_HOME);
															   
															   bot.keyRelease(KeyEvent.VK_CONTROL);
															   bot.keyPress(KeyEvent.VK_END);
															   bot.keyPress(KeyEvent.VK_RIGHT);

															   bot.keyPress(KeyEvent.VK_SHIFT);
															   bot.keyPress(KeyEvent.VK_END);
															   bot.keyPress(KeyEvent.VK_RIGHT);
												
															   bot.keyPress(KeyEvent.VK_END);
															   bot.keyPress(KeyEvent.VK_RIGHT);

															   bot.keyPress(KeyEvent.VK_END);
															   bot.keyPress(KeyEvent.VK_RIGHT);

															   bot.keyPress(KeyEvent.VK_END);
															   bot.keyPress(KeyEvent.VK_RIGHT);

															   bot.keyPress(KeyEvent.VK_END);
															   bot.keyPress(KeyEvent.VK_RIGHT);

															   bot.keyPress(KeyEvent.VK_END);
															   bot.keyPress(KeyEvent.VK_RIGHT);

															   bot.keyPress(KeyEvent.VK_END);
															   bot.keyPress(KeyEvent.VK_RIGHT);

															   bot.keyPress(KeyEvent.VK_END);
															   bot.keyPress(KeyEvent.VK_RIGHT);
															   
															   bot.keyPress(KeyEvent.VK_END);
															   bot.keyPress(KeyEvent.VK_RIGHT);
															   
															   bot.keyPress(KeyEvent.VK_END);
															   bot.keyPress(KeyEvent.VK_RIGHT);
															   
															   bot.keyPress(KeyEvent.VK_END);
															   bot.keyPress(KeyEvent.VK_RIGHT);
							
															   bot.keyPress(KeyEvent.VK_END);
															   bot.keyPress(KeyEvent.VK_RIGHT);

															   bot.keyPress(KeyEvent.VK_END);
															   bot.keyPress(KeyEvent.VK_RIGHT);

															   bot.keyPress(KeyEvent.VK_END);
															   bot.keyPress(KeyEvent.VK_RIGHT);

															   bot.keyPress(KeyEvent.VK_END);
															   bot.keyPress(KeyEvent.VK_RIGHT);

															   bot.keyPress(KeyEvent.VK_END);
															   bot.keyPress(KeyEvent.VK_RIGHT);

															   bot.keyPress(KeyEvent.VK_END);
															   bot.keyPress(KeyEvent.VK_RIGHT);

															   bot.keyPress(KeyEvent.VK_END);
															   bot.keyPress(KeyEvent.VK_RIGHT);
															   
															   bot.keyPress(KeyEvent.VK_END);
															   bot.keyPress(KeyEvent.VK_RIGHT);
															   
															   bot.keyPress(KeyEvent.VK_END);
															   bot.keyPress(KeyEvent.VK_END);

															   bot.keyRelease(KeyEvent.VK_SHIFT);
															   
															   
															   Thread.sleep(6000);
												                
												      
												                action.contextClick(Text2).build().perform();
												        
												                Thread.sleep(2000);
												                
												                common1();
						
												                WebElement ApplyPadding1 = driver.findElement(By.cssSelector("#padding_P_1")); 

												                WebElement ApplyMargin1 = driver.findElement(By.cssSelector("#margin_P_2"));

												                WebElement Applylettspace1 = driver.findElement(By.cssSelector("#letter-spacing_P_3"));

												                WebElement ApplyWrdspace1 = driver.findElement(By.cssSelector("#word-spacing_P_4"));

												                WebElement ApplyLineHeght1 = driver.findElement(By.cssSelector("#line-height_P_5"));

												                WebElement ApplyTxtIndent1 = driver.findElement(By.cssSelector("#text-indent_P_6"));

												                WebElement Display1 = driver.findElement(By.cssSelector("#display_P_7"));

												                WebElement Float1 = driver.findElement(By.cssSelector("#float_P_8"));

												                WebElement Width1 = driver.findElement(By.cssSelector("#width_P_9"));
												                
												                
												                System.out.println("Below Are the Values of Edit Properties Popup After Changed");
												                
												                
												                
												                
												                // Get the Values from Edit Properties Popup
												                String padding = ApplyPadding1.getAttribute("value");
												                System.out.println("Padding Value is"+" "+padding);
												                
												                String Margin =  ApplyMargin1.getAttribute("value");
												                System.out.println("Margin Value is"+" "+Margin);
				
												                String letterspacing = Applylettspace1.getAttribute("value");
												                System.out.println("Letterspacing Value is"+" "+letterspacing);
												                
												                String wordspacing = ApplyWrdspace1.getAttribute("value");
												                System.out.println("Wordspacing Value is"+" "+wordspacing);
												                
												                String lineheigt = ApplyLineHeght1.getAttribute("value");
												                System.out.println("Lineheigt Value is"+" "+lineheigt);
												                
												                String txtindent = ApplyTxtIndent1.getAttribute("value");
												                System.out.println("Textindent Value is"+" "+txtindent);
												                
												                String disply = Display1.getAttribute("value");
												                System.out.println("Display Value is"+" "+disply);
												                
												                String floaat = Float1.getAttribute("value");
												                System.out.println("Float Value is"+" "+floaat);
												                
												                String width = Width1.getAttribute("value");
												                System.out.println("Width Value is"+" "+width);
												                
												                 
												                 
					
															
															  /*String padding1 = Text2.getCssValue("padding-top");
															  String padding2 = Text2.getCssValue("padding-right");
															  String padding3 = Text2.getCssValue("padding-bottom");
															  String padding4 = Text2.getCssValue("padding-left");
															  
															  
															  String padding = padding1+" "+padding2+" "+padding3+" "+padding4;
;															  
															  System.out.println("Padding Value is"+" "+padding1+" "+padding2+" "+padding3+" "+padding4);
															   
															   Thread.sleep(1000);
															   
															      String Margin1 = Text2.getCssValue("margin-top");
																  String Margin2 = Text2.getCssValue("margin-right");
																  String Margin3 = Text2.getCssValue("margin-bottom");
																  String Margin4 = Text2.getCssValue("margin-left");

																  String Margin = Margin1+" "+Margin2+" "+Margin3+" "+Margin4;
															   
																  System.out.println("Margin Value is"+" "+Margin1+" "+Margin2+" "+Margin3+" "+Margin4);
															   
															   Thread.sleep(1000);

															   String letterspacing = Text2.getCssValue("letter-spacing");
															   System.out.println("Letterspacing Value is"+" "+letterspacing);
															   
															   
															   Thread.sleep(1000);

															   String wordspacing = Text2.getCssValue("word-spacing");
															   System.out.println("Wordspacing Value is"+" "+wordspacing);
															   
															   Thread.sleep(1000);

															   String lineheigt = Text2.getCssValue("line-height");
															   System.out.println("Lineheigt Value is"+" "+lineheigt);
															   
															   Thread.sleep(1000);

															   String txtindent = Text2.getCssValue("text-indent");
															   System.out.println("Textindent Value is"+" "+txtindent);
															   
															   
															   Thread.sleep(1000);

															   String disply = Text2.getCssValue("display");
															   System.out.println("Display Value is"+" "+disply);
															   
															   
															   Thread.sleep(1000);

															   String floaat = Text2.getCssValue("float");
															   System.out.println("Float Value is"+" "+floaat);
															   
															   Thread.sleep(1000);

															   String width = Text2.getCssValue("width");
															   System.out.println("Width Value is"+" "+width);
															   */
												                
															   Thread.sleep(3000);
															   
															   
															   
															   if ((padding.equals("2px 3px 4px 5px")) && (letterspacing.equals("4px")) && (wordspacing.equals("5px")) && (lineheigt.equals("25.6px")) && (txtindent.equals("20px")) && (disply.equals("table-cell")) && (floaat.equals("none")) && (width.equals("400px")))

															   {

															   System.out.println("All Font Properties Applied to Text successfully");

															   }


															  else {
															   	

																  System.out.println("All Font Properties Not Applied to Text successfully");
															   
															      }		
															   
             }
														   catch( Exception e)
															
															{
															
																
																System.out.println("The error Message is " + e);
																throw(e);
														
															}		 		   
														   
														   
														   
								   
   
			                                         }		
			
		
			
		
		
		//Insert Image
		
		public void insertImage() throws InterruptedException, AWTException {
			
			
			
			WebElement Text2 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div[1]/de[1]/h2/strong"));
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
		 	Actions action = new Actions(driver);
		 	js.executeScript("arguments[0].scrollIntoView(true);",Text2);
			

	  		 Thread.sleep(2000);
			 Robot bot = new Robot();
			 
			 
			 Point p = Text2.getLocation();
             int x = p.getX();
             int y = p.getY();
             Dimension d = Text2.getSize();
             int h = d.getHeight();
             int w = d.getWidth();
             
             bot.mouseMove(x + (w/2), y+(h/2) +80);
             bot.mousePress(KeyEvent.BUTTON1_MASK);//click function
             bot.mouseRelease(KeyEvent.BUTTON1_MASK);

             Thread.sleep(4000);
             
			 bot.keyPress(KeyEvent.VK_END);
			 
			 bot.keyPress(KeyEvent.VK_SHIFT);
			 bot.keyPress(KeyEvent.VK_F10);
			 
			 bot.keyRelease(KeyEvent.VK_SHIFT);
			 bot.keyRelease(KeyEvent.VK_F10);

			 Thread.sleep(5000);

			
	  		  
			  
			      // Right Click Operations
				 
				 action.contextClick().build().perform();
				 
				 Thread.sleep(4000);
				 
				  //Click Insert Image
	    	  
	    	  js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
	    			  driver.findElement(By.xpath("/html/body/div[13]/ul/li[13]")));
	    	  
	    	  Thread.sleep(3000);
					  
					  driver.findElement(By.xpath("/html/body/div[13]/ul/li[13]")).click();
					  
					  
					  Thread.sleep(5000);
	              
				  
				  //Select an Image
					  
					  
					  String imagepath1 = driver.findElement(By.xpath("//*[@id='dataSourceTree_8_a']")).getAttribute("href").toString();
					  
					  System.out.println("Path of the Image Before Applied is"+" "+imagepath1);
					  
					  
				  
				  
				  js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
	    			  driver.findElement(By.xpath("//*[@id='dataSourceTree_8_span']"))); 
				  
				  Thread.sleep(3000);
				  driver.findElement(By.xpath("//*[@id='dataSourceTree_8_span']")).click();
				  

					  
		
	                  Thread.sleep(5000);
					  
					  js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
	    			  driver.findElement(By.xpath("//*[@id='save']")));
	    	  
	    	  
	    	  driver.findElement(By.xpath("//*[@id='save']")).click();
			  
			  //Verify the Path of Selected Image
			  
			  String imagepath2 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div[1]/de[1]/h2/strong/img")).getAttribute("src").toString();
			  
			 System.out.println("Path of the Image After Applied is"+" "+imagepath2);
			 
			 
			 if ((imagepath1).equals(imagepath2)) {
				 
				 
				 System.out.println("Successfully Inserted Image");
				 
			 }
			 
			 else {
				 
				 
				 System.out.println("Failed To Insert Image");
				 
			 }
			
			
			
		}
		
		
		
		
	// Insert Video
     public void insertVideo() throws InterruptedException, AWTException {
			
    	 
    	 WebElement Text2 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div[1]/de[1]/h2/strong"));
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
		 	Actions action = new Actions(driver);
		 	js.executeScript("arguments[0].scrollIntoView(true);",Text2);
			

	  		 Thread.sleep(2000);
			 Robot bot = new Robot();
			 
			 
			 Point p = Text2.getLocation();
          int x = p.getX();
          int y = p.getY();
          Dimension d = Text2.getSize();
          int h = d.getHeight();
          int w = d.getWidth();
          
          bot.mouseMove(x + (w/2), y+(h/2) +80);
          bot.mousePress(KeyEvent.BUTTON1_MASK);//click function
          bot.mouseRelease(KeyEvent.BUTTON1_MASK);

          Thread.sleep(4000);
          
			 bot.keyPress(KeyEvent.VK_END);
			 
			 bot.keyPress(KeyEvent.VK_SHIFT);
			 bot.keyPress(KeyEvent.VK_F10);
			 
			 bot.keyRelease(KeyEvent.VK_SHIFT);
			 bot.keyRelease(KeyEvent.VK_F10);

			 Thread.sleep(5000);

			
	  		  
			  
			      // Right Click Operations
				 
				 action.contextClick().build().perform();
				 
				 Thread.sleep(4000);
				 
				  //Click Insert Video
	    	  
	    	  js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
	    			  driver.findElement(By.xpath("/html/body/div[13]/ul/li[14]")));
	    	  
	    	  Thread.sleep(3000);
					  
					  driver.findElement(By.xpath("/html/body/div[13]/ul/li[14]")).click();
					  
					  
					  Thread.sleep(5000);
	              
				  
				  //Select an Video  
					  
					  
					  String videopath1 = driver.findElement(By.xpath("//*[@id='dataSourceTree_2_a']")).getAttribute("href").toString();
					  
					  System.out.println("Path of the Image Before Applied is"+" "+videopath1);
					  

				  js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
	    			  driver.findElement(By.xpath("//*[@id='dataSourceTree_2_span']"))); 
				  
				  Thread.sleep(3000);
				  driver.findElement(By.xpath("//*[@id='dataSourceTree_2_span']")).click();
				  


	                  Thread.sleep(5000);
					  
					  js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
	    			  driver.findElement(By.xpath("//*[@id='save']")));
	    	  
	    	  
	    	  driver.findElement(By.xpath("//*[@id='save']")).click();
			  
			  //Verify the Path of Selected Image
			  
			  String videopath2 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div[1]/de[1]/h2/strong/video")).getAttribute("src").toString();
			  
			 System.out.println("Path of the Image After Applied is"+" "+videopath2);
			 
			 
			 if ((videopath1).equals(videopath2)) {
				 
				 
				 System.out.println("Successfully Inserted Image");
				 
			 }
			 
			 else {
				 
				 
				 System.out.println("Failed To Insert Image");
				 
			 }
			

			
			
		}
		
		

					//Enter Actions 
		
		
		public void EnterActions() throws InterruptedException, AWTException {
			
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
			//Copy And paste Starts
			WebElement para12 = driver.findElement(By.cssSelector("#about_us > div:nth-child(2) > p:nth-child(12)"));
			
			Actions action = new Actions(driver);

			//Select the Paragraph Text
						action.moveToElement(para12, 0, 0)
				        .clickAndHold()
				        .moveByOffset(1150, 0)
				        .release()
				        .perform();



			Thread.sleep(5000);
			
			
			Actions actions = new Actions(driver);
			actions.moveToElement(para12);
			
			
			Robot rb1 = new Robot(); 
			rb1.keyPress(KeyEvent.VK_CONTROL);
			rb1.keyPress(KeyEvent.VK_C);
			rb1.keyRelease(KeyEvent.VK_CONTROL);
			rb1.keyRelease(KeyEvent.VK_C);
			
			
			
			Thread.sleep(4000);

			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);

			Thread.sleep(3000);

			 
            // Paragraph Option in Right Click
			WebElement selectPara = driver.findElement(By.xpath("/html/body/div[14]/ul/li[1]"));
			
			
			js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
	    			selectPara );
	    	Thread.sleep(1000);

	    	//selectPara.click();
	    	
	    	robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);

			Thread.sleep(4000);
			
			
			for (int j=13; j<=20; j++) {
				
				
				
				if ( j == 15) {
					
				
					WebElement h1 = driver.findElement(By.cssSelector("#about_us > div:nth-child(2) > h1"));  
					Robot rb = new Robot(); 
					rb.keyPress(KeyEvent.VK_CONTROL);
					rb.keyPress(KeyEvent.VK_V);
					rb.keyRelease(KeyEvent.VK_CONTROL);
					rb.keyRelease(KeyEvent.VK_V);
					WebElement descriptionEle = h1.findElement(By.tagName("h1"));

					  String descriptionText = descriptionEle.getText();
					  System.out.println(descriptionText);
					
					
					
				}
				
				else if ( j == 16 ) {
					
					WebElement h2 = driver.findElement(By.cssSelector("#about_us > div:nth-child(2) > h2")); 
					Robot rb = new Robot(); 
					rb.keyPress(KeyEvent.VK_CONTROL);
					rb.keyPress(KeyEvent.VK_V);
					rb.keyRelease(KeyEvent.VK_CONTROL);
					rb.keyRelease(KeyEvent.VK_V);
				}
				
				
               else if ( j == 17 ) {
					
					WebElement h3 = driver.findElement(By.cssSelector("#about_us > div:nth-child(2) > h3")); 
					Robot rb = new Robot(); 
					rb.keyPress(KeyEvent.VK_CONTROL);
					rb.keyPress(KeyEvent.VK_V);
					rb.keyRelease(KeyEvent.VK_CONTROL);
					rb.keyRelease(KeyEvent.VK_V);
				}
				
               else if ( j == 18 ) {
					
					WebElement h4 = driver.findElement(By.cssSelector("#about_us > div:nth-child(2) > h4")); 
					Robot rb = new Robot(); 
					rb.keyPress(KeyEvent.VK_CONTROL);
					rb.keyPress(KeyEvent.VK_V);
					rb.keyRelease(KeyEvent.VK_CONTROL);
					rb.keyRelease(KeyEvent.VK_V);
				}
				
               else if ( j == 19 ) {
					
					WebElement h5 = driver.findElement(By.cssSelector("#about_us > div:nth-child(2) > h5")); 
					Robot rb = new Robot(); 
					rb.keyPress(KeyEvent.VK_CONTROL);
					rb.keyPress(KeyEvent.VK_V);
					rb.keyRelease(KeyEvent.VK_CONTROL);
					rb.keyRelease(KeyEvent.VK_V);
				}
				
               else if ( j == 20 ) {
            	   
            
					WebElement h5 = driver.findElement(By.cssSelector("#about_us > div:nth-child(2) > h6")); 
					Robot rb = new Robot(); 
					rb.keyPress(KeyEvent.VK_CONTROL);
					rb.keyPress(KeyEvent.VK_V);
					rb.keyRelease(KeyEvent.VK_CONTROL);
					rb.keyRelease(KeyEvent.VK_V);
				}
				
				
				
				else {
				
	
				WebElement para1 = driver.findElement(By.cssSelector("#about_us > div:nth-child(2) > p:nth-child("+j+")"));
				
				Robot rb = new Robot(); 
				rb.keyPress(KeyEvent.VK_CONTROL);
				rb.keyPress(KeyEvent.VK_V);
				rb.keyRelease(KeyEvent.VK_CONTROL);
				rb.keyRelease(KeyEvent.VK_V);
				
				}
				
		       if ( j == 20 ) {
		    	   
		    	   Robot rb = new Robot(); 
		    	   rb.keyRelease(KeyEvent.VK_CONTROL);
					rb.keyRelease(KeyEvent.VK_V); 
		       }
				
		       
		       else {
			
							
							Thread.sleep(5000);

			
				Robot robot1 = new Robot();
				robot1.keyPress(KeyEvent.VK_ENTER);
				robot1.keyRelease(KeyEvent.VK_ENTER);
				
				
				if ( j >=14 )
					
					
				{
					
					
					int k = j -10;
					
					
					
					WebElement Enteroptions = driver.findElement(By.xpath("/html/body/div[14]/ul/li["+k+"]"));  

					js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
							Enteroptions );
								    	Thread.sleep(1000);
								    	
								    	Enteroptions.click();

					
										Thread.sleep(5000);
				
					
				}
				
				
				
				else {
				
				int k = j -11;
				
				
				
				WebElement Enteroptions = driver.findElement(By.xpath("/html/body/div[14]/ul/li["+k+"]"));  

				js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
						Enteroptions );
							    	Thread.sleep(1000);
							    	
							    	Enteroptions.click();

				//selectPara.click();
							    	
							    	/*robot.keyPress(KeyEvent.VK_ENTER);
									robot.keyRelease(KeyEvent.VK_ENTER);
									*/
									Thread.sleep(5000);
				
				
				//para1.sendKeys(Keys.chord(Keys.CONTROL, "v"));
				

				//para1.sendKeys(Keys.CONTROL+ "v");

		       }
									
									
									
									
		       }}
			
			
			
		
		
		}
		
					
		

	
	
	//Common Methods
		
		
		
		public static String getAbsoluteXPath(WebElement element)
	    {
	        return (String) ((JavascriptExecutor) driver).executeScript(
	                "function absoluteXPath(element) {"+
	                        "var comp, comps = [];"+
	                        "var parent = null;"+
	                        "var xpath = '';"+
	                        "var getPos = function(element) {"+
	                        "var position = 1, curNode;"+
	                        "if (element.nodeType == Node.ATTRIBUTE_NODE) {"+
	                        "return null;"+
	                        "}"+
	                        "for (curNode = element.previousSibling; curNode; curNode = curNode.previousSibling){"+
	                        "if (curNode.nodeName == element.nodeName) {"+
	                        "++position;"+
	                        "}"+
	                        "}"+
	                        "return position;"+
	                        "};"+

	    "if (element instanceof Document) {"+
	    "return '/';"+
	    "}"+

	    "for (; element && !(element instanceof Document); element = element.nodeType ==Node.ATTRIBUTE_NODE ? element.ownerElement : element.parentNode) {"+
	    "comp = comps[comps.length] = {};"+
	    "switch (element.nodeType) {"+
	    "case Node.TEXT_NODE:"+
	    "comp.name = 'text()';"+
	    "break;"+
	    "case Node.ATTRIBUTE_NODE:"+
	    "comp.name = '@' + element.nodeName;"+
	    "break;"+
	    "case Node.PROCESSING_INSTRUCTION_NODE:"+
	    "comp.name = 'processing-instruction()';"+
	    "break;"+
	    "case Node.COMMENT_NODE:"+
	    "comp.name = 'comment()';"+
	    "break;"+
	    "case Node.ELEMENT_NODE:"+
	    "comp.name = element.nodeName;"+
	    "break;"+
	    "}"+
	    "comp.position = getPos(element);"+
	    "}"+

	    "for (var i = comps.length - 1; i >= 0; i--) {"+
	    "comp = comps[i];"+
	    "xpath += '/' + comp.name.toLowerCase();"+
	    "if (comp.position !== null) {"+
	    "xpath += '[' + comp.position + ']';"+
	    "}"+
	    "}"+

	    "return xpath;"+

	"} return absoluteXPath(arguments[0]);", element);
	    }


	
	
	
	public void copy_paste() throws InterruptedException, AWTException {
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
			
			
		//Copy And paste Starts
		WebElement para = driver.findElement(By.cssSelector("#about_us > div:nth-child(2) > p"));
		
		Actions action = new Actions(driver);

		//Select the Paragraph Text
					action.moveToElement(para, 0, 0)
			        .clickAndHold()
			        .moveByOffset(1150, 0)
			        .release()
			        .perform();



		Thread.sleep(5000);
		
		
		Actions actions = new Actions(driver);
		actions.moveToElement(para);
		
		
		Robot rb1 = new Robot(); 
		rb1.keyPress(KeyEvent.VK_CONTROL);
		rb1.keyPress(KeyEvent.VK_C);
		rb1.keyRelease(KeyEvent.VK_CONTROL);
		rb1.keyRelease(KeyEvent.VK_C);

		
		
		/*actions.sendKeys(Keys.CONTROL, "c");
		actions.build().perform();
		*/
					 
					 //Right Click the Element for menu options
				/*	 action.contextClick(para).build().perform();
					
					 Thread.sleep(5000);
					 
					 
					//Mouse over on copy

		WebElement copy = driver.findElement(By.xpath("/html/body/div[14]/ul/li[1]"));

		action.moveToElement(copy ).build().perform();

		Thread.sleep(3000);

		js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
					    			copy);
					    	Thread.sleep(1000);


		copy.click();

*/
		Thread.sleep(4000);

		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(3000);


		WebElement selectPara = driver.findElement(By.xpath("/html/body/div[14]/ul/li[1]"));

		js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
					    			selectPara );
					    	Thread.sleep(1000);

		//selectPara.click();
					    	
					    	robot.keyPress(KeyEvent.VK_ENTER);
							robot.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(4000);

		for (int j=2; j<=12; j++) {
			
		
			
			WebElement para1 = driver.findElement(By.cssSelector("#about_us > div:nth-child(2) > p:nth-child("+j+")"));
			
			
			/*Actions actions1 = new Actions(driver);
			actions1.moveToElement(para1);
			actions1.click();
			*/
			Robot rb = new Robot(); 
			rb.keyPress(KeyEvent.VK_CONTROL);
			rb.keyPress(KeyEvent.VK_V);
			rb.keyRelease(KeyEvent.VK_CONTROL);
			rb.keyRelease(KeyEvent.VK_V);
			
			
			
	       if ( j == 12 ) {
	    	   
	    	   
	    	   rb.keyRelease(KeyEvent.VK_CONTROL);
				rb.keyRelease(KeyEvent.VK_V); 
	       }
			
	       
	       else {
			
			/*
			Actions actions1 = new Actions(driver);
			actions1.moveToElement(para1);
			actions1.click();
			
			actions1.sendKeys(Keys.CONTROL, "v");
			actions1.build().perform();
			*/
			//Thread.sleep(3000);
			
			

			//Select the Paragraph Text
						/*action.moveToElement(para1, 0, 0)
				        .clickAndHold()
				        .moveByOffset(1150, 0)
				        .release()
				        .perform();
						*/
						
						Thread.sleep(5000);

			
						//Right Click the Element for menu options
						/* action.contextClick(para1).build().perform();
						
						 Thread.sleep(3000);
						 
						 
						//Mouse over on copy

			WebElement copy1 = driver.findElement(By.xpath("/html/body/div[14]/ul/li[1]"));

			action.moveToElement(copy1 ).build().perform();

			Thread.sleep(3000);

			js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
					copy1);
						    	Thread.sleep(1000);


						    	copy1.click();


			Thread.sleep(4000);			
*/						
						
			
			Robot robot1 = new Robot();
			robot1.keyPress(KeyEvent.VK_ENTER);
			robot1.keyRelease(KeyEvent.VK_ENTER);
			
			WebElement selectPara2 = driver.findElement(By.xpath("/html/body/div[14]/ul/li[1]"));

			js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
					selectPara2 );
						    	Thread.sleep(1000);

			//selectPara.click();
						    	
						    	robot.keyPress(KeyEvent.VK_ENTER);
								robot.keyRelease(KeyEvent.VK_ENTER);
								
								Thread.sleep(5000);
			
			
			//para1.sendKeys(Keys.chord(Keys.CONTROL, "v"));
			

			//para1.sendKeys(Keys.CONTROL+ "v");

								
								
	       }

			}
		
		


		
		}
	
	
	
	
	
	
		
		
	
	
	
	
	public void common1() throws InterruptedException
	
	
	{
		Actions action = new Actions(driver);
				 
		 Thread.sleep(5000);
	    
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 
		 
	    //Mouse over on Edit Properties and click it
	    
	    WebElement editProperties = driver.findElement(By.xpath("/html/body/div[13]/ul/li[13]")); 
	    
	    action.moveToElement(editProperties).build().perform();
	    
	    js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
	    		editProperties);
		    Thread.sleep(3000);
		    
		    editProperties.click();
		 
		 Thread.sleep(7000);
		 
		
	}

	

	public void common_method() throws InterruptedException, AWTException {
		
    //WebElement un = driver.findElement(By.xpath("//*[@id=\"about_us\"]/ul/li[2]/u/b/i/font"));
		
		WebElement un = driver.findElement(By.xpath("//*[@id=\"about_us\"]/p[1]/b/font"));
    

    Actions action = new Actions(driver);
		
    /*action.moveToElement(un, 0, 0)
    .clickAndHold()
    .moveByOffset(100, 0)
    .release()
    .perform();
    
    Thread.sleep(5000);
	 */
	 action.contextClick(un).build().perform();
	
    
    
		/*int xaxis = un.getLocation().x;
		 
		int yaxis=un.getLocation().y;
		 
		int width = un.getSize().width;
		int height= un.getSize().height;
		 
		Robot r=new Robot();
		r.mouseMove(xaxis+width/2, yaxis+height/2+70);
		r.mousePress(InputEvent.BUTTON3_MASK);
	    r.mouseRelease(InputEvent.BUTTON3_MASK);*/
	    
	    
	    Thread.sleep(4000);
	    
	    
	    WebElement color = driver.findElement(By.xpath("/html/body/div[14]/ul/li[8]"));
	    
	    int xaxis1 = color.getLocation().x;
	     
	    int yaxis1=color.getLocation().y;
	     
	    int width1 = color.getSize().width;
	    int height1= color.getSize().height;
	     
	    Robot r1=new Robot();
	    r1.mouseMove(xaxis1+width1/2, yaxis1+height1/2+70);
	    
	    Thread.sleep(10000);
		
		
	}
	
}
