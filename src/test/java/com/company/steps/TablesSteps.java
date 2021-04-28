package com.company.steps;

import com.company.pages.TablesPage;
import io.cucumber.java8.En;
import org.junit.Assert;

import java.util.List;

import static com.codeborne.selenide.Selenide.open;
import static com.company.pages.TablesPage.listOfColumnTexts;
import static com.company.pages.TablesPage.tablesURL;

public class TablesSteps implements En {

    TablesPage tablesPage;
    List<String> expectedSortedList;


    public TablesSteps() {

        Given("I am on the TablePage", () -> {
            tablesPage = open(tablesURL, TablesPage.class);
        });

        When("I sort data by LastName", () -> {
            listOfColumnTexts = tablesPage.lastNameColumnList().texts();

            tablesPage.clickOnLastName();
        });

        Then("I see {} data", (String order) -> {
            expectedSortedList = tablesPage.sortColumnTextsList(order);
            List<String> resultOfSorting = tablesPage.lastNameColumnList().texts();
            Assert.assertEquals(expectedSortedList, resultOfSorting);
        });
    }

}
