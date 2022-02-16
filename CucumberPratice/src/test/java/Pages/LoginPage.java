package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(how= How.ID, using = "SubmitLogin")
    private WebElement btnSubmitLogin;

    @FindBy(how= How.ID, using = "email")
    private WebElement txtEmail;

    @FindBy(how= How.NAME, using = "passwd")
    private WebElement txtPassword;

    public void EnterLoginInfo(String userName, String passWord){
        txtEmail.sendKeys(userName);
        txtPassword.sendKeys(passWord);
    }

    public void SubmitLogin(){
        btnSubmitLogin.click();
    }
}
