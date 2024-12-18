package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class HomeTest extends TestData{
    PsgeTest  registrationPage = new  PsgeTest ();




    @BeforeAll
    static void beforeAllBrowser() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.pageLoadStrategy = "eager";
       // Configuration.holdBrowserOpen = true;
    }


    @Test
    void registrationTest() {

        registrationPage.openPage()
                .setFirstName(firstName)
                .setLastName(lastName)
                .setUserEmail(userEmail)
                .setGenter("Male")
                .setUserNumber("0000000000")
                .setDateOfBirth("29","May", "1987")
                .setSubjects()
                .setHobbies("Sports")
                .setImg("img/1.img")
                .setAdres(streetAddress)
                .setState()
                .setCity()
                .setSubmit()
                .setRespons();
    }
}

