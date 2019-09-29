public class  {

    private RemoteWebDriver driver;

    public (RemoteWebDriver driver){
        this.driver = driver;
    }


    /*PO
    {
        "title":"",
        "info":[
        {"key":"tab","value":[{"class":"TextField","frameName":"","locator":{"tag_name":"INPUT","type":"name","value":"name=q"},"name":"tab","strict_locator":"name=q"}]}
        
,        {"key":"aldd","value":[{"class":"Button","frameName":"","locator":{"tag_name":"INPUT","type":"name","value":"name=btnI"},"name":"aldd","strict_locator":"name=btnI"}]}
        

        ]
    }

    PO*/

    private By tab = By.name("name=q");  
      
,    private By aldd = By.name("name=btnI");  
      

    public RemoteWebElement gettab(){
        return driver.findElement(tab);
    }      
,    public RemoteWebElement getaldd(){
        return driver.findElement(aldd);
    }      
}

