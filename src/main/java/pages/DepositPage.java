package pages;



import org.junit.Assert;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;


import java.util.List;

/**
 * Created by Rogoza Dimity on 15.05.2018.
 */
public class DepositPage extends BasePage{
    @FindBy(xpath = "//*[contains(text(),'Рассчитайте доходность по вкладу')]")
    WebElement title;

    @FindBy(xpath = "//*[@class='calculator__currency-field']")
    List<WebElement> currency;

    @FindBy(xpath = "//*[@name='amount']")
    WebElement amountDeposit;

    @FindBy(xpath = "//*[@name='replenish']")
    WebElement monthIncrease;

    @FindBy(xpath = "//*[@class='calculator__check-text']")
    List<WebElement> checkBoxes;

    @FindBy(xpath = "//*[@class = 'js-calc-rate']")
    WebElement percentRate;

    @FindBy(xpath = "//*[@class = 'js-calc-earned']")
    WebElement profit;

    @FindBy(xpath = "//*[@class = 'js-calc-replenish']")
    WebElement increase;

    @FindBy(xpath = "//*[@class = 'js-calc-result']")
    WebElement allMoney;

    public DepositPage(){
        PageFactory.initElements(BaseSteps.getDriver(),this);
    }

    public void checkTitleDeposit(String expectedText){
        checkTitle(title,expectedText);
    }

    public void selectCurrency(String currency){
        selectItem(this.currency,currency).click();
    }
    public void enterAmountDeposit(String value){
        enterCondition(amountDeposit,value);
    }
    public void enterMonthIncrease(String value){
        enterCondition(monthIncrease,value);
    }
    public void selectMonths(String months){
        WebElement selectElem = BaseSteps.getDriver().findElement(By.tagName("select"));
        Select select = new Select(selectElem);
        select.selectByVisibleText(""+ months +" месяцев");
    }
    public void selectCheckBox(List<String> checkbox){
        for(String item : checkbox)
        selectItem(checkBoxes,item).click();
    }
    public void checkPercentRate(String percent){
        WebDriverWait wait = new WebDriverWait(BaseSteps.getDriver(), 10);
        wait.until(ExpectedConditions.textToBe(By.xpath("//*[@class = 'js-calc-rate']"),percent));
        Assert.assertEquals("Заголовок не совпадает",percent, percentRate.getText());
    }
    public void checkProfit(String profit){
        WebDriverWait wait = new WebDriverWait(BaseSteps.getDriver(), 10);
        wait.until(ExpectedConditions.textToBe(By.xpath("//*[@class = 'js-calc-earned']"),profit));
        Assert.assertEquals("Заголовок не совпадает",profit, this.profit.getText());
    }
    public void checkIncrease(String increase){
        WebDriverWait wait = new WebDriverWait(BaseSteps.getDriver(), 10);
        wait.until(ExpectedConditions.textToBe(By.xpath("//*[@class = 'js-calc-replenish']"),increase));
        Assert.assertEquals("Заголовок не совпадает",increase, this.increase.getText());
    }
    public void checkAllMoney(String money){
        WebDriverWait wait = new WebDriverWait(BaseSteps.getDriver(), 10);
        wait.until(ExpectedConditions.textToBe(By.xpath("//*[@class = 'js-calc-result']"),money));
        Assert.assertEquals("Заголовок не совпадает",money, this.allMoney.getText());
    }
}
