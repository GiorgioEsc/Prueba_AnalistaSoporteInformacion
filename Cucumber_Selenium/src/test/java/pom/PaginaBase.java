package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaginaBase {

    private WebDriver driver;

    public PaginaBase (WebDriver driver){
        this.driver = driver;
    }

    //ClickInicio
    public void click (By element) throws Exception {
        try{
        driver.findElement(element).click();
        }catch (Exception e){
            throw new Exception("No se pudo hacer click sobre el elemento: "+element);
        }
    }

    //Display
    public boolean isDisplayed (By element) throws Exception {
        try{
           return driver.findElement(element).isDisplayed();
        }catch (Exception e){
            throw new Exception("No se pudo mostrar el elemento: "+element);
        }
    }

    //Texto
    public String getText (By element) throws Exception {
        try{
            return driver.findElement(element).getText();
        }catch (Exception e){
            throw new Exception("No se pudo obtener el texto del elemento"+element);
        }
    }

    //Titulo
    public String getTitle () throws Exception {
        try{
            return driver.getTitle();
        }catch (Exception e){
            throw new Exception("No se pudo obtener el titulo del driver");
        }
    }

}
