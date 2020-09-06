import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

//import org.junit.runner.RunWith;
//@RunWith(Cucumber.class)
//@CucumberOptions(features="classpath:features",glue ={"classpath:com.abc.def.definations"} )
@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty","json:target/cucumber.json"})
public class TestRunnerCucumber {
}