package step_deifinition;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_SocialMedia {
	WebDriver driver;
	@Given("Social media page should open in default browser")
	public void social_media_page_should_open_in_default_browser() {
		driver=new ChromeDriver();
	    driver.get("https://demo.nopcommerce.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));	
	}

	@When("scroll to the footer section")
	public void scroll_to_the_footer_section() throws InterruptedException {
	    PageClass pg=new PageClass(driver);
	    pg.scroll();
	}

	@And("click on facebook icon")
	public void click_on_facebook_icon() {
	    PageClass pg=new PageClass(driver);
	    pg.fbClick();
	}

	@Then("open facebook page of nopcommerce")
	public void open_facebook_page_of_nopcommerce() {
	    System.out.println("Facebook page opened..");
	}

	@And("click on x icon")
	public void click_on_x_icon() {
	    PageClass pg=new PageClass(driver);
	    pg.twitterClick();
	}

	@Then("open x page of nopcommerce")
	public void open_x_page_of_nopcommerce() {
		System.out.println("X page opened..");
	}

	@And("click on instagram icon")
	public void click_on_instagram_icon() {
	    PageClass pg=new PageClass(driver);
	    pg.instagramClick();
	}

	@Then("open instagram page of nopcommerce")
	public void open_instagram_page_of_nopcommerce() {
		System.out.println("Instagram page opened..");
	}

	@And("click on youtube icon")
	public void click_on_youtube_icon() {
	    PageClass pg=new PageClass(driver);
	    pg.ytClick();
	}

	@Then("open youtube page of nopcommerce")
	public void open_youtube_page_of_nopcommerce() {
		System.out.println("Youtube page opened..");
		driver.quit();
	}
}
