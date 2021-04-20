package com.company.steps;

import com.company.pages.LoginPage;
import com.company.pages.SecureArea;
import io.cucumber.java8.En;

import static com.codeborne.selenide.Selenide.open;
import static com.company.pages.LoginPage.loginURL;

public class LoginSteps implements En {
    LoginPage loginPage;

    public LoginSteps() {

        Given("I am on the LoginPage", () -> {
            loginPage = open(loginURL, LoginPage.class);
                });

        When("I insert valid user credentials", () -> {
            loginPage.validLoginInput();
            loginPage.clickOnLoginBtn();
        });

        Then("I see correct SecureArea", () -> {
            loginPage.secureAreaHeader();
        });


    }
}
