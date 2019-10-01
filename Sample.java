public class Sample {

    private RemoteWebDriver driver;

    public Sample(RemoteWebDriver driver){
        this.driver = driver;
    }


    /*PO
    {
        "title":"Sample",
        "info":[
        {"key":"tab","value":[]}
        
,        {"key":"aldd","value":[]}
        
,        {"key":"dingo","value":[]}
        

        ]
    }

    PO*/

    private By tab = By.name("name=q");  
      
,    private By aldd = By.name("name=btnI");  
      
,    private By dingo = By.name("name=btnK");  
      

    public RemoteWebElement gettab(){
        return driver.findElement(tab);
    }      
,    public RemoteWebElement getaldd(){
        return driver.findElement(aldd);
    }      
,    public RemoteWebElement getdingo(){
        return driver.findElement(dingo);
    }      
}

