package tastNGTestcases;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExtentReportDemo {
   private static WebDriver driver=null;
    public static void main(String[] args) throws InterruptedException {
        ExtentHtmlReporter htmlReporter=new ExtentHtmlReporter("extentreport");
        ExtentReports extent=new ExtentReports();
        extent.attachReporter(htmlReporter);
        ExtentTest test=extent.createTest("Google search test","this is test to validate google funtionalty");
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        test.log(Status.INFO,"Stating test case");
        driver.get("https://www.google.com/");
        test.pass("navigate to google.com");
        Thread.sleep(3000);
        driver.findElement(By.name("q")).sendKeys("Automation");
        test.pass("enter text in serch box");
        //Thread.sleep(3000);
       // driver.findElement(By.name("btnk")).sendKeys(Keys.RETURN);
       // test.pass("press keyboad enter key");
        driver.close();
        driver.quit();
        test.pass("closs the browser");
        test.info("test compleated");
        extent.flush();

    }
}
