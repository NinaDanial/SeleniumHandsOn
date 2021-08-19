package SecondProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestNGAnnotations {


    public static WebElement getWebElement(By locator) {
        return DriverSingleton.getDriverInstance().findElement(locator);
    }
}
