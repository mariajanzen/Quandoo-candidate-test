package com.company.pages;


import com.codeborne.selenide.SelenideElement;
import com.company.util.PropertiesLoader;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class HoversPage {

    /* Properties */
    public static String hoversURL = PropertiesLoader.loadProperty("url") + "/hovers";

    /* Elements */
    private static final By imgElement = By.tagName("img");
    private static final By textElement = By.tagName("h5");

    public void hoverOverProfiles(int index) {
        $$(imgElement).get(index).hover();
    }

    public boolean isUsernamePresent(String username, int index) {
        String elementsText = $$(textElement).get(index).getText();
        return elementsText.contentEquals(username);
    }

    public SelenideElement textProfile() {
        return $(textElement);
    }

}
