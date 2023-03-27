package stepDefinitions;



import com.exito.tasks.AgregarProductos;
import com.exito.tasks.BuscarProductos;
import com.exito.userInterface.HomePage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;


import java.time.Duration;


public class productosExito {

    //@Managed(driver = "firefox")
    //FirefoxProfile customProfile = new FirefoxProfile();

    //FirefoxOptions options = new FirefoxOptions();


       private   WebDriver navegador;
        JavascriptExecutor js = (JavascriptExecutor) driver;
        private Actor actor = Actor.named("Global");
        private HomePage homePage = new HomePage();
        //FirefoxProfile customProfile = new FirefoxProfile();
         //WebDriver driver = new FirefoxDriver(customProfile);


       //ChromeOptions options = new ChromeOptions();
       //WebDriver driver = new ChromeDriver(options);


        @Given("^que un nuevo cliente accede a la web de exito$")
        public void queUnNuevoClienteAccedeALaWebDeExito() throws InterruptedException {
            //options.setProfile(new FirefoxProfile());
            //customProfile.setPreference("dom.disable_beforeunload", true);
            //options.addArguments("--remote-allow-origins=*");
            //driver.get("https://www.google.com");
            //options.addArguments("--disable-notifications");
            Thread.sleep(10000);
            //driver.get("https://www.exito.com/");
            Thread.sleep(10000);
            //driver.quit();
            Thread.sleep(10000);
            //driver.close();

            actor.can(BrowseTheWeb.with(navegador));
            Thread.sleep(2000);
            actor.attemptsTo(Open.browserOn(homePage));
            Thread.sleep(10000);





           /* WebDriverWait wait = new WebDriverWait(navegador, Duration.ofMillis(10000));
            wait.until(ExpectedConditions.alertIsPresent());
            Alert alert = driver.switchTo().alert();
            Assert.assertTrue(alert.getText().contains("Thanks."));
            alert.accept();*/

            //Alert alert = navegador.switchTo().alert();
            //alert.accept();
             //Thread.sleep(2000);
            //WebDriver navegador = new ChromeDriver(chromeOptions);
            //Alert alert = navegador.switchTo().alert();
            //alert.accept();

    }
    @When("^el agrega (.*) unidades de (.*) de (.*) al carro$")
    public void elAgregaProductosAlCarro(String cantidad, String categoria,String tipoCategoria) throws InterruptedException {
            Thread.sleep(2000);
            actor.wasAbleTo(

              BuscarProductos.conCategoria(categoria, tipoCategoria),
              AgregarProductos.cantidad(cantidad)
      );
    }

    @Then("^el ve los productos listado en el carro de compras$")
    public void elVeLosProductosListadoEnElCarroDeCompras() {

    }

    @When("^el agrega varios productos al carro$")
    public void elAgregaVariosProductosAlCarro(DataTable arg1) {

    }


}
