package StepsDefenition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginTest {

    @Given("User already in amazon home page")
    public void user_already_in_amazon_home_page() {
        //public static void test() throws InterruptedException {
            System.setProperty("webdriver.chrome.driver","C:\\Users\\fazlu\\IdeaProjects\\CucumberBDD1\\driver\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.manage().window().maximize();
            String baseUrl = "https://www.amazon.com/";
            driver.get(baseUrl);


    }
    @When("I enter valid email and valid password")
    public void i_enter_valid_email_and_valid_password() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\fazlu\\IdeaProjects\\CucumberBDD1\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        //String baseUrl = "https://www.amazon.com/";
        //driver.get(baseUrl);
        WebElement searchbox= driver.findElement(By.xpath("//input[@id='ap_email']"));

       // System.out.println("This is When for login test for valid email & password");
    }
    @Then("user should be able to login successfully")
    public void user_should_be_able_to_login_successfully() {
        System.out.println("This is Then for Login test for valid email & password");
    }


    @When("I enter wrong email and wrong password")
    public void i_enter_wrong_email_and_wrong_password() {
        System.out.println("This is When for Login test for wrong email & password");
    }
    @Then("user should not be able to login successfully")
    public void user_should_not_be_able_to_login_successfully() {
        System.out.println("This is Then for Login test for wrong email & password");
    }




    @When("I enter valid email and invalid password")
    public void i_enter_valid_email_and_invalid_password() {
        System.out.println("This is When for Login test for  valid email & invalid password");
    }
    @Then("user could not be able to login correctly")
    public void user_could_not_be_able_to_login_correctly() {
        System.out.println("This is Then for Login test for  valid email & invalid password");
    }





    @When("I enter invalid email and valid password")
    public void i_enter_invalid_email_and_valid_password() {
        System.out.println("This is When for Login test for invalid email & valid password");
    }
    @Then("user not  able to login successfully")
    public void user_not_able_to_login_successfully() {
        System.out.println("This is Then for Log test for invalid email & valid password");
    }



}
