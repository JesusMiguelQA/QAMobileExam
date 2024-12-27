package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class TiendaCartScreen extends BaseScreen {

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.saucelabs.mydemoapp.android:id/productTV']")
    public WebElement lblProductName;

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc='Removes product from cart']")
    public WebElement btnRemoveProduct;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc='Confirms products for checkout']")
    public WebElement btnProceedCheckout;
}