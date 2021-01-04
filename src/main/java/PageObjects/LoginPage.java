package PageObjects;

import com.codeborne.selenide.SelenideElement;
import infrastructure.BaseTest;
import infrastructure.utils.Report;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage extends BaseTest {

    private final SelenideElement emailInput = $(By.xpath("//input[@id='login-form-login']")),
            passwordInput = $(By.cssSelector("#login-form-password")),
            submitButton = $(By.id("login-form-login-button"));


    public ConnectorsPage logIn(String email, String password) {
        Report.log("Login as user :" + email);
        emailInput.setValue(email);
        passwordInput.setValue(password);
        submitButton.click();
        return new ConnectorsPage();
    }


}
