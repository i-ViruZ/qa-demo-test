package tests;

import com.codeborne.selenide.SelenideElement;
import components.Calendar1;

import static com.codeborne.selenide.CollectionCondition.texts;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;

public class PsgeTest extends TestData{

    private SelenideElement firstNameInput = $("#firstName");
    private SelenideElement lastNameInput = $("#lastName");
    private SelenideElement userEmailInput = $("#userEmail");
    private SelenideElement genterWrapper = $("#genterWrapper");
    private SelenideElement userNumberInput = $("#userNumber");
    private SelenideElement userHobbies = $("#hobbiesWrapper");
    private SelenideElement userImage = $("#uploadPicture");
    private SelenideElement userAdres = $("#currentAddress");
    private SelenideElement userCity = $("#submit");


    Calendar1 calendar = new Calendar1();



    public PsgeTest openPage() {
        open("/automation-practice-form");
        $(".practice-form-wrapper").shouldHave(text("Student Registration Form"));
        executeJavaScript("$('#fixedban').remove()"); //убрать рекламу из браузера
        return this;
    }

    public PsgeTest setFirstName(String value) {
        firstNameInput.setValue(value);
        return this;
    }

    public PsgeTest setLastName(String value) {
        lastNameInput.setValue(value);
        return this;
    }

    public PsgeTest setUserEmail(String value) {
        userEmailInput.setValue(value);
        return this;
    }

    public PsgeTest setGenter(String value) {
        genterWrapper.$(byText("Male")).click();
        return this;
    }

    public PsgeTest setUserNumber(String value) {
        userNumberInput.setValue(value);
        return this;
    }

    public PsgeTest setDateOfBirth(String day, String month, String year) {
        $("#dateOfBirthInput").click();
        new Calendar1().setDate(day, month, year);
        return this;
    }

    public PsgeTest setSubjects() {
        $("#subjectsInput").setValue("English");
        $("#subjectsInput").pressEnter();
        return this;
    }


    public PsgeTest setHobbies(String value) {
        userHobbies.$(byText("Sports")).click();
        return this;
    }

    public PsgeTest setImg(String value) {
        userImage.uploadFromClasspath("img/1.img");
        return this;
    }

    public PsgeTest setAdres(String value) {
        userAdres.setValue(value);
        ;
        return this;
    }

    public PsgeTest setState() {
        $("#state").click();
        $("#react-select-3-option-3").click();
        return this;
    }

    public PsgeTest setCity() {
        $("#city").click();
        $(withText("Jaiselmer")).click();
        return this;
    }

    public PsgeTest setSubmit() {
        userCity.click();
        return this;
    }

    public PsgeTest setRespons() {
        $$(".table-responsive").shouldHave(texts(firstName, lastName));
        $(".table-responsive").shouldHave(text(userEmail));
        $$(".table-responsive").shouldHave(texts("Male"));
        $$(".table-responsive").shouldHave(texts("0000000000"));
        $(".table-responsive").shouldHave(text("29 May,1987"),text("English"),text("Sports"), text(streetAddress));
        return this;

//    public RegistrationPage checkResult(String key, String value) {
//        $(".table-responsive").$(byText(key)).parent().shouldHave(text(value));
//        return this;
//    }

    }

}
