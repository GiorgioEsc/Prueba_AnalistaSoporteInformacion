package seleniumgluecode;

import org.openqa.selenium.WebDriver;
import pom.PaginaEmpleos;
import pom.PaginaInicio;

public class TestBase {

    protected WebDriver driver = Hooks.getDriver();

    protected PaginaInicio paginaInicio = new PaginaInicio(driver);
    protected PaginaEmpleos paginaEmpleos = new PaginaEmpleos(driver);


}
