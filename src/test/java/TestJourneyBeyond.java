import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestJourneyBeyond {

    WebDriver driver;

    @BeforeMethod
    public void openLinkPage() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://localhost/MVCFramework/pages/home");


    }

    @Test
    public void Homepage() {

        //01.click the home button
        driver.findElement(By.xpath("/html/body/header/ul/li[1]/a")).click();


        //02.click the about button
        driver.findElement(By.xpath("/html/body/header/ul/li[2]/a")).click();
        driver.navigate().back();
    }
}