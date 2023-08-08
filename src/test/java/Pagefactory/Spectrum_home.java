
package Pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Spectrum_home {
    WebDriver driver;
    Actions actions;
     WebDriverWait wait;

    //@FindBy(xpath = "//button[@title='Open chat']")
    //@FindBy(id = "asapp-chat-sdk-badge")
    //@FindBy(css = "[title='Open chat']")
   //@FindBy(css = "#asapp-chat-sdk-badge, [title='Open chat']")
//   @FindBys({
//           @FindBy(id = "asapp-chat-sdk-badge"),
//           @FindBy(css = "[title='Open chat']")
//   })
    //@FindBy(xpath = "//span[contains(text(),'Chat With Us')]")
    @FindBy(xpath = "//button[@id='asapp-chat-sdk-badge']")
    WebElement chat_button;
    @FindBy(xpath = "//iframe[@id='asapp-chat-sdk-frame-el']")
    WebElement chat_frame;
    @FindBy(xpath = "//iframe[@id='asapp-chat-sdk-frame-el']")
    WebElement input_field;
    @FindBy(className = "icon icon_minimize")
    WebElement minimize_Button;

    public Spectrum_home(WebDriver driver){
        this.driver=driver;
        //this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        actions=new Actions(driver);
        PageFactory.initElements(driver,this);

    }

    public void Chat_button_click(){
        //driver.switchTo().frame(chat_button);
       // wait.until(ExpectedConditions.visibilityOf(chat_button));
       // chat_button.isDisplayed();
        System.out.println("button is displayed:");
        chat_button.click();
        driver.switchTo().frame(chat_frame);
        System.out.println("here we click now the screen opens:");


    }
    public void chat_frame_popup(){

        System.out.println("successfully move on the iframe:");
        actions.click(input_field).perform();
    }
    public void minimize_button_function(){
        actions.click(minimize_Button).perform();
        System.out.println("successfully click on minimize button:");

    }
}

