package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import utilities.ConfigReader;



public class ProjectLoginPage extends PageObject{
    WebDriver driver;
    @FindBy(xpath = "//li[@class='dropdown']")
    public WebElement myAccount;

    @FindBy(xpath = "//a[text()='Login']")
    public WebElement login;
    @FindBy(id="input-email")
    public WebElement username;

    @FindBy(id="input-password")
    public WebElement password;

    @FindBy(className = "btn btn-primary")
    public WebElement loginButton;

    @FindBy(xpath = "//a[text()='Components']")
    public WebElement component;

    @FindBy(xpath = "//a[text()='Monitors (2)']")
    public WebElement monitor;

    @FindBy(xpath = "//h2")
    public WebElement verification;

    @FindBy(xpath = "//h3")
    public WebElement verify;




    //************Methods************\\
    public void loginMethod() {

        myAccount.click();
        login.click();

        username.sendKeys(ConfigReader.getProperties("username"));
        password.sendKeys(ConfigReader.getProperties("password"));
        loginButton.click();

    }


    public void navigateBack(){
      driver.navigate().back();
      verify.isDisplayed();

    }

    public void hover(){
        Actions actions = new Actions(driver);
        actions.moveToElement(component).perform();
        monitor.isDisplayed();
    }

    public void navigateTo(){

        component.click();
        monitor.click();
        verification.isDisplayed();

    }

}
