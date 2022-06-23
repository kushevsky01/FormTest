package service.simpleservice;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class FormController {

    List<User> users = new ArrayList<>();
    @GetMapping("/")
    public String getIndex(Model model) {
        model.addAttribute("users", users);
        return "index";
    }

    @PostMapping( "/")
    String postIndex(@ModelAttribute User user){
        users.add(user);
        return "redirect:/";
    }

}
