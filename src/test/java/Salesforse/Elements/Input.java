package Salesforse.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Input extends BaseElement {

    final String inputElementLocator = "//div[@role='dialog' and @aria-modal='true']//*[text()='%s']/" +
            "ancestor::div[contains(@class,'uiInput')]//input";
    final String TextAreaElementLocator = "//div[@role='dialog' and @aria-modal='true']//*[text()='%s']/" +
            "ancestor::div[contains(@class,'uiInput')]//textarea";

    public Input(WebDriver driver, String label) {
        super(driver, label);
    }

    public void write(String text) {
        System.out.println(String.format("Setting %s into %s input", text, label));
        driver.findElement(By.xpath(String.format(inputElementLocator, label))).sendKeys(text);
    }
    public void writeTextArea(String text) {
        System.out.println(String.format("Setting %s into %s input", text, label));
        driver.findElement(By.xpath(String.format(TextAreaElementLocator, label))).sendKeys(text);
    }
}
