package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        features = "src/test/java/features",
        glue = ("seleniumgluecode"),
        plugin =("json:test/report/cucumber_report.json")
)


public class Testrunner {
    @AfterClass
    public static void finalReporte(){

        try {
            System.out.println("Generando reporte");
            String[] cmd = {"cmd.exe", "/c", "npm run report"};
            Runtime.getRuntime().exec(cmd);
            System.out.println("El reporte se genero exitosamente");

        }catch (Exception ex){
            ex.printStackTrace();
        }

    }
}
