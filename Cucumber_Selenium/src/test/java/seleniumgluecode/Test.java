package seleniumgluecode;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;


public class Test extends TestBase{

    @Given("^El usuario se encuentra en la pagina inicio de choucairtesting$")
    public void el_usuario_se_encuentra_en_la_pagina_inicio_de_choucairtesting() throws Throwable {
        Assert.assertTrue(paginaInicio.pagInicioIsDisplayed());
    }

    @When("^Hace click sobre el boton Empleos$")
    public void hace_click_sobre_el_boton_Empleos() throws Throwable {
        paginaInicio.clickOnInicio();
    }

    @Then("^Se debe redirir a la pantalla de empleos$")
    public void se_debe_redirir_a_la_pantalla_de_empleos() throws Throwable {
        Assert.assertTrue("No se redirecciono a la sección de Empleos", paginaEmpleos.isTitleEmpleos());
    }

}
