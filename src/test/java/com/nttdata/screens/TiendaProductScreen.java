package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class TiendaProductScreen extends BaseScreen {

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc='Tap to add product to cart']")
    public WebElement btnAddToCart;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.saucelabs.mydemoapp.android:id/noTV']")
    public WebElement txtQuantity;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc='Decrease item quantity']")
    public WebElement btnDecreaseQuantity;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc='Increase item quantity']")
    public WebElement btnIncreaseQuantity;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.saucelabs.mydemoapp.android:id/productTV']")
    public WebElement lblProductName;
}