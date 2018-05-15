package steps;

import io.qameta.allure.Step;
import pages.DepositPage;

import java.util.List;

/**
 * Created by Rogoza Dimity on 15.05.2018.
 */
public class DepositPageSteps {

    @Step("Проверяем заголовок")
    public void checkTitleDeposit(String title){
        new DepositPage().checkTitleDeposit(title);
    }

    @Step("Выбираем валюту")
    public void selectCurrency(String currency){
        new DepositPage().selectCurrency(currency);
    }

    @Step("Вводим ссуму вклада")
    public void enterAmountDeposit(String amount){
        new DepositPage().enterAmountDeposit(amount);
    }

    @Step("Выбираем длительность")
    public void selectMonths(String months){
        new DepositPage().selectMonths(months);
    }

    @Step("Ввщдим сумму пополнения")
    public void enterMonthIncrease(String increaseAmount){
        new DepositPage().enterMonthIncrease(increaseAmount);
    }

    @Step("Выьираем чекбокс(ы)")
    public void selectCheckBox(List<String> boxes){
        new DepositPage().selectCheckBox(boxes);
    }

    @Step("Проверяем процентную ставку")
    public void checkPercentRate(String percent){
        new DepositPage().checkPercentRate(percent);
    }

    @Step("Проверяем прибыль")
    public void checkProfit(String profit){
        new DepositPage().checkProfit(profit);
    }

    @Step("Проверяем сколько доложили")
    public void checkIncrease(String increase){
        new DepositPage().checkIncrease(increase);
    }

    @Step("Проверяем полную сумму")
    public void checkAllMoney(String allMoney){
        new DepositPage().checkAllMoney(allMoney);
    }
}
