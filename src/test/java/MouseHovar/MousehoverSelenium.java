package MouseHovar;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MousehoverSelenium {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.macys.com/");
        Actions act=new Actions(driver);
        Thread.sleep(3000);
        WebElement men=driver.findElement(By.xpath("//a/span[contains(text(),'Men')]"));
        act.moveToElement(men).build().perform();
        //Thread.sleep(3000);
        //WebElement jeans=driver.findElement(By.cssSelector("a[href='/shop/mens-clothing/mens-jeans?id=11221&cm_sp=us_hdr-_-men-_-11221_jeans_COL1']"));

        act.moveToElement(men).build().perform();
        //act.moveToElement(jeans).click().build().perform();
    }
}
