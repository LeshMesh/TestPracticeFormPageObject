package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import pages.RegistrationPageWithFaker;
import pages.components.CalendarComponent;

public class TestBaseWithFaker {

    RegistrationPageWithFaker registrationPageWithFaker = new RegistrationPageWithFaker();
    CalendarComponent calendarComponent = new CalendarComponent();

    @BeforeAll
    static void setUp() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browser = "CHROME";
        Configuration.browserSize = "1280x720";
    }
}
