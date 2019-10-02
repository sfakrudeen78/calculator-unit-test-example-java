import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Twinkle {

    private RemoteWebDriver driver;

    public Twinkle(RemoteWebDriver driver){
        this.driver = driver;
    }


    /*PO
    {
        "metadata":"%5B%7B%22key%22%3A%22tab%22%2C%22value%22%3A%5B%7B%22class%22%3A%22Button%22%2C%22frameName%22%3A%22%22%2C%22locator%22%3A%7B%22tag_name%22%3A%22INPUT%22%2C%22type%22%3A%22css%22%2C%22value%22%3A%22css%3Ddiv.FPdoLc.VlcLAe%20%3E%20center%20%3E%20input%5Bname%3D%5C%22btnK%5C%22%5D%22%7D%2C%22name%22%3A%22tab%22%2C%22strict_locator%22%3A%22css%3Ddiv.FPdoLc.VlcLAe%20%3E%20center%20%3E%20input%5Bname%3D%5C%22btnK%5C%22%5D%22%7D%2C%7B%22class%22%3A%22Button%22%2C%22frameName%22%3A%22%22%2C%22locator%22%3A%7B%22tag_name%22%3A%22INPUT%22%2C%22type%22%3A%22name%22%2C%22value%22%3A%22name%3DbtnK%22%7D%2C%22name%22%3A%22tab%22%2C%22strict_locator%22%3A%22name%3DbtnK%22%7D%5D%7D%2C%7B%22key%22%3A%22lab%22%2C%22value%22%3A%5B%7B%22class%22%3A%22Button%22%2C%22frameName%22%3A%22%22%2C%22locator%22%3A%7B%22tag_name%22%3A%22INPUT%22%2C%22type%22%3A%22name%22%2C%22value%22%3A%22name%3DbtnI%22%7D%2C%22name%22%3A%22lab%22%2C%22strict_locator%22%3A%22name%3DbtnI%22%7D%2C%7B%22class%22%3A%22Button%22%2C%22frameName%22%3A%22%22%2C%22locator%22%3A%7B%22tag_name%22%3A%22INPUT%22%2C%22type%22%3A%22css%22%2C%22value%22%3A%22css%3Ddiv.FPdoLc.VlcLAe%20%3E%20center%20%3E%20input%5Bname%3D%5C%22btnI%5C%22%5D%22%7D%2C%22name%22%3A%22lab%22%2C%22strict_locator%22%3A%22css%3Ddiv.FPdoLc.VlcLAe%20%3E%20center%20%3E%20input%5Bname%3D%5C%22btnI%5C%22%5D%22%7D%2C%7B%22class%22%3A%22Button%22%2C%22frameName%22%3A%22%22%2C%22locator%22%3A%7B%22tag_name%22%3A%22INPUT%22%2C%22type%22%3A%22xpath%22%2C%22value%22%3A%22//form%5B@id%3D%27tsf%27%5D/div%5B2%5D/div/div%5B3%5D/center/input%5B2%5D%22%7D%2C%22name%22%3A%22lab%22%2C%22strict_locator%22%3A%22//form%5B@id%3D%27tsf%27%5D/div%5B2%5D/div/div%5B3%5D/center/input%5B2%5D%22%7D%5D%7D%5D"
    }

    PO*/

    private By tab = By.css("css=div.FPdoLc.VlcLAe > center > input[name="btnK"]");  
      
,    private By lab = By.name("name=btnI");  
      

    public RemoteWebElement getTab(){
        return driver.findElement(tab);
    }      
,    public RemoteWebElement getLab(){
        return driver.findElement(lab);
    }      
}

