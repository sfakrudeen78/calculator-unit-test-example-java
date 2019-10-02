import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Sample23 {

    private RemoteWebDriver driver;

    public Sample23(RemoteWebDriver driver){
        this.driver = driver;
    }


    /*PO
    {
        "metadata":"%5B%7B%22key%22%3A%22tab%22%2C%22value%22%3A%5B%7B%22class%22%3A%22Button%22%2C%22frameName%22%3A%22%22%2C%22locator%22%3A%7B%22tag_name%22%3A%22INPUT%22%2C%22type%22%3A%22name%22%2C%22value%22%3A%22name%3DbtnK%22%7D%2C%22name%22%3A%22tab%22%2C%22strict_locator%22%3A%22name%3DbtnK%22%7D%2C%7B%22class%22%3A%22Button%22%2C%22frameName%22%3A%22%22%2C%22locator%22%3A%7B%22tag_name%22%3A%22INPUT%22%2C%22type%22%3A%22css%22%2C%22value%22%3A%22css%3Ddiv.FPdoLc.VlcLAe%20%3E%20center%20%3E%20input%5Bname%3D%5C%22btnK%5C%22%5D%22%7D%2C%22name%22%3A%22tab%22%2C%22strict_locator%22%3A%22css%3Ddiv.FPdoLc.VlcLAe%20%3E%20center%20%3E%20input%5Bname%3D%5C%22btnK%5C%22%5D%22%7D%5D%7D%2C%7B%22key%22%3A%22twenty%22%2C%22value%22%3A%5B%7B%22class%22%3A%22Button%22%2C%22frameName%22%3A%22%22%2C%22locator%22%3A%7B%22tag_name%22%3A%22INPUT%22%2C%22type%22%3A%22name%22%2C%22value%22%3A%22name%3DbtnK%22%7D%2C%22name%22%3A%22twenty%22%2C%22strict_locator%22%3A%22name%3DbtnK%22%7D%2C%7B%22class%22%3A%22Button%22%2C%22frameName%22%3A%22%22%2C%22locator%22%3A%7B%22tag_name%22%3A%22INPUT%22%2C%22type%22%3A%22css%22%2C%22value%22%3A%22css%3Ddiv.FPdoLc.VlcLAe%20%3E%20center%20%3E%20input%5Bname%3D%27btnK%27%5D%22%7D%2C%22name%22%3A%22twenty%22%2C%22strict_locator%22%3A%22css%3Ddiv.FPdoLc.VlcLAe%20%3E%20center%20%3E%20input%5Bname%3D%27btnK%27%5D%22%7D%5D%7D%2C%7B%22key%22%3A%22makkal%22%2C%22value%22%3A%5B%7B%22class%22%3A%22A%22%2C%22frameName%22%3A%22%22%2C%22locator%22%3A%7B%22tag_name%22%3A%22A%22%2C%22type%22%3A%22css%22%2C%22value%22%3A%22css%3Da.gb_e%22%7D%2C%22name%22%3A%22makkal%22%2C%22strict_locator%22%3A%22css%3Da.gb_e%22%7D%2C%7B%22class%22%3A%22A%22%2C%22frameName%22%3A%22%22%2C%22locator%22%3A%7B%22tag_name%22%3A%22A%22%2C%22type%22%3A%22xpath%22%2C%22value%22%3A%22//a%5Bcontains%28text%28%29%2C%27Gmail%27%29%5D%22%7D%2C%22name%22%3A%22makkal%22%2C%22strict_locator%22%3A%22//a%5Bcontains%28text%28%29%2C%27Gmail%27%29%5D%22%7D%2C%7B%22class%22%3A%22A%22%2C%22frameName%22%3A%22%22%2C%22locator%22%3A%7B%22tag_name%22%3A%22A%22%2C%22type%22%3A%22xpath%22%2C%22value%22%3A%22//a%5Bcontains%28@href%2C%20%27https%3A//mail.google.com/mail/%3Ftab%3Dwm%26ogbl%27%29%5D%22%7D%2C%22name%22%3A%22makkal%22%2C%22strict_locator%22%3A%22//a%5Bcontains%28@href%2C%20%27https%3A//mail.google.com/mail/%3Ftab%3Dwm%26ogbl%27%29%5D%22%7D%5D%7D%5D"
    }

    PO*/

    private By tab = By.name("name=btnK");  
      
,    private By twenty = By.name("name=btnK");  
      
,    private By makkal = By.css("css=a.gb_e");  
      

    public RemoteWebElement getTab(){
        return driver.findElement(tab);
    }      
,    public RemoteWebElement getTwenty(){
        return driver.findElement(twenty);
    }      
,    public RemoteWebElement getMakkal(){
        return driver.findElement(makkal);
    }      
}

