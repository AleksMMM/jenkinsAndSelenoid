package com.guru.qa.pages.component;

import com.codeborne.selenide.SelenideElement;

public class AutoCompleteComponent {

    private SelenideElement elementInput;

    public AutoCompleteComponent(SelenideElement elementInput) {
        this.elementInput = elementInput;
    }

    public AutoCompleteComponent setValues(String[] values) {
        for (String value: values) {
            elementInput.setValue(value).pressEnter();
        }
        return this;
    }
}
