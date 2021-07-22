package Day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class _06_Task {

    // Navigate https://www.facebook.com/
    // Click on Create New Account button
    // Fill the form
    // Get text for Sign Up button

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Library/Selenium/chromedriver/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        driver.get("https://www.facebook.com/");

        WebElement createAccount = driver.findElement(By.cssSelector("a[data-testid=open-registration-form-button]"));
        createAccount.click();

        WebElement firstName = driver.findElement(By.cssSelector("input[name=firstname]"));
        firstName.sendKeys("Steven");

        WebElement lastname = driver.findElement(By.cssSelector("input[name=lastname]"));
        lastname.sendKeys("Russo");

        WebElement emailOrMobile = driver.findElement(By.cssSelector("input[name=reg_email__]"));
        emailOrMobile.sendKeys("technostudytest@gmail.com");

        WebElement emailOrMobileConfirm = driver.findElement(By.cssSelector("input[name=reg_email_confirmation__"));
        emailOrMobileConfirm.sendKeys("technostudytest@gmail.com");

        WebElement password = driver.findElement(By.cssSelector("input[id=password_step_input]"));
        password.sendKeys("1234567890");

        Select month = new Select(driver.findElement(By.id("month")));
        month.selectByVisibleText("Dec");

        Select day = new Select(driver.findElement(By.id("day")));
        day.selectByIndex(2);

        Select year = new Select(driver.findElement(By.id("year")));
        year.selectByValue("1990");

        WebElement genderMale = driver.findElement(By.cssSelector("input[value='2']"));
        genderMale.click();

        String signUp = driver.findElement(By.cssSelector("button[name=websubmit]")).getText();
        System.out.println(signUp);

        driver.quit();
    }

}
