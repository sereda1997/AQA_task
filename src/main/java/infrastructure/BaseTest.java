package infrastructure;

import PageObjects.LoginPage;
import com.codeborne.selenide.Configuration;
import infrastructure.utils.Report;
import org.testng.annotations.BeforeClass;

import static com.codeborne.selenide.Selenide.open;

public class BaseTest {
    public static String keepit_test_site_url = "https://ws-test.keepit.com";

    @BeforeClass
    protected void createWebDriver() {
        Configuration.startMaximized = true;
        Configuration.browser = ChromeDriverProvider.class.getName();
    }

    protected LoginPage openTestSite() {
        Report.log("Open Login Page");
        open(keepit_test_site_url);
        return new LoginPage();
    }
}
