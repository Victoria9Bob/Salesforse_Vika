package Salesforse.Tests;

import Salesforse.Pages.AccountDetailsPage;
import Salesforse.Pages.AccountsPage;
import Salesforse.Pages.HomePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import Salesforse.Pages.LoginPage;

import java.util.concurrent.TimeUnit;

public class BaseTest {

//    protected static final String USERNAME = "voropaev.olegd-rdm4@force.com";
//    protected static final String PASSWORD = "password@2";
    protected static final String USERNAME = "123vika-5egd@force.com";
    protected static final String PASSWORD = "S12345Vika";
    protected WebDriver driver;
    protected LoginPage loginPage;
    protected HomePage homePage;
    protected AccountsPage accountsPage;
    protected AccountDetailsPage accountDetailsPage;

    @BeforeClass(alwaysRun = true)
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--ignore-certificate-errors");
        options.addArguments("--disable-popup-blocking");
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        accountsPage = new AccountsPage(driver);
        accountDetailsPage= new AccountDetailsPage(driver);
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        driver.quit();
    }
}
