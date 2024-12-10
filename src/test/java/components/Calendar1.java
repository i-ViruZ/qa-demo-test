package components;

import static com.codeborne.selenide.Selenide.$;

public class Calendar1 {
    public void  setDate(String day, String month, String year) {

        $(".react-datepicker__month-select").selectOption("May");
        $(".react-datepicker__year-select").click();
        $(".react-datepicker__year-select").selectOption("1987");
        $(".react-datepicker__day--029:nth-child(6)").click();

    }
}