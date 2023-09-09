package hu.progmatic.myfirstspring_0909;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/weather")
public class WheatherForecastController{
    // [...]/weather/forecast/budapest --> sunny
    // [...]/weather/forecast/bugyi --> thunderstorm

    Map<String, String> forecasts = new HashMap<String, String>() {{
        put("Budapest", "sunny");
        put("Bugyi", "thunderstorm");
        put("Ozd", "cloudy");
    }};

    @GetMapping({"", "/"})
    public String forecast() {
        return "No data, NEEED A CITY";
    }

    @GetMapping("/forecast/{city}")
    public String budapest(@PathVariable String city) {
        if (forecasts.containsKey(city)) {
            return city + " forecast: " + forecasts.get(city);
        } else {
            return "No forecast " + city;
        }
    }
    // getOrDefault

    @GetMapping("/forecasts")
    public Map<String, String> getAllForecasts() {
        return forecasts;
    }



}
