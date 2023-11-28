package utilities;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Utility extends BaseTest {

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }
    String baseUrl = "https://demo.nopcommerce.com/";

    /**
     * This method will click on the element
     */
    public void clickOnElement(By by) {
        driver.findElement(by).click();
    }

    /**
     * select method
     */
    public void selectByVisibleTextFromDropDown(By by, String text) {
        WebElement element = driver.findElement(by);
        Select select = new Select(element);
        select.selectByVisibleText(text);
    }

    /**
     * This method will get text from element
     */
    public String getTextElement(By by) {
        return driver.findElement(by).getText();
    }

    /**
     * This method will have actions on mouseHover
     */
    public void mouseHoverOnElements(By by) {
        WebElement element = driver.findElement(by);
        Actions actions = new Actions(driver);
        actions.moveToElement(element).build().perform();

    }

    /**
     * This method will have click action on mousehover element
     */
    public void clickMouseHoverOnElements(By by) {
        WebElement element = driver.findElement(by);
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().build().perform();
    }

    /**
     * This method will send keys to element
     */
    public void sendTextToElement(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }

    /**
     * This method will verify the text
     */
    public void verifyText(String displayMessage, String expectedText, String actualText) {
        Assert.assertEquals(displayMessage, expectedText, actualText);
    }
    public void closeBrowser() {

        driver.quit();

    }

}
