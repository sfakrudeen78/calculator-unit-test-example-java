public class Twinkle {

    private RemoteWebDriver driver;

    public Twinkle(RemoteWebDriver driver){
        this.driver = driver;
    }


    /*PO
    {
        "metadata":"%5B%7B%22key%22%3A%22abc%22%2C%22value%22%3A%5B%7B%22class%22%3A%22Button%22%2C%22frameName%22%3A%22%22%2C%22locator%22%3A%7B%22tag_name%22%3A%22INPUT%22%2C%22type%22%3A%22name%22%2C%22value%22%3A%22name%3DbtnK%22%7D%2C%22name%22%3A%22abc%22%2C%22strict_locator%22%3A%22name%3DbtnK%22%7D%2C%7B%22class%22%3A%22Button%22%2C%22frameName%22%3A%22%22%2C%22locator%22%3A%7B%22tag_name%22%3A%22INPUT%22%2C%22type%22%3A%22name%22%2C%22value%22%3A%22name%3DbtnK%22%7D%2C%22name%22%3A%22abc%22%2C%22strict_locator%22%3A%22name%3DbtnK%22%7D%5D%7D%2C%7B%22key%22%3A%22tab%22%2C%22value%22%3A%5B%7B%22class%22%3A%22Button%22%2C%22frameName%22%3A%22%22%2C%22locator%22%3A%7B%22tag_name%22%3A%22INPUT%22%2C%22type%22%3A%22name%22%2C%22value%22%3A%22name%3DbtnK%22%7D%2C%22name%22%3A%22tab%22%2C%22strict_locator%22%3A%22name%3DbtnK%22%7D%2C%7B%22class%22%3A%22Button%22%2C%22frameName%22%3A%22%22%2C%22locator%22%3A%7B%22tag_name%22%3A%22INPUT%22%2C%22type%22%3A%22css%22%2C%22value%22%3A%22css%3Ddiv.FPdoLc.VlcLAe%20%3E%20center%20%3E%20input%5Bname%3D%5C%22btnK%5C%22%5D%22%7D%2C%22name%22%3A%22tab%22%2C%22strict_locator%22%3A%22css%3Ddiv.FPdoLc.VlcLAe%20%3E%20center%20%3E%20input%5Bname%3D%5C%22btnK%5C%22%5D%22%7D%2C%7B%22class%22%3A%22Button%22%2C%22frameName%22%3A%22%22%2C%22locator%22%3A%7B%22tag_name%22%3A%22INPUT%22%2C%22type%22%3A%22css%22%2C%22value%22%3A%22css%3Ddiv.FPdoLc.VlcLAe%20%3E%20center%20%3E%20input%5Bname%3D%5C%22btnK%5C%22%5D%22%7D%2C%22name%22%3A%22tab%22%2C%22strict_locator%22%3A%22css%3Ddiv.FPdoLc.VlcLAe%20%3E%20center%20%3E%20input%5Bname%3D%5C%22btnK%5C%22%5D%22%7D%5D%7D%5D"
    }

    PO*/

    private By abc = By.name("name=btnK");  
      
,    private By tab = By.name("name=btnK");  
      

    public RemoteWebElement getabc(){
        return driver.findElement(abc);
    }      
,    public RemoteWebElement gettab(){
        return driver.findElement(tab);
    }      
}

