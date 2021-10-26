package zw.co.afrosoft.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoticesController {
    @GetMapping("/notifications")
    public String getNotifications(){
        return "Here are our Notifications from the DB";
    }
}
