package tests;

import Pages.HomePage;
import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import Pages.LoginPage;

public class LoginTest extends BaseTest {

    public static void wait(int seconds) {
        try {
            Thread.sleep(seconds * 1000L);  // Convert seconds to milliseconds
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Restore the interrupt status
            e.printStackTrace();
        }
    }

    @Test
    public void testLogin() {
        driver.get("https://www.saucedemo.com/");
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePge=new HomePage(driver);
        loginPage.login("standard_user", "secret_sauce");
        Assert.assertTrue(driver.getCurrentUrl().contains("inventory"));
        homePge.addcart();
        wait(5);
        homePge.GiveInfo("Nandini","Singh","208008");
    }
}