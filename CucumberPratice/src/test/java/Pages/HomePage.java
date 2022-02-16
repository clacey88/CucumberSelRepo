package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public HomePage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(how= How.ID, using = "SubmitLogin")
    private WebElement btnSubmitLogin;

    @FindBy(how= How.CLASS_NAME, using = "login")
    private WebElement btnLogin;



    public void ClickLoginBttn(){
        btnLogin.click();
    }

}
