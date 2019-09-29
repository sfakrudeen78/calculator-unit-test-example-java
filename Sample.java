public class Sample {

    private RemoteWebDriver driver;

    public Sample(RemoteWebDriver driver){
        this.driver = driver;
    }


    /*PO
    {
        "title":"Sample",
        "info":[
        {"key":"junga","value":[{"class":"Button","frameName":"","locator":{"tag_name":"INPUT","type":"name","value":"name=btnK"},"name":"junga","strict_locator":"name=btnK"}]}
        
,        {"key":"monkye","value":[{"class":"TextField","frameName":"","locator":{"tag_name":"INPUT","type":"name","value":"name=q"},"name":"monkye","strict_locator":"name=q"}]}
        

        ]
    }

    PO*/

    private By junga = By.name("name=btnK");  
      
,    private By monkye = By.name("name=q");  
      

    public RemoteWebElement getjunga(){
        return driver.findElement(junga);
    }      
,    public RemoteWebElement getmonkye(){
        return driver.findElement(monkye);
    }      
}

