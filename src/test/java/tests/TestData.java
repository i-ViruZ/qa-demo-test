package tests;

import com.github.javafaker.Faker;



public class TestData {

    Faker faker = new Faker();
    String name = faker.name().fullName();
    String firstName = faker.name().firstName();
    String lastName = faker.name().lastName();
    String userEmail = faker.internet().emailAddress();

    String streetAddress = faker.address().streetAddress();

}
