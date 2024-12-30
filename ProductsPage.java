package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductsPage {

      private WebDriver driver;
      WebElement firstProductClick= By.xpath("//div[@class='ItemOrj col-4'][1]").findElement(driver);

public ProductsPage(WebDriver driver){
    this.driver=driver;
}
public void firstProductClick(){
driver.findElement((By) firstProductClick).click();
}
}

