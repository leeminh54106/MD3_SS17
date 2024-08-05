package ra.ss17.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class bai1Controller {
    @GetMapping
    public String bai1() {
        return "bai1";
    }
    @PostMapping("/add")
    public String bai1Post(@RequestParam("vegetables") List<String> vegetables, Model model) {
        model.addAttribute("selectedVegetables", String.join(", ", vegetables));
        return "bai1";
    }
}
