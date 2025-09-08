package step_deifinition;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_Search {
	WebDriver driver;
	@Given("search page should open in default browser")
	public void search_page_should_open_in_default_browser() {
		driver=new ChromeDriver();
	    driver.get("https://demo.nopcommerce.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	}

	@When("enter product names in searchbox")
	public void enter_product_names_in_searchbox() throws InterruptedException {
		PageClass pg=new PageClass(driver);
		pg.enterProducts();
	}

//	@And("click on search button")
//	public void click_on_search_button() throws InterruptedException {
//		PageClass pg=new PageClass(driver);
//		pg.searchClick();
//	}

	@Then("display product lists")
	public void display_product_lists() {
		System.out.println("Searched successfully");
		driver.close();
	}

}
