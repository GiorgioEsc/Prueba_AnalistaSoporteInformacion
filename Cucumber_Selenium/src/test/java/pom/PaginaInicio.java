package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class PaginaInicio extends PaginaBase {
    private String tituloPagina="Choucair Testing";
    private By Empleos = By.id("menu-item-550");


    public PaginaInicio(WebDriver driver) {
        super(driver);
    }

    public boolean pagInicioIsDisplayed() throws Exception{
        return this.getTitle().equals(tituloPagina);
    }

    public void clickOnInicio() throws Exception {
        this.click(Empleos);
    }


}
