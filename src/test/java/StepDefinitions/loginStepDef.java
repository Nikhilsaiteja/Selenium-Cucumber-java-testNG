package StepDefinitions;

import Pages.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class loginStepDef {

    private WebDriver driver;
    private LoginPage loginPage;

    @Before
    public void setup(){
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
    }

    @After
    public void tearDown(){
        if(driver!=null){
            driver.quit();
        }
    }

    @Given("Login page is opened")
    public void Login_page_is_opened(){
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
    }

    @Given("Entered valid email and password")
    public void Entered_valid_email_and_password(){
        loginPage.enterEmail("abcd.1234@gmail.com");
        loginPage.enterPassword("Abcd@1234");
    }

    @When("Clicked on Login Button")
    public void Clicked_on_Login_Button(){
        loginPage.clickLogin();
    }

    @Then("Dashboard page should be displayed")
    public void Dashboard_page_should_be_displayed() {
        Assert.assertTrue(loginPage.getDashboardURL().contains("route=account/account"));
    }
}
