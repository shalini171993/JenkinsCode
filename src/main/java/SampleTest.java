import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleTest {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Shalini\\Downloads\\Driver\\chromedriver.exe");
        WebDriver driver =  new ChromeDriver();

        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());
    }
}
