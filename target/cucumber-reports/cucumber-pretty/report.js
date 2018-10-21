$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Featrue1.feature");
formatter.feature({
  "line": 1,
  "name": "Calculate add and substract",
  "description": "  In order to calculate add and substract\n  As a Registered user\n  I want to see answer for add and subs",
  "id": "calculate-add-and-substract",
  "keyword": "Feature"
});
formatter.before({
  "duration": 20635133,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Add",
  "description": "",
  "id": "calculate-add-and-substract;add",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "add numbers \"2\" and \"3\"",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 13
    },
    {
      "val": "3",
      "offset": 21
    }
  ],
  "location": "Feature1Steps.add_numbers_and(String,String)"
});
formatter.result({
  "duration": 3157256645,
  "status": "passed"
});
formatter.before({
  "duration": 640771,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Substract",
  "description": "",
  "id": "calculate-add-and-substract;substract",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "substract numbers \"2\" and \"3\"",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 19
    },
    {
      "val": "3",
      "offset": 27
    }
  ],
  "location": "Feature1Steps.substract_numbers_and(String,String)"
});
formatter.result({
  "duration": 5000364872,
  "status": "passed"
});
formatter.uri("Feature2.feature");
formatter.feature({
  "line": 1,
  "name": "Calculate mul and div",
  "description": "  In order to calculate mul and div\n  As a Registered user\n  I want to see answer for mul and div",
  "id": "calculate-mul-and-div",
  "keyword": "Feature"
});
formatter.before({
  "duration": 446999,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "multiply",
  "description": "",
  "id": "calculate-mul-and-div;multiply",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "multiply numbers \"2\" and \"3\"",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 18
    },
    {
      "val": "3",
      "offset": 26
    }
  ],
  "location": "Feature2Steps.multiply_numbers_and(String,String)"
});
formatter.result({
  "duration": 5000060741,
  "status": "passed"
});
formatter.before({
  "duration": 1024891,
  "status": "passed"
))
formatter.scenario({
  "line": 9,
  "name": "divide",
  "description": "",
  "id": "calculate-mul-and-div;divide",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "divide numbers \"2\" and \"3\"",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 16
    },
    {
      "val": "3",
      "offset": 24
    }
  ],
  "location": "Feature2Steps.divide_numbers_and(String,String)"
});
formatter.result({
  "duration": 1001066810,
  "status": "passed"
});
});;