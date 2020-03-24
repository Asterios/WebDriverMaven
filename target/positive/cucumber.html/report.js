$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/CP_Positive.Feature");
formatter.feature({
  "line": 2,
  "name": "Acceptance testing to validate Collateral Value Positive Test.",
  "description": "In order to validate that \nCollateral Value is calculated correctly\nDoing the Acceptance Testing",
  "id": "acceptance-testing-to-validate-collateral-value-positive-test.",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@CP_Positive"
    }
  ]
});
formatter.before({
  "duration": 9648616200,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Validate that account \"13114\" has collateral bigger than zero",
  "description": "",
  "id": "acceptance-testing-to-validate-collateral-value-positive-test.;validate-that-account-\"13114\"-has-collateral-bigger-than-zero",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@CP_Positive"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "I am connected on the database",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I do query for account \"13114\"",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "the collateral value is bigger than zero",
  "keyword": "Then "
});
formatter.match({
  "location": "CP_Positive_Steps.i_am_connected_on_the_database()"
});
formatter.result({
  "duration": 168900500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "13114",
      "offset": 24
    }
  ],
  "location": "CP_Positive_Steps.i_do_query_for_account(String)"
});
formatter.result({
  "duration": 11877000,
  "status": "passed"
});
formatter.match({
  "location": "CP_Positive_Steps.the_collateral_value_is_bigger_than_zero()"
});
formatter.result({
  "duration": 438400,
  "status": "passed"
});
formatter.after({
  "duration": 633526900,
  "status": "passed"
});
});