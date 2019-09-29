public class Sample {

    private RemoteWebDriver driver;

    public Sample(RemoteWebDriver driver){
        this.driver = driver;
    }


    /*PO
    {
        "title":"Sample",
        "info":[
        {"value":[{"class":"Button","frameName":"","locator":{"tag_name":"INPUT","type":"name","value":"name=btnK"},"name":"tamber","strict_locator":"name=btnK"}]}
        

        ]
    }

    PO*/

    private By tamber = By.name("name=btnK");  
      

    public RemoteWebElement gettamber(){
        return driver.findElement(tamber);
    }      
}

