$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("ww.feature");
formatter.feature({
  "line": 3,
  "name": "Weight Watchers search validations",
  "description": "",
  "id": "weight-watchers-search-validations",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@wwfeature"
    }
  ]
});
formatter.before({
  "duration": 2775794032,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Weight Watchers search positive scenarios",
  "description": "",
  "id": "weight-watchers-search-validations;weight-watchers-search-positive-scenarios",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "Open Chrome Browser with url",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Assert loaded page title matches WW (Weight Watchers): Weight Loss \u0026 Wellness Help | WW USA",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "On the right corner of the page, click on Find a Workshop",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Assert loaded page title contains “Find WW Studios \u0026 Meetings Near You | WW USA”",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "In the search field, search for meetings for zip code: \"10011\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Print the title of the first result and the distance (located on the right of location title/name)",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Click on the first search result and then, verify displayed location name/title matches with the name of the first searched result that was clicked",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "From this location page, print TODAY’s hours of operation (located towards the bottom of the page)",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "Create a method to print the number of meeting the each person(under the scheduled time) has a particular day of the week",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "WWSearchStep.openChromeBrowserWithUrl()"
});
formatter.result({
  "duration": 105624435,
  "status": "passed"
});
formatter.match({
  "location": "WWSearchStep.loadedPageTitle()"
});
formatter.result({
  "duration": 640400762,
  "status": "passed"
});
formatter.match({
  "location": "WWSearchStep.clickOnFindAWorkshop()"
});
formatter.result({
  "duration": 3694600950,
  "status": "passed"
});
formatter.match({
  "location": "WWSearchStep.assertLoadedPageTitle()"
});
formatter.result({
  "duration": 31246098,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "10011",
      "offset": 56
    }
  ],
  "location": "WWSearchStep.inTheSearchFieldSearchForMeetingsForZipCode(String)"
});
formatter.result({
  "duration": 162883210,
  "status": "passed"
});
formatter.match({
  "location": "WWSearchStep.titleOfTheFirstResult()"
});
formatter.result({
  "duration": 478439264,
  "status": "passed"
});
formatter.match({
  "location": "WWSearchStep.verifyDisplayedLocation()"
});
formatter.result({
  "duration": 3378359679,
  "status": "passed"
});
formatter.match({
  "location": "WWSearchStep.printTODAYSHoursOfOperation()"
});
formatter.result({
  "duration": 181417682,
  "status": "passed"
});
formatter.match({
  "location": "WWSearchStep.methodToPrintTheNumber()"
});
formatter.result({
  "duration": 25955179,
  "status": "passed"
});
formatter.match({
  "location": "WWSearchStep.closeDriver()"
});
formatter.result({
  "duration": 28616,
  "status": "passed"
});
formatter.after({
  "duration": 104195493,
  "status": "passed"
});
});