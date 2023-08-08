//package Pagefactory;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.CacheLookup;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//
//public class LoginPage_PF {
//
//	WebDriver driver;
//
//	//create constructor here soo that to maintain the session
//
//
//	public LoginPage_PF(WebDriver driver) {
//		this.driver=driver;
//
//		//and addition in PF which is not present in POM
//		//here this keyword is used to reffer this class
//		PageFactory.initElements(driver,this);
//
//
//
//	}
//
//	//here i am creating locators with the help of findBy
//	@FindBy(xpath="//input[@id='email']")
//	WebElement txt_Username;
//
//	//here we can use cache lookup
//	//@CacheLookup
//
//	//here i am  initilized the web element
//
//
//	@FindBy(xpath="//input[@id='pass']")
//	WebElement txt_password;
//
//	@FindBy(xpath="//button[@id='loginbutton']")
//    WebElement Btn_button;
//
//
//	public void enterUsername(String username) {
//		txt_Username.sendKeys(username);
//
//
//
//	}
//	public void EnterPassword(String password) {
//		// TODO Auto-generated method stub
//		txt_password.sendKeys(password);
//
//
//	}
//
//
//
//
//
//    public void click_on_login_button() {
//    	Btn_button.click();
//
//
//
//
//    }
//    //i am not creating checkstroies method her e bcz we discuss everpage have single class
////    public void checksories() {
////
////
////
////
////
////
////    }
////
//
//
//}
