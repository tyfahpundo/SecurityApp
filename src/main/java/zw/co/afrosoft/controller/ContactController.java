package zw.co.afrosoft.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {
    @GetMapping("/contact")
    public String contactUs(){
        return "Here is How you can Get in touch with us";
    }
}
