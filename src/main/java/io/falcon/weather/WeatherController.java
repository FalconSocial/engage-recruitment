package io.falcon.weather;

import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("weather")
public class WeatherController {

    private String apiKey = "PUT_API_KEY_HERE";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping
    public String getOutput(@RequestParam("city") String c1, @RequestParam("country") String c2) {
        final JsonNode node = restTemplate.getForObject("https://api.openweathermap.org/data/2.5/weather?unites=metric&q=Bangkok,th&appid=" + apiKey, JsonNode.class);
        double t = node.get("main").get("temp").asDouble();
        double f = node.get("main").get("feels_like").asDouble();
        Double h = node.get("main").get("humidity").asDouble();
        double p = node.get("main").get("pressure").asDouble();

        String o = null;
        if (t >= 30 && h < 80) {
            o = "The weather in " + c1 + ", " + c2 + " is hot and dry!";
        } else if (t >= 18 && h < 80) {
            o = "The weather in " + c1 + ", " + c2 + " is warm and dry!";
        } else if (t >= 5 && h < 80) {
            o = "The weather in " + c1 + ", " + c2 + " is chilly and dry!";
        } else if (t < 5 && h < 80) {
            o = "The weather in " + c1 + ", " + c2 + " is cold and dry!";
        } else if (t >= 30 && h >= 80) {
            o = "The weather in " + c1 + ", " + c2 + " is hot and humid!";
        } else if (t >= 18 && h >= 80) {
            o = "The weather in " + c1 + ", " + c2 + " is warm and humid!";
        } else if (t >= 5 && h >= 80) {
            o = "The weather in " + c1 + ", " + c2 + " is chilly and humid!";
        } else if (t < 5 && h >= 80) {
            o = "The weather in " + c1 + ", " + c2 + " is cold and humid!";
        }

        return o;
    }

}
