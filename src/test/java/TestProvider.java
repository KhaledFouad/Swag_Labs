import org.testng.annotations.DataProvider;

public class TestProvider {

    @DataProvider(name = "loginData")
    public Object[][] loginData() {
        return new Object[][]{
                {"standard_user", "secret_sauce"},
                {"locked_out_user", "secret_sauce"},
                {"problem_user", "secret_sauce"},
                {"performance_glitch_user", "secret_sauce"},
                {"invalid_user", "invalid_password"}
        };
    }

    @DataProvider(name = "addToCartData")
    public Object[][] addToCartData() {
        return new Object[][]{
                {"standard_user", "secret_sauce", "sauce-labs-backpack"},
                {"standard_user", "secret_sauce", "sauce-labs-bike-light"},
                {"standard_user", "secret_sauce", "sauce-labs-bolt-t-shirt"},
                {"invalid", "invalid", "sauce-labs-backpack"},
                {"", "", "sauce-labs-backpack"},
                {"standard_user", "secret_sauce", "invalid-item-id"},
                {"standard_user", "secret_sauce", ""}
        };
    }

    @DataProvider(name = "checkoutData")
    public Object[][] checkoutData() {
        return new Object[][]{
                {"standard_user", "secret_sauce", "Khaled", "Fouad", "12345"},
                {"standard_user", "secret_sauce", "mah", "Kamal", "67890"},
                {"standard_user", "secret_sauce", "Ahmed", "fahim", "ABCDE"},
                {"invalid", "invalid", "tot", "rot", "00000"},
                {"     ", "     ", "Fdhjhc", "Fgfgfg", "     "}
        };
    }
}
