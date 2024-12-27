@shopping
Feature: Pruebas de Regresión del Carrito de Compras
  Como equipo de QA
  Quiero validar el funcionamiento del carrito de compras
  Para asegurar que no haya comportamientos no deseados que afecten la experiencia del usuario

  @mobile
  Scenario Outline: Validar la funcionalidad del carrito de compras
    Given estoy en la aplicación de SauceLabs
    And valido que carguen correctamente los productos en la galeria
    When agrego <UNIDADES> del siguiente producto "<PRODUCTO>"
    Then valido el carrito de compra actualice correctamente

    Examples:
      | PRODUCTO                  | UNIDADES |
      | Sauce Labs Backpack      | 1        |
      | Sauce Labs Bolt T-Shirt  | 1        |
      | Sauce Labs Bike Light    | 2        |