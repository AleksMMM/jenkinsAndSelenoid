package com.guru.qa.tests;

import com.guru.qa.pages.RegistrationFormPage;
import com.guru.qa.utils.RandomData;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class AutomationFormTest {

    @Test
    @DisplayName("Fill form with correct data test")
    void fillFormTest() {
        RegistrationFormPage registrationFormPage = new RegistrationFormPage();
        step("Open registration form", () -> {
            registrationFormPage.openForm();
        });
        step("Fill in registration form with data", () -> {
            registrationFormPage.fillForm(new RandomData());
        });
        step("Check if modal results is equal to the data you filled", () -> {
            registrationFormPage.checkResults(new RandomData());
        });
    }
}
