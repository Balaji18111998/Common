package Commonpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Common_files {

	public WebDriver driver;
	public File f = new File("C:\\Users\\DELL\\eclipse-workspace\\Redbusmaven\\OR.Properties");
	public Properties prop;

	public void driverurllaunch() {

		String brw = prop.getProperty("browser");

		if (brw.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\DELL\\Downloads\\Selenium jars" + "\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			
			
		}
		else if (brw.equalsIgnoreCase("Firefox"))
		{System.setProperty("webdriver.geckodriver.driver","C:\\Users\\DELL\\Downloads\\Selenium jars\\drivers\\geckodriver-v0.31.0-win64\\geckodriver.exe");
	driver=new FirefoxDriver();	
		}
		else { System.out.println("Browser launch error");
		}
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();}
		
		public void propfile() throws IOException {
		
		FileInputStream fi=new FileInputStream(f);
		prop=new Properties();
		prop.load(fi);
		}
	
	
}
	


