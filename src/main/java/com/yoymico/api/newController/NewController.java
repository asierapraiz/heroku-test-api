package com.yoymico.api.newController;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/apo")
public class NewController {

    @GetMapping("/homo")
    public String home(){
    return "Hola mundo desde git";
    }
}
