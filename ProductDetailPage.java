package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductDetailPage {

 private   WebDriver driver;
     WebElement sepetEkle= By.xpath(" //div[@class='basketBtn']").findElement(driver);
     WebElement closeBtn=driver.findElement(By.xpath("  //a[@class='tici-noty-notification-close-btn']"));


  public ProductDetailPage(WebDriver driver){
        this.driver=driver;
    }


    public void sepetEkle(){
      driver.findElement((By) sepetEkle).click();
    }


    public void closeBtn(){
      driver.findElement((By) closeBtn).click();
    }


}
