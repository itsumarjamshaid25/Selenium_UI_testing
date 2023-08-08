package Pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class VertexSpecialMenu {
    WebDriver driver;
    Actions hover;
    public VertexSpecialMenu(WebDriver driver){
        this.driver=driver;
        hover =new Actions(driver);
        PageFactory.initElements(driver,this);




    }
    @FindBy(xpath = "//a[normalize-space()='Services']")
    WebElement Menu_Button_service;
    @FindBy(xpath = "//div[@class='xg-mega-menu-container']")
    WebElement service_links_Page;
    @FindBy(xpath = "//a[normalize-space()='Mobile UI/UX Design']")
    WebElement service_hover_link;
    @FindBy(xpath = "//ul[@class='navbar-nav']//a[normalize-space()='About']")
    WebElement Menu_Button_about;
    @FindBy(xpath="//h2[normalize-space()='About Us']")
    WebElement heading;
    @FindBy(xpath="//ul[@class='navbar-nav']//a[normalize-space()='Career With Us']")
    WebElement Menu_Button_Career;
    @FindBy(xpath = "//h2[contains(text(),'Empowering The Leaders of Tomorrow. Come & Join Us')]")
    WebElement Main_heading_on_career;


    public void About_Button(){
        Menu_Button_about.click();
        System.out.println("user click on about button successfully:");




    }
    public void Context_on_About(){
        heading.isDisplayed();
        System.out.println("user is succesfully on about Us Page:");
    }


    public void Hover_on_service() throws InterruptedException {
        hover.moveToElement(Menu_Button_service).perform();
        Thread.sleep(200);
        System.out.println("successfully hover on service:");






    }
    public void further_option_on_service() {
        service_links_Page.isDisplayed();
        System.out.println("yes link page hab been shown:");
        hover.moveToElement(service_links_Page).moveToElement(service_hover_link).click().perform();





    }
    public void career_button(){
        Menu_Button_Career.click();
        System.out.println("successfully click on career button:");
    }
    public void context_on_career(){
        Main_heading_on_career.isDisplayed();
        System.out.println("user landed successfully on career page:");
    }
}




