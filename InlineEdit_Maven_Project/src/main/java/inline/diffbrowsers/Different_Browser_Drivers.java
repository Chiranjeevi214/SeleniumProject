package inline.diffbrowsers;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
public class Different_Browser_Drivers {
	
		public static WebDriver driver;

		public static WebDriver getDriver(String browserName) {

			switch (browserName) {
			case "Chrome":
				System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
				ChromeOptions chromeOptions = new ChromeOptions();
				chromeOptions.addArguments("--start-maximized");
				driver = new ChromeDriver(chromeOptions);
				//driver.get("http://admin.omega.sitesuite.netstellar.com/");
				//driver.get("http://dev.console.sitesuite.netstellar.com/v2.5/index.html");
				
				driver.get("http://admin.cgq1.sitesuite.netstellar.com/");
				
				break;

			case "Firefox":
				System.out.println("FireFox");
				
				System.setProperty("webdriver.gecko.driver",
						"D:\\geckodriver-v0.24.0-win64\\geckodriver.exe");
				DesiredCapabilities dc = DesiredCapabilities.firefox();
				dc.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
				ProfilesIni prof = new ProfilesIni();				
				FirefoxProfile profile= prof.getProfile("default");
				profile.setAcceptUntrustedCertificates(true);
				driver =  new FirefoxDriver(dc);
				//driver.manage().window().setSize(new Dimension(1024, 768));
				//driver.get("https://omega.sitesuite.netstellar.com/");
				
				driver.get("http://admin.cgq1.sitesuite.netstellar.com/");
				
				//driver.get("http://admin.bdtest2.sitesuite.netstellar.com/");
				//driver.get("http://vastavamtv.com/wp-admin");
				
				
				break;

			case "InternetExplorer":

				System.setProperty("webdriver.ie.driver", "E:\\Drivers\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
				driver.get("http://signin.sitesuite.netstellar.com/signin");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				break;

			default:
				System.out.println("Browser Not Found");

			}

			return driver;

		}

	}



