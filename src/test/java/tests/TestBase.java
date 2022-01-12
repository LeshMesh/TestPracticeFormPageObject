package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import pages.RegistrationPage;
import pages.components.CalendarComponent;

public class TestBase {

    RegistrationPage registrationPage = new RegistrationPage();
    CalendarComponent calendarComponent = new CalendarComponent();


    @BeforeAll
    static void setUp() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browser = "CHROME";
        Configuration.browserSize = "1280x720";
    }
}
