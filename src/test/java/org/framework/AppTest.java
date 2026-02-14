package org.framework;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
//config's test, report
@CucumberOptions(
        /*test if each test definition exist. Deprecated
        strict = true,*/
        dryRun = true,
        plugin = {"pretty","json:target/json/results.json"},
        //where to find tests
        features = {"scr/test/java/org/framework"},
        //step definitions
        glue = {""}
        //execute selected tags
        //tags = "@smoke"

)
public class AppTest {

}
