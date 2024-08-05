package ra.bt2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class bai2Controller {
    @GetMapping
    public String indexPage(){
        return "bai2";
    }

    @PostMapping("/caculator")
    public String calculator(@RequestParam("input1") Double input1, @RequestParam("input2") Double input2,@RequestParam("btnCal") String btnCal, Model model){
        Double result = (double) 0;
        if(btnCal.equals("add")){
            result = input1 + input2;
            model.addAttribute("calName", "Addition");
            model.addAttribute("result", result);
        }else if(btnCal.equals("sub")){
            result = input1 - input2;
            model.addAttribute("calName", "Subtraction");
            model.addAttribute("result", result);
        }else if(btnCal.equals("mul")){
            result = input1 * input2;
            model.addAttribute("calName", "Multiplication");
            model.addAttribute("result", result);
        }else if(btnCal.equals("divi")){
            if(input2 ==0){
                //show noti
                model.addAttribute("calName", "Error to divide by zero");
                model.addAttribute("result","nah");
            }else {
                result = input1 / input2;
                model.addAttribute("calName", "Division");
                model.addAttribute("result", result);
            }
        }

        return "bai2";
    }
}
