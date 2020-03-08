package runners;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.BeforeClass;

import com.cucumber.listener.ExtentCucumberFormatter;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(
       // plugin = {"json:target/positive/cucumber.json", "pretty", "html:target/positive/cucumber.html","com.cucumber.listener.ExtentCucumberFormatter"},
        features = "src/test/resources/Features/News.Feature",
        glue = "steps",
        //tags = {"@Search-Cars"}
        monochrome = true
        )

public class PositiveTest extends AbstractTestNGCucumberTests {
	
	
}


