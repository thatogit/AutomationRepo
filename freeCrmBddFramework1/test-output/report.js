$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM Login Feature",
  "description": "",
  "id": "free-crm-login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "comments": [
    {
      "line": 3,
      "value": "#Without examples Keyword"
    }
  ],
  "line": 5,
  "name": "Free CRM Login test scenario",
  "description": "",
  "id": "free-crm-login-feature;free-crm-login-test-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "The user is on a login page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "Title is free CRM",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User enter \"thatomadub\" and \"thato123\"",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "User click login button",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "User must be on home page",
  "keyword": "Then "
});
formatter.match({
  "location": "loginStepsDefination.The_user_is_on_a_login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "loginStepsDefination.Title_is_free_CRM()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "thatomadub",
      "offset": 12
    },
    {
      "val": "thato123",
      "offset": 29
    }
  ],
  "location": "loginStepsDefination.User_enter_username_and_password(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "loginStepsDefination.User_click_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "loginStepsDefination.User_must_be_on_home_page()"
});
formatter.result({
  "status": "skipped"
});
});