package GunTour.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePageUser extends PageObject {

    WebDriver driver = getDriver();

    private final By productTittle = By.xpath("//*[@id=\"root\"]/div/div/div[2]/header/h5/span");
    private final By bookingIcon = By.xpath("//*[@id=\"root\"]/div/nav/div/div[1]/a/p");
    private final By loginSuccessPopUp = By.xpath("/html/body/div[2]/div");
    private final By rightArrowProduct = By.xpath("//*[@id=\"root\"]/div/div/div[3]/button[2]");
    private final By leftArrowProduct = By.xpath("//*[@id=\"root\"]/div/div/div[3]/button[1]");
    private final By communityPicture = By.xpath("//*[@id=\"root\"]/div/div/section[3]/div/div[2]/img");
    private final By googleMap = By.xpath("//*[@id=\"mapDiv\"]/div/div/div[2]/div[2]");


    public String getUrl(){
        return driver.getCurrentUrl();
    }

    public String getProductTittle(){
        return driver.findElement(productTittle).getText();
    }

    public boolean isBookingVisible(){
        return driver.findElement(bookingIcon).isDisplayed();
    }

    public boolean isPopUpVisible(){
        return driver.findElement(loginSuccessPopUp).isDisplayed();
    }

    public boolean isCommunityPictureVisible(){
        return driver.findElement(communityPicture).isDisplayed();
    }

    public void clickMap(){
        driver.findElement(googleMap).click();
    }
}
