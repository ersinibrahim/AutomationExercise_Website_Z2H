package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.HomePage;
import utilities.BaseDriver;


public class EnterSteps {

    HomePage homePage;
    WebDriver driver= BaseDriver.getDriver();

    public EnterSteps(HomePage homePage) {
        this.homePage = homePage;
    }

    @Given("^Navigate to Automation Exercise website$")
    public void navigateToAutomationExerciseWebsite() {

        driver.get("https://automationexercise.com");
        driver.manage().window().maximize();
        Assert.assertTrue(driver.getCurrentUrl().contains("automationexercise"));


    }


    @When("^User should Enter the Website successfully$")
    public void userShouldEnterTheWebsiteSuccessfully() {

        homePage.clickFunction(homePage.products_button);
        Assert.assertTrue(driver.getCurrentUrl().contains("products"));

        String price1=homePage.product1_price.getText();

        System.out.println("text = " + price1);

        homePage.clickFunction(homePage.product1_AddToCard_button);

        homePage.clickFunction(homePage.continueShopping_button);

        String price2=homePage.product2_price.getText();

        homePage.clickFunction(homePage.product2_AddToCard_button);
        homePage.clickFunction(homePage.view_cart_button);
    }


}
