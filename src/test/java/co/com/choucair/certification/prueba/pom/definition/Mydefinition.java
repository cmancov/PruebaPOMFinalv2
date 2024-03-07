package co.com.choucair.certification.prueba.pom.definition;

import co.com.choucair.certification.prueba.pom.step.OpenApp;
import co.com.choucair.certification.prueba.pom.step.SearchProduct;
import  cucumber.api.java.en.Given;
import  cucumber.api.java.en.Then;
import  cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class Mydefinition {

    @Steps
    OpenApp openApp;
    @Steps
    SearchProduct searchProduct;

    @Given("^I entry to the page exito$")
    public void iEntryToThePageExito() {
        {
            openApp.appUrl();

        }
    }

      @When("^I add some products$")
        public void iAddSomeProducts() {
          {
              searchProduct.pageSearch();
          }
        }

    @Then("^products are displayed in the cart$")
        public void productsAreDisplayedInTheCart(){
        {
            searchProduct.verify();
        }
    }

}

