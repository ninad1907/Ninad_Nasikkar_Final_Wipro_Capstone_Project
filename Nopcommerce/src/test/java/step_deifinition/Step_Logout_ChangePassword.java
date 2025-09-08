package step_deifinition;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_Logout_ChangePassword {
		WebDriver driver;
		@Given("change password page should open in default browser")
		public void change_password_page_should_open_in_default_browser() {
			driver=new ChromeDriver();
		    driver.get("https://demo.nopcommerce.com/");
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));	
		}

		@When("login to nopcommerce")
		public void login_to_nopcommerce() throws InterruptedException {
		    PageClass pg=new PageClass(driver);
		    pg.loginMethod();
		    pg.enterEmail();
		    pg.enterPassword();
		    pg.loginClick();
		}
		
		@And("click on my account option")
		public void click_on_my_account_option() {
		    PageClass pg=new PageClass(driver);
		    pg.myAccClick();
		}
		
		@And("click on change password")
		public void click_on_change_password() {
		    PageClass pg=new PageClass(driver);
		    pg.clickChangePass();
		}
		
		@And("enter old password")
		public void enter_old_password() {
		    PageClass pg=new PageClass(driver);
		    pg.enterOldPass();
		}
		
		@And("enter new password")
		public void enter_new_password() {
		    PageClass pg=new PageClass(driver);
		    pg.enterNewPass();
		}
		
		@And("confirm password")
		public void confirm_password() {
		    PageClass pg=new PageClass(driver);
		    pg.enterConfirmPass();
		}
		
		@And("click on change password button")
			public void click_on_change_password_button() throws InterruptedException{
		    PageClass pg=new PageClass(driver);
		    pg.clickChangePassBtn();
		}
		
		@Then("password changed successfully")
		public void password_changed_successfully() {
			System.out.println("Password changed successfully");
		}
		
		@And("click on logout button")
		public void click_on_logout_button() {
		    PageClass pg=new PageClass(driver);
		    pg.clickLogout();
		}
		
		@Then("logged out of nopcommerce")
		public void logged_out_of_nopcommerce() {
			System.out.println("Logged out successfully");
			driver.close();
		}
		
	}
