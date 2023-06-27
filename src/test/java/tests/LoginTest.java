package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.LoginPage;

import static org.testng.Assert.assertTrue;

public class LoginTest {

    @Test
    public void shouldLoginSuccessfully() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginAs("standard_user", "secret_sauce");

        assertTrue(true);
    }

    @Test
    public void shouldFailLogin() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginAs("xxx", "yyy");

        assertTrue(false);
    }
}
