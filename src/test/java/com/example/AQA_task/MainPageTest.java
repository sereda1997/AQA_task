package com.example.AQA_task;

import PageObjects.ConnectorsPage;
import infrastructure.BaseTest;
import infrastructure.RequestUtils;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;

import static infrastructure.CloudConectors.Office365Admin;

public class MainPageTest extends BaseTest {
    @Test
    @Severity(SeverityLevel.BLOCKER)
    @Description("Verify the ability to add Office365Connector")
    public void VerifyTheAbilityToCreateOffice365Connector() throws InterruptedException {
        ConnectorsPage page =
                openTestSite()
                        .logIn("automation@keepitqa.com", "password")
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
