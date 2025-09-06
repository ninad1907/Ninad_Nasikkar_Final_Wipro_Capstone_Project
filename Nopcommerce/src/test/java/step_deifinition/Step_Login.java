package step_deifinition;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_Login {
	WebDriver driver;
	@Given("login page should open in default browser")
	public void login_page_should_open_in_default_browser() {
		driver=new ChromeDriver();
	    driver.get("https://demo.nopcommerce.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}

	@When("click on login button")
	public void click_on_login_button() {
		PageClass pg=new PageClass(driver);
		pg.loginMethod();
	}

	@And("enter the email address")
	public void enter_the_email_address() {
		PageClass pg=new PageClass(driver);
		pg.enterEmail();
	}

	@And("enter password")
	public void enter_password() {
		PageClass pg=new PageClass(driver);
		pg.enterPassword();
	}

	@And("click on login")
	public void click_on_login() throws InterruptedException {
		PageClass pg=new PageClass(driver);
		pg.loginClick();
	}
	
	@Then("open new webpage")
	public void open_new_webpage() {
		System.out.println("login successful");
		driver.close();
	}
}
