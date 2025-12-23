package driver_factory;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.util.HashMap;
import java.util.Map;

public class EdgeDriver {
    public  static WebDriver getEdgeDriver(){

        EdgeOptions options = new EdgeOptions();
        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("profile.default_content_setting_values.notifications", false);
        options.setExperimentalOption("prefs", prefs);
        WebDriver driver = new org.openqa.selenium.edge.EdgeDriver(options);
        driver.manage().window().maximize();
        return driver;
    }

}
