package tests;

import com.github.javafaker.Faker;

import java.util.Locale;

public class TestDataWithFaker {

    static Faker faker = new Faker(new Locale("en"));

    public static String firstName = faker.name().firstName();
    public static String lastName = faker.name().lastName();
    public static String userEmail = faker.internet().emailAddress();
    public static String mobileNumber = faker.phoneNumber().subscriberNumber(10);
    public static String currentAddress = faker.address().fullAddress();
    public static String
            gender = "Female",
            subjects = "C",
            subjectsAll = "Computer Science",
            pathPicture = "img/dog.jpg",
            namePicture = "dog.jpg",
            state = "Haryana",
            city = "Karnal",
            hobbies = "Sports, Reading, Music",
            dayOfBirth = "03",
            monthOfBirth = "December",
            yearOfBirth = "2000";
}
