package com.herokuapp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    public static String LOGIN_URL = BASE_URL+"login";
    @FindBy(id="username") private WebElement usernameInput;
    @FindBy(id="password") private WebElement passwordInput;
    @FindBy(xpath = "//form[@id='login']//i[@class='fa fa-2x fa-sign-in']") private WebElement loginButton;

    public LoginPage(WebDriver driver) {
        super(driver);
    }
    public void login (String username, String password){
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginButton.click();
    }

}
