public class Sample {

    private RemoteWebDriver driver;

    public Sample(RemoteWebDriver driver){
        this.driver = driver;
    }


    /*PO
    {
        "title":"Sample",
        "info":[
        {"value":[{"class":"Button","frameName":"","locator":{"tag_name":"INPUT","type":"name","value":"name=btnK"},"name":"temple","strict_locator":"name=btnK"}]}
        
,        {"value":[{"class":"Button","frameName":"","locator":{"tag_name":"INPUT","type":"name","value":"name=btnI"},"name":"bum","strict_locator":"name=btnI"}]}
        

        ]
    }

    PO*/

    private By temple = By.name("name=btnK");  
      
,    private By bum = By.name("name=btnI");  
      

    public RemoteWebElement gettemple(){
        return driver.findElement(temple);
    }      
,    public RemoteWebElement getbum(){
        return driver.findElement(bum);
    }      
}

