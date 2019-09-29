public class Sample {

    private RemoteWebDriver driver;

    public Sample(RemoteWebDriver driver){
        this.driver = driver;
    }


    /*PO
    {
        "title":"Sample",
        "info":[
        {"key":"tablet","value":[{"class":"Button","frameName":"","locator":{"tag_name":"INPUT","type":"name","value":"name=btnK"},"name":"tablet","strict_locator":"name=btnK"}]}
        

        ]
    }

    PO*/

    private By tablet = By.name("name=btnK");  
      

    public RemoteWebElement gettablet(){
        return driver.findElement(tablet);
    }      
}

