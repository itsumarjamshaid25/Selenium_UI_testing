package StepsDefinitions;

import Pagefactory.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;


public class VertexSpecial_StepDef {

    WebDriver driver = null;
    VertexSpecialHome cookies;
    VertexSpecialHome scroll;
    VertexSpecialHome contactButtonClick;
    VertexSpecialMenu Button;
    OrangeHRM HRM_link;
    //Spectrum_home chat;




    @Given("User is navigated to {string}")
    public void user_is_navigated_to(String url)throws InterruptedException {
        driver=new ChromeDriver();
        driver.navigate().to(url);
        Thread.sleep(2000);
        driver.manage().window().maximize();
    }




    @When("The cookies Banner popup")
    public void the_cookies_banner_popup() throws InterruptedException {

        Thread.sleep(8000);
       VertexSpecialHome cookies=new VertexSpecialHome(driver);
        cookies.cookies_Banner_popUp();

        // Write code here that turns the phrase above into concrete actions
//        driver.findElement(By.xpath("//h4[normalize-space()='Cookies & Privacy']")).isDisplayed();
//        System.out.println("showed......");

        //throw new io.cucumber.java.PendingException();
    }

    @Then("user is able to click on accept button")
    public void user_is_able_to_click_on_accept_button() {
       VertexSpecialHome cookies=new VertexSpecialHome(driver);
        cookies.Click_on_cookies_button();

//        System.out.println("ready to cancel......");
//
//        driver.findElement(By.xpath("//button[@id='gdpr-cookie-accept']")).click();
        driver.close();
        driver.quit();
        //throw new io.cucumber.java.PendingException();
    }


    //For validate the scroll
    @Then("User scroll the side bar")
    public void user_scroll_the_side_bar() throws InterruptedException {
       Thread.sleep(2000);
        //we can do it by 2 more ways like by pixel and by end of the page techniqu
        VertexSpecialHome scroll= PageFactory.initElements(driver, VertexSpecialHome.class);
        scroll.scrollToElement();


    }
    //to click on the contact button blow
    @When("user scrolldown the website")
    public void user_scroldown_the_website() throws InterruptedException {
        Thread.sleep(2000);

        //here we are performing scroll fnctionality to the contact button
        VertexSpecialHome scroll= PageFactory.initElements(driver, VertexSpecialHome.class);
        scroll.scrollToContctus();
        Thread.sleep(2000);
       // VertexSpecialHome contactButtonClick=new VertexSpecialHome(driver);


        
    }

    @Then("user will get the contact button")
    public void user_will_get_the_contact_button() throws InterruptedException {
        Thread.sleep(2000);
        //here this is object call of clicking on contact button
        VertexSpecialHome contactButtonClick= PageFactory.initElements(driver, VertexSpecialHome.class);
        contactButtonClick.clickonContactus();


    }
    //thi
    @When("user scrolldown to footer")
    public void user_scrolldown_to_footer() {
        VertexSpecialHome scroll= PageFactory.initElements(driver, VertexSpecialHome.class);
        scroll.scrolldown_to_footer();
    }
    @Then("user will able to click on About link")
    public void user_will_able_to_click_on_About_link() throws InterruptedException {
        Thread.sleep(200);
        VertexSpecialHome Aboutlink= PageFactory.initElements(driver, VertexSpecialHome.class);
        Aboutlink.Footer_About_link();
        driver.close();
        driver.quit();

    //its for featured project left button
    }
    @When("user scrolldown to featuredProjects")
    public void user_scrolldown_to_featured_projects() throws InterruptedException {

        VertexSpecialHome scroll= PageFactory.initElements(driver, VertexSpecialHome.class);
        scroll.Scroll_featured_project();
        System.out.println("succressfully scroll to frature projects:");
        Thread.sleep(2000);


    }

    @Then("user will able to click on left button")
    public void user_will_able_to_click_on_left_button() throws InterruptedException {
        Thread.sleep(2000);
         VertexSpecialHome LB=new VertexSpecialHome(driver);
         LB.click_on_left_button();


    }


    @Then("user will able to click on right  button")
    public void user_will_able_to_click_on_right_button() throws InterruptedException {
        Thread.sleep(2000);

        VertexSpecialHome RB=new VertexSpecialHome(driver);
        RB.right_button();
    }
    //Ites for carousel testing

    @When("user scrolldown to featuredProjects Carousel")
    public void user_scrolldown_to_featured_projects_carousel() throws InterruptedException {
        //VertexSpecialHome scroll= PageFactory.initElements(driver, VertexSpecialHome.class);
        WebElement Contactelement=driver.findElement(By.xpath("//div[@class='slick-track']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true)",Contactelement );
        VertexSpecialHome Carousel=new VertexSpecialHome(driver);
       // Carousel.Scroll_featured_project();

        System.out.println("succressfully scroll to frature projects:");
        Carousel.carousel_Animation_stop();


        //here i am adding explicit wait for the carousel element should be
        // displayed before click and I am importing a webdriverwait class
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.visibilityOf(VertexSpecialHome.);
        Thread.sleep(6000);


    }

    @Then("user will able to click on the carousel element")
    public void user_will_able_to_click_on_the_carousel_element() {



    }
// this is for aout button in navbar
    @When("user click on About button")
    public void user_click_on_about_button() throws InterruptedException {
        VertexSpecialMenu Button= PageFactory.initElements(driver, VertexSpecialMenu.class);
        Button.About_Button();
        Thread.sleep(2000);


    }

    @Then("user will able to see all the further options of about page")
    public void user_will_able_to_see_all_the_further_options_of_about_page() throws InterruptedException {
        VertexSpecialMenu Button= PageFactory.initElements(driver, VertexSpecialMenu.class);
        Button.Context_on_About();
        Thread.sleep(2000);

    }


    // hover functionality on service button
  @When("user hover on service button")
  public void user_hover_on_service_button() throws InterruptedException {
      VertexSpecialMenu Button= PageFactory.initElements(driver, VertexSpecialMenu.class);
      Button.Hover_on_service();
      Thread.sleep(3000);


}

    @Then("user will able to see all the further options")
    public void user_will_able_to_see_all_the_further_options() throws InterruptedException {
        VertexSpecialMenu Button= PageFactory.initElements(driver, VertexSpecialMenu.class);
        Button.further_option_on_service();


    }
//this is for career button click on the navbar
    @When("user click on career button")
    public void user_click_on_career_button() throws InterruptedException {
        VertexSpecialMenu Button= PageFactory.initElements(driver, VertexSpecialMenu.class);
        Button.career_button();
        Thread.sleep(2000);



    }

    @Then("user will able to see all the further options of career page")
    public void user_will_able_to_see_all_the_further_options_of_career_page() throws InterruptedException {
        VertexSpecialMenu Button= PageFactory.initElements(driver, VertexSpecialMenu.class);
        Button.context_on_career();
        Thread.sleep(2000);

    }
    // this is tab switching for OrangeHRM
    @When("user is click on HRM.Inc link")
    public void user_is_click_on_hrm_inc_link() {
      OrangeHRM  HRM_link= PageFactory.initElements(driver, OrangeHRM.class);
        HRM_link.tab_switch_link();


    }

    @Then("user is navigated to next page and window is switched")
    public void user_is_navigated_to_next_page_and_window_is_switched() throws InterruptedException {
        OrangeHRM  HRM_link= PageFactory.initElements(driver, OrangeHRM.class);
        HRM_link.switch_to_next_windows();
        Thread.sleep(2000);
//        driver.close();
//        driver.quit();
  //child page click selection
    }
    @When("use is on child window  tab")
    public void use_is_on_child_window_tab() throws InterruptedException {
        OrangeHRM  HRM_link= PageFactory.initElements(driver, OrangeHRM.class);
        HRM_link.tab_switch_link();
        HRM_link.switch_to_next_windows();
       Thread.sleep(2000);
    }

    @Then("user is able to hover on solution tab")
    public void user_is_able_to_hover_on_solution_tab() {
        OrangeHRM  HRM_link= PageFactory.initElements(driver, OrangeHRM.class);
        HRM_link.able_to_hover();

    }
//  -----------------------------------------------------------------------------------------

    //this is for iframe work of spectrum
    @And("USER WILL W8")
    public void user_will_w8() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
       //Thread.sleep(15000);
        System.out.println("waited");
    }
    @When("user click on chat button")
    public void user_click_on_chat_button() throws InterruptedException {
        System.out.println("reached");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

        WebElement chatbox=driver.findElement(By.xpath("//button[@id='asapp-chat-sdk-badge']"));
        chatbox.click();
//the functionality o iframe wasnt work with the concept of page factory soo thats i did it here

//        Spectrum_home chat= new Spectrum_home(driver);
//        chat.Chat_button_click();
//        System.out.println("quiting");

        //Thread.sleep(2000);
    }

    @And("user will get the chat window")
    public void user_will_get_the_chat_window() throws InterruptedException {
        WebElement frame=driver.findElement(By.xpath("//iframe[@id='asapp-chat-sdk-frame-el']"));
        driver.switchTo().frame(frame);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//textarea[@id='chat-input']")).sendKeys("Hi umar");
        WebElement SEND_BUTTON=driver.findElement(By.xpath("//button[contains(@class, 'chatInput__sendButton')]"));
        SEND_BUTTON.click();
//        Spectrum_home chat= PageFactory.initElements(driver, Spectrum_home.class);
//        chat.chat_frame_popup();
//        Thread.sleep(200);


    }

    @Then("user can able to minimize and chat with centre")
   public void user_can_able_to_minimize_and_chat_with_centre() {
//        WebElement frame=driver.findElement(By.xpath("//iframe[@id='asapp-chat-sdk-frame-el']"));
//        driver.switchTo().frame(frame);
        WebElement minimize=driver.findElement(By.xpath("//button[@class='sc-bqWxrE vRyBT closeChat chatNavBar__navButton alwaysShowMinimize' and @title='Minimize Chat']"));
        minimize.click();

//        Spectrum_home chat= PageFactory.initElements(driver, Spectrum_home.class);
//        chat.minimize_button_function();


    }
    //_______________________________________________________________________________________________________________________
    //implement the image uploading in selenium
    @When("User click on Upload file")
    public void user_click_on_upload_file() throws InterruptedException {
        FoundIt_india uploader=new FoundIt_india(driver);
        uploader.Upload_Button_Method();
        Thread.sleep(2000);



    }

    @When("new Window popUp and click on Upload Button")
    public void new_window_pop_up_and_click_on_upload_button() throws InterruptedException {
        FoundIt_india uploader=new FoundIt_india(driver);
        uploader.file_Upload_Method();
        Thread.sleep(2000);


    }

    @Then("File is upload successfully")
    public void file_is_upload_successfully() throws InterruptedException {
        FoundIt_india uploader=new FoundIt_india(driver);
        uploader.Submit_Button_Method();
        Thread.sleep(2000);
        driver.close();
        driver.quit();
    }
//   _________________________________________-
//  now doing robot class we use this method when click() method is not working on upload resume butto
//    which is present in new window tAB
    //javascript executer tab use karna jab click button na chal rha ho
@When("user click on Upload resume Button")
public void user_click_on_upload_resume_button() throws InterruptedException {
        Thread.sleep(400);
        encavy_res_check checker=new encavy_res_check(driver);
        checker.click_on_Upload_resume();
        Thread.sleep(200);

}

    @When("Get the option of file seletion")
    public void get_the_option_of_file_seletion() throws InterruptedException {
        encavy_res_check checker=new encavy_res_check(driver);
        checker.File_selection();


    }

    @Then("user upload file and click on submit button")
    public void user_upload_file_and_click_on_submit_button() {
        encavy_res_check checker=new encavy_res_check(driver);
        checker.click_on_submit_Button();
        driver.close();
        driver.quit();

    }





}


