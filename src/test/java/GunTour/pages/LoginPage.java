package GunTour.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static java.lang.Thread.sleep;

@DefaultUrl("https://guntour.vercel.app/login")
public class LoginPage extends PageObject {
    @Managed
    WebDriver driver = getDriver();

    private final By fieldEmail = By.id("email");
    private final By fieldPassword = By.id("password");
    private final By loginButton = By.id("sign");

    public void wait(int wait) {
        try {
            sleep(wait);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void InputEmail(String email){
        driver.findElement(fieldEmail).sendKeys(email);
        wait(1000);
    }
    public void InputPassword(String password){
        driver.findElement(fieldPassword).sendKeys(password);
        wait(1000);
    }
    public void ClickLoginButton(){
        driver.findElement(loginButton).click();
        wait(1000);
    }
    public String getUrl(){
        return driver.getCurrentUrl();
    }



}
