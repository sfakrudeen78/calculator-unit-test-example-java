public class Sample {

    private RemoteWebDriver driver;

    public Sample(RemoteWebDriver driver){
        this.driver = driver;
    }


    /*PO
    {
        "title":"Sample",
        "info":[
        {"key":tab,"value":[{"class":"Button","frameName":"","locator":{"tag_name":"INPUT","type":"name","value":"name=btnK"},"name":"tab","strict_locator":"name=btnK"}]}
        
,        {"key":mab,"value":[{"class":"Button","frameName":"","locator":{"tag_name":"INPUT","type":"name","value":"name=btnI"},"name":"mab","strict_locator":"name=btnI"}]}
        

        ]
    }

    PO*/

    private By tab = By.name("name=btnK");  
      
,    private By mab = By.name("name=btnI");  
      

    public RemoteWebElement gettab(){
        return driver.findElement(tab);
    }      
,    public RemoteWebElement getmab(){
        return driver.findElement(mab);
    }      
}

