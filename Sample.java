public class Sample {

    private RemoteWebDriver driver;

    public Sample(RemoteWebDriver driver){
        this.driver = driver;
    }


    /*PO
    {
        "title":"Sample",
        "info":[
        {"key":"abc","value":[]}
        
,        {"key":"table","value":[]}
        
,        {"key":"baby","value":[]}
        

        ]
    }

    PO*/

    private By abc = By.name("name=btnK");  
      
,    private By table = By.name("name=btnK");  
      
,    private By baby = By.name("name=btnI");  
      

    public RemoteWebElement getabc(){
        return driver.findElement(abc);
    }      
,    public RemoteWebElement gettable(){
        return driver.findElement(table);
    }      
,    public RemoteWebElement getbaby(){
        return driver.findElement(baby);
    }      
}

