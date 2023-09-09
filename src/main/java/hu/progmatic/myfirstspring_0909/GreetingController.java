package hu.progmatic.myfirstspring_0909;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greet")
public class GreetingController {

    @GetMapping
    public String greet() {
        return "Szia, uram!";
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
