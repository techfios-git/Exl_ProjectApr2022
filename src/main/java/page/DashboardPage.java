package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class DashboardPage {
	
	WebDriver driver;
	
	public DashboardPage(WebDriver driver) {
		this.driver = driver;
	}

	// WebElement list
	@FindBy(how = How.XPATH, using = "//h2[contains(text(), 'Dashboard' )]") WebElement DASHBOARD_HEADER_ELEMENT;
	@FindBy(how = How.XPATH, using = "//span[contains(text(), 'Customers' )]") WebElement CUSTOMER_MENU_ELEMENT;
	@FindBy(how = How.XPATH, using = "//a[contains(text(), 'Add Customer' )]") WebElement ADD_CUSTOMER_MENU_ELEMENT;
	@FindBy(how = How.XPATH, using = "//a[contains(text(), 'List Customers')]") WebElement LIST_CUSTOMER_MENU_ELEMENT;
	
	// Corresponding method
	public void validateDashboardPage(String expectedTest) {
		Assert.assertEquals(DASHBOARD_HEADER_ELEMENT.getText(), expectedTest, "Dashboard page not found!!!");
	}
	
	public void clickCustomerMenuButton() {
		CUSTOMER_MENU_ELEMENT.click();
	}
	
	public void clickAddCustomerMenuButton() {
		ADD_CUSTOMER_MENU_ELEMENT.click();
	}
	
	public void clickListCustomerMenuButton() throws InterruptedException {
		Thread.sleep(2000);
		LIST_CUSTOMER_MENU_ELEMENT.click();
	}
}
