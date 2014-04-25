import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Test1 {
    private WebDriver driver;
    private StringBuffer verificationErrors = new StringBuffer();

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "/Users/kgividen/Data/Novell/svn/frameworks/validator/UnitTests/ValidatorTesting/chromeDriver/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }

    @Test
    public void testAddNewTestUI() throws Exception {
        driver.get("http://www.google.com");
        // Get to the page
        driver.findElement(By.id("gbqfq"));
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }
}
