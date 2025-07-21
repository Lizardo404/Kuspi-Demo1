package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class BasePage {
    protected static WebDriver driver;
    //  private static Actions actions;
    Actions actions = new Actions(driver);

    //un solo valor para todas las instancias del objeto, una sola instancia compartida para todas las clases
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15)); //wait explicit
    //webdriver esperara hasta 10' en la pagina hasta encontrar los webelements

    static {  // block static to open browser
        WebDriverManager.chromedriver().setup(); // call webdriver
        driver = new ChromeDriver();
        System.out.println("###################  Browser was Open by code  ##############");
    }

    public BasePage(WebDriver driver) { // code to execute one time at the first to run script
        BasePage.driver = driver;
    }

    //Static method to navigate a URL,  url --> argument to get web address
    public static void navigateTo(String url) {
        driver.get(url);
        WebDriverManager.chromedriver().setup(); // call to execute we  bdriver ASA chromeDriver
        driver.manage().window().maximize();
    }

    // close browser
    public static void closeBrowser(){
        driver.quit();
        System.out.println("###################  Browser was closes by code  ##############");
    }
    //
    //Framework to selenium!! Find Element by webdriver
    // Framework to reuse code only programing one time
    // Encuentra y devuelve un WebElement en la página utilizando un locator XPath, esperando a que esté presentente en el DOM
    private WebElement Find(String locator){
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));  //objetc to webelement return a waitelement until condition completed
    }   //ExpectedConditions --> attach import org.openqa.selenium.support.ui.ExpectedConditions;

    //instruction to clic on webElemeny
    public void clickElement (String locator){ // click element to recall on pageobjet class
        Find(locator).click();
    }

    //Action to mouse
    public void hoverOverElement(String locator){
        actions.moveToElement(Find(locator)).perform();
    }

    //Write text
    //instruction to clear and write on textbox webelement
    public void write(String locator, String keyToSent){   //Wi will share string argument
        Find(locator).clear();
        Find(locator).sendKeys(keyToSent);
        Find(locator).sendKeys(Keys.ENTER);
    }

    public String textFromElement(String locator) {
        return Find(locator).getText(); //Devuelve el texto de un WebElement, siempre y cuando tenga texto elemento si no tirara una excepcion

    }



}
