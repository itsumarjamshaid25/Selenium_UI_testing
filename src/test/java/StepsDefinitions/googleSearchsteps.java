//package StepsDefinitions;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.en.*;
//
//public class googleSearchsteps {
//
//	
//	WebDriver driver=null;
//	
//	@Given("browser is open")
//	public void browser_is_open() {
//		String projectPath=System.getProperty("user.dir");
//		System.out.println("ProjectPath is:"+projectPath);
//		
//		System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/drivers/chromedriver.exe");
//		driver=new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
//		driver.manage().timeouts().pageLoadTimeout(4, TimeUnit.SECONDS);
//		//driver.manage().window().maximize();
//	  
//	}
//
//	@And("user is on search page")
//	public void user_is_on_search_page() {
//		driver.navigate().to("https://google.com");
//		
//	  
//	}
//
//	@When("user enter the text in search bar")
//	public void user_enter_the_text_in_search_bar() {
//		driver.findElement(By.name("q")).sendKeys("vertexspecial.com");
//	
//	}
//	@And("hit on search button")
//	public void hit_on_search_button() {
//       driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
//	}
//    @When("user navigate on search result Screen")
//    
//	@Then("User  is navigate on search result screen")
//    public void user_is_navigate_on_search_screen() throws InterruptedException {
//		Thread.sleep(4000);
//    	driver.navigate().to("https://vertexspecial.com");
//		
//		
//    }
//	public void user_is_navigate_on_search_result_screen() {
//		driver.getPageSource().contains("vertex Special Technologies");
//		driver.close();
//		driver.quit();
//	   
//	}
//
//
//
//}
