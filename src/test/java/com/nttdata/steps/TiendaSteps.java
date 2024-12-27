package com.nttdata.steps;

import com.nttdata.screens.TiendaHomeScreen;
import com.nttdata.screens.TiendaProductScreen;
import com.nttdata.screens.TiendaCartScreen;
import net.thucydides.core.annotations.Step;

public class TiendaSteps {

    TiendaHomeScreen tiendaHomeScreen;
    TiendaProductScreen tiendaProductScreen;
    TiendaCartScreen tiendaCartScreen;

    @Step("Validar carga de pantalla")
    public void validateHomeScreen() {
        tiendaHomeScreen.validateScreen();
        tiendaHomeScreen.lblProducts.isDisplayed();
    }

    @Step("Validar que la grilla de productos esté visible")
    public void validateProductGrid() {
        tiendaHomeScreen.gridProducts.isDisplayed();
    }

    @Step("Seleccionar el producto {0}")
    public void selectProduct(String productName) {
        String productXpath = String.format("//android.widget.ImageView[@content-desc='%s']", productName);
        tiendaHomeScreen.$(productXpath).click();
    }

    @Step("Agregar {0} unidades al carrito")
    public void addToCart(int units) {
        for(int i = 1; i < units; i++) {
            tiendaProductScreen.btnIncreaseQuantity.click();
        }
        tiendaProductScreen.btnAddToCart.click();
    }

    @Step("Validar que el carrito se actualizó")
    public void validateCart() {
        tiendaProductScreen.iconCart.isDisplayed();
    }
}