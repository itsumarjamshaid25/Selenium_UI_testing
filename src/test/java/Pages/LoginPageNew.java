  package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageNew {
	
//	According to POM structure we place all the method and locator in a single file and in other file we place  only objects 
	WebDriver driver;
	By txt_Username=By.xpath("//input[@id='email']");
    By txt_password=By.xpath("//input[@id='pass']");
    By Btn_login=By.xpath("//button[@id='loginbutton']");
    //By pg_Stories=By.xpath("//span[contains(text(),'Stories')]");
    
    //now to connect this file with loginSteps you have to create a constructor
    public LoginPageNew(WebDriver driver) {
    	this.driver=driver;
    	
    	
    	
    }
    
 
    //here i created methods and we can create a single method also 
    
public void enterUsername(String Username) {
	
	driver.findElement(txt_Username).sendKeys(Username);
	
	
	
	
	
} 
public void enterpassword(String password) {
	driver.findElement(txt_password).sendKeys(password);
	
}

public void clickloginbutton() {
	
	driver.findElement(Btn_login).click();
	
	
	
}
public void checkStories() {
	
	//driver.findElement(pg_Stories).isDisplayed();
	driver.getPageSource().contains("Stories");
}




//in a good practice we can create a single function for all the top functionallities
public void loginwithvaliduser(String Username,String password) {
	
	driver.findElement(txt_Username).sendKeys(Username);
	driver.findElement(txt_password).sendKeys(password);
	driver.findElement(Btn_login).click();
	
	//driver.findElement(pg_Stories).isDisplayed();
	driver.getPageSource().contains("Stories");
	
	
	
	
	
}




}
