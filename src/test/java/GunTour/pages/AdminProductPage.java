package GunTour.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static java.lang.Thread.sleep;

@DefaultUrl("https://guntour.vercel.app/admin")
public class AdminProductPage extends PageObject {

    @Managed
    WebDriver driver = getDriver();

    public static final String DIR = System.getProperty("user.dir");
    public static String IMAGE_FOLDER = DIR+"/src/test/resources/images";
    By clickOk = By.xpath("/html/body/div[2]/div/div[6]/button[1]");

    //    private final By productButton = By.xpath("//*[@id=\"root\"]/div/aside/div/div[2]/ul/li[1]/a");
    By tableTitle = By.xpath("//*[@id=\"root\"]/div/div/div[3]/div/div[2]/table/thead/tr/th[3]");
    By addProductButton = By.xpath("//*[@id=\"root\"]/div/div/div[3]/div/div[1]/div/label");
    By closeButton = By.xpath("//*[@id=\"root\"]/div/div/div[3]/div/div[1]/div/div/div/label/div");
    By productPhotoElement = By.xpath("//*[@id=\"root\"]/div/div/div[3]/div/div[1]/div/div/div/div[2]/div/input");
    By fieldProductName = By.xpath("//*[@id=\"root\"]/div/div/div[3]/div/div[1]/div/div/div/div[3]/input");
    By fieldRentPrice = By.xpath("//*[@id=\"root\"]/div/div/div[3]/div/div[1]/div/div/div/div[4]/input");
    By fieldDesc = By.xpath("//*[@id=\"root\"]/div/div/div[3]/div/div[1]/div/div/div/div[5]/textarea");
    By fieldWarning = By.xpath("//*[@id=\"root\"]/div/div/div[3]/div/div[1]/div/div/div/div[6]/textarea");
    By saveDataModal = By.xpath("//*[@id=\"root\"]/div/div/div[3]/div/div[1]/div/div/div/div[8]");
    By alertAddProductPopup = By.id("swal2-title");
    By editProductButton = By.id("button-edit-1");

    public void wait(int wait) {
        try {
            sleep(wait);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public String getUrl(){
        return driver.getCurrentUrl();
    }
    public void clickOk(){
        driver.findElement(clickOk).click();
        wait(1000);
    }
    public String getTableTitle(){
        return driver.findElement(tableTitle).getText();
    }
    public void clickAddProductButton(){
        driver.findElement(addProductButton).click();
        wait(1000);
    }
//    public void ClickProductButton(){
//        driver.findElement(productButton).click();
//    }
    public void scrollToCloseButton() {
        driver.findElement(By.id("my-modal-3")).sendKeys(Keys.CONTROL, Keys.END);
        wait(1000);
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,350)", "");
////        Actions act = new Actions(driver);
////        act.sendKeys(Keys.PAGE_DOWN).build().perform();
    }
    public void clickCloseButton(){
        driver.findElement(closeButton).click();
        wait(1000);
    }

    public void inputAddProductPhoto(){
        WebElement element= getDriver().switchTo().activeElement().findElement(productPhotoElement);
        element.sendKeys(IMAGE_FOLDER+"/Tenda.jpeg");
        wait(1000);
    }
    public void inputProductName(String productName) {
        driver.findElement(fieldProductName).sendKeys(productName);
        wait(1000);
    }
    public void inputRentPrice(String rentPrice) {
        driver.findElement(fieldRentPrice).sendKeys(rentPrice);
        wait(1000);
    }
    public void inputDesc(String desc) {
        driver.findElement(fieldDesc).sendKeys(desc);
        wait(1000);
    }
    public void inputWarning(String warning) {
        driver.findElement(fieldWarning).sendKeys(warning);
        wait(1000);
    }
    public void clickSaveDataButton(){
        driver.findElement(saveDataModal).click();
        wait(1000);
    }

    public String getAlertProductPopup() {
        return driver.findElement(alertAddProductPopup).getText();
    }

    public void clickEditProductButton() {
        driver.findElement(editProductButton).click();
    }
    public void inputEditProductPhoto(){
        WebElement element= getDriver().switchTo().activeElement().findElement(productPhotoElement);
        element.sendKeys(IMAGE_FOLDER+"/Tenda Update.jpeg");
        wait(1000);
    }


}
