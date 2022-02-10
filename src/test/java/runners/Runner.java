package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "src/test/java/stepdefinitions",
        tags = "@istediginiz tag",
        dryRun = false)

public class Runner {
    //Runner class'inin icine hicbir kod yazmiyoruz
    //Bu class icin onemli olan kullanacagimiz 2 adet notasyon
}
