package step_deifinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageClass {
	WebDriver driver;
	
	//registration
	By registerBtn=By.xpath("//a[@class=\"ico-register\"][1]");
	By radioBtn=By.id("gender-male");
	By firstname=By.id("FirstName");
	By lastname=By.id("LastName");
	By email=By.id("Email");
	By company=By.id("Company");
	By newsletter=By.xpath("//*[@id=\"Newsletter\"]");
	By password=By.id("Password");
	By confirm_password=By.id("ConfirmPassword");
	By register=By.cssSelector("div>button[class=\"button-1 register-next-step-button\"]");
	By continueBtn=By.cssSelector("div>a[class=\"button-1 register-continue-button\"]");
	
	//login
	By loginBtn=By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a");
	By email_login=By.id("Email");
	By password_login=By.id("Password");
	By login=By.xpath("//button[@class=\"button-1 login-button\"]");
	
	//search
	By searchbox=By.id("small-searchterms");
	By searchBtn=By.xpath("//*[@id=\"small-search-box-form\"]/button");
	
	//add to cart
	By search=By.id("small-searchterms");
	By addCart=By.xpath("//*[@id=\"main\"]/div/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div/div/div[2]/div[3]/div[2]/button[1]");
	By shoppingBag=By.partialLinkText("Shopping cart");
	
	//delete from cart
	By remove=By.name("updatecart");
	
	//currency selection
	By currency=By.id("customerCurrency");
	
	//add to wishlist
	By wishlist_icon=By.cssSelector("div>button[title=\"Add to wishlist\"]");
	By wishlist_option=By.cssSelector("a>span[class=\"wishlist-label\"]");
	
	//social media
	By facebook=By.xpath("/html/body/div[6]/div[4]/div[1]/div[4]/div[1]/ul/li[1]/a");
	By twitter=By.xpath("/html/body/div[6]/div[4]/div[1]/div[4]/div[1]/ul/li[2]/a");
	By instagram=By.xpath("/html/body/div[6]/div[4]/div[1]/div[4]/div[1]/ul/li[5]/a");
	By youtube=By.xpath("/html/body/div[6]/div[4]/div[1]/div[4]/div[1]/ul/li[4]/a");
	
	//add address
	By my_acc=By.cssSelector("li>a[class=\"ico-account\"]");
	By addresses=By.xpath("//*[@id=\"main\"]/div/div[1]/div/div[2]/ul/li[2]/a");
	By add_new=By.xpath("//*[@id=\"main\"]/div/div[2]/div/div[2]/div[2]/button");
	By add_firstname=By.id("Address_FirstName");
	By add_lastname=By.id("Address_LastName");
	By add_email=By.id("Address_Email");
	By add_company=By.id("Address_Company");
	By add_country=By.id("Address_CountryId");
	By add_state=By.id("Address_StateProvinceId");
	By add_city=By.id("Address_City");
	By address1=By.id("Address_Address1");
	By address2=By.id("Address_Address2");
	By zipcode=By.id("Address_ZipPostalCode");
	By mob_number=By.id("Address_PhoneNumber");
	By save=By.xpath("//*[@id=\"main\"]/div/div[2]/form/div/div[2]/div[2]/button");
	
	//change password and logout
	By change_password=By.xpath("//*[@id=\"main\"]/div/div[1]/div/div[2]/ul/li[7]/a");
	By old_pass=By.id("OldPassword");
	By new_pass=By.id("NewPassword");
	By confirm_pass=By.id("ConfirmNewPassword");
	By change_pass_button=By.cssSelector("div>button[class=\"button-1 change-password-button\"]");
	By logout=By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a");
	By cancel=By.xpath("//*[@id=\"bar-notification\"]/div/span");
	
	public PageClass(WebDriver driver){
		this.driver=driver;
	}
	
//	**********Registration**********
	
	//register button
	public void registerMethod() throws InterruptedException {
		driver.findElement(registerBtn).click();
		Thread.sleep(2000);
	}
	
	//enter details
	public void detailsMethod() throws InterruptedException {
		driver.findElement(radioBtn).click();
		
		WebElement fname=driver.findElement(firstname);
		fname.sendKeys("Rugved");
		Thread.sleep(2000);
		
		WebElement lname=driver.findElement(lastname);
		lname.sendKeys("Phadke");
		Thread.sleep(2000);
		
		WebElement email_field=driver.findElement(email);
		email_field.sendKeys("rugvedp1@gmail.com");
		Thread.sleep(2000);
		
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0,600)");
		
		WebElement company_name=driver.findElement(company);
		company_name.sendKeys("Wipro");
		Thread.sleep(2000);
		
//		driver.findElement(newsletter).click();
//		Thread.sleep(2000);
		
	}
	
	//create password
	public void passwordMethod() throws InterruptedException {
		WebElement pass=driver.findElement(password);
		pass.sendKeys("Rabbit@99");
		Thread.sleep(2000);
		
		WebElement cnf_pass=driver.findElement(confirm_password);
		cnf_pass.sendKeys("Rabbit@99");
		Thread.sleep(2000);
	}
	
	//register
	public void registerClick() throws InterruptedException {
		driver.findElement(register).click();
		Thread.sleep(2000);
	}
	
	//continue
	public void continueClick() {
		driver.findElement(continueBtn).click();
	}
	
//	**********Login**********
	
	//login button
	public void loginMethod() {
		driver.findElement(loginBtn).click();
	}
	
	//enter email
	public void enterEmail() {
		WebElement el4=driver.findElement(email_login);
		el4.click();
		el4.sendKeys("rugvedp1@gmail.com");
//		el4.sendKeys(Keys.ENTER);
	}
	
	//enter password
	public  void enterPassword() {
		WebElement el5=driver.findElement(password_login);
		el5.sendKeys("Rabbit@99");
//		el5.sendKeys(Keys.ENTER);
	}
	
	//click login button
	public void loginClick() throws InterruptedException {
		driver.findElement(login).click();
		Thread.sleep(3000);
	}
	
//	**********Search**********
	
	//enter product names
	public void enterProducts() {
		String[] products= {"Iphone","shoes","speakers"};

		for(String product:products) {
			WebElement el5=driver.findElement(searchbox);
			el5.clear();
			el5.sendKeys(product);
			driver.findElement(searchBtn).click();
		}	
	}
	
//	public void searchClick() {
//		driver.findElement(searchBtn).click();
//		enterProducts();
//	}
	
//	**********Add to cart**********
	
	//search for product
	public void searchProduct() {
		WebElement el5=driver.findElement(search);
		el5.sendKeys("iphone");
		driver.findElement(searchBtn).click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,650)");
	}
	
	
	//add to cart
	public void addToCart() throws InterruptedException {
		driver.findElement(addCart).click();
		Thread.sleep(6000);
		
	}
	
	//view shopping bag
	public void viewCart() {
		driver.findElement(shoppingBag).click();
	}
	
//	**********Delete from cart**********
	
	//add product to cart
	public void addToCart2() throws InterruptedException {
		searchProduct();
		addToCart();
	}
	
	//click on remove option
	public void removeClick() {
		driver.findElement(remove).click();
	}
	
//	**********Currency selection**********
	
	//click on currency selection dropdown
	public void selectCurrency() {
		WebElement el6=driver.findElement(currency);
		el6.click();
	}
	
	//select euro
	public void selectEuro() throws InterruptedException {
		WebElement el6=driver.findElement(currency);
		Select sel=new Select(el6);
		sel.selectByVisibleText("Euro");
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,900)");
		js.executeScript("window.scrollBy(0,300)");
	}
	
//	**********Add to wishlist**********
	
	//search a product
	
	//click on wishlist icon
	public void wishlistIconClick() throws InterruptedException {
		driver.findElement(wishlist_icon).click();
		Thread.sleep(6000);
	}
	
	//click on wishlist option
	public void wishlistOptionClick() {
		driver.findElement(wishlist_option).click();
	}
	
//	**********Social media**********
	
	//scroll to footer section
	public void scroll() throws InterruptedException {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,900)");
		js.executeScript("window.scrollBy(0,900)");
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
	}
	
	//click on facebook icon
	public void fbClick() {
		driver.findElement(facebook).click();
	}
	
	//click on X icon
	public void twitterClick() {
		driver.findElement(twitter).click();
	}
	
	//click on instagram icon
	public void instagramClick() {
		driver.findElement(instagram).click();
	}
	
	//click on yt icon
	public void ytClick() {
		driver.findElement(youtube).click();
	}
	
//	**********Add address**********
	
	//click on my account button
	public void myAccClick() {
		driver.findElement(my_acc).click();
	}
	
	//click on addresses button
	public void addressesClick() {
		driver.findElement(addresses).click();
	}
	
	//click on add new button
	public void addNewClick() {
		driver.findElement(add_new).click();
	}
	
	//enter fname
	public void enterFname() {
		WebElement el7=driver.findElement(add_firstname);
		el7.sendKeys("Rugved");
	}

	//enter lname
	public void enterLname() {
		WebElement el8=driver.findElement(add_lastname);
		el8.sendKeys("Phadke");
	}
	
	//enter email
	public void enterMail() {
		WebElement el9=driver.findElement(add_email);
		el9.sendKeys("rugvedp1@gmail.com");
	}
	
	//enter company
	public void enterCompany() {
		WebElement el10=driver.findElement(add_company);
		el10.sendKeys("Wipro");
	}
	
	//select country
	public void selectCountry() {
		WebElement el11=driver.findElement(add_country);
		Select sel1=new Select(el11);
		sel1.selectByVisibleText("India");
	}
	
	//select state
	public void selectState() {
		WebElement el12=driver.findElement(add_state);
		Select sel2=new Select(el12);
		sel2.selectByVisibleText("Maharashtra");
	}
	
	//enter city
	public void enterCity() {
		WebElement el13=driver.findElement(add_city);
		el13.sendKeys("Pune");
	}
	
	//enter address1
	public void enterAdd1() {
		WebElement el14=driver.findElement(address1);
		el14.sendKeys("Monte Roza, Flat No 1103");
	}
	
	//enter address2
	public void enterAdd2() {
		WebElement el15=driver.findElement(address2);
		el15.sendKeys("Sinhagad road");
	}
	
	//enter zip code
	public void enterZipCode() {
		WebElement el15=driver.findElement(zipcode);
		el15.sendKeys("411052");
	}
	
	//enter phone number
	public void enterMobile() {
		WebElement el16=driver.findElement(mob_number);
		el16.sendKeys("9786351244");
	}
	
	//click on save button
	public void clickSave() {
		driver.findElement(save).click();;
	}
	
//	**********Logout & change password**********
	
	//click on change password option
	public void clickChangePass() {
		driver.findElement(change_password).click();
	}
	
	//enter old password
	public void enterOldPass() {
		WebElement el17=driver.findElement(old_pass);
		el17.sendKeys("Rabbit@99");
	}
	
	//enter old password
	public void enterNewPass() {
		WebElement el18=driver.findElement(new_pass);
		el18.sendKeys("Rabbit@19");
	}
	
	//enter old password
	public void enterConfirmPass() {
		WebElement el19=driver.findElement(confirm_pass);
		el19.sendKeys("Rabbit@19");
	}
	
	//click on change password button
	public void clickChangePassBtn() throws InterruptedException {
		driver.findElement(change_pass_button).click();
		driver.findElement(cancel).click();
		Thread.sleep(2000);
	}
	
	//click on logout button
	public void clickLogout() {
		driver.findElement(logout).click();
	}
}
