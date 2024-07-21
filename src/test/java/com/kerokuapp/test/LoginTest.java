package com.kerokuapp.test;

import com.herokuapp.LoginPage;
import com.herokuapp.SecureAreaPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.herokuapp.LoginPage.LOGIN_URL;

public class LoginTest extends BaseTest {
    @Test
    public void loginText(){
        driver.get(LOGIN_URL);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("tomsmith","SuperSecretPassword!");
        SecureAreaPage secureAreaPage = new SecureAreaPage(driver);
        String actualMessage = secureAreaPage.setSuccessMesageText();
        String expectedMessage = "You logged into a secure area!";
        Assert.assertTrue(actualMessage.contains(expectedMessage));
        Assert.assertTrue(secureAreaPage.isLogoutButtonDisplayed());
    }
}
