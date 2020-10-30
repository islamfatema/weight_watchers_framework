package stepdefinition;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.WWSearchPage;

/**
 * @author fatemaislam
 *
 */
public class WWSearchStep {
	WebDriver driver;
	private WWSearchPage wwSearchPage = new WWSearchPage();

	@Given("^Open Chrome Browser with url$")
	public void openChromeBrowserWithUrl() throws Throwable {
		SharedSD.getDriver();

	}

	@When("^Assert loaded page title matches WW \\(Weight Watchers\\): Weight Loss & Wellness Help | WW USA$")

	public void loadedPageTitle() throws Throwable {
		String actualTitle = SharedSD.getDriver().getTitle();
		System.out.println(actualTitle);
		String expectedTitle = "WW (Weight Watchers): Weight Loss & Wellness Help | WW USA";
		Assert.assertEquals(expectedTitle, actualTitle);
	}

	@When("^On the right corner of the page, click on Find a Workshop$")
	public void clickOnFindAWorkshop() throws Throwable {
		wwSearchPage.clickOnfindWorkShop();
		Thread.sleep(3000);
	}

	@When("^Assert loaded page title contains “Find WW Studios & Meetings Near You | WW USA”$")

	public void assertLoadedPageTitle() throws Throwable {
		String actualTitle = SharedSD.getDriver().getTitle();

		Assert.assertEquals(actualTitle, "Find WW Studios & Meetings Near You | WW USA");
	}

	@When("^In the search field, search for meetings for zip code: \"([^\"]*)\"$")
	public void inTheSearchFieldSearchForMeetingsForZipCode(String zip) throws Throwable {
		wwSearchPage.enterZipCode(zip);
		wwSearchPage.clicksearchButton();

	}

	@When("^Print the title of the first result and the distance \\(located on the right of location title/name\\)$")
	public void titleOfTheFirstResult() throws Throwable {
		System.out.println(wwSearchPage.gettexts());
	}

	@When("^Click on the first search result and then, verify displayed location name/title matches with the name of the first searched result that was clicked$")
	public void verifyDisplayedLocation() throws Throwable {
		wwSearchPage.clickOnFirstResult();
		Thread.sleep(3000);

	}

	@When("^From this location page, print TODAY’s hours of operation \\(located towards the bottom of the page\\)$")
	public void printTODAYSHoursOfOperation() throws Throwable {
		wwSearchPage.clickOnHoursTime();

		Date now = new Date();
		SimpleDateFormat simpleDateformat = new SimpleDateFormat("E");
		simpleDateformat = new SimpleDateFormat("EEEE");
		System.out.println(simpleDateformat.format(now));
		System.out.println(wwSearchPage.getTimes());

	}

	@When("^Create a method to print the number of meeting the each person\\(under the scheduled time\\) has a particular day of the week$")

	public void methodToPrintTheNumber() throws Throwable {
		System.out.println(wwSearchPage.printMeetings());
	}

	@Then("^close browser$")
	public void closeDriver() throws Throwable {
		// SharedSD.getDriver().quit();
	}

}
