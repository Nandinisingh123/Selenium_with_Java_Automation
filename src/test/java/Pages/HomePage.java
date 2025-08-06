package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    private WebDriver driver;
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    //LoginPage log=new LoginPage(driver);
    private By addcart1=By.id("add-to-cart-sauce-labs-backpack");
    private By addcart2=By.id("add-to-cart-sauce-labs-bike-light");
    private By addcart3= By.id("add-to-cart-test.allthethings()-t-shirt-(red)");
    private By cart=By.className("shopping_cart_link");
    private By check=By.id("checkout");
    private By FirstName=By.id("first-name");
    private By LastName=By.id("last-name");
    private By PostalCode=By.id("postal-code");
    private By Continue= By.id("continue");
    private By Finish= By.id("finish");
    private By backhome=By.id("back-to-products");
    public void addcart()
    {
        driver.findElement(addcart1).click();
        driver.findElement(addcart2).click();
        driver.findElement(addcart3).click();
        driver.findElement(cart).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(check));
        driver.findElement(check).click();
    }

    public void GiveInfo(String firstname, String lastname, String postalcode)
    {
        driver.findElement(FirstName).sendKeys(firstname);
        driver.findElement(LastName).sendKeys(lastname);
        driver.findElement(PostalCode).sendKeys(postalcode);
        driver.findElement(Continue).click();
        driver.findElement(Finish).click();
        driver.findElement(backhome).click();

    }
}
