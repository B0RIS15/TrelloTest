import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class hometest {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\kozee\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://trello.com");
        driver.findElement(By.cssSelector("a[href*=\"login\"]")).click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("google-link")));
        driver.findElement(By.id("user")).sendKeys("example1423@mail.com");
        driver.findElement(By.id("password")).sendKeys("DayZakyrit");
        driver.findElement(By.id("login")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("header")));
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class=\"board-tile mod-add\"]"))).click();
        driver.findElement(By.xpath("//input[@class=\"subtle-input\" and @placeholder=\"Добавить заголовок доски\" and @data-test-id=\"create-board-title-input\" and @ value=\"\"]")).sendKeys("TEST");
        driver.findElement(By.xpath("//button[@class=\"button primary\" and @type=\"submit\" and @data-test-id=\"create-board-submit-button\"]")).click();

    }
}
