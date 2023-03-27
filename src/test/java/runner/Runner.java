package runner;

import io.cucumber.core.snippets.SnippetType;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(publish = true,
        features = "src/test/resources/feature" ,
        glue = "stepDefinitions",
        tags = "@EscenarioSinProductos",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class Runner {

}
