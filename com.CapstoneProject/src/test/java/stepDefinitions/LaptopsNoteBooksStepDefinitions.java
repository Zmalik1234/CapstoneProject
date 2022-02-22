package stepDefinitions;

import core.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.LaptopsNoteBooksPageObject;

public class LaptopsNoteBooksStepDefinitions extends Base{
	
	LaptopsNoteBooksPageObject laptop = new LaptopsNoteBooksPageObject();

	@Given("User is on Retail website")
	public void user_is_on_retail_website() {
		
	
	}
	@When("User click on Laptop & NoteBook tab")
	public void user_click_on_laptop_note_book_tab() {
		laptop.dropdownLaptopsAndNoteBooks();
		logger.info("User click on Laptop & NoteBook tab");

	}
	@When("User click on Show all Laptop & NoteBook option")
	public void user_click_on_show_all_laptop_note_book_option() {
		laptop.showAllLaptopsNotebooks();
		logger.info("User click on Show all Laptop & NoteBook option");

	}
	@When("User click on MacBook item")
	public void user_click_on_mac_book_item() {
		laptop.macBookImgResponsive();
		logger.info("User click on MacBook item");

	}
	@Then("User should see a message {string}")
	public void user_should_see_a_message(String string) {
		laptop.macBookTextDescriptions();
		logger.info("macBookTextDescriptions");

	}
	@Then("User should see {string} showed to the cart")
	public void user_should_see_showed_to_the_cart(String string) {
		laptop.macBookAddToCart();
		logger.info("User should see {string} showed to the cart");

	}
	@Then("User click on cart option")
	public void user_click_on_cart_option() {
		laptop.addToCartOption();
		logger.info("User successfully click on cart option");

	}
	@Then("user click on red X button to remove the item from cart")
	public void user_click_on_red_x_button_to_remove_the_item_from_cart() {
		laptop.macBookRedXbutton();
		logger.info("user successfully click on red X button to remove the item from cart");

	}
	@Then("item should be removed and cart should show {string}")
	public void item_should_be_removed_and_cart_should_show(String string) {
		laptop.removeItemFromCart();
		logger.info("item should be removed and cart should show {string}");
		

	}
	@When("User click on product comparison icon on {string}")
	public void user_click_on_product_comparison_icon_on(String string) {
		laptop.productComparisonIcon();
		logger.info("user successfully click on product comparison icon on {string}");

	}
	@Then("User click on Product comparison link")
	public void user_click_on_product_comparison_link() {
		laptop.macBookAirCompareThisProduct();
		logger.info("User successfully click on Product comparison link");

	}
	@Then("User should see Product Comparison Chart")
	public void user_should_see_product_comparison_chart() {
		laptop.macBookAirImgResponsive();
		logger.info("User should see Product Comparison Chart");

	}
	@And("User click on heart icon to add 'Sony VaIO' laptop to wish list")
	public void user_click_on_heart_icon_to_add_laptop_to_wish_list(String string) {
		laptop.sonyVAIOAddToWishList();
		logger.info("User click on heart icon to add laptop to wish list");
		

	}
	@Then("User should get a message {}")
	public void user_should_get_a_message(String string) {
		laptop.sonyVAIOsuccessMessage();
		logger.info("User should get a message {‘You must login or create an account to save Sony VAIO to your wish list!’}");

	}
	@And("User click on 'MacBook Pro' item")
	public void user_click_on_item(String string) {
		laptop.macBookProImgResponsive();
		logger.info("User successfully click on ‘MacBook Pro’ item");
		

	}
	@Then("User should see {string} price tag is present on UI.")
	public void user_should_see_price_tag_is_present_on_ui(String string) {
		laptop.macBookAirActualPrice();
		logger.info("User should see {string} price tag is present on UI.");

	}
	
	
}
