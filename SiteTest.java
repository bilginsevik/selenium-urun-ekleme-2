import org.junit.Test;
import test.DeleteProduct;
import test.HomePage;
import test.ProductDetailPage;
import test.ProductsPage;

public class SiteTest extends base_test {
HomePage homePage;
ProductsPage productsPage;
ProductDetailPage productDetailPage;
DeleteProduct deleteProduct;


@Test
public void searchTest(){
    driver.get("https://www.englishhome.com/");
    homePage=new HomePage(driver);
    homePage.decoration();
}
@Test
    public void ProductsPage(){
productsPage=new ProductsPage(driver);
productsPage.firstProductClick();

}
@Test
    public void ProductDetailPage(){
    productDetailPage=new ProductDetailPage(driver);
    productDetailPage.sepetEkle();
    productDetailPage.closeBtn();
}
@Test
    public void DeleteProduct(){
    deleteProduct=new DeleteProduct(driver);
    deleteProduct.sepetim();
    deleteProduct.delete();
}
}
