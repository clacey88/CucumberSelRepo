package Steps;

import Base.BaseUtli;
import Pages.HomePage;
import Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AutoPracStep extends BaseUtli {

    private BaseUtli baseUtli;

    public AutoPracStep(BaseUtli baseUtli){
        this.baseUtli=baseUtli;
    }




    @Given("User arrives to homepage")
    public void userArrivesToHomepage() {
        baseUtli.webDriver.navigate().to("http://automationpractice.com/index.php");
    }

    @And("clicks login button")
    public void clicksLoginButton() {
        HomePage h = new HomePage(baseUtli.webDriver);
        h.ClickLoginBttn();
        //baseUtli.webDriver.findElement(By.className("login")).click();
    }

    @When("user clicks signin button")
    public void userClicksSigninButton() {
        //baseUtli.webDriver.findElement(By.id("SubmitLogin")).click();
        LoginPage p = new LoginPage(baseUtli.webDriver);
        p.SubmitLogin();
    }

    @Then("user reaches profile screen")
    public void userReachesProfileScreen() throws InterruptedException {
        System.out.println("reached homepage");
        Thread.sleep(1000);
        Assert.assertTrue(baseUtli.webDriver.findElement(By.cssSelector("a.home")).isDisplayed());
    }

    @And("^User enters ([^\"]*) and ([^\"]*)$")
    public void userEntersUsernameAndPassword(String username, String password) {
        System.out.println(username + " " + password);
        LoginPage p = new LoginPage(baseUtli.webDriver);
        p.EnterLoginInfo(username,password);
    }

    @Then("user reaches profile screen wrong page")
    public void userReachesProfileScreenWrongPage() {
        Assert.assertTrue(baseUtli.webDriver.findElement(By.cssSelector("dfdlfldkfkljdf")).isDisplayed());

    }
}
