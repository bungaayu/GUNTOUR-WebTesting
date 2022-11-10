package GunTour.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleMapPage extends PageObject {

    WebDriver driver = getDriver();

    private final By mountGede = By.xpath("//*[@id=\"QA0Szd\"]/div/div/div[1]/div[2]/div/div[1]/div/div/div[2]/div[1]/div[1]/div[1]/h1/span[1]");


    public boolean isMountGedeDisplayed(){
        return driver.findElement(mountGede).isDisplayed();
    }
}
