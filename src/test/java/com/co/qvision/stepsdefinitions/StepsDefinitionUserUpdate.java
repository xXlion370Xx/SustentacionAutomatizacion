package com.co.qvision.stepsdefinitions;

import com.co.qvision.models.LoginCredentials;
import com.co.qvision.models.UpdateCredentials;
import com.co.qvision.tasks.Home;
import com.co.qvision.tasks.MyAccount;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class StepsDefinitionUserUpdate {
    // Here instance the web driver that we use
    @Managed
    WebDriver chrome;
    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("User");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(chrome));
    }

    @Given("^That i sign in my account on the option account detail$")
    public void thatISignInMyAccountOnTheOptionAccountDetail() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.bon-bonite.com/"));
    }

    @When("^enter my correct credentials$")
    public void enterMyCorrectCredentials(List<LoginCredentials> loginCredentialsList  ) {

        // Call the method tha navigate to the module my account
        OnStage.theActorInTheSpotlight().attemptsTo(Home.seeMyAccount());

        // Save the loginCredentials on the model loginCredentials object
        LoginCredentials loginCredentials;
        loginCredentials = loginCredentialsList.get(0);

        // Call the method to enter crendentials
        OnStage.theActorInTheSpotlight().attemptsTo(MyAccount.enterCredentials(loginCredentials));

    }

    @When("^change my personal data$")
    public void changeMyPersonalData( List<UpdateCredentials> updateCredentialsList) {

        // Save the update credentials on the model updateCredentials
        UpdateCredentials updateCredentials;
        updateCredentials = updateCredentialsList.get(0);

        // Call method that update the credentials
        OnStage.theActorInTheSpotlight().attemptsTo(MyAccount.updateData(updateCredentials));

    }

    @Then("^sould see my data update$")
    public void souldSeeMyDataUpdate() {

    }

}
