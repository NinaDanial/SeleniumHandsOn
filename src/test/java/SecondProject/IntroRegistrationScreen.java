package SecondProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class IntroRegistrationScreen extends BasePage{
    public static WebDriver driver;
    public static WebDriverWait wait;

    @BeforeClass
    public static void runOnceBeforeClass() {
        driver = DriverSingleton.getDriverInstance();
        driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://buyme.co.il");

    }
    @Test
    public void PressRegistration() {
        WebElement RegistrationButton =
                TestNGAnnotations.getWebElement(By.className("seperator-link"));
        RegistrationButton.click();
    }
       @Test
               public void PressRegistrationLink() {
           WebElement RegistrationLink =
                   TestNGAnnotations.getWebElement(By.cssSelector("span.text-link"));
           RegistrationLink.click();
       }
       @Test
    public void EnterFirstNameByKey() {
        WebElement FirstNameElement= TestNGAnnotations.getWebElement(By.cssSelector("input[id=ember1763]"));
        FirstNameElement.sendKeys("Nina");
    }
@Test
    public void EnterEmailAddressByKey() {
        WebElement EmailElement= TestNGAnnotations.getWebElement(By.xpath("//input[@type='email' and @id='ember1766']"));
        EmailElement.sendKeys("nardeensu@gmail.com");

}
@Test
    public void EnterPassByKey() {
        WebElement PasswordElement= TestNGAnnotations.getWebElement(By.cssSelector("input[type=password]"));
        PasswordElement.sendKeys("Ninosh55");
}
@Test
    public void ReEnterPassByKey() {
        WebElement RenterPasswordElement= TestNGAnnotations.getWebElement(By.id("ember1716"));
        RenterPasswordElement.sendKeys("Ninosh55");
}
@Test
    public void RegistrationToBuyMe() {
        WebElement RegistrationToBuyMeElement= TestNGAnnotations.getWebElement(By.id("ember1719"));
        RegistrationToBuyMeElement.click();
}
    @Test
    public static void assertionFirstName(){
        Assert.assertEquals("Nina",);

    }


}
