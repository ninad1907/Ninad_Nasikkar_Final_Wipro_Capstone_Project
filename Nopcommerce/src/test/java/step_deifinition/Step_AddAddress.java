package step_deifinition;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_AddAddress {
	WebDriver driver;
	@Given("address page should open in default browser")
	public void address_page_should_open_in_default_browser() {
		driver=new ChromeDriver();
	    driver.get("https://demo.nopcommerce.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));	
	}

	@When("log in to nopcommerce website")
	public void log_in_to_nopcommerce_website() throws InterruptedException {
	    PageClass pg=new PageClass(driver);
	    pg.loginMethod();
	    pg.enterEmail();
	    pg.enterPassword();
	    pg.loginClick();
	}

	@And("click on my account button")
	public void click_on_my_account_button() {
	    PageClass pg=new PageClass(driver);
	    pg.myAccClick();
	}

	@And("click on addresses button")
	public void click_on_addresses_button() {
	    PageClass pg=new PageClass(driver);
	    pg.addressesClick();
	}

	@And("click on add new button")
	public void click_on_add_new_button() {
	    PageClass pg=new PageClass(driver);
	    pg.addNewClick();
	}

	@And("enter first name")
	public void enter_first_name() {
	    PageClass pg=new PageClass(driver);
	    pg.enterFname();
	}

	@And("enter last name")
	public void enter_last_name() {
	    PageClass pg=new PageClass(driver);
	    pg.enterLname();
	}

	@When("enter email address")
	public void enter_email_address() {
	    PageClass pg=new PageClass(driver);
	    pg.enterMail();
	}

	@And("enter company")
	public void enter_company() {
	    PageClass pg=new PageClass(driver);
	    pg.enterCompany();
	}

	@And("select country from dropdown")
	public void select_country_from_dropdown() {
	    PageClass pg=new PageClass(driver);
	    pg.selectCountry();
	}

	@And("select state from dropdown")
	public void select_state_from_dropdown() {
	    PageClass pg=new PageClass(driver);
	    pg.selectState();
	}

	@And("enter city")
	public void enter_city() {
	    PageClass pg=new PageClass(driver);
	    pg.enterCity();
	}

	@And("enter address line one")
	public void enter_address_line_one() {
	    PageClass pg=new PageClass(driver);
	    pg.enterAdd1();
	}

	@And("enter address line two")
	public void enter_address_line_two() {
	    PageClass pg=new PageClass(driver);
	    pg.enterAdd2();
	}

	@And("enter pincode")
	public void enter_pincode() {
	    PageClass pg=new PageClass(driver);
	    pg.enterZipCode();
	}

	@And("enter phone number")
	public void enter_phone_number() {
	    PageClass pg=new PageClass(driver);
	    pg.enterMobile();
	}

	@And("click on save button")
	public void click_on_save_button() {
	    PageClass pg=new PageClass(driver);
	    pg.clickSave();
	}

	@Then("new address added successfully")
	public void new_address_added_successfully() {
	    System.out.println("New address added");
	    driver.close();
	}
}
