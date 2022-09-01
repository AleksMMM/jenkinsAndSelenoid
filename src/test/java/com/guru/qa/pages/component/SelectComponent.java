package com.guru.qa.pages.component;

import com.codeborne.selenide.SelenideElement;

public class SelectComponent {
    private SelenideElement elementInput;

    public SelectComponent(SelenideElement elementInput) {
        this.elementInput = elementInput;
    }

    public SelectComponent setValue(String value) {
        elementInput.setValue(value).pressEnter();
        return this;
    }
}
