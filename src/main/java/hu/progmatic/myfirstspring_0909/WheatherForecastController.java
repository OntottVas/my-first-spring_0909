package hu.progmatic.myfirstspring_0909;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/weather")
public class WheatherForecastController{
    // [...]/weather/forecast/budapest --> sunny
    // [...]/weather/forecast/bugyi --> thunderstorm

    private final Map<String, String> forecasts = new HashMap<String, String>() {{
        put("Budapest", "sunny");
        put("Bugyi", "thunderstorm");
        put("Ozd", "cloudy");
    }};

    @GetMapping({"", "/"})
    public String forecast() {
        return "No data, NEEED A CITY";
    }

    @GetMapping("/forecast/{city}")
    public String getWeatherForecast(@PathVariable String city, Model model) {
        model.addAttribute("city", city);
        model.addAttribute("weather", forecasts.getOrDefault(city, "Nope"));
        return "weather";
    }
    // getOrDefault

    @GetMapping("/forecasts")
    public Map<String, String> getAllForecasts() {
        return forecasts;
    }



}
