package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MenuPage {
    public final static By ALL_ITEMS_OPTION = By.id("inventory_sidebar_link");
    public final static By ABOUT_OPTION = By.id("about_sidebar_link");
    public final static By LOGOUT_OPTION = By.id("logout_sidebar_link");
    public final static By RESET_APP_STATE_OPTION = By.id("reset_sidebar_link");
    public final static By CLOSE_BUTTON = By.xpath("//button[text()='Close Menu']");
    WebDriver driver;

    public MenuPage(WebDriver driver) {
        this.driver = driver;
    }

    public ProductsPage clickAllItemsOption() {
        driver.findElement(ALL_ITEMS_OPTION).click();
        return new ProductsPage(driver);
    }

    public void clickAboutOption() {
        driver.findElement(ABOUT_OPTION).click();
    }

    public LoginPage clickLogoutOption() {
        driver.findElement(LOGOUT_OPTION).click();
        return new LoginPage(driver);
    }

    public void clickResetAppStateOption() {
        driver.findElement(RESET_APP_STATE_OPTION).click();
    }

    public void clickCloseButton() {
        driver.findElement(CLOSE_BUTTON).click();
    }
}