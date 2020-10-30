package framework;
import org.openqa.selenium.By;

/**
 * @author fatemaislam
 *
 */
public class WWSearchPage extends BasePage {

	private By findWorkShop = By.xpath("//a[@href='https://www.weightwatchers.com/us/find-a-workshop/']");

	private By locationSearch = By.xpath("//input[@id='location-search']");

	private By searchButton = By.xpath("//button[@id='location-search-cta']");

	private By resultAndDistance = By.xpath("//div[@id='location-1180510']");

	private By firstResult = By.xpath("//a[contains(text(),'WW Studio Flatiron')]");

	private By clickOnHours = By.xpath("//div[@class='title-3o8Pv']");

	private By time = By.xpath("//span[@class='meetingTime-1g52A']");

	private By meeting = By.xpath("//div[@class='day-NhBOb']");

	public void clickOnfindWorkShop() {
		clickOn(findWorkShop);
	}

	public void enterZipCode(String enterZip) {
		sendText(locationSearch, enterZip);
	}

	public void clicksearchButton() {
		clickOn(searchButton);
	}

	public String gettexts() {

		return getTextFromElement(resultAndDistance);
	}

	public void clickOnFirstResult() {
		clickOn(firstResult);
	}

	public void clickOnHoursTime() {
		clickOn(clickOnHours);
	}

	public String getTimes() {

		return getTextFromElement(time);
	}

	public String printMeetings() {

		return getTextFromElement(meeting);
	}

}
