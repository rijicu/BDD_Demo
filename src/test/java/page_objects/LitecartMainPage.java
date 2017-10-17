package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.DriverFactory;

import java.util.List;

public class LitecartMainPage extends AbstractPage {

    private final By emailAddressFieldLocator = By.name("email");
    private final By passwordFieldLocator = By.name("password");
    private final By loginButtonLocator = By.name("login");
    private final By stickerSaleLocator = By.xpath("//div[@class='sticker sale']");
//    @FindBy(name = "email")
//    private WebElement emailInput;
//
//    @FindBy(name = "password")
//    private WebElement passwordInput;
//
//    @FindBy(name = "login")
//    private WebElement loginInput;
    public Boolean isEmailFieldPresent(){
        return isElementPresent(emailAddressFieldLocator);
    }

    public Boolean isPasswordFieldPresent(){
        return isElementPresent(passwordFieldLocator);
    }

    public Boolean isLoginButtonPresent() {
        return isElementPresent(loginButtonLocator);
    }

    public Boolean isSaleStickersListNotEmpty(){
        //return isElementPresent(stickerSaleLocator);
       return getSaleStickers().size() > 0;
    }

    private Boolean isElementPresent (By element) {
        return !driver.findElements(element).isEmpty();
    }

    private List<WebElement> getSaleStickers() {
        return driver.findElements(stickerSaleLocator);
    }

    public LitecartMainPage open() {
        driver.get("http://localhost/");
        return new LitecartMainPage();
    }
}
