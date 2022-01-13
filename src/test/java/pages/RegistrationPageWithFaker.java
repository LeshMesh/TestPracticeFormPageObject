package pages;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static tests.TestDataWithFaker.*;
import static tests.TestElements.*;

public class RegistrationPageWithFaker {

    public RegistrationPageWithFaker openPage() {
        open("/automation-practice-form");

        return this;
    }

    public RegistrationPageWithFaker typeFirstName() {
        firstNameInput.setValue(firstName);

        return this;
    }

    public RegistrationPageWithFaker typeLastName() {
        lastNameInput.setValue(lastName);

        return this;
    }

    public RegistrationPageWithFaker typeUserEmail() {
        userEmailInput.setValue(userEmail);

        return this;
    }

    public RegistrationPageWithFaker typeMobileNumber() {
        mobileNumberInput.setValue(mobileNumber);

        return this;
    }

    public RegistrationPageWithFaker typeCurrentAddress() {
        currentAddressInput.setValue(currentAddress);

        return this;
    }

    public RegistrationPageWithFaker typeGenderSelect() {
        genderSelect.$(byText(gender)).click();

        return this;
    }

    public RegistrationPageWithFaker typeSubjectsSelect() {
        subjectsSelect.setValue(subjects);
        $(byText(subjectsAll)).scrollTo().click();

        return this;
    }

    public RegistrationPageWithFaker typeHobbiesSelect() {
        hobbiesSportsSelect.scrollTo().click();
        hobbiesReadingSelect.click();
        hobbiesMusicSelect.click();

        return this;
    }

    public RegistrationPageWithFaker typeUploadPicture() {
        pictureUpload.uploadFromClasspath(pathPicture);

        return this;
    }

    public RegistrationPageWithFaker typeStateAndCitySelect() {
        stateSelect.click();
        listStateAndCitySelect.$(byText(state)).click();
        citySelect.click();
        listStateAndCitySelect.$(byText(city)).click();

        return this;
    }

    public RegistrationPageWithFaker clickButtonSubmit() {
        buttonSubmit.scrollTo().click();

        return this;
    }

    public void checkResultRegistation() {
        resultTable.shouldBe(Condition.visible);
        resultTable.$(byText("Student Name")).parent().shouldHave(Condition.text(firstName + " " + lastName));
        resultTable.$(byText("Student Email")).parent().shouldHave(Condition.text(userEmail));
        resultTable.$(byText("Gender")).parent().shouldHave(Condition.text(gender));
        resultTable.$(byText("Mobile")).parent().shouldHave(Condition.text(mobileNumber));
        resultTable.$(byText("Date of Birth")).parent().shouldHave(Condition.text(dayOfBirth + " " + monthOfBirth + "," + yearOfBirth));
        resultTable.$(byText("Subjects")).parent().shouldHave(Condition.text(subjectsAll));
        resultTable.$(byText("Hobbies")).parent().shouldHave(Condition.text(hobbies));
        resultTable.$(byText("Picture")).parent().shouldHave(Condition.text(namePicture));
        resultTable.$(byText("Address")).parent().shouldHave(Condition.text(currentAddress));
        resultTable.$(byText("State and City")).parent().shouldHave(Condition.text(state + " " + city));
    }

}
