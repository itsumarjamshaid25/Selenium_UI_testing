package Pagefactory;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FoundIt_india {
    WebDriver driver;
    public FoundIt_india(WebDriver driver){

        this.driver=driver;
       // actions =new Actions(driver);
        PageFactory.initElements(driver,this);

    }
    @FindBy(xpath = "//div[@class='heroSection-buttonContainer_secondaryBtn secondaryBtn']")
    WebElement Upload_Button;
    @FindBy(xpath = "//input[@id='file-upload']")
    WebElement file_Upload;
    @FindBy(xpath = "//span[@class='action-cta']")
    WebElement Submitted_Button;





    public void Upload_Button_Method(){
        try {
            Upload_Button.click();
            System.out.println("successfully clicked:");
        }catch(Throwable T){
            System.out.println(T.getMessage());
            System.out.println(T.getCause());

        }





    }
    public void file_Upload_Method(){
        try {
            file_Upload.sendKeys("F:\\vertex Work\\Vertexspecial.Bug report.pdf");
            System.out.println("fileupload Successfully:");

        }catch(Throwable T){
            System.out.println(T.getMessage());
            System.out.println(T.getCause());

        }




    }
    public void Submit_Button_Method(){
        try {
            Submitted_Button.click();
            System.out.println("click on submitted Button successfully:");
        }catch(Throwable T){
            System.out.println(T.getMessage());
            System.out.println(T.getCause());

        }




    }



}
