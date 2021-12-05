package Salesforse.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Drobdown extends  BaseElement{

    private String drobDownLOC = "//span[text()='%s']/ancestor::div[contains(@class, 'uiInputSelect')]//a[@class='select']";
    private String optionLOC = "//div[contains(@class,'uiMenuList') and contains(@class,'visible')]//a[contains(text(),'%s')]";
    public Drobdown(WebDriver driver,String label) {
        super(driver,label);
    }
    public void selectOption(String optionName){
        driver.findElement(By.xpath(String.format(drobDownLOC,label))).click();
        WebElement optionToClick = driver.findElement(By.xpath(String.format(optionLOC,optionName)));
        scrollIntoView(optionToClick);
        optionToClick.click();
    }
}
