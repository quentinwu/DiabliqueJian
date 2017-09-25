$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("cucumberJava.feature");
formatter.feature({
  "line": 1,
  "name": "CucumberJava",
  "description": "",
  "id": "cucumberjava",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Login functionality exists",
  "description": "",
  "id": "cucumberjava;login-functionality-exists",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "I have opened the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "I open Facebook website",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "Login button exists",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "User name field exists",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Password field exists",
  "keyword": "And "
});
formatter.match({
  "location": "cucumberJava.openBrowser()"
});
formatter.result({
  "duration": 3312989964,
  "status": "passed"
});
formatter.match({
  "location": "cucumberJava.goToFacebook()"
});
formatter.result({
  "duration": 2486010898,
  "status": "passed"
});
formatter.match({
  "location": "cucumberJava.loginButton()"
});
formatter.result({
  "duration": 19087091,
  "status": "passed"
});
formatter.match({
  "location": "cucumberJava.userNameField()"
});
formatter.result({
  "duration": 1055528071,
  "status": "passed"
});
formatter.match({
  "location": "cucumberJava.passwordField()"
});
formatter.result({
  "duration": 8934907,
  "status": "passed"
});
formatter.after({
  "duration": 2272387,
  "status": "passed"
});
});