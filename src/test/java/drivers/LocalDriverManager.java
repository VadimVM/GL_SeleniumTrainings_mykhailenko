package drivers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LocalDriverManager {
   public static WebDriver driver;
   public static ChromeOptions options;
   private static final Logger LOGGER = LogManager.getLogger(LocalDriverManager.class.getName());

    @BeforeAll
    public static void setup() {
        WebDriverManager.chromedriver().setup();
        options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
        LOGGER.info("browser start successfully");
    }

    @AfterAll
    public static void  cleanup()
    {
        driver.quit();
        LOGGER.info("browser close");
    }


}
