package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomePage {
	
	WebDriverWait wait;
	public HomePage(AndroidDriver<AndroidElement> driver) {
		PageFactory.initElements(driver, this);	
		wait=new WebDriverWait(driver,30);
	}
	
	//@AndroidFindBy(xpath="//*[@text='Enter name here']")
	@AndroidFindBy(id="com.androidsample.generalstore:id/nameField")
	public AndroidElement textbox1;
	
	@AndroidFindBy(className="android.widget.Spinner")
	public WebElement dropdownlist;
	
	public WebElement getNameField() {
		 wait.until(ExpectedConditions.visibilityOf(textbox1));
		return textbox1;
	}

}
