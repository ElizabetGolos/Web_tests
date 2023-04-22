import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Tests {
    private static WebDriver driver;
    private static Map<String, Object> vars;
    private static HomePage homePage;

    static
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://skillfactory.ru/");
        vars = new HashMap<String, Object>();
        homePage = new HomePage(driver);
    }

    @After
    public void tearDown() {
        driver.quit();
    }
    public String waitForWindow(int timeout) {
        try {
            Thread.sleep(timeout);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Set<String> whNow = driver.getWindowHandles();
        Set<String> whThen = (Set<String>) vars.get("window_handles");
        if (whNow.size() > whThen.size()) {
            whNow.removeAll(whThen);
        }
        return whNow.iterator().next();
    }
    @Test
    public void Test1_contacts() {

        homePage.setContacts();

    }

    @Test
    public void Test2_Free_events() {
         homePage.setFreeEvents();
    }

    @Test
    public void Test3_career_center() {
        driver.findElement(By.xpath("//*[@id=\"sbs-562561178-1678713806322\"]/div/a")).click();
    }

    @Test
    public void Test4_media() {
        driver.findElement(By.xpath("//*[@id=\"sbs-562561178-1678713806329\"]/div/a")).click();
    }

    @Test
    public void Test5_corporativnoye_obuchenye() {
        driver.findElement(By.xpath("//*[@id=\"sbs-562561178-1678713806333\"]/div/a")).click();
    }
    @Test
    public void Test6_courses() {
        driver.findElement(By.xpath("//*[@id=\"rec562561178\"]/div/div/div[20]/a")).click();
    }


    @Test
    public void Test7_Choose_course(){
        driver.findElement(By.cssSelector(".tn-elem__5625611781679404485958 > .tn-atom")).click();
    {
        WebElement element = driver.findElement(By.linkText("Git"));
        Actions builder = new Actions(driver);
        builder.moveToElement(element).perform();
    }
    driver.findElement(By.linkText("Тестирование")).click();
    {
        WebElement element = driver.findElement(By.cssSelector(".tn-elem__5608766611679951555532 > .tn-atom"));
        Actions builder = new Actions(driver);
        builder.moveToElement(element).perform();
    }
    {
        WebElement element = driver.findElement(By.cssSelector(".tn-elem__5608766611679951555532 > .tn-atom"));
        Actions builder = new Actions(driver);
        builder.moveToElement(element).perform();
    }
    {
        WebElement element = driver.findElement(By.tagName("body"));
        Actions builder = new Actions(driver);
        builder.moveToElement(element, 0, 0).perform();
    }
            vars.put("window_handles", driver.getWindowHandles());
            driver.findElement(By.cssSelector(".tn-elem__5608766611679951555515 > .tn-atom")).click();
            vars.put("win1571", waitForWindow(2000));
            driver.switchTo().window(vars.get("win1571").toString());
}
    @Test
    public void Test8_input_data (){
        driver.findElement(By.name("name")).click();
        driver.findElement(By.name("name")).sendKeys("Елизавета");
        driver.findElement(By.name("email")).click();
        driver.findElement(By.name("email")).sendKeys("goloseliz@gmail.com");
        driver.findElement(By.name("tildaspec-phone-part[]")).click();
        driver.findElement(By.name("tildaspec-phone-part[]")).sendKeys("(999) 999-99-99");
        driver.findElement(By.cssSelector("#form562643444 .t-submit")).click();
    }
   @Test
   public void Test9_a(){

       driver.findElement(By.cssSelector(".tn-elem__5664443331679411548099 > .tn-atom")).click();

       {
           WebElement element = By.xpath("//*[@id=\"rec496233002\"]/div/div/div[7]/a").findElement(driver);
           Actions builder = new Actions(driver);
           builder.moveToElement(element).perform();
       }
       driver.findElement(By.linkText("Записаться на курс")).click();
       {
           WebElement element = driver.findElement(By.tagName("body"));
           Actions builder = new Actions(driver);
           builder.moveToElement(element, 0, 0).perform();
       }
       driver.findElement(By.id("input_1495810359387")).click();
       driver.findElement(By.id("input_1495810359387")).sendKeys("Голос Элизабет");
       driver.findElement(By.cssSelector("#form527771797 > .t-form__inputsbox")).click();
       driver.findElement(By.id("input_1495810354468")).click();
       driver.findElement(By.id("input_1495810354468")).sendKeys("goloseliz@gmail.com");
       driver.findElement(By.name("tildaspec-phone-part[]")).click();
       driver.findElement(By.name("tildaspec-phone-part[]")).sendKeys("(999) 999-99-99");
       driver.findElement(By.cssSelector(".t-form__submit:nth-child(12) > .t-submit")).click();
   }

   }




