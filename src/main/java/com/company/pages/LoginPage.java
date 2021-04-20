package com.company.pages;

import com.codeborne.selenide.SelenideElement;
import com.company.util.PropertiesLoader;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    /* Properties */
    public static String loginURL = PropertiesLoader.loadProperty("url") + "/login";
    private static String validUsername = PropertiesLoader.loadProperty("valid.username");
    private static String validPassword = PropertiesLoader.loadProperty("valid.password");
    public static String secureURL = PropertiesLoader.loadProperty("url") +"/secure";


    private static String invalidUsername = "qwerty";
    private static String invalidPwd = "Qwerty!";



    /* Elements */

    private static By usernameInput = By.id("username");
    private static By pwdInput = By.id("password");
    private static By loginBtn = By.xpath("//*[@id=\"login\"]/button/i");
    private static By header = By.cssSelector("#content > div > h2"); //text "Login Page"
    private static By registrationHeader = By.id ("flash-messages"); //text " You logged into a secure area! "

    public static String invalidUsernameMessage = " Your username is invalid! ";
    public static String invalidPasswordMessage = " Your password is invalid! ";


    public void validUsernameInput() {
        $(usernameInput).setValue(validUsername);
    }
    public void validPwdInput() {
        $(pwdInput).setValue(validPassword);
    }

    public void invalidUserInput() {
        $(usernameInput).setValue(invalidUsername);
    }

    public void invalidPwdInput() {
        $(pwdInput).setValue(invalidPwd);
    }

    public void clickOnLoginBtn() {
        $(loginBtn).click();
    }

    public SelenideElement secureAreaHeader() {
        return $(registrationHeader);

    }

    public SelenideElement errorUsernameMessage() {
        return $(registrationHeader);
    }

    public SelenideElement errorPwdMessage() {
        return $(registrationHeader);
    }

}
