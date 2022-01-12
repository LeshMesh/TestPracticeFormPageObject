package tests;

import org.junit.jupiter.api.Test;

import static tests.TestData.*;

public class PracticeFormTestPageObject extends TestBase {

    @Test
    void fillFormTest() {
        registrationPage.openPage()
                .typeFirstName()
                .typeLastName()
                .typeUserEmail()
                .typeGenderSelect()
                .typeMobileNumber()
                .typeSubjectsSelect()
                .typeHobbiesSelect()
                .typeUploadPicture()
                .typeCurrentAddress()
                .typeStateAndCitySelect();
        calendarComponent.setDate(dayOfBirth, monthOfBirth, yearOfBirth);
        registrationPage.clickButtonSubmit();
        registrationPage.checkResultRegistation();
    }
}
