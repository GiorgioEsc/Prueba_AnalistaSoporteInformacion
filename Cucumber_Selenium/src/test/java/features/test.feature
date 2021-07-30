Feature: Seccion Empleos
  Como candidato quiero ingresar a la seccion empleos para consultar las ofertas disponibles
  y la informacion de preparacion.

  Scenario: Ingresar a la categoria empleos desde la pantalla de inicio
    Given El usuario se encuentra en la pagina inicio de choucairtesting
    When Hace click sobre el boton Empleos
    Then Se debe redirir a la pantalla de empleos

