@wwfeature

Feature: Weight Watchers search validations
Scenario: Weight Watchers search positive scenarios

Given Open Chrome Browser with url
When Assert loaded page title matches WW (Weight Watchers): Weight Loss & Wellness Help | WW USA
And On the right corner of the page, click on Find a Workshop
And Assert loaded page title contains “Find WW Studios & Meetings Near You | WW USA”
And In the search field, search for meetings for zip code: "10011"
And Print the title of the first result and the distance (located on the right of location title/name)
And Click on the first search result and then, verify displayed location name/title matches with the name of the first searched result that was clicked
And From this location page, print TODAY’s hours of operation (located towards the bottom of the page)
And Create a method to print the number of meeting the each person(under the scheduled time) has a particular day of the week
Then close browser
