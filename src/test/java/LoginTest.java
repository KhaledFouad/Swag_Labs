import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends  BaseTest {

    @Test(dataProviderClass = TestProvider.class, dataProvider = "loginData")
    public void validLoginTest(String username, String password) {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(username, password);
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/inventory.html", "Login failed -); URL mismatch");
    }

    @Test(dataProviderClass = TestProvider.class, dataProvider = "addToCartData")
    public void addItemToCart(String username, String password, String itemId) {

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(username, password);
        ProductPage productPage = new ProductPage(driver);
        productPage.clickProductAddToCart(itemId);

        Assert.assertEquals(
             productPage.getProductPageTitle(), "Your Cart", "Add to cart failed -);"
        );
    }

    @Test(dataProviderClass = TestProvider.class, dataProvider = "checkoutData")
    public void checkout(String username, String password, String firstName, String lastName, String postalCode) {
     ProductPage productPage = new ProductPage(driver);

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(username, password);

        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        driver.findElement(By.className("shopping_cart_link")).click();
        driver.findElement(By.id("checkout")).click();
        CheckOutPage checkOutPage = new CheckOutPage(driver);
        checkOutPage.checkOut(firstName, lastName, postalCode);
        Assert. assertEquals(
           driver.findElement(By.className("complete-header")).getText(), "Thank you for your order!", "Checkout failed -);");
    }
}
