package hu.progmatic.myfirstspring_0909;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/weather")
public class WeatherController {
    List<String> weathers = List.of("sunny","rainy","cloudy","windy","thunderstorm","mellow");

    // localhost:8080/weather/random --> sunny, cloudy, rainy veletlenszeruen
    @GetMapping("/random")
    public String randomWeather() {
        Random random = new Random();

        return weathers.get(random.nextInt(0, weathers.size()));
    }

    @GetMapping("/randomm")
    public String randommWeather() {
        int random = ((int) (Math.random() * 10)) + 1;
        if (random < weathers.size()) {
            return weathers.get(random);
        }
        return "nope";
    }
}
