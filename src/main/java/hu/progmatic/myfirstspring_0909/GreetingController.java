package hu.progmatic.myfirstspring_0909;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

@Controller
public class GreetingController {

    @GetMapping("/greet")
    public String greet() {
        return "welcome"; // welcome.html
    }

    @GetMapping({"", "/home"})
    public String home() {
        return "home";
    }

    @GetMapping("/hello/{name}")
    public String getNameWelcome(Model model, @PathVariable String name) {
        model.addAttribute("szemelyNeve", name);
        return "hello";
    }

    @GetMapping("/nice")
    public String greetNicely() {
        return "Adjon Isten Jóbarát!";
    }

    // localhost:8080/greet/Jancsika --> Szia, Jancsika!
    @GetMapping("/{name}")
    public String greetWithName(@PathVariable String name) {
        return "Szia, " + name + "!";
    }

    // localhost:8080/greet/Jucika/3 --> Szia, Jucika! Szia, Jucika! Szia, Jucika!
    @GetMapping("/{name}/{repetition}")
    public String greetManyTimes(@PathVariable String name, @PathVariable int repetition) {
        return ("Szia, " + name + "!").repeat(repetition);
    }

    /*@GetMapping("/{name}/{howMany}")
    public String greetManyTimesWithLoop (@PathVariable String name, @PathVariable int howMany) {
        String output = "";
        int counter = 0;
        while (howMany != 0) {
            if (counter > 5) {
                return "Fuck off...";
            }
            output += "Szia, " + name + "! ";
            howMany--;
            counter++;
        }
        return output;
    }*/


}
