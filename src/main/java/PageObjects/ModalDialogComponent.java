package PageObjects;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import infrastructure.utils.Report;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ModalDialogComponent {
    private final SelenideElement
            nameInput = $(By.id("name")),
            nextButton = $(By.id("next-button-1"));

    public void inputConnectorName(String connectorsName) throws InterruptedException {
        Report.log("Set connectors name: " + connectorsName);
        Thread.sleep(5000L);// Only for presentation
        nameInput.setValue(connectorsName);
    }

    public void verifyNextButtonState() throws InterruptedException {
        Report.log("Verify If Next Button enabled");
        Thread.sleep(5000L);// Only for presentation
        nextButton.shouldBe(Condition.enabled);
    }
}
