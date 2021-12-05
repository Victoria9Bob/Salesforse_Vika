package Salesforse.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LightiningFormatedTextElement extends BaseElement {

    private String visibleTextLocator = "//span[contains(text(),'%s') and @class='test-id__field-label']/ancestor::div[contains(@class,'test-id__output-root')]//*[@data-output-element-id='output-field']";

    public LightiningFormatedTextElement(WebDriver driver, String label) {
        super(driver, label);
    }

    public String getValue() {
        return driver.findElement(By.xpath(String.format(visibleTextLocator, label))).getText();
    }
}
