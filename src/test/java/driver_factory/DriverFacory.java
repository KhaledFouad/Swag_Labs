package driver_factory;

import org.openqa.selenium.WebDriver;

public class DriverFacory {

    private static final WebDriver driver = null;
    public  static WebDriver getDriver( String browserType ){
if (driver != null){
    return switch (browserType.toLowerCase()) {
        case "chrome" -> ChromeDriverFactory.getChromeDriver();
        case "edge" -> EdgeDriver.getEdgeDriver();
        case "firefox" -> FirefoxDriver.getFirefoxDriver();
        default -> throw new IllegalArgumentException("Unsupported browser type: " + browserType);
    };

}return driver;

    }
}

