package Waytoautomation.demogmail;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import util.TestUtil;

public class Base 
{
	public static WebDriver driver;
	public static Properties prop;
	//public final String dbPropath = "C:" + File.separator  + "/Users/abhishek/eclipse-workspace/POMTest/src/main/java/com/gmail/qa/config/config.properties";
	
	
	public Base() {
		try {
			prop = new Properties();
			//prop.load(new FileInputStream(dbPropath));
			FileInputStream ip = new FileInputStream(System.getProperty(("user.dir")+"/demogmail/src/main/java/Waytoautomation/demogmail/config/config.properties"));
			//prop.load(ip);
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void initialization() {
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("chrome")) {
			//System.out.println(System.getProperty("user.dir"));
			
			System.setProperty("webdriver.chrome.driver","C:/Users/abhishek/eclipse-workspace/POMTest/Driver/chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browserName.equals("FF")) {
			System.setProperty("webdriver.gecko.driver","geckodriver.exe");
			driver = new FirefoxDriver();
			
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}

}
