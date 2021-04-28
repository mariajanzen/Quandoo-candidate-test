package com.company.pages;

import com.codeborne.selenide.ElementsCollection;
import com.company.util.PropertiesLoader;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class TablesPage {

    /*Properties*/
    public static String tablesURL = PropertiesLoader.loadProperty("url") + "/tables";

    /* Elements */
    private static final By lastNameSorter = By.xpath("//*[@id=\'table2\']/thead/tr/th[1]/span");

    private static final By lastNameColumn = By.xpath("//*[@id=\'table2\']/tbody/tr/td[1]");

    private static final By firstNameSorter = By.xpath("//*[@id='table2']/thead/tr/th[2]");


    /*Page values*/
    public static List<String> listOfColumnTexts;


    public ElementsCollection lastNameColumnList() {
        return $$(lastNameColumn);
    }


    public void clickOnLastName() {
         $(lastNameSorter).click();
    }

    public List<String> sortColumnTextsList(String order) {
        List<String> sortedList = Collections.emptyList();

        if(order.equals("ascending")) {
            sortedList = listOfColumnTexts.stream().sorted().collect(Collectors.toList());
        }
        if(order.equals("descending")) {
            sortedList = listOfColumnTexts.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        }

        return sortedList;
    }
}
