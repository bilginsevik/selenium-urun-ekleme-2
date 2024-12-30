package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DeleteProduct {
  private WebDriver driver;
 WebElement sepetim= By.xpath(" //div[@class='svgIcon cart-svg']").findElement(driver);
 WebElement delete= driver.findElement(By.xpath(" //div[@class='miniCartButtonSil']"));


public DeleteProduct(WebDriver driver){
    this.driver=driver;
}
public void sepetim(){
    driver.findElement((By) sepetim).click();
}
public void delete(){
    driver.findElement((By) delete).click();
}
}
