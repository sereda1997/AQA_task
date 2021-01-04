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


    public ConnectorsPage logIn(String email, String password) throws InterruptedException {
        Report.log("Login as user :" + email);
        emailInput.setValue(email);
        Thread.sleep(5000L);// Only for presentation
        passwordInput.setValue(password);
        Thread.sleep(5000L);// Only for presentation
        submitButton.click();
        return new ConnectorsPage();
    }


}
