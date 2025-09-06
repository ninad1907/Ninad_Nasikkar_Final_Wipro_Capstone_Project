package step_deifinition;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_ChangeCurrency {
	WebDriver driver;
	@Given("Home page should open in default browser")
	public void home_page_should_open_in_default_browser() {
		driver=new ChromeDriver();
	    driver.get("https://demo.nopcommerce.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));	
	}

	@When("click on currency dropdown")
	public void click_on_currency_dropdown() {
	    PageClass pg=new PageClass(driver);
	    pg.selectCurrency();
	}

	@And("click on the euro option")
	public void click_on_the_euro_option() throws InterruptedException {
	    PageClass pg=new PageClass(driver);
	    pg.selectEuro();
	}

	@Then("change the currency of all products to euro")
	public void change_the_currency_of_all_products_to_euro() {
	    System.out.println("Cuurencyy changed to euro");
	    driver.close();
	}
}
