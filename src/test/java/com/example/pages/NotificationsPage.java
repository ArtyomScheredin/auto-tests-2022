package com.example.pages;


import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class NotificationsPage {
    private static final String URL = "https://ok.ru/notifications";
    private static final SelenideElement NOTIFICATIONS_HEADER = $(By.id("hook_Block_NotificationsLayerTitle"));

    public NotificationsPage() {
        NOTIFICATIONS_HEADER.shouldBe(visible);
    }

    public static NotificationsPage openPage() {
        open(URL);
        return new NotificationsPage();
    }

    public static boolean isOpen() {
        return NOTIFICATIONS_HEADER.isDisplayed();
    }

    public static String getURL() {
        return URL;
    }
}