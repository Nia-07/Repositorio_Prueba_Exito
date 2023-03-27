Feature: Realizar compras de productos
  Como un nuevo cliente
  Quiero ingresar a la pagina Éxito https://www.exito.com
  Para realizar una compra de un producto

  @EscenarioSinProductos
  Scenario: Agregar productos al carrito de compras
    Given que un nuevo cliente accede a la web de exito
    When el agrega 3 unidades de Parlantes, de tecnologia al carro
    Then el ve los productos listado en el carro de compras
  @EscenarioConProductos
    Scenario Outline: Agregar productos al carrito de compras
      Given que un nuevo cliente accede a la web de exito
      When el agrega varios productos al carro
        | "<nombreProducto>"  | "<cantidadAgregar>"|
      Then el ve los productos listado en el carro de compras

      Examples:
        | nombreProducto  | cantidadAgregar|
        | audifonos       | 100            |
        | mercado         | despensa       |
        | bebes           | sillas         |



