package tests;

import org.junit.jupiter.api.Test;

import static tests.TestDataWithFaker.*;

public class PracticeFormTestPageObjectWithFaker extends TestBaseWithFaker {

    @Test
    void fillFormTest() {
        registrationPageWithFaker.openPage()
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
        registrationPageWithFaker.clickButtonSubmit();
        registrationPageWithFaker.checkResultRegistation();
    }
}
