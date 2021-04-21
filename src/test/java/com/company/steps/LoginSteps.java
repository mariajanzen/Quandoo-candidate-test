package com.company.steps;

import com.company.pages.LoginPage;
import io.cucumber.java8.En;

import static com.codeborne.selenide.Selenide.open;
import static com.company.pages.LoginPage.*;

public class LoginSteps implements En {
    LoginPage loginPage;

    public LoginSteps() {

        Given("I am on the LoginPage", () -> {
            loginPage = open(loginURL, LoginPage.class);
                });

        When("I insert valid username", () -> {
            loginPage.validUsernameInput();
        });

        When("I insert valid password", () -> {
            loginPage.validPwdInput();
        });

        Then("I click on the login button", () -> {
            loginPage.clickOnLoginBtn();
        });

        Then("I see correct SecureArea", () -> {
            loginPage.secureAreaHeader();
        });

        When("I insert invalid username", () -> {
            loginPage.invalidUserInput();
        });

        When("I insert invalid password", () -> {
            loginPage.invalidPwdInput();
        });

        Then("I see error username message", () -> {
            loginPage.errorUsernameMessage().getText().equals(invalidUsernameMessage);
        });

        Then("I see error password message", () -> {
            loginPage.errorPwdMessage().getText().equals(invalidPasswordMessage);
        });

    }
}
