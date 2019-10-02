public class Twinkle {

    private RemoteWebDriver driver;

    public Twinkle(RemoteWebDriver driver){
        this.driver = driver;
    }


    /*PO
    {
        "metadata":"%5B%7B%22key%22%3A%22tab%22%2C%22value%22%3A%5B%7B%22class%22%3A%22H1%22%2C%22frameName%22%3A%22%22%2C%22locator%22%3A%7B%22tag_name%22%3A%22H1%22%2C%22type%22%3A%22css%22%2C%22value%22%3A%22css%3Dh1.post-title%22%7D%2C%22name%22%3A%22tab%22%2C%22strict_locator%22%3A%22css%3Dh1.post-title%22%7D%2C%7B%22class%22%3A%22H1%22%2C%22frameName%22%3A%22%22%2C%22locator%22%3A%7B%22tag_name%22%3A%22H1%22%2C%22type%22%3A%22xpath%22%2C%22value%22%3A%22//div%5B@id%3D%27container%27%5D/div/article/header/h1%22%7D%2C%22name%22%3A%22tab%22%2C%22strict_locator%22%3A%22//div%5B@id%3D%27container%27%5D/div/article/header/h1%22%7D%5D%7D%2C%7B%22key%22%3A%22tabeee%22%2C%22value%22%3A%5B%7B%22class%22%3A%22A%22%2C%22frameName%22%3A%22%22%2C%22locator%22%3A%7B%22tag_name%22%3A%22A%22%2C%22type%22%3A%22css%22%2C%22value%22%3A%22css%3Dhtml%20%3E%20body%20%3E%20%23wrapper%20%3E%20%23container%20%3E%20div.container.single-post-container%20has-sidebar%20%3E%20aside%20%3E%20ul%20%3E%20li%3Anth-of-type%285%29%20%3E%20a%22%7D%2C%22name%22%3A%22tabeee%22%2C%22strict_locator%22%3A%22css%3Dhtml%20%3E%20body%20%3E%20%23wrapper%20%3E%20%23container%20%3E%20div.container.single-post-container%20has-sidebar%20%3E%20aside%20%3E%20ul%20%3E%20li%3Anth-of-type%285%29%20%3E%20a%22%7D%2C%7B%22class%22%3A%22A%22%2C%22frameName%22%3A%22%22%2C%22locator%22%3A%7B%22tag_name%22%3A%22A%22%2C%22type%22%3A%22xpath%22%2C%22value%22%3A%22//a%5Bcontains%28text%28%29%2C%27ES5%20to%20ESNext%27%29%5D%22%7D%2C%22name%22%3A%22tabeee%22%2C%22strict_locator%22%3A%22//a%5Bcontains%28text%28%29%2C%27ES5%20to%20ESNext%27%29%5D%22%7D%2C%7B%22class%22%3A%22A%22%2C%22frameName%22%3A%22%22%2C%22locator%22%3A%7B%22tag_name%22%3A%22A%22%2C%22type%22%3A%22xpath%22%2C%22value%22%3A%22//div%5B@id%3D%27container%27%5D/div/aside/ul/li%5B6%5D/a%22%7D%2C%22name%22%3A%22tabeee%22%2C%22strict_locator%22%3A%22//div%5B@id%3D%27container%27%5D/div/aside/ul/li%5B6%5D/a%22%7D%2C%7B%22class%22%3A%22A%22%2C%22frameName%22%3A%22%22%2C%22locator%22%3A%7B%22tag_name%22%3A%22A%22%2C%22type%22%3A%22xpath%22%2C%22value%22%3A%22//a%5Bcontains%28@href%2C%20%27/page/es5-to-esnext%27%29%5D%22%7D%2C%22name%22%3A%22tabeee%22%2C%22strict_locator%22%3A%22//a%5Bcontains%28@href%2C%20%27/page/es5-to-esnext%27%29%5D%22%7D%5D%7D%5D"
    }

    PO*/

    private By tab = By.css("css=h1.post-title");  
      
    private By tabeee = By.css("css=html > body > #wrapper > #container > div.container.single-post-container has-sidebar > aside > ul > li:nth-of-type(5) > a");  
      

    public RemoteWebElement gettab(){
        return driver.findElement(tab);
    }      
    public RemoteWebElement gettabeee(){
        return driver.findElement(tabeee);
    }      
}

