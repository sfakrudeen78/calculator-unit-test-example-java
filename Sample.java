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
        

        ]
    }

    PO*/

    private By abc = By.name("name=btnK");  
      

    public RemoteWebElement getabc(){
        return driver.findElement(abc);
    }      
}

