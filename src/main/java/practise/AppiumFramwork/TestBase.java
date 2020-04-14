package practise.AppiumFramwork;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class TestBase {

	public static AndroidDriver<AndroidElement> getDependencies(String appName) throws IOException{
		
		AndroidDriver<AndroidElement> driver;
		//AppiumDriver driver;
		
		FileInputStream  fis= new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\practise\\AppiumFramwork\\config.properties");
		//FileInputStream  fis= new FileInputStream("C:\\Users\\User\\eclipse-workspace\\AppiumFramwork\\src\\main\\java\\practise\\AppiumFramwork\\config.properties");
		
		Properties prop = new Properties();
		prop.load(fis);
		
		File appDirectory= new File("src");
		File app= new File(appDirectory, (String) prop.get(appName));
		
		DesiredCapabilities capabilities=new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, prop.get("devicename"));
		capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		//capabilities.setCapability(MobileCapabilityType.BROWSER_NAME,"chrome");
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
		capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "80");
		
		URL url=new URL("http://127.0.0.1:4723/wd/hub");
	     driver = new AndroidDriver<AndroidElement>(url, capabilities);
		
		return driver;		
		
	}
}
