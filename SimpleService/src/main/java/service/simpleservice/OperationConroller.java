package service.simpleservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class OperationConroller {
    @GetMapping("/calc")
    public Result getCalc( @RequestParam(value = "command", defaultValue = "no command") String command,@RequestParam(value = "a",defaultValue = "0") String a, @RequestParam(value = "b",defaultValue = "0") String b) {
        Double result = (double) Calculate.calculateParameter(command, a, b);
        return new Result(command, Double.parseDouble(a), Double.parseDouble(b), result);
    }

}
