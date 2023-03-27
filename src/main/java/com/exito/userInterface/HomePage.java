package com.exito.userInterface;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeOptions;

@DefaultUrl("https://www.exito.com/")
public class HomePage extends PageObject {
     //WebDriverManager.chromedriver().setup();



    public static final Target CATEGORIA_BUTTON =Target.the("Boton en donde se da click para ver las categorias").locatedBy("(By.xpath('//div[@class=\"vtex-button__label flex items-center justify-center h-100 ph6 \"]')");
}
