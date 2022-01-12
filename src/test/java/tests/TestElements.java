package tests;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class TestElements {

    public static SelenideElement
            firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            userEmailInput = $("#userEmail"),
            mobileNumberInput = $("#userNumber"),
            currentAddressInput = $("#currentAddress"),
            genderSelect = $("#genterWrapper"),
            subjectsSelect = $("#subjectsInput"),
            hobbiesSportsSelect = $("[for=hobbies-checkbox-1]"),
            hobbiesReadingSelect = $("[for=hobbies-checkbox-2]"),
            hobbiesMusicSelect = $("[for=hobbies-checkbox-3]"),
            pictureUpload = $("#uploadPicture"),
            stateSelect = $("#state"),
            citySelect = $("#city"),
            listStateAndCitySelect = $("#stateCity-wrapper"),
            resultTable = $(".modal-content"),
            buttonSubmit = $("#submit");
}
