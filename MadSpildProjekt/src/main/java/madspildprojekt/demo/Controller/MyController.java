package madspildprojekt.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

    @GetMapping("/")
    public String forside() {
        return "Forside" ;
    }

    @GetMapping("/foodbank")
    public String foodbank() {
        return "FoodBank" ;
    }

    @GetMapping("/ReadMore")
    public String ReadMore() {
        return "ReadMore" ;
    }

    @GetMapping("/EmptyFridge")
    public String EmptyFridge() {
        return "EmptyFridge" ;
    }




}
