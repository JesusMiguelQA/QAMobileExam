package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class TiendaHomeScreen extends BaseScreen {

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.saucelabs.mydemoapp.android:id/productTV']")
    public WebElement lblProducts;

    @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView[@content-desc='Displays all products of catalog']")
    public WebElement gridProducts;

    @AndroidFindBy(xpath = "//android.widget.ScrollView[@resource-id='com.saucelabs.mydemoapp.android:id/scrollView']")
    public WebElement scrollView;
}