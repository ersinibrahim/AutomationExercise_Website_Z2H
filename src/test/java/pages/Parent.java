package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utilities.BaseDriver;

import java.time.Duration;


public class Parent {

    public void clickFunction(WebElement element) {
        waitUntilClickable(element);
        scrollToElement(element);
        element.click();
    }

    public void waitUntilVisible(WebElement element) {
        WebDriverWait wait = new WebDriverWait(BaseDriver.getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void scrollToElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) BaseDriver.getDriver();
        js.executeScript("arguments[0].scrollIntoView()", element);
    }

    public void waitUntilClickable(WebElement element) {
        WebDriverWait wait = new WebDriverWait(BaseDriver.getDriver(), 10);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void verifyContainsText(WebElement element, String message) {
        waitUntilVisible(element);

        Assert.assertTrue(element.getText().toLowerCase().contains(message.toLowerCase()));
    }

    public void findElementAndClick(WebElement webElement) {
        clickFunction(webElement);
    }

    public void findElementContainsText(WebElement webElement, String message) {
        verifyContainsText(webElement, message);
    }

    public void scrollToUpElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) BaseDriver.getDriver();
        js.executeScript("arguments[0].setAttribute('style', 'top:0px')", element);
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

}
