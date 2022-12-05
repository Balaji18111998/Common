package c;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;


public class Common {
	
	
	public static WebDriver driver;
	public static File f = new File("/Users/apple/eclipse-workspace/redbusmavn/Or.properties");
	public static Properties prop;
	public static Logger log = Logger.getLogger(Common.class);
	public static Actions act;
	
	
	public void driverurllaunch() {
		
		String brw = prop.getProperty("browser");
		
		if(brw.equalsIgnoreCase("Chrome")) {
			
		
		System.setProperty("webdriver.chrome.driver","//Users//apple//Downloads//chromedriver");
		
		driver = new ChromeDriver();
		
		}
		else if (brw.equalsIgnoreCase("Safari"))
		{
			
			driver = new SafariDriver();
		}
		else {
			System.out.println("Browser launch error");
		}
		
		driver.get(prop.getProperty("url"));
		
		//driver.manage().window().maximize();
		
		log.info("url is launched successfully");
	}
	
	
	public void propfile() throws IOException {
		
		FileInputStream fi = new FileInputStream(f);
		
		prop = new Properties();
		
		prop.load(fi);
		
	}
	
	public void log4jfile() {
		
		int a=100;
        	PropertyConfigurator.configure("/Users/apple/eclipse-workspace/redbusmavn/lo4j.properties");	
		
		
	}
     
	public void action1() {
		
		act = new Actions(driver);
		
		
	}


}
