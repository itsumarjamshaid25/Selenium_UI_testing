package Pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.*;

public class OrangeHRM {
    WebDriver driver;
    Actions actions;
    public OrangeHRM(WebDriver driver){

        this.driver=driver;
        actions =new Actions(driver);
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//a[normalize-space()='OrangeHRM, Inc']")
    WebElement Link_Switch;
    @FindBy(xpath = "//a[@class='nav-link-hed'][normalize-space()='Solutions']")
    WebElement hover;


    public void tab_switch_link(){

        Link_Switch.click();
        System.out.println("here user click succesfully:");

    }
    public void switch_to_next_windows(){
        Set<String> windowsIDs=driver.getWindowHandles();//ths is use for to get more the one windows id
        //we can use 2 different APPROACHES LIKE ITRATOR METHOND AND LINKLIST I AM DOING BOTH HERE
        Iterator<String> IT= windowsIDs.iterator();//this method call is to get the both id's with the help of this
        //method object we can get the all windows id's
        String ParentWindIds= IT.next();//here i am storing first id in parent windids variable we use string bcz id in formof string

        String ChildWindIds= IT.next();//here i am storing 2nd window id in childwindIds
        System.out.println("parentwindowsIDs" +ParentWindIds);
        System.out.println("childwindIDS"+ ChildWindIds);
        driver.switchTo().window( ChildWindIds);
        System.out.println("parentwindowTitle:"+" "+driver.getTitle());
        System.out.println("childwindowTitle:"+" "+driver.getTitle());

       // ____________________________________________________________________________
        //now i am implementing with the help of Arraylist
//        List<String> windowsIDslist=new ArrayList(windowsIDs);//converting the set in list form
//       String parentwindowsIds= windowsIDslist.get(0);//if we are doing with the help of arraylist to get th id we use get method and the pass index
//       String childwindowsIds= windowsIDslist.get(1);
//        System.out.println("parentwindIds"+ parentwindowsIds);
//        System.out.println("childwindIds"+ childwindowsIds);
//        driver.switchTo().window(childwindowsIds);
    }
    public void able_to_hover(){

        actions.moveToElement(hover).perform();


    }
}
