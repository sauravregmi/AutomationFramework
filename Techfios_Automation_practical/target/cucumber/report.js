$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./src/test/java/cucumberTestFeatures/Background.feature");
formatter.feature({
  "line": 2,
  "name": "Validate Background scenario",
  "description": "",
  "id": "validate-background-scenario",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Color"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "Sky Blue Background",
  "description": "",
  "id": "validate-background-scenario;sky-blue-background",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@Scenario1"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "\"Set SkyBlue Background\" button exits",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "\"Set SkyBlue Background\" after user clicks on the button",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "the background color will change to sky blue",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Set SkyBlue Background",
      "offset": 1
    }
  ],
  "location": "BackgroundStepDef.button_exits(String)"
});
formatter.result({
  "duration": 2617878957,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Set SkyBlue Background",
      "offset": 1
    }
  ],
  "location": "BackgroundStepDef.after_user_clicks_on_the_button(String)"
});
formatter.result({
  "duration": 1368742,
  "error_message": "java.lang.NullPointerException: Cannot invoke \"cucumberPage.BackgroundColor.SkyBlueBackgound()\" because \"this.backgroundColor\" is null\n\tat cucumberTestStep.BackgroundStepDef.after_user_clicks_on_the_button(BackgroundStepDef.java:22)\n\tat ✽.Then \"Set SkyBlue Background\" after user clicks on the button(./src/test/java/cucumberTestFeatures/Background.feature:7)\n",
  "status": "failed"
});
formatter.match({
  "location": "BackgroundStepDef.the_background_color_will_change_to_sky_blue()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 11,
  "name": "Set  White Background",
  "description": "",
  "id": "validate-background-scenario;set--white-background",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@Scenario2"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "\"Set white Background\" button exits",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "\"Set white Background\" after user clicks on the button",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "the background color will change to white",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Set white Background",
      "offset": 1
    }
  ],
  "location": "BackgroundStepDef.button_exits(String)"
});
formatter.result({
  "duration": 2108104251,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Set white Background",
      "offset": 1
    }
  ],
  "location": "BackgroundStepDef.after_user_clicks_on_the_button(String)"
});
formatter.result({
  "duration": 160215,
  "error_message": "java.lang.NullPointerException: Cannot invoke \"cucumberPage.BackgroundColor.SkyBlueBackgound()\" because \"this.backgroundColor\" is null\n\tat cucumberTestStep.BackgroundStepDef.after_user_clicks_on_the_button(BackgroundStepDef.java:22)\n\tat ✽.Then \"Set white Background\" after user clicks on the button(./src/test/java/cucumberTestFeatures/Background.feature:13)\n",
  "status": "failed"
});
formatter.match({
  "location": "BackgroundStepDef.the_background_color_will_change_to_white()"
});
formatter.result({
  "status": "skipped"
});
});