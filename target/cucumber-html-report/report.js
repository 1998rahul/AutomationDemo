$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/Demo1.feature");
formatter.feature({
  "line": 1,
  "name": "Demo1",
  "description": "",
  "id": "demo1",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "verify Amazon home page",
  "description": "",
  "id": "demo1;verify-amazon-home-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I verify Amazon logo is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "Search bar is displayed",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});