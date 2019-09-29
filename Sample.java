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
        
,        {"key":"tab","value":[{"class":"Button","frameName":"","locator":{"tag_name":"INPUT","type":"name","value":"name=btnK"},"name":"tab","strict_locator":"name=btnK"}]}
        
,        {"key":"junga","value":[{"class":"Button","frameName":"","locator":{"tag_name":"INPUT","type":"name","value":"name=btnK"},"name":"junga","strict_locator":"name=btnK"}]}
        

        ]
    }

    PO*/

    private By tablet = By.name("name=btnK");  
      
,    private By tab = By.name("name=btnK");  
      
,    private By junga = By.name("name=btnK");  
      

    public RemoteWebElement gettablet(){
        return driver.findElement(tablet);
    }      
,    public RemoteWebElement gettab(){
        return driver.findElement(tab);
    }      
,    public RemoteWebElement getjunga(){
        return driver.findElement(junga);
    }      
}

