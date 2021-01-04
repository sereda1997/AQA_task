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

    public void inputConnectorName(String connectorsName) {
        Report.log("Set connectors name: " + connectorsName);
        nameInput.setValue(connectorsName);
    }

    public void verifyNextButtonState() {
        Report.log("Verify If Next Button enabled");
        nextButton.shouldBe(Condition.enabled);
    }
}
