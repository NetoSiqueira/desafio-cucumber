package steps;

import base.BasePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import page.LoginPage;

public class LoginSteps   {
    private LoginPage page = new LoginPage();

    @Given("the main page loaded")
    public void theMainPageLoaded() {
        Assert.assertEquals(page.showPage(), "Login");
    }
    @When("the following field Email: {string}")
    public void theFollowingFieldEmail(String string) {
       page.setUserName(string);
    }
    @When("the following field Password: {string}")
    public void theFollowingFieldPassword(String string) {
        page.setPassword(string);
    }
    @When("the click the button Login")
    public void theClickTheButtonLogin() {
       page.button();
    }
    @Then("the application show the page Invoice List")
    public void theApplicationShowThePageInvoiceList() {
        Assert.assertEquals(page.pageInvoiceList(), "Invoice List");
        page.logout();
    }

    @Then("the application shows the message: {string}")
    public void the_application_shows_the_message(String string) {
        Assert.assertEquals(page.alertDanger(), string);
    }
}
