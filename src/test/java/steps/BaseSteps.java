package steps;

import com.codeborne.selenide.Selenide;
import constants.ChampionatUrls;
import io.cucumber.java.en.Given;

public class BaseSteps {

    @Given("Open the page {string}")
    public void openPage(String url) {
        Selenide.open(ChampionatUrls.BASE_URL.getBaseUrl());

    }

}
