package com.pageobjects.test

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Sample22 {

    private RemoteWebDriver driver;

    public Sample22(RemoteWebDriver driver){
        this.driver = driver;
    }


    //PAGE-OBJECT-START

    /*PO
    {
        "metadata":"%5B%7B%22key%22%3A%22tab%22%2C%22value%22%3A%5B%7B%22class%22%3A%22Button%22%2C%22frameName%22%3A%22%22%2C%22locator%22%3A%7B%22tag_name%22%3A%22INPUT%22%2C%22type%22%3A%22name%22%2C%22value%22%3A%22name%3DbtnK%22%7D%2C%22name%22%3A%22tab%22%2C%22page_verification%22%3Atrue%2C%22strict_locator%22%3A%22name%3DbtnK%22%7D%2C%7B%22class%22%3A%22Button%22%2C%22frameName%22%3A%22%22%2C%22locator%22%3A%7B%22tag_name%22%3A%22INPUT%22%2C%22type%22%3A%22css%22%2C%22value%22%3A%22css%3Ddiv.FPdoLc.VlcLAe%20%3E%20center%20%3E%20input%5Bname%3D%5C%22btnK%5C%22%5D%22%7D%2C%22name%22%3A%22tab%22%2C%22page_verification%22%3Atrue%2C%22strict_locator%22%3A%22css%3Ddiv.FPdoLc.VlcLAe%20%3E%20center%20%3E%20input%5Bname%3D%5C%22btnK%5C%22%5D%22%7D%5D%7D%2C%7B%22key%22%3A%22tee%22%2C%22value%22%3A%5B%7B%22class%22%3A%22Button%22%2C%22frameName%22%3A%22%22%2C%22locator%22%3A%7B%22tag_name%22%3A%22INPUT%22%2C%22type%22%3A%22name%22%2C%22value%22%3A%22name%3DbtnI%22%7D%2C%22name%22%3A%22tee%22%2C%22page_verification%22%3Atrue%2C%22strict_locator%22%3A%22name%3DbtnI%22%7D%2C%7B%22class%22%3A%22Button%22%2C%22frameName%22%3A%22%22%2C%22locator%22%3A%7B%22tag_name%22%3A%22INPUT%22%2C%22type%22%3A%22css%22%2C%22value%22%3A%22css%3Ddiv.FPdoLc.VlcLAe%20%3E%20center%20%3E%20input%5Bname%3D%5C%22btnI%5C%22%5D%22%7D%2C%22name%22%3A%22tee%22%2C%22page_verification%22%3Atrue%2C%22strict_locator%22%3A%22css%3Ddiv.FPdoLc.VlcLAe%20%3E%20center%20%3E%20input%5Bname%3D%5C%22btnI%5C%22%5D%22%7D%2C%7B%22class%22%3A%22Button%22%2C%22frameName%22%3A%22%22%2C%22locator%22%3A%7B%22tag_name%22%3A%22INPUT%22%2C%22type%22%3A%22xpath%22%2C%22value%22%3A%22//form%5B@id%3D%27tsf%27%5D/div%5B2%5D/div/div%5B3%5D/center/input%5B2%5D%22%7D%2C%22name%22%3A%22tee%22%2C%22page_verification%22%3Atrue%2C%22strict_locator%22%3A%22//form%5B@id%3D%27tsf%27%5D/div%5B2%5D/div/div%5B3%5D/center/input%5B2%5D%22%7D%5D%7D%5D"
    }

    PO*/

    
    private By tab = By.name("name=btnK");  
      
    private By tee = By.name("name=btnI");  
      

    public RemoteWebElement getTab(){
        return driver.findElement(tab);
    }      
    public RemoteWebElement getTee(){
        return driver.findElement(tee);
    }      

    //PAGE-OBJECT-END



}

