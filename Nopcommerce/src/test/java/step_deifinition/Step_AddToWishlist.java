package step_deifinition;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_AddToWishlist {
	WebDriver driver;
	@Given("product page should open in default browser")
	public void product_page_should_open_in_default_browser() {
		driver=new ChromeDriver();
	    driver.get("https://demo.nopcommerce.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));	
	}

	@When("search a product")
	public void search_a_product() {
		PageClass pg=new PageClass(driver);
		pg.searchProduct();
	}

	@And("click on the add to wishlist icon")
	public void click_on_the_add_to_wishlist_icon() throws InterruptedException {
		PageClass pg=new PageClass(driver);
		pg.wishlistIconClick();
	}

	@And("click on Wishlist option")
	public void click_on_wishlist_option() {
		PageClass pg=new PageClass(driver);
		pg.wishlistOptionClick();
	}

	@Then("display products in the wishlist")
	public void display_products_in_the_wishlist() {
	    System.out.println("Added to wishlist...");
	    driver.close();
	}
}
