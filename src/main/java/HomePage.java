import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='header_user_info']/a")
    private WebElement signInButton;



    public AuthenticationPage clickSignInButton() {
        signInButton.click();
        return new AuthenticationPage(driver);
    }



}
