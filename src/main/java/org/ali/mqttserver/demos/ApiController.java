package org.ali.mqttserver.demos;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {


    @GetMapping("sendMessage")
    public String sendMessage(){

        return "this is a message";
    }
}
