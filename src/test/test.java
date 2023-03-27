package Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class test {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(options);
        // WebDriver driver = new ChromeDriver();
        driver.get("https://www.exito.com/");
        By electronicos = By.xpath("//img[@alt=\"Electrodomésticos\"]");
        seleniumClick(driver, electronicos);
        driver.switchTo().parentFrame();
        Thread.sleep(10000);
        driver.close();
        driver.quit();
    }

    private static void highlightObjectect(WebDriver driver, WebElement ele){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", ele);
    }

    private static void seleniumClick(WebDriver driver, By xpath){
        WebElement element = driver.findElement(xpath);
        highlightObjectect(driver, element);
        element.click();
    }
}