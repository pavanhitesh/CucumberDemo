$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("example.feature");
formatter.feature({
  "line": 2,
  "name": "Example for Feature",
  "description": "",
  "id": "example-for-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@example"
    }
  ]
});
formatter.before({
  "duration": 1718497199,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Verify Application Opened",
  "description": "",
  "id": "example-for-feature;verify-application-opened",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@example1"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User navigate to given url \"https://www.seleniumhq.org/\"",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user click on download link",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user click on documentation link",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.seleniumhq.org/",
      "offset": 28
    }
  ],
  "location": "StepDefinitions.user_navigate_to_given_url(String)"
});
formatter.result({
  "duration": 14343306038,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_click_on_download_link()"
});
formatter.result({
  "duration": 2019412903,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_click_on_documentation_link()"
});
formatter.result({
  "duration": 5504322532,
  "status": "passed"
});
formatter.after({
  "duration": 65205,
  "status": "passed"
});
});