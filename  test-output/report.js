$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/Login.feature");
formatter.feature({
  "name": "login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "successful login with valid credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user lunch chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.user_lunch_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user opens url \"https://admin-demo.nopcommerce.com/login\"",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_opens_url(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "uesr enter email as \"admin@yourstore.com\" and password as \"admin\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.uesr_enter_email_as_and_password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on login",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "page tittle should be \"Dashboard / nopCommerce administration\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.page_tittle_should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on logout link",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_click_on_logout_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "page tittle should be \"Your store. Login\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.page_tittle_should_be(String)"
});
formatter.result({
  "error_message": "junit.framework.ComparisonFailure: expected:\u003c[Your store. Login]\u003e but was:\u003c[admin-demo.nopcommerce.com | 522: Connection timed out]\u003e\r\n\tat junit.framework.Assert.assertEquals(Assert.java:100)\r\n\tat junit.framework.Assert.assertEquals(Assert.java:107)\r\n\tat stepdefinitions.com.Steps.page_tittle_should_be(Steps.java:79)\r\n\tat ✽.page tittle should be \"Your store. Login\"(file:Features/Login.feature:11)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
});