//package StepsDefinitions;
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
//
//public class samplelogin {
//
//	
//	
//	private Object SECONDS;
//	
//
//	
//	
//@Given("user is on fiverr main page")
//	public void user_is_on_fiverr_main_page() { 
//	
//	WebDriver driver=new ChromeDriver();
//	
//	driver.navigate().to("https://google.com");
//	driver.findElement(By.name("q")).sendKeys("Fiverr.com");
//	driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
//	driver.get("https://www.Fiverr.com");
//	//driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
//	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//	
//	driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
//	
//	}
//
////@When("user is on join fiverr popup")
////
////public void user_is_on_join_fiverr_popup() throws InterruptedException {
////	Thread.sleep(8000); 
////	driver.findElement(By.xpath("//header/div[1]/div[1]/nav[1]/ul[1]/li[5]/a[1]")).click();
////	
////      
////}
//
//@And("user click on the signin button")
//public void user_click_on_the_signin_button() throws InterruptedException {
//
//driver.findElement(By.xpath("//header/div[1]/div[1]/nav[1]/ul[1]/li[5]/a[1]")).click();
//Thread.sleep(2000);
//}
//@And("user is on the  login Page")
//public void user_is_on_the_login_Page() throws InterruptedException  {
//	driver.findElement(By.id("px-captcha")).isDisplayed();
//	WebElement element = driver.findElement(By.id("DQfXrkWXLAzkxpP"));
//	Actions actions = new Actions(driver);
//
//	// Perform the click and hold action on the element
//	actions.clickAndHold(element).perform();
//	Thread.sleep(6000);
//	
//}
//
//@When("user enter the email password")
//public void user_enter_the_email_password()  throws InterruptedException {
//	driver.findElement(By.xpath("//input[@id='login']")).sendKeys("umarjamshaid444@gmail.com");
//	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Umaranta1133");
//	Thread.sleep(1000);
//}
//
//@And("click on the sign in button")
//public void click_on_the_sign_in_button() throws InterruptedException {
//    driver.findElement(By.xpath("//body/div[7]/div[1]/section[1]/form[1]/div[1]/button[1]")).sendKeys(Keys.ENTER);
//   Thread.sleep(2000);
//}
//
//@Then("user is on the home page of website")
//public void user_is_on_the_home_page_of_website() {
//   driver.findElement(By.xpath("//body/div[@id='main-wrapper']/div[3]/section[1]/div[1]/article[1]/div[1]/form[1]/div[8]/input[1]")).isDisplayed();
//   driver.close();
//   driver.quit();
//}
//
//
//
//}
