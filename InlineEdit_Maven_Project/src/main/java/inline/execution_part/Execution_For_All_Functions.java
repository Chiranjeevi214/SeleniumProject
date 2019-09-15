package inline.execution_part;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import inline.diffbrowsers.Different_Browser_Drivers;
import inline.inline.elements.and.methods.Methods_For_Inline_Functionalities;
import inline.methods_for_signin_signout.Methods_For_SignIn_SignOut;


public class Execution_For_All_Functions extends Different_Browser_Drivers {

	@BeforeTest
	public void browser() {
		getDriver("Firefox");

	}

	@AfterMethod
	public void Screenshot(ITestResult result) throws IOException {
		if (ITestResult.FAILURE == result.getStatus()) {
			TakesScreenshot takeScreenshot = (TakesScreenshot) driver;
			File duplicate = takeScreenshot.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(duplicate, new File("./failedScreenshots/" + result.getName() + ".png"));
			System.out.println("Screenshot has taken,please refresh your project to see the screenshots");
		}
	}

	
	Methods_For_SignIn_SignOut signin = new Methods_For_SignIn_SignOut();
	
	Methods_For_Inline_Functionalities Inlelemt = new Methods_For_Inline_Functionalities();

	@Test(priority = 0)
	public void sign_In() throws InterruptedException, AWTException {

		//Admin Page Login
		signin.signin_signout();
		

}

	@Test(priority = 1)
	public void webpage_click() throws InterruptedException, AWTException {

		Inlelemt.webpage_click();

}
	
	/*@Test(priority = 2)
	public void edit_properties_clickall() throws InterruptedException, AWTException {

		Inlelemt.editproper_all();

}*/
	
	/*@Test(priority = 2)
	public void bullets_click() throws InterruptedException, AWTException {

		Inlelemt.bullets_click();

}
	*/
	
	/*@Test(priority = 10)
	public void webpage_click1() throws InterruptedException, AWTException {

		Inlelemt.webpage_click1();

}
	*/
	
	/*@Test(priority = 3)
	public void edit_properties_clickall() throws InterruptedException, AWTException {

	Inlelemt.editproper_all();

}*/
	
	/*@Test(priority = 4)
	public void insertImage() throws InterruptedException, AWTException {

	Inlelemt.insertImage();

}	*/
	
	@Test(priority = 5)
	public void insertVideo() throws InterruptedException, AWTException {

	Inlelemt.insertVideo();

}	
	
	
	
	
	/*@Test(priority = 2)
	public void bullets_click() throws InterruptedException, AWTException {

		Inlelemt.bullets_click();

}
	*/

	/*@Test(priority = 2)
	public void bullets_click() throws InterruptedException, AWTException {

		Inlelemt.bullets_click();

}*/
	
	//Applying Inline Editing Methods
	
    /*@Test(priority = 2)
	public void family_click() throws InterruptedException, AWTException {

		Inlelemt.fontfamily_clck();

}
	
	
	@Test(priority = 3)
	public void fontsize_click() throws InterruptedException, AWTException {

		Inlelemt.fontsize_clck();
	
	}
	
	
	@Test(priority = 4)
	public void fontcolor_click() throws InterruptedException, AWTException {

		Inlelemt.fontcolor_clck();
	
	}

	
	
	@Test(priority = 5)
	public void fonttype_click() throws InterruptedException, AWTException {

		Inlelemt.fonttype_clck();
	
	}
	
	

	@Test(priority = 6)
	public void Text_Align_click() throws InterruptedException, AWTException {

		Inlelemt.textalign_clck();
	
	}
	
	
	
	@Test(priority = 7)
	public void hyperlink_click_New() throws InterruptedException, AWTException {

		Inlelemt.hyperlink_clck_for_New();
	
	}
	
	@Test(priority = 8)
	public void hyperlink_click_Exist() throws InterruptedException, AWTException {

		Inlelemt.hyperlink_clck_for_Exist();
	
	}
	
	
	@Test(priority = 9)
	public void EnterActions() throws InterruptedException, AWTException {

		Inlelemt.EnterActns();
	
	}
	
	@Test(priority = 10)
	public void InlineSave() throws InterruptedException, AWTException {

		Inlelemt.InlineSave();
	
	}*/
	
	
	//Validate Whether Inline Editing Applied or Not
	
	/*@Test(priority = 11)
	public void InlineValidate_aftersave() throws InterruptedException, AWTException {

		Inlelemt.InlineValidate_save();
	
	}*/
	
	
	/*@Test(priority = 12)
	public void InlineValidate_afterrollback() throws InterruptedException, AWTException {

		Inlelemt.InlineValidate_rollback();
	
	}*/
	
	
	
	
	
	/*@Test(priority = 10)
	public void webpage_click1() throws InterruptedException, AWTException {

		Inlelemt.webpage_click1();

}
	
	@Test(priority = 11)
	public void static_Image() throws InterruptedException, AWTException {

		Inlelemt.static_image();

}
	
	@Test(priority = 12)
	public void webpage_click2() throws InterruptedException, AWTException {

		Inlelemt.webpage_click2();

}
	
	
	@Test(priority = 13)
	public void static_Inline1() throws InterruptedException, AWTException {

		Inlelemt.static_Inline1();
	}
	*/
	
	

	/*@Test(priority = 2)
	public void hyperlink_click_Exist() throws InterruptedException, AWTException {

		Inlelemt.hyperlink_clck_for_Exist();
	
	}
	
	@Test(priority = 3)
	public void EnterActions() throws InterruptedException, AWTException {

		Inlelemt.EnterActns();
	
	}
	
	
	
	
	/*@Test(priority = 2)
	public void edit_properties_clickall() throws InterruptedException, AWTException {

		Inlelemt.editproper_all();

}*/
	

	/*@Test(priority = 2)
	public void static_Inline() throws InterruptedException, AWTException {

		Inlelemt.static_Inline();
		
		

}*/
	
	/*
	
	
	@Test(priority = 4)
	public void static_Inline1() throws InterruptedException, AWTException {

		Inlelemt.static_Inline1();

}*/

	
	
	//Static Image Inline Editing
	


 
	/*@Test(priority = 5)
	public void static_Image1() throws InterruptedException, AWTException {
		
		Inlelemt.static_image1();

		
}*/

	
/*	
	
	@Test(priority = 2)
	public void family_click1() throws InterruptedException, AWTException {

		Inlelemt.fontfamily_click1();

}
*/	

	
/*@Test(priority = 2)
	public void family_click() throws InterruptedException, AWTException {

		Inlelemt.fontfamily_clck();

}
	
	
	@Test(priority = 3)
	public void fontsize_click() throws InterruptedException, AWTException {

		Inlelemt.fontsize_clck();
	
	}
	
	
	@Test(priority = 4)
	public void fontcolor_click() throws InterruptedException, AWTException {

		Inlelemt.fontcolor_clck();
	
	}

	
	
	@Test(priority = 5)
	public void fonttype_click() throws InterruptedException, AWTException {

		Inlelemt.fonttype_clck();
	
	}
	
	

	@Test(priority = 6)
	public void Text_Align_click() throws InterruptedException, AWTException {

		Inlelemt.textalign_clck();
	
	}
	
	
	
	@Test(priority = 7)
	public void hyperlink_click_New() throws InterruptedException, AWTException {

		Inlelemt.hyperlink_clck_for_New();
	
	}*/
	

	/*@Test(priority = 2)
	public void hyperlink_click_Exist() throws InterruptedException, AWTException {

		Inlelemt.hyperlink_clck_for_Exist();
	
	}
	
	@Test(priority = 3)
	public void EnterActions() throws InterruptedException, AWTException {

		Inlelemt.EnterActns();
	
	}*/
	
	
	/*@Test(priority = 4)
	public void webpage_click1() throws InterruptedException, AWTException {

		Inlelemt.webpage_click1();

}
	
	@Test(priority = 5)
	public void static_Image() throws InterruptedException, AWTException {

		Inlelemt.static_image();

}
	
	@Test(priority = 6)
	public void webpage_click2() throws InterruptedException, AWTException {

		Inlelemt.webpage_click2();

}
	
	
	@Test(priority = 4)
	public void static_Inline1() throws InterruptedException, AWTException {

		Inlelemt.static_Inline1();
	}
	
	*/
	
	
	
	

	/*@Test(priority = 2)
	public void family_click() throws InterruptedException, AWTException {

		Inlelemt.fontfamily_click();

}*/

	
	/*
	
	@Test(priority = 2)
	public void fontsize_click() throws InterruptedException, AWTException {

		Inlelemt.fontsize_click();

}

/*	
	@Test(priority = 3)
	public void fontcolor_click() throws InterruptedException, AWTException {

		Inlelemt.fontcolor_click();

}
	

	
	@Test(priority = 4)
	public void fonttype_click() throws InterruptedException, AWTException {

		Inlelemt.fonttype_click();

}


   
   
  @Test(priority = 5)
  	public void hyperlink_click() throws InterruptedException, AWTException {

  		Inlelemt.hyperlink_click();

  }
  
  
  @Test(priority = 6)
	public void textalign_click() throws InterruptedException, AWTException {

		Inlelemt.textalign_click();

}
  
  
 @Test(priority = 7)
	public void edit_properties_click() throws InterruptedException, AWTException {

		Inlelemt.edit_properties_click();

}

 
 @Test(priority = 7)
	public void edit_properties_clickall() throws InterruptedException, AWTException {

		Inlelemt.editproper_all();

}

 
 @Test(priority = 8)
	public void EnterActions() throws InterruptedException, AWTException {

		Inlelemt.EnterActions();

}
*/ 
 
 
   
   
	
/*
	
	@Test(priority = 5)
	public void bullets_click() throws InterruptedException, AWTException {

		Inlelemt.bullets_click();

}*/
	
	
}
