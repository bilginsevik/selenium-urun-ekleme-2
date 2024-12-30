package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    private WebDriver driver;

       WebElement decoration= By.xpath("//span[text()='Dekorasyon']").findElement(driver);


    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    public void decoration(){
        driver.findElement((By) decoration).click();


    }

    }

