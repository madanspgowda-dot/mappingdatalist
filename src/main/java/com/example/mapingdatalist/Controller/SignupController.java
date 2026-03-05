package com.example.mapingdatalist.Controller;

import com.example.mapingdatalist.Entity.SignupEntity;
import com.example.mapingdatalist.Services.SignUpServices;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class SignupController {
    private final SignUpServices signupservices;

    public SignupController(SignUpServices signupservices) {
        this.signupservices = signupservices;
    }

    @GetMapping("/")
    public String showsignuppage(Model model) {
        model.addAttribute("signupdata",new SignupEntity());
        return "Signup";
    }
    @PostMapping("/signup")
    public String signup(@ModelAttribute SignupEntity signupentity, RedirectAttributes redirectAttributes) {

        if (signupservices.existsByEmail(signupentity.getEmail())) {
            redirectAttributes.addFlashAttribute("error", "Email already exists");
            return "redirect:/";
        }
        else if (!signupentity.getPassword().equals(signupentity.getConpassword())) {
            redirectAttributes.addFlashAttribute("error", "Passwords do not match");
            return "redirect:/";
        }

        signupservices.savesignpdata(signupentity);

        redirectAttributes.addFlashAttribute("success", "Signup successful");
        return "redirect:/login";
    }
    @GetMapping("/login")
    public String showloginpage(){
        return "login";
    }
}
