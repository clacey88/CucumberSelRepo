package Base;

import Base.BaseUtli;
import Models.User;
import Models.UserManager;
import Pages.LoginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import java.util.List;
import java.util.Map;


public class LoginStep extends BaseUtli {
    private BaseUtli baseUtli;

    @DataTableType
    public User convert(Map<String, String> entry){
        return new User(
                entry.get("username"),
                entry.get("password")
        );
    }

    public LoginStep(BaseUtli baseUtli) {
        this.baseUtli = baseUtli;
    }

    @Given("User naviagtes to login page")
    public void userNaviagtesToLoginPage() {
        System.out.println("Went to login page");
        baseUtli.webDriver.navigate().to("http://automationpractice.com/index.php");
    }




    @When("User clicks login button")
    public void userClicksLoginButton() {
        System.out.println("clicks button");
    }

    @Then("User should see the userform page")
    public void userShouldSeeTheUserformPage() {
        System.out.println("userform visible");

    }



    @And("User enters the following for Login")
    public void userEntersTheFollowingForLogin(List<User> users)  {
        //List<User> users = new ArrayList<User>();
        //Stores all the users
    /*    UserManager userManager= new UserManager();

        List<Map<String, String>> rows = table.asMaps(String.class, String.class);


        for (Map<String, String> columns : rows) {
            userManager.addUser(new User(columns.get("username"), columns.get("password")));
        }*/
        System.out.println("UserName: " + users.get(0).username + "  " + users.get(0).password);

        System.out.println("enter login info");









    }





    @And("^User enters the following email address as Email:([^\"]*)$")
    public void userEntersTheFollowingEmailAddressAsEmailAdmin(String name) {
        System.out.println(name);
    }
}
