$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/reddit1");
formatter.feature({
  "line": 2,
  "name": "reddit",
  "description": "",
  "id": "reddit",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@run"
    }
  ]
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Search for compensation",
  "description": "",
  "id": "reddit;search-for-compensation",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "that I am on the \"\u003curl\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on search field and type \"\u003csearchString\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I hit Enter Key",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "a page with summary will be viewed",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "reddit;search-for-compensation;",
  "rows": [
    {
      "cells": [
        "url",
        "searchString"
      ],
      "line": 10,
      "id": "reddit;search-for-compensation;;1"
    },
    {
      "cells": [
        "http://www.reddit.com",
        "compensation"
      ],
      "line": 11,
      "id": "reddit;search-for-compensation;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 11,
  "name": "Search for compensation",
  "description": "",
  "id": "reddit;search-for-compensation;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@run"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "that I am on the \"http://www.reddit.com\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on search field and type \"compensation\"",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I hit Enter Key",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "a page with summary will be viewed",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.reddit.com",
      "offset": 18
    }
  ],
  "location": "SearchTest.that_I_am_on_the_www_reddit_com(String)"
});
formatter.result({
  "duration": 16772300086,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "compensation",
      "offset": 34
    }
  ],
  "location": "SearchTest.i_click_on_search_field_and_type_searchString(String)"
});
formatter.result({
  "duration": 1230527598,
  "status": "passed"
});
formatter.match({
  "location": "SearchTest.i_hit_Enter_Key()"
});
formatter.result({
  "duration": 3575413674,
  "status": "passed"
});
formatter.match({
  "location": "SearchTest.a_page_with_summary_will_be_viewed()"
});
formatter.result({
  "duration": 8698292,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "View reddit",
  "description": "",
  "id": "reddit;view-reddit",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 14,
  "name": "I have searched for Compensation reddits",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "I click on first rows",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "new page with Reddit will be displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "top most top tile will be printed on screen",
  "keyword": "And "
});
formatter.match({
  "location": "ViewRedditTest.i_have_searched_for_Compensation_reddits()"
});
formatter.result({
  "duration": 18967017,
  "status": "passed"
});
formatter.match({
  "location": "ViewRedditTest.i_click_on_first_rows()"
});
formatter.result({
  "duration": 958014282,
  "status": "passed"
});
formatter.match({
  "location": "ViewRedditTest.new_page_with_Reddit_will_be_displayed()"
});
formatter.result({
  "duration": 4554792783,
  "status": "passed"
});
formatter.match({
  "location": "ViewRedditTest.top_most_top_tile_will_be_printed_on_screen()"
});
formatter.result({
  "duration": 5676595382,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 19,
  "name": "login",
  "description": "",
  "id": "reddit;login",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 20,
  "name": "I am on the BasePage",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "I enter u \"\u003cusername\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "I enter p \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I click on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I am logging",
  "keyword": "Then "
});
formatter.examples({
  "line": 25,
  "name": "",
  "description": "",
  "id": "reddit;login;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 26,
      "id": "reddit;login;;1"
    },
    {
      "cells": [
        "le_tester",
        "MEfHU8LstpUj3FJ"
      ],
      "line": 27,
      "id": "reddit;login;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 27,
  "name": "login",
  "description": "",
  "id": "reddit;login;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@run"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "I am on the BasePage",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "I enter u \"le_tester\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "I enter p \"MEfHU8LstpUj3FJ\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I click on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I am logging",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginTest.i_am_on_the_BasePage()"
});
formatter.result({
  "duration": 2838215196,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "le_tester",
      "offset": 11
    }
  ],
  "location": "LoginTest.i_enter_user(String)"
});
formatter.result({
  "duration": 899397284,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "MEfHU8LstpUj3FJ",
      "offset": 11
    }
  ],
  "location": "LoginTest.i_enter_password(String)"
});
formatter.result({
  "duration": 344387058,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.i_click_on_Login_button()"
});
formatter.result({
  "duration": 30503860181,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.i_am_logged_in()"
});
formatter.result({
  "duration": 87101,
  "status": "passed"
});
formatter.scenario({
  "line": 29,
  "name": "DownVote",
  "description": "",
  "id": "reddit;downvote",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 30,
  "name": "I am logged in",
  "keyword": "Given "
});
formatter.step({
  "line": 31,
  "name": "Reddit was not yet downvoted",
  "keyword": "When "
});
formatter.step({
  "line": 32,
  "name": "Click Downvote",
  "keyword": "Then "
});
formatter.match({
  "location": "VoteTest.i_am_logged_in()"
});
formatter.result({
  "duration": 39487119,
  "status": "passed"
});
formatter.match({
  "location": "VoteTest.reddit_was_not_yet_downvoted()"
});
formatter.result({
  "duration": 480567,
  "status": "passed"
});
formatter.match({
  "location": "VoteTest.click_Downvote()"
});
formatter.result({
  "duration": 1052503587,
  "status": "passed"
});
});