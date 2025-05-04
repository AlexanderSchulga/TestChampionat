package steps;

import io.cucumber.java.en.Then;
import page_objects.NavigationPageRPLSelenide;

public class CategoryPageSteps {

    private NavigationPageRPLSelenide navigationPageRPLSelenide = new NavigationPageRPLSelenide();

    @Then("Main page should be appear")
    public void waitUntilTextRplVisible() {navigationPageRPLSelenide.waitUntilTextRplVisible();
    }

}
