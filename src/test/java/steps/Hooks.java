package steps;

import core.Propriedades;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.support.ui.WebDriverWait;

import static core.DriverFactory.*;
import static core.Propriedades.screenshot;

public class Hooks {


    @Before
    public void iniciar(Scenario _scenario){
        Propriedades.scenario = _scenario;
        getDriver().get("https://automation-sandbox-python-mpywqjbdza-uc.a.run.app");
        wait = new WebDriverWait(getDriver(), 60);
    }


    @After
    public void fechar(Scenario scenario)  {
        if (Propriedades.scenario.isFailed()) {
            screenshot();
        }
        if (Propriedades.FECHAR_BROWSER)
            killDriver();
    }
}
