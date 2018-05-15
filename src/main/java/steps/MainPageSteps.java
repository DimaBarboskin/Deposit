package steps;

import io.qameta.allure.Step;
import pages.MainPage;

/**
 * Created by Rogoza Dimity on 15.05.2018.
 */
public class MainPageSteps {

    @Step("Выбираем действие")
    public void clickInsideMainPanel(String item1, String item) {
        new MainPage().clickInsideMainPanel(item1,item);
    }

}
