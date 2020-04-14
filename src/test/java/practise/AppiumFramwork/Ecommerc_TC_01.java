package practise.AppiumFramwork;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageObject.HomePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class Ecommerc_TC_01 extends TestBase{
	
	@AndroidFindBy(className="android.widget.Spinner")
	public WebElement dropdownlist;
	
	public static void main(String[] arg) throws IOException, InterruptedException {
		
	
		
		AndroidDriver<AndroidElement> driver= getDependencies("generalstoreappname");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		HomePage hpage= new HomePage(driver);
		WebDriverWait wait = new WebDriverWait(driver,20);
		
		try {
			
			//wait.until(ExpectedConditions.visibilityOf(hpage.textbox));
			//hpage.nametextbox.sendKeys("Neha Singh");
			
			
		}catch(Exception ex) { ex.printStackTrace();}
		
	    // hpage.textbox1.sendKeys("Hello");
		//hpage.getNameField().sendKeys("Neha Singh");
		
		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Hello");
		//driver.findElementByXPath("//*[@text='Enter name here']");
		
		//driver.hideKeyboard();
		
		//Thread.sleep(20000);
		//hpage.dropdownlist.click();
		
		//driver.findElementByAndroidUIAutomator("new uiScrollable(new uiSelector().scrollIntoView(text(\"Bahrain\")))");		
	
	}

}
