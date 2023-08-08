package Pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class encavy_res_check {
    WebDriver driver;

    public encavy_res_check(WebDriver driver) {
        this.driver=driver;
        // actions =new Actions(driver);
        PageFactory.initElements(driver,this);

    }


    @FindBy(xpath = "//button[contains(text(), 'Upload Your Resume')]")
    WebElement Upload_resume;
    @FindBy(xpath = "//h4[normalize-space()='Where can we email you a backup of the results?']")
    WebElement Txt_diplay;





    public void click_on_Upload_resume(){
        try {


            Upload_resume.click();
            System.out.println("here its click then on otherwise use java scriptexecutor:");
        }catch(Throwable T){
            System.out.println(T.getMessage());
            System.out.println(T.getCause());

        }



    }
    public void File_selection() throws InterruptedException {

        //we can only perform 3 functionallity with help of robot class
        //find the path of file in windows folder
        //CTRL V the path of file
        //click open Button
       try{
           Robot selector=new Robot();
           selector.delay(2000);
           //now to copy the file path from the folder we use string seletion java method
           StringSelection ss=new StringSelection("D:\\Desktop\\M.Umar SQA Manual+Automation CV.pdf");
           Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,null);

           //now perfrom ctrl v funtion on keyboard
           selector.keyPress(KeyEvent.VK_CONTROL);//press control key
           selector.keyPress(KeyEvent.VK_V);//press V
           //now release the key

           selector.keyRelease(KeyEvent.VK_CONTROL);
           selector.keyRelease(KeyEvent.VK_V);

           //now press enter
           selector.keyPress(KeyEvent.VK_ENTER);
           selector.keyRelease(KeyEvent.VK_ENTER);


           System.out.println("file selected Successfully:");
       }catch(Throwable T){
           System.out.println(T.getMessage());
           System.out.println(T.getCause());
           Thread.sleep(8000);

       }


    }
    public void click_on_submit_Button(){
        try{
              Txt_diplay.isDisplayed();
            System.out.println("click on Submit Button Successfully:");
        }catch(Throwable T){
            System.out.println(T.getMessage());
            System.out.println(T.getCause());

        }







    }






}
