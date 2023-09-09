package hu.progmatic.myfirstspring_0909;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/menu")
public class MenuController {
    // localhost:8080/menu/monday --> töltöttkáposzta
    // localhost:8080/menu/tuesday --> kirántotthús
    // .
    // .
    // localhost:8080/menu/saturday VAGY /sunday --> Aranygaluska
    // localhost:8080/menu/ VAGY /menu --> adj meg egy napot
    @GetMapping({"", "/"})
    public String mainMenu() {
        return "Adj meg egy napot!";
    }

    @GetMapping("/monday")
    public String monday() {
        return "toltottkaposzta";
    }

    @GetMapping("/tuesday")
    public String tuesday() {
        return "kirantotthus rizsaval";
    }

    @GetMapping("/wednesday")
    public String wednesday() {
        return "piritott maj";
    }

    @GetMapping("/thursday")
    public String thursday() {
        return "csigateszta";
    }

    @GetMapping("/friday")
    public String friday() {
        return "banana";
    }

    @GetMapping({"/saturday", "/sunday"})
    public String saturday() {
        return "Aranygaluska";
    }
}
