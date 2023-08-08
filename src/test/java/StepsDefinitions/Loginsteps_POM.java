//package StepsDefinitions;
//import org.openqa.selenium.support.PageFactory;
//
//import Pages.LoginPageNew;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//
//
//import io.cucumber.java.en.*;
//public class Loginsteps_POM {
//	WebDriver driver;
//	
//	
//	@Given("user is on login  page")
//	public void user_is_on_login_page() {
//		 driver=new ChromeDriver();
//	driver.navigate().to("https://google.com");
//	driver.get("https://www.facebook.com/login");
//	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
//	driver.manage().timeouts().pageLoadTimeout(2,TimeUnit.SECONDS);
//	
//	
//	
//	}
//
//	@When("^user enter (.*)  and (.*)$")
//	public void user_enter_username_and_password(String Username,String password) {
//	
//		LoginPageNew login= new LoginPageNew(driver);
//		login.enterUsername(Username);
//		login.enterpassword(password);
//
//	}
//
//	@And("click on the submit button")
//	public void click_on_the_submit_button() throws InterruptedException {
//		
//		LoginPageNew login=new LoginPageNew(driver);
//				login.clickloginbutton();
//		//Thread.sleep(2000);
//	   
//	}
//
//	@Then("Stories option visible on the Home screen")
//	public void Stories_option_visible_on_the_Home_screen() throws InterruptedException {
//		LoginPageNew login=new LoginPageNew(driver);
//		login.checkStories();
//		
//		//Thread.sleep(2000);
//		driver.close();
//		driver.quit();
//	   
//	}
//
//
//
//}
//
