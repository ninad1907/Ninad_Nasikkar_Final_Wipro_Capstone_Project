package step_deifinition;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_Register {
	WebDriver driver;
	@Given("registration page should open in default browser")
	public void registration_page_should_open_in_default_browser() {
		driver=new ChromeDriver();
	    driver.get("https://demo.nopcommerce.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	}

	@When("click on register button")
	public void click_on_register_button() throws InterruptedException {
		PageClass pg=new PageClass(driver);
		pg.registerMethod();
		
	}

	@And("enter the details")
	public void enter_the_details() throws InterruptedException {
		PageClass pg=new PageClass(driver);
		pg.detailsMethod();
	}

	@And("create new password")
	public void create_new_password() throws InterruptedException {
		PageClass pg=new PageClass(driver);
		pg.passwordMethod();
	}

	@And("click on register")
	public void click_on_register() throws InterruptedException {
		PageClass pg=new PageClass(driver);
		pg.registerClick();
	}
	
	@And("click on continue")
	public void click_on_coninue() {
		PageClass pg=new PageClass(driver);
		pg.continueClick();
	}

	@Then("open home page")
	public void open_home_page() {
		System.out.println("registration successful");
		driver.close();
	}
}
