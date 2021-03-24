import org.openqa.selenium.WebDriver;

public class AuthenticationPage {

    private WebDriver driver;

    public AuthenticationPage(WebDriver driver) {
        this.driver = driver;
    }


    public String getUrl() {
        return driver.getCurrentUrl();
    }
}
