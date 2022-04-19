package Testrunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        //features = "C:\\Users\\fazlu\\IdeaProjects\\CucumberBDD1\\src\\test\\java\\Features\\Login.feature"
        //features = "C:\\Users\\fazlu\\IdeaProjects\\CucumberBDD1\\src\\test\\java\\Features\\Login.feature"
        features = "C:\\Users\\fazlu\\IdeaProjects\\CucumberBDD1\\src\\test\\java\\Features\\Login.feature"
        ,glue={"StepsDefenition"}

)
public class Run {
}
