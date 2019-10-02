public class Twinkle {

    private RemoteWebDriver driver;

    public Twinkle(RemoteWebDriver driver){
        this.driver = driver;
    }


    /*PO
    {
        "metadata":"%5B%7B%22key%22%3A%22tab%22%2C%22value%22%3A%5B%7B%22class%22%3A%22A%22%2C%22frameName%22%3A%22%22%2C%22locator%22%3A%7B%22tag_name%22%3A%22A%22%2C%22type%22%3A%22css%22%2C%22value%22%3A%22css%3Dhtml%20%3E%20body%20%3E%20%23topnav%20%3E%20div%20%3E%20div.w3-bar.w3-left%20%3E%20a.w3-bar-item.w3-button%22%7D%2C%22name%22%3A%22tab%22%2C%22strict_locator%22%3A%22css%3Dhtml%20%3E%20body%20%3E%20%23topnav%20%3E%20div%20%3E%20div.w3-bar.w3-left%20%3E%20a.w3-bar-item.w3-button%22%7D%2C%7B%22class%22%3A%22A%22%2C%22frameName%22%3A%22%22%2C%22locator%22%3A%7B%22tag_name%22%3A%22A%22%2C%22type%22%3A%22xpath%22%2C%22value%22%3A%22//div%5B@id%3D%27topnav%27%5D/div/div/a%5B10%5D%22%7D%2C%22name%22%3A%22tab%22%2C%22strict_locator%22%3A%22//div%5B@id%3D%27topnav%27%5D/div/div/a%5B10%5D%22%7D%5D%7D%2C%7B%22key%22%3A%22mango%22%2C%22value%22%3A%5B%7B%22class%22%3A%22A%22%2C%22frameName%22%3A%22%22%2C%22locator%22%3A%7B%22tag_name%22%3A%22A%22%2C%22type%22%3A%22css%22%2C%22value%22%3A%22css%3Da.w3-btn.w3-margin-bottom%22%7D%2C%22name%22%3A%22mango%22%2C%22strict_locator%22%3A%22css%3Da.w3-btn.w3-margin-bottom%22%7D%2C%7B%22class%22%3A%22A%22%2C%22frameName%22%3A%22%22%2C%22locator%22%3A%7B%22tag_name%22%3A%22A%22%2C%22type%22%3A%22xpath%22%2C%22value%22%3A%22//div%5B@id%3D%27main%27%5D/div%5B2%5D/a%22%7D%2C%22name%22%3A%22mango%22%2C%22strict_locator%22%3A%22//div%5B@id%3D%27main%27%5D/div%5B2%5D/a%22%7D%5D%7D%2C%7B%22key%22%3A%22gambling%22%2C%22value%22%3A%5B%7B%22class%22%3A%22A%22%2C%22frameName%22%3A%22%22%2C%22locator%22%3A%7B%22tag_name%22%3A%22A%22%2C%22type%22%3A%22css%22%2C%22value%22%3A%22css%3Dhtml%20%3E%20body%20%3E%20%23belowtopnav%20%3E%20div.w3-row.w3-white%20%3E%20%23main%20%3E%20p%20%3E%20a.w3-btn.w3-white%20w3-border%22%7D%2C%22name%22%3A%22gambling%22%2C%22strict_locator%22%3A%22css%3Dhtml%20%3E%20body%20%3E%20%23belowtopnav%20%3E%20div.w3-row.w3-white%20%3E%20%23main%20%3E%20p%20%3E%20a.w3-btn.w3-white%20w3-border%22%7D%5D%7D%2C%7B%22key%22%3A%22screenx%22%2C%22value%22%3A%5B%7B%22class%22%3A%22A%22%2C%22frameName%22%3A%22%22%2C%22locator%22%3A%7B%22tag_name%22%3A%22A%22%2C%22type%22%3A%22css%22%2C%22value%22%3A%22css%3Dhtml%20%3E%20body%20%3E%20%23sidenav%20%3E%20%23leftmenuinner%20%3E%20%23leftmenuinnerinner%20%3E%20div.notranslate%20%3E%20div.ref_overview%20%3E%20a%3Anth-of-type%2823%29%22%7D%2C%22name%22%3A%22screenx%22%2C%22strict_locator%22%3A%22css%3Dhtml%20%3E%20body%20%3E%20%23sidenav%20%3E%20%23leftmenuinner%20%3E%20%23leftmenuinnerinner%20%3E%20div.notranslate%20%3E%20div.ref_overview%20%3E%20a%3Anth-of-type%2823%29%22%7D%2C%7B%22class%22%3A%22A%22%2C%22frameName%22%3A%22%22%2C%22locator%22%3A%7B%22tag_name%22%3A%22A%22%2C%22type%22%3A%22xpath%22%2C%22value%22%3A%22//div%5B@id%3D%27leftmenuinnerinner%27%5D/div/div%5B25%5D/a%5B24%5D%22%7D%2C%22name%22%3A%22screenx%22%2C%22strict_locator%22%3A%22//div%5B@id%3D%27leftmenuinnerinner%27%5D/div/div%5B25%5D/a%5B24%5D%22%7D%5D%7D%2C%7B%22key%22%3A%22stop%22%2C%22value%22%3A%5B%7B%22class%22%3A%22A%22%2C%22frameName%22%3A%22%22%2C%22locator%22%3A%7B%22tag_name%22%3A%22A%22%2C%22type%22%3A%22css%22%2C%22value%22%3A%22css%3Dhtml%20%3E%20body%20%3E%20%23sidenav%20%3E%20%23leftmenuinner%20%3E%20%23leftmenuinnerinner%20%3E%20div.notranslate%20%3E%20div.ref_overview%20%3E%20a%3Anth-of-type%2822%29%22%7D%2C%22name%22%3A%22stop%22%2C%22strict_locator%22%3A%22css%3Dhtml%20%3E%20body%20%3E%20%23sidenav%20%3E%20%23leftmenuinner%20%3E%20%23leftmenuinnerinner%20%3E%20div.notranslate%20%3E%20div.ref_overview%20%3E%20a%3Anth-of-type%2822%29%22%7D%2C%7B%22class%22%3A%22A%22%2C%22frameName%22%3A%22%22%2C%22locator%22%3A%7B%22tag_name%22%3A%22A%22%2C%22type%22%3A%22xpath%22%2C%22value%22%3A%22//a%5Bcontains%28text%28%29%2C%27screenTop%27%29%5D%22%7D%2C%22name%22%3A%22stop%22%2C%22strict_locator%22%3A%22//a%5Bcontains%28text%28%29%2C%27screenTop%27%29%5D%22%7D%2C%7B%22class%22%3A%22A%22%2C%22frameName%22%3A%22%22%2C%22locator%22%3A%7B%22tag_name%22%3A%22A%22%2C%22type%22%3A%22xpath%22%2C%22value%22%3A%22//div%5B@id%3D%27leftmenuinnerinner%27%5D/div/div%5B25%5D/a%5B23%5D%22%7D%2C%22name%22%3A%22stop%22%2C%22strict_locator%22%3A%22//div%5B@id%3D%27leftmenuinnerinner%27%5D/div/div%5B25%5D/a%5B23%5D%22%7D%5D%7D%5D"
    }

    PO*/

    private By tab = By.css("css=html > body > #topnav > div > div.w3-bar.w3-left > a.w3-bar-item.w3-button");  
      
,    private By mango = By.css("css=a.w3-btn.w3-margin-bottom");  
      
,    private By gambling = By.css("css=html > body > #belowtopnav > div.w3-row.w3-white > #main > p > a.w3-btn.w3-white w3-border");  
      
,    private By screenx = By.css("css=html > body > #sidenav > #leftmenuinner > #leftmenuinnerinner > div.notranslate > div.ref_overview > a:nth-of-type(23)");  
      
,    private By stop = By.css("css=html > body > #sidenav > #leftmenuinner > #leftmenuinnerinner > div.notranslate > div.ref_overview > a:nth-of-type(22)");  
      

    public RemoteWebElement gettab(){
        return driver.findElement(tab);
    }      
,    public RemoteWebElement getmango(){
        return driver.findElement(mango);
    }      
,    public RemoteWebElement getgambling(){
        return driver.findElement(gambling);
    }      
,    public RemoteWebElement getscreenx(){
        return driver.findElement(screenx);
    }      
,    public RemoteWebElement getstop(){
        return driver.findElement(stop);
    }      
}

