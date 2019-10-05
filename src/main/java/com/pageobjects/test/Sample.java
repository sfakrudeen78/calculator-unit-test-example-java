import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Sample.java {

    private RemoteWebDriver driver;

    public Sample.java(RemoteWebDriver driver){
        this.driver = driver;
    }


    /*PO
    {
        "metadata":"%5B%7B%22key%22%3A%22tab%22%2C%22value%22%3A%5B%7B%22class%22%3A%22A%22%2C%22frameName%22%3A%22%22%2C%22locator%22%3A%7B%22tag_name%22%3A%22A%22%2C%22type%22%3A%22css%22%2C%22value%22%3A%22css%3Dhtml%20%3E%20%23gsr%20%3E%20%23viewport%20%3E%20%23main%20%3E%20%23body%20%3E%20center%20%3E%20%23prm-pt%20%3E%20%23gws-output-pages-elements-homepage_additional_languages__als%20%3E%20%23SIvCob%20%3E%20a%3Anth-of-type%281%29%22%7D%2C%22name%22%3A%22tab%22%2C%22page_verification%22%3Atrue%2C%22strict_locator%22%3A%22css%3Dhtml%20%3E%20%23gsr%20%3E%20%23viewport%20%3E%20%23main%20%3E%20%23body%20%3E%20center%20%3E%20%23prm-pt%20%3E%20%23gws-output-pages-elements-homepage_additional_languages__als%20%3E%20%23SIvCob%20%3E%20a%3Anth-of-type%281%29%22%7D%2C%7B%22class%22%3A%22A%22%2C%22frameName%22%3A%22%22%2C%22locator%22%3A%7B%22tag_name%22%3A%22A%22%2C%22type%22%3A%22xpath%22%2C%22value%22%3A%22//a%5Bcontains%28text%28%29%2C%27%u09AC%u09BE%u0982%u09B2%u09BE%27%29%5D%22%7D%2C%22name%22%3A%22tab%22%2C%22page_verification%22%3Atrue%2C%22strict_locator%22%3A%22//a%5Bcontains%28text%28%29%2C%27%u09AC%u09BE%u0982%u09B2%u09BE%27%29%5D%22%7D%2C%7B%22class%22%3A%22A%22%2C%22frameName%22%3A%22%22%2C%22locator%22%3A%7B%22tag_name%22%3A%22A%22%2C%22type%22%3A%22xpath%22%2C%22value%22%3A%22//div%5B@id%3D%27SIvCob%27%5D/a%5B2%5D%22%7D%2C%22name%22%3A%22tab%22%2C%22page_verification%22%3Atrue%2C%22strict_locator%22%3A%22//div%5B@id%3D%27SIvCob%27%5D/a%5B2%5D%22%7D%2C%7B%22class%22%3A%22A%22%2C%22frameName%22%3A%22%22%2C%22locator%22%3A%7B%22tag_name%22%3A%22A%22%2C%22type%22%3A%22xpath%22%2C%22value%22%3A%22//a%5Bcontains%28@href%2C%20%27https%3A//www.google.co.in/setprefs%3Fsig%3D0_hExc_s5WR2wKzxRfBivj1nENqeY%253D%26hl%3Dbn%26source%3Dhomepage%26sa%3DX%26ved%3D0ahUKEwicyZK6kYTlAhXRdn0KHRAQAosQ2ZgBCA8%27%29%5D%22%7D%2C%22name%22%3A%22tab%22%2C%22page_verification%22%3Atrue%2C%22strict_locator%22%3A%22//a%5Bcontains%28@href%2C%20%27https%3A//www.google.co.in/setprefs%3Fsig%3D0_hExc_s5WR2wKzxRfBivj1nENqeY%253D%26hl%3Dbn%26source%3Dhomepage%26sa%3DX%26ved%3D0ahUKEwicyZK6kYTlAhXRdn0KHRAQAosQ2ZgBCA8%27%29%5D%22%7D%5D%7D%5D"
    }

    PO*/

    //PAGE-OBJECT-START
    private By tab = By.css("css=html > #gsr > #viewport > #main > #body > center > #prm-pt > #gws-output-pages-elements-homepage_additional_languages__als > #SIvCob > a:nth-of-type(1)");  
      
,    private By tee = By.name("name=btnK");  
      

    public RemoteWebElement getTab(){
        return driver.findElement(tab);
    }      
,    public RemoteWebElement getTee(){
        return driver.findElement(tee);
    }      
    //PAGE-OBJECT-END

