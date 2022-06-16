import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Domaci1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Petar\\Downloads\\chromedriver_win32(1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://kupujemprodajem.com/");
        driver.manage().window().maximize();


        WebElement el = driver.findElement(By.xpath("/html/body/div[9]/div/div[2]"));
        el.click();
        WebElement el1 = driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/div/form/div[3]/div/div/div[2]/div[2]/div[1]/div/input"));
        el1.sendKeys("Iphone 13");
        WebElement el2 = driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/div/form/div[3]/div/div/div[2]/div[2]/div[2]/div[1]"));
        el2.click();

        Actions scrollDown = new Actions(driver);
        scrollDown.sendKeys(Keys.PAGE_DOWN).build().perform();

        WebElement ad = driver.findElement(By.xpath("//*[@id=\"adDescription7321776\"]/a"));
        ad.click();

        String title = String.valueOf(driver.findElement(By.className("oglas-title")));
        String expected = "iPhone 13, iPhone 12, iPhone 11 - NOVO!";

        if(title.equals(expected)){
            System.out.println("Validno!");}
    }
}

