package SecondProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.yaml.snakeyaml.events.Event;

import java.util.List;
public class BasePage {
    private static WebDriver driver;

    /**
     *finding an element by tag name
     * @param ID
     */
    public static WebElement byId(String ID) {
        WebElement element= driver.findElement(By.id(ID));
        return element;
    }

    /**
     * Clicking on fields/buttons
     * @param locator
     */

    public void clickElement(By locator) {
        getWebElement(locator).click();
    }

    /**
     * Writing in a field
     * @param locator
     * @param text
     */
    public void sendKeysToElement(By locator, String text) {
        getWebElement(locator).sendKeys(text);
    }

    /**
     * pick a value from a list
     * @return
     */
    public void pickValueFromList() {
        List<WebElement> elementsList= driver.findElements(By.name(""));
    }
    private WebElement getWebElement(By locator) {
        return DriverSingleton.getDriverInstance().findElement(locator);
    }
    /**
     * comparing between two String values
     *
     */
    public void assertionField (String gettingValue) {
        Assert.assertEquals("","");
    }
}