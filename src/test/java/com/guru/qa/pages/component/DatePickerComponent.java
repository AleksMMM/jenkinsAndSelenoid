package com.guru.qa.pages.component;

import static com.codeborne.selenide.Selenide.$;

public class DatePickerComponent {
    public DatePickerComponent setDate(String day, String month, String year) {
        $("#dateOfBirthInput").click();
        $(".react-datepicker__year-select").selectOptionByValue(year);
        $(".react-datepicker__month-select").selectOptionContainingText(month);
        $(".react-datepicker__day--0" + day + ":not(.react-datepicker__day--outside-month)").click();
        return this;
    }
}
