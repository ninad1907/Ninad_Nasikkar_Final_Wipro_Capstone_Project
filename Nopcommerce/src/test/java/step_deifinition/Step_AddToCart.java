package step_deifinition;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_AddToCart {
	WebDriver driver;
	@Given("add to cart page should open in default browser")
	public void add_to_cart_page_should_open_in_default_browser() {
		driver=new ChromeDriver();
	    driver.get("https://demo.nopcommerce.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));	
	}

	@When("search for a product")
	public void search_for_a_product(){
		PageClass pg=new PageClass(driver);
		pg.searchProduct();
	}

	@And("click on add to cart button")
	public void click_on_add_to_cart_button() throws InterruptedException {
		PageClass pg=new PageClass(driver);
		pg.addToCart();
	}

	@And("click on shopping cart button")
	public void click_on_shopping_cart_button(){
	    PageClass pg=new PageClass(driver);
	    pg.viewCart();
	}

	@Then("show the added product")
	public void show_the_added_product() {
		System.out.println("Product added to cart successfully");
		driver.close();
	}

}
