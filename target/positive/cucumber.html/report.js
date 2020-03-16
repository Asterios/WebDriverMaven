$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/News.Feature");
formatter.feature({
  "line": 2,
  "name": "Acceptance testing to validate Newspaper Page is working.",
  "description": "In order to validate that \nthe Newspaper page is working\nDoing the Acceptance Testing",
  "id": "acceptance-testing-to-validate-newspaper-page-is-working.",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@News"
    }
  ]
});
formatter.before({
  "duration": 9462085600,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Validate Newspaper page in news247",
  "description": "",
  "id": "acceptance-testing-to-validate-newspaper-page-is-working.;validate-newspaper-page-in-news247",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@News-Positive"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "I am on the Home Page \"https://www.news247.gr/\"",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I click on newsapapers",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I should see the list of newsapapers",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.news247.gr/",
      "offset": 23
    }
  ],
  "location": "NewsSteps.i_am_on_the_Home_Page(String)"
});
formatter.result({
  "duration": 811344400,
  "status": "passed"
});
formatter.match({
  "location": "NewsSteps.i_click_on_newsapapers()"
});
formatter.result({
  "duration": 628646200,
  "status": "passed"
});
formatter.match({
  "location": "NewsSteps.i_should_see_the_list_of_newsapapers()"
});
formatter.result({
  "duration": 3019400500,
  "status": "passed"
});
formatter.after({
  "duration": 4870172300,
  "status": "passed"
});
});