package step_deifinition;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_DeleteFromCart {
	WebDriver driver;
	@Given("delete from cart page should open in default browser")
	public void delete_from_cart_page_should_open_in_default_browser() {
		driver=new ChromeDriver();
	    driver.get("https://demo.nopcommerce.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

	}
	
	@When("Add the product to cart")
		public void Add_the_product_to_cart() throws InterruptedException {
			PageClass pg=new PageClass(driver);
			pg.addToCart2();
		}

	@And("Click on shopping cart")
	public void click_on_shopping_cart() {
		PageClass pg=new PageClass(driver);
		pg.viewCart();
	}

	@And("click on remove button")
	public void click_on_remove_button() {
		PageClass pg=new PageClass(driver);
		pg.removeClick();
	}

	@Then("product deleted successfully")
	public void product_deleted_successfully() {
	    System.out.println("product deleted successfully");
	    driver.close();
	}
}
