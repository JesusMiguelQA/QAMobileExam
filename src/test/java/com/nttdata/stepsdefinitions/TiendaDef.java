package com.nttdata.stepsdefinitions;

import com.nttdata.steps.TiendaSteps;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class TiendaDef {

    @Steps
    private TiendaSteps tiendaSteps;

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("estoy en la aplicación de SauceLabs")
    public void estoyEnLaAplicaciónDeSauceLabs() {
        tiendaSteps.validateHomeScreen();
    }

    @And("valido que carguen correctamente los productos en la galeria")
    public void validoQueCarguenCorrectamenteLosProductosEnLaGaleria() {
        tiendaSteps.validateProductGrid();
    }

    @When("agrego {int} del siguiente producto {string}")
    public void agregoUNIDADESDelSiguienteProducto(Integer unidades, String producto) {
        tiendaSteps.selectProduct(producto);
        tiendaSteps.addToCart(unidades);
    }

    @Then("valido el carrito de compra actualice correctamente")
    public void validoElCarritoDeCompraActualiceCorrectamente() {
        tiendaSteps.validateCart();
    }
}