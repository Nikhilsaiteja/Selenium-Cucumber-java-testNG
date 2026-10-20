package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private final WebDriver webDriver;

    public LoginPage(WebDriver driver){
        this.webDriver = driver;
    }

    private final By emailField = By.id("input-email");
    private final By passwordField = By.id("input-password");
    private final By loginBtn = By.xpath("//input[@value='Login']");
    private final By logoutLink = By.xpath("//a[@class='list-group-item'][normalize-space()='Logout']");

    public void enterEmail(String email){
        webDriver.findElement(emailField).sendKeys(email);
    }

    public void enterPassword(String password){
        webDriver.findElement(passwordField).sendKeys(password);
    }

    public void clickLogin(){
        webDriver.findElement(loginBtn).click();
    }

    public String getDashboardURL(){
        return webDriver.getCurrentUrl();
    }
}
