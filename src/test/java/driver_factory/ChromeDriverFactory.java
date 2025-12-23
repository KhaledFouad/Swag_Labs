package driver_factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.HashMap;
import java.util.Map;

public class ChromeDriverFactory {
    public  static WebDriver getChromeDriver(){

        ChromeOptions options = new ChromeOptions();
        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("profile.default_content_setting_values.notifications", 2);
        options.setExperimentalOption("prefs", prefs);
        WebDriver driver = new org.openqa.selenium.chrome.ChromeDriver(options);
        driver.manage().window().maximize();
        return driver;
    }

}
