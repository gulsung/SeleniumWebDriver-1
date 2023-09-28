package Selenium;

import Utilities.MyFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.List;

public class _05_FindingByClassName {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://form.jotform.com/232061499257057");

        WebElement firstName = driver.findElement(By.className("form-textbox"));
        firstName.sendKeys("Gökhan");
        
        List<WebElement> ortakClassName = driver.findElements(By.className("form-sub-label"));
        System.out.println(ortakClassName.size());

        for (WebElement e:ortakClassName
             ) {
            System.out.println("e.getText() = " + e.getText());
        }

        MyFunctions.Bekle(3);
        driver.quit();
    }
}
