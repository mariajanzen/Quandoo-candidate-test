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
    private static String secureURL = PropertiesLoader.loadProperty("url") +"/secure";


    private static String invalidUsername = "qwerty";
    private static String invalidPwd = "Qwerty!";



    /* Elements */

    private static By usernameInput = By.id("username");
    private static By pwdInput = By.id("password");
    private static By loginBtn = By.xpath("//*[@id=\"login\"]/button/i");
    private static By header = By.cssSelector("#content > div > h2"); //text "Login Page"
    private static By secureSuccessfulHeader = By.xpath("//*[@id=\"flash\"]/text()"); //text " You logged into a secure area! "
    private static By invalidUsernameMessage = By.xpath("//*[@id=\"flash\"]/text()"); //text " Your username is invalid! "
    private static By invalidPasswordMessage = By.xpath("//*[@id=\"flash\"]/text()"); //text " Your password is invalid! "

    public void validLoginInput() {
        $(usernameInput).setValue(validUsername);
        $(pwdInput).setValue(validPassword);
    }

    public void invalidUserInput() {
        $(usernameInput).setValue(invalidUsername);
        $(pwdInput).setValue(validPassword);
    }

    public void invalidPwdInput() {
        $(usernameInput).setValue(validUsername);
        $(pwdInput).setValue(invalidPwd);
    }

    public void clickOnLoginBtn() {
        $(loginBtn).click();
    }

    public SelenideElement secureAreaHeader() {
        return $(secureSuccessfulHeader);

    }





}
