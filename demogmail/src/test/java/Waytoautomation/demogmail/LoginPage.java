package Waytoautomation.demogmail;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class LoginPage extends Base
{
	//Page factory = OR:
		@FindBy(id="identifierId")
		WebElement Email;
		
		@FindBy(id="identifierNext")
		WebElement nextBtn;
		
		
//		@FindBy(xpath="$x("//input[@name='password'][@type='password']")")
//		WebElement password;
		
//		@FindBy(id="passwordNext")
		@FindBy(xpath="$x(//span[@name='Next']")
		WebElement nextBtn1;
		
		@FindBy(xpath="//span[class(text(),'Create account')]")
		WebElement createbtn;
		
		@FindBy(id="logo")
		WebElement googlelogo;

		//Initializing the Page objects/Factory/OR:
		public LoginPage() {
			PageFactory.initElements(driver, this);
		}
		
		//Action:
		public String validateLoginPageTitle() {
			return driver.getTitle();
		}
		
		public boolean validateGoogleImage() {
			return googlelogo.isDisplayed();
		}
		
//			public HomePage login(String un,String pwd) {
//				Email.sendKeys(un);
//				nextBtn.click();
//				password.sendKeys(pwd);
//				nextBtn1.click();
//				return new HomePage();
				
			
	
}
