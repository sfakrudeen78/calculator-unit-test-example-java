import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Sample {

    private RemoteWebDriver driver;

    public Sample(RemoteWebDriver driver){
        this.driver = driver;
    }


    /*PO
    {
        "metadata":"%5B%7B%22key%22%3A%22mannan%22%2C%22value%22%3A%5B%7B%22class%22%3A%22A%22%2C%22frameName%22%3A%22%22%2C%22locator%22%3A%7B%22tag_name%22%3A%22A%22%2C%22type%22%3A%22css%22%2C%22value%22%3A%22css%3Da.gb_e%22%7D%2C%22name%22%3A%22mannan%22%2C%22strict_locator%22%3A%22css%3Da.gb_e%22%7D%2C%7B%22class%22%3A%22A%22%2C%22frameName%22%3A%22%22%2C%22locator%22%3A%7B%22tag_name%22%3A%22A%22%2C%22type%22%3A%22xpath%22%2C%22value%22%3A%22//a%5Bcontains%28text%28%29%2C%27Gmail%27%29%5D%22%7D%2C%22name%22%3A%22mannan%22%2C%22strict_locator%22%3A%22//a%5Bcontains%28text%28%29%2C%27Gmail%27%29%5D%22%7D%2C%7B%22class%22%3A%22A%22%2C%22frameName%22%3A%22%22%2C%22locator%22%3A%7B%22tag_name%22%3A%22A%22%2C%22type%22%3A%22xpath%22%2C%22value%22%3A%22//a%5Bcontains%28@href%2C%20%27https%3A//mail.google.com/mail/%3Ftab%3Dwm%26ogbl%27%29%5D%22%7D%2C%22name%22%3A%22mannan%22%2C%22strict_locator%22%3A%22//a%5Bcontains%28@href%2C%20%27https%3A//mail.google.com/mail/%3Ftab%3Dwm%26ogbl%27%29%5D%22%7D%5D%7D%2C%7B%22key%22%3A%22tablet%22%2C%22value%22%3A%5B%7B%22class%22%3A%22Span%22%2C%22frameName%22%3A%22%22%2C%22locator%22%3A%7B%22tag_name%22%3A%22SPAN%22%2C%22type%22%3A%22xpath%22%2C%22value%22%3A%22//div%5B@id%3D%27gbw%27%5D/div/div/div%5B2%5D/div%5B2%5D/div/a/span%22%7D%2C%22name%22%3A%22tablet%22%2C%22strict_locator%22%3A%22//div%5B@id%3D%27gbw%27%5D/div/div/div%5B2%5D/div%5B2%5D/div/a/span%22%7D%2C%7B%22class%22%3A%22Span%22%2C%22frameName%22%3A%22%22%2C%22locator%22%3A%7B%22tag_name%22%3A%22SPAN%22%2C%22type%22%3A%22css%22%2C%22value%22%3A%22css%3Dspan.gb_xa.gbii%22%7D%2C%22name%22%3A%22tablet%22%2C%22strict_locator%22%3A%22css%3Dspan.gb_xa.gbii%22%7D%5D%7D%5D"
    }

    PO*/

    private By mannan = By.css("css=a.gb_e");  
      
,    private By tablet = By.xpath("//div[@id='gbw']/div/div/div[2]/div[2]/div/a/span");  
      

    public RemoteWebElement getMannan(){
        return driver.findElement(mannan);
    }      
,    public RemoteWebElement getTablet(){
        return driver.findElement(tablet);
    }      
}

