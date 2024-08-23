package steps;

import common.googleBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.googleBasePages;

public class searchMachine extends googleBase {
    googleBasePages gp;
    @Given("i am on google search")
    public void i_am_on_google_search() {
        launchGoogle();

    }
    @When("i enter {string} in the search bar")
    public void i_enter_in_the_search_bar(String product_name) {
        gp = new googleBasePages(driver);
        gp.EnterElement(product_name);

        }
    @When("i click search button")
    public void i_click_search_button() {

        gp = new googleBasePages(driver);
        gp.clickSearch();


    }
    @Then("i can see the search result successfully")
    public void i_can_see_the_search_result_successfully() {

        gp = new googleBasePages(driver);
        gp.verifying();

        closeAll();

    }



}
