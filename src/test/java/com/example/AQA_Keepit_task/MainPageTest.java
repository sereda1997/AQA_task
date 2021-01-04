package com.example.AQA_Keepit_task;

import PageObjects.ConnectorsPage;
import infrastructure.BaseTest;
import infrastructure.RequestUtils;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.*;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static infrastructure.CloudConectors.Office365Admin;

public class MainPageTest extends BaseTest {
    @Test
    @Severity(SeverityLevel.BLOCKER)
    @Description("Verify the ability to add Office365Connector")
    public void VerifyTheAbilityToCreateOffice365Connector() {
        ConnectorsPage page =
                openKeepitTestSite()
                        .logIn("automation@keepitqa.com", "E#*b2wGIbFHz")
                        .addConector(Office365Admin)
                        .createNewConector("Test");
    }

    @Test
    @Severity(SeverityLevel.BLOCKER)
    @Description("Verify User Endpoint")
    public void VerifyUsersEndpoint() {
        RequestUtils.verifyIfAllElements("zhc4v6-5ev7di-9hhhlm");
        RequestUtils.verifySchemaAndElements("zhc4v6-5ev7di-9hhhlm");
    }

}
