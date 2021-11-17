# Falcon Weather App

### Overview

A few months ago a member of our team, Donald, started building a weather app. The requirements for the app are:

GIVEN a city name and a country code<br />
WHEN the temperature is <temp_op> <temp_value> in that city<br />
AND the humidity is <humidity_op> <humidity_value> in that city<br />
THEN display the following message: "The weather in <city_name>, <country_code> is <temp_word> and <humidity_word>!"<br />

GIVEN a city name<br />
WHEN the temperature is <temp_op> <temp_value> in that city<br />
AND the humidity is <humidity_op> <humidity_value> in that city<br />
THEN display the following message: "The weather in <city_name> is <temp_word> and <humidity_word>!"<br />

|temp_op     |temp_value|temp_word|
|------------|----------|---------|
|greater than|29        |hot      |
|greater than|17        |warm     |
|greater than|5         |chilly   |
|less than   |6         |cold     |

|humidity_op |humidity_value|humidity_word|
|------------|--------------|-------------|
|greater than|79            |humid        |
|less than   |80            |dry          |

Before the project was completed, Donald left the company. The code he wrote compiles but has not been tested.

You are now taking on the project. You have 2 tasks:

1. Review the code to familiarise yourself with what it does and make any improvements you think are necessary.
2. Implement an additional feature to get the difference in weather between two cities (see below).

Weather data is obtained from the API defined here: https://openweathermap.org/current#data. An API key is required for this and will be provided to you.

### Additional Feature

GIVEN a city name C1 and a city name C2<br />
WHEN the temperature is <temp_op> <temp_value> in C1<br />
AND the humidity is <humidity_op> <humidity_value> in C1<br />
AND the temperature in C2 differs by X degrees compared to the temperature in C1<br />
THEN display the following message: "The weather in C1 is <temp_word> and <humidity_word>! It is X degrees [warmer|colder] in C2"<br />

### Running the App

To run the app:
```
gradlew bootRun
```
To invoke the app's functionality:
```
curl http://localhost:8080/weather?city=Copenhagen&country=dk
```
Or simply hit the endpoint in a browser.

###

Information for interviewers can be found here: https://falconio.atlassian.net/wiki/spaces/NGA/pages/2756313093/Backend+Coding+Exercise.