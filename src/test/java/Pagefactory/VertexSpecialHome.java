package Pagefactory;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VertexSpecialHome {

    private JavascriptExecutor jsExecutor;
    WebDriver driver;

    //create constructor so that it will
    public VertexSpecialHome(WebDriver driver) {
        this.driver=driver;
        //new to add some code which is only ava in PF concepts

        //this line is used to direct this class page factory provide you an inti
        // element class it will initilized when the object is call and all the locators will initilized with it
          PageFactory.initElements(driver,this);



    }

    //here we declare the locators
    @FindBy(xpath="//h4[normalize-space()='Cookies & Privacy']")
    WebElement cookies_Banner_popUp;
    @FindBy(xpath ="//button[@id='gdpr-cookie-accept']")
    WebElement Click_on_cookies_button;
    //this locator is for scroll down
    @FindBy(xpath="//body/section/div/div/div/div/div[1]/a[1]/div[1]")
    WebElement element;
    //this is the locator for contact us button in bottom
    @FindBy(xpath = "//h2[normalize-space()='Featured Projects']")
    WebElement ContactHeading;
    @FindBy(xpath = "//a[@href='/contact']")
    WebElement  Contactelement;

    @FindBy(xpath = "//div[@class='footer-widget widget widget_nav_menu']//a[normalize-space()='About']")
    WebElement About_link;
//here are the locators of featured Porject left and right button
    //I took the contactelement locatore form the top
    @FindBy(xpath = "//i[@class='fas fa-arrow-left']")
    WebElement left_button;
    @FindBy(xpath = "//div[@class='next-icon slick-arrow']//i[@class='fas fa-arrow-right']")
    WebElement right_button;

    // this are the locators of carousel

    @FindBy(xpath ="//div[@class='slick-track']")
    WebElement carouselElement;
    @FindBy(xpath = "//div[@class='slick-track']//div[1]//div[1]//div[1]//div[1]//a[1]")
    WebElement elementtoclick;
    //here we are call the methods
    public void cookies_Banner_popUp(){

        cookies_Banner_popUp.isDisplayed();
        System.out.println("here the banner is showan:");

    }

    public void Click_on_cookies_button() {

        Click_on_cookies_button.click();
        System.out.println("User is able to click on the button :");

    }
    public void scrollToElement() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true)", element);


    }
    //Method to click on the bottom contact us buttton
    public void scrollToContctus(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true)", ContactHeading);
          //System.out.println("successfuly scroll to contact us ");
    }
    public void clickonContactus(){
        Contactelement.click();
        System.out.println("successfully click");


    }
    public void scrolldown_to_footer(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true)", About_link);
        System.out.println("successfuly scroll to contact us ");


    }
    public void Footer_About_link(){

        About_link.click();
        System.out.println("click successfull");


    }

    public void Scroll_featured_project(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true)",Contactelement );
        System.out.println("successfuly scroll to contact us ");

    }
   public void click_on_left_button(){
        left_button.click();
       System.out.println("successfully click on left button:");

   }
   public void right_button(){
        right_button.click();
       System.out.println("right button click successfully:");


   }
//method for carousel stop and click on it
   public void  carousel_Animation_stop(){
       JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
       jsExecutor.executeScript("arguments[0].removeAttribute('data-interval');", carouselElement);

   }
   public void element_to_be_click_carousel(){
        elementtoclick.click();



   }


}


