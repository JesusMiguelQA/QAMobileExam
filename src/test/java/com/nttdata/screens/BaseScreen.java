package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class BaseScreen extends PageObject {

    public BaseScreen() {
        PageFactory.initElements(new AppiumFieldDecorator(getDriver()), this);
    }

    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc='Container for fragments']/android.view.ViewGroup")
    public WebElement mainContainer;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc='View menu']")
    public WebElement btnMenu;

    @AndroidFindBy(xpath = "//android.widget.RelativeLayout[@content-desc='Displays number of items in your cart']/android.widget.ImageView")
    public WebElement iconCart;

    public boolean validateScreen() {
        return mainContainer.isDisplayed();
    }
}