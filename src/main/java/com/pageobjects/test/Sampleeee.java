package com.pageobjects.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Sampleeee {

    private RemoteWebDriver driver;

    public Sampleeee(RemoteWebDriver driver){
        this.driver = driver;
    }

    //PAGE-OBJECT-START
    /*PO
    {
        "metadata":"%5B%7B%22key%22%3A%22blooee%22%2C%22value%22%3A%5B%7B%22class%22%3A%22Button%22%2C%22frameName%22%3A%22%22%2C%22locator%22%3A%7B%22tag_name%22%3A%22INPUT%22%2C%22type%22%3A%22name%22%2C%22value%22%3A%22btnI%22%7D%2C%22name%22%3A%22blooee%22%2C%22page_verification%22%3Atrue%2C%22strict_locator%22%3A%22name%3DbtnI%22%7D%2C%7B%22class%22%3A%22Button%22%2C%22frameName%22%3A%22%22%2C%22locator%22%3A%7B%22tag_name%22%3A%22INPUT%22%2C%22type%22%3A%22css%22%2C%22value%22%3A%22div.FPdoLc.VlcLAe%20%3E%20center%20%3E%20input%5Bname%3D%5C%22btnI%5C%22%5D%22%7D%2C%22name%22%3A%22blooee%22%2C%22page_verification%22%3Atrue%2C%22strict_locator%22%3A%22css%3Ddiv.FPdoLc.VlcLAe%20%3E%20center%20%3E%20input%5Bname%3D%5C%22btnI%5C%22%5D%22%7D%2C%7B%22class%22%3A%22Button%22%2C%22frameName%22%3A%22%22%2C%22locator%22%3A%7B%22tag_name%22%3A%22INPUT%22%2C%22type%22%3A%22xpath%22%2C%22value%22%3A%22//form%5B@id%3D%27tsf%27%5D/div%5B2%5D/div/div%5B3%5D/center/input%5B2%5D%22%7D%2C%22name%22%3A%22blooee%22%2C%22page_verification%22%3Atrue%2C%22strict_locator%22%3A%22//form%5B@id%3D%27tsf%27%5D/div%5B2%5D/div/div%5B3%5D/center/input%5B2%5D%22%7D%5D%7D%5D"
    }

    PO*/

    By blooee = getElement("name","btnI");

    public  WebElement getBlooee(){
        return driver.findElement(blooee);
    }      

    //PAGE-OBJECT-END

    public By getElement(String type, String value){

        if(type.equals("ng-model")||type.equals("ng-repeat")||type.equals("ng-bind")||type.equals("ng-options")){
            return By.cssSelector("*["+type+"="+value+"]");
        }else if(type.equals("id")){
            return By.id(value);
        }else if (type.equals("name")){
            return By.name(value);
        }else if (type.equals("link")){
            return By.linkText(value);
        }else if (type.equals("css")){
            return By.cssSelector(value);
        }else if (type.equals("xpath")){
            return By.xpath(value);
        }
        return null;
    }
}

