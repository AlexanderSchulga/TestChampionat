package steps;

import io.cucumber.java.en.When;
import page_objects.NavigationBarPageSelenide;

public class NavigationBarSteps {

    private NavigationBarPageSelenide navigationBarPageSelenide = new NavigationBarPageSelenide();

    @When("Login page was opened")
    public void goToSpecificGenre() {
        //String param = (String) BaseSteps.container.get("param1");
        navigationBarPageSelenide.clickFootball();
        navigationBarPageSelenide.clickRpl();
    }

}
