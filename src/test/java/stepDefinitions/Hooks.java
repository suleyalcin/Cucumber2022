package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {

    /*
    step definitions pakage'i icerisinde
 @before @after gibi bir notasyon varsa  extends test base dememize gerek kalmadan
 her scenario'dan once ve sonra bu methodlar calisir
 Bu da bizim isteyebilecegimiz bir durum degildir
 Cucumber'da @before @after kullanma ihtiyacimiz olursa bunu
 stepdefinitions pakage;i altinda olusturacagimiz hooks classina koyariz

 biz her scenario'dan sonra
     */

    @After
    public void tearDown(Scenario scenario){
        final byte[] screenshot=((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        if (scenario.isFailed()) {
            scenario.attach(screenshot, "image/png","screenshots");
        }
        Driver.closeDriver();
    }
}
