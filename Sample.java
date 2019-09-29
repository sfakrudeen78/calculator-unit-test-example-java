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
        

        ]
    }

    PO*/

    private By junga = By.name("name=btnK");  
      

    public RemoteWebElement getjunga(){
        return driver.findElement(junga);
    }      
}

