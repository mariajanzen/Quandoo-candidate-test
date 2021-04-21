package com.company.steps;

import com.company.pages.HoversPage;
import io.cucumber.java8.En;

import static com.codeborne.selenide.Selenide.open;
import static com.company.pages.HoversPage.hoversURL;

public class HoversSteps implements En {
    HoversPage hoversPage;

    public HoversSteps() {

        Given("I am on the HoversPage", () -> {
            hoversPage = open(hoversURL, HoversPage.class);
        });

        When("I hover over the profile pictures", () -> {
            for (int i = 3; i > 0; --i) {
                hoversPage.hoverOverProfiles(i);
            }
        });

        Then("I see the user information under the picture", () -> {
            for(int i = 3; i > 0; --i) {
                hoversPage.isUsernamePresent("user" + i, i-1);
            }
        });
    }
}
