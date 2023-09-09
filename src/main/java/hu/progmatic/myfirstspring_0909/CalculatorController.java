package hu.progmatic.myfirstspring_0909;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    // add/n/n
    // subtract
    // multiply
    // divide

    @GetMapping("/add/{firstNumber}/{secondNumber}")
    public int add(@PathVariable int firstNumber, @PathVariable int secondNumber) {
        return firstNumber + secondNumber;
    }

    @GetMapping("/subtract/{firstNumber}/{secondNumber}")
    public int subtract(@PathVariable int firstNumber, @PathVariable int secondNumber) {
        return firstNumber - secondNumber;
    }

    @GetMapping("/subtract")
    public int subtractOther(@RequestParam int a, @RequestParam int b) {
        return a - b;
    }

    @GetMapping("/multiply/{firstNumber}/{secondNumber}")
    public int multiply(@PathVariable int firstNumber, @PathVariable int secondNumber) {
        return firstNumber * secondNumber;
    }

    @GetMapping("/divide/{firstNumber}/{secondNumber}")
    public double divide(@PathVariable double firstNumber, @PathVariable double secondNumber)
            throws ArithmeticException {
        if (secondNumber == 0) {
            throw new ArithmeticException();
        }
        return firstNumber / secondNumber;
    }
}
