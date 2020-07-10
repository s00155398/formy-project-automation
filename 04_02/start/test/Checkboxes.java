import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Checkboxes {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:/Users/Admin/Desktop/chromedriver_win32/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("http://formy-project.herokuapp.com/checkbox");

        WebElement checkbox1 = driver.findElement(By.id("checkbox-1"));
        checkbox1.click();

        WebElement checkbox2 = driver.findElement(By.cssSelector("input[value='checkbox-2']"));
        checkbox2.click();

        WebElement checkbox3 = driver.findElement(By.xpath(("//*[@id=\"checkbox-3\"]")));
        checkbox3.click();

        driver.quit();
    }
}
