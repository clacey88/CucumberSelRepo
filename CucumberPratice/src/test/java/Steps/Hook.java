package Steps;

import Base.BaseUtli;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hook extends BaseUtli {

    private BaseUtli baseUtli;

    public Hook(BaseUtli baseUtli) {
        this.baseUtli = baseUtli;
    }


    @Before
    public void InitalizeTest(){
        //System.setProperty("webdriver.gecko.driver","/Users/chaunceylacey/Downloads/libs/geckodriver");
       System.setProperty("webdriver.chrome.driver","/Users/chaunceylacey/Downloads/libs/chromedriver_98");
        baseUtli.webDriver= new ChromeDriver();
        //baseUtli.webDriver= new FirefoxDriver();
    }

    @After
    public void TearDownTest(Scenario scenario){
        if (scenario.isFailed()) {
            //take screenshot
            System.out.println(scenario.getName());
        }
        System.out.println("Closed The broswer");
        baseUtli.webDriver.close();
    }

}
