package clienteappController;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class clienteappController {

    @GetMapping("/home")
    public String index () {
        return "home";
    }
}
