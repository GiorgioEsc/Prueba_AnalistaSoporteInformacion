package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class PaginaEmpleos extends PaginaBase {

    private By localizador = By.className("elementor-button-wrapper");
    private String tituloPagina = "Ir al portal de empleos";

    public PaginaEmpleos(WebDriver driver) {
        super(driver);
    }

    public boolean isTitleEmpleos() throws Exception {
       return this.isDisplayed(localizador) && this.getText(localizador).equals(tituloPagina);
    }

}
