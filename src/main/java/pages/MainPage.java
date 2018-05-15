package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;

import java.util.List;

/**
 * Created by Rogoza Dimity on 14.05.2018.
 */
public class MainPage extends BasePage {

    @FindBy(xpath = "//*[@class='service__title']")
    List<WebElement> mainPanel;

    @FindBy(xpath = "//*[@class='service']//a[@class='service__links-item']")
    List<WebElement> insideMainPanel;

    public MainPage(){
        PageFactory.initElements(BaseSteps.getDriver(),this);
    }

    public void clickInsideMainPanel(String item1, String item){
        WebElement choiceMainPanel = selectItem(mainPanel, item1);
        choiceMainPanel.findElement(By.xpath("./parent::div/descendant::span[contains(text(),'"+ item +"')]")).click();
    }
}
