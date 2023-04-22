import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.w3c.dom.html.HTMLInputElement;

public record HomePage(WebDriver driver)  {
    private static final String CONTACTS = "//*[@id=\"sbs-562561178-1678713806326\"]/div/a";
    private static final String FREE_EVENTS = "//*[@id=\"sbs-562561178-1678713806343\"]/div/a";



    public void setContacts(String contacts) {
        driver.findElement(By.xpath(CONTACTS)).click();



    }
    public void setFreeEvents(){
        driver.findElement(By.xpath(FREE_EVENTS)).click();
    }
}
