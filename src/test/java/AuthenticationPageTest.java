import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AuthenticationPageTest {

    private WebDriver driver;
    private HomePage homePage;


    @BeforeMethod
    public void before() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        homePage = new HomePage(driver);
        driver.get("http://automationpractice.com/index.php");

    }

    @Test
    public void shouldCheckUrl() {
        String url = homePage.clickSignInButton().getUrl();

        Assert.assertEquals(url, "http://automationpractice.com/index.php?controller=authentication&back=my-account");
    }

}
