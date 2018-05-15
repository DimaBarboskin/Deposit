package steps;


import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

/**
 * Created by Rogoza Dimity on 15.05.2018.
 */
public class ScenarioSteps {
    MainPageSteps mainPageSteps = new MainPageSteps();
    DepositPageSteps depositPageSteps = new DepositPageSteps();

    @When("^выбран пункты \"(.+)\",\"(.+)\"$")
    public void clickInsideMainPanel(String item1,String item){
        mainPageSteps.clickInsideMainPanel(item1,item);
    }

    @Then("^проверяем заголовок \"(.+)\"$")
    public void checkTitleDeposit(String title){
        depositPageSteps.checkTitleDeposit(title);
    }

    @When("^выбираем валюту: \"(.+)\"$")
    public void selectCurrency(String currency){
        depositPageSteps.selectCurrency(currency);
    }

    @When("^вводим сумму \"(.+)\"$")
    public void enterAmountDeposit(String amount){
        depositPageSteps.enterAmountDeposit(amount);
    }

    @When("^длительность в месяцах \"(.+)\"$")
    public void selectMonths(String months){
        depositPageSteps.selectMonths(months);
    }

    @When("^ежемесячное пополнение \"(.+)\"$")
    public void enterMonthIncrease(String increaseAmount){
        depositPageSteps.enterMonthIncrease(increaseAmount);
    }

    @When("^выбираем условия \"(.*)\"$")
    public void selectCheckBox(List<String> boxes){
        depositPageSteps.selectCheckBox(boxes);
    }

    @Then("^проверяем процентную ставку \"(.+)\"$")
    public void checkPercentRate(String percent){
        depositPageSteps.checkPercentRate(percent);
    }

    @Then("^прибыль\"(.+)\"$")
    public void checkProfit(String profit){
        depositPageSteps.checkProfit(profit);
    }

    @Then("^сколько денег доложили\"(.+)\"$")
    public void checkIncrease(String increase){
        depositPageSteps.checkIncrease(increase);
    }

    @Then("^общую сумму \"(.+)\"$")
    public void checkAllMoney(String allMoney){
        depositPageSteps.checkAllMoney(allMoney);
    }
}
