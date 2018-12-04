package Stepdefs;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class GoogleStepdefs {
    @Given("User is on Google page")
    public void User_is_on_Google_page(){
        open(Configuration.baseUrl);
    }

    @When("User enters \"([^\\\"]*)\" in search field")
    public void User_enters_in_search_field(String searchText){
        $(By.id("lst-ib")).sendKeys(searchText);
    }

    @And("User clicks Search button")
    public void User_clicks_Search_button(){
        $(By.id("lst-ib")).submit();
    }

    @Then("User clicks \"([^\\\"]*)\" link")
    public void User_click_link(String linkText) throws InterruptedException {
        ElementsCollection links = $$(By.className("r"));
        SelenideElement link = links.find(Condition.hasText(linkText));
        link.click();

        Thread.sleep(3000);
    }


}
