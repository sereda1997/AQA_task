package PageObjects;

import com.codeborne.selenide.SelenideElement;
import infrastructure.CloudConectors;
import infrastructure.utils.Report;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class ConnectorsPage {
    private final SelenideElement
            addConectorButton = $(By.id("cloud-devices-button")),
            dropdownMenu = $(By.className("main-links"));
    private final ModalDialogComponent modalDialogComponent = new ModalDialogComponent();

    private void clickAddCloudConector() {
        addConectorButton.click();
    }

    public ConnectorsPage addConector(CloudConectors conector) {
        Report.log("Click add conector:" + conector.getDropdownText());
        clickAddCloudConector();
        dropdownMenu.$(byText(conector.getDropdownText())).hover().click();
        return this;
    }

    public ConnectorsPage createNewConector(String name) throws InterruptedException {
        modalDialogComponent.inputConnectorName(name);
        modalDialogComponent.verifyNextButtonState();
        return this;
    }

}
