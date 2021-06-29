package homeworks;

import drivers.LocalDriverManager;
import org.junit.jupiter.api.Test;

public class AdminMenuNavigationTest extends LocalDriverManager{
    public static String BASE_URL = System.getenv("TEST_BASE_URL");


    @Test
    public void openUrl(){
        driver.get(BASE_URL);
    }

}
