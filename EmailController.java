package com.gustavo.brenda.email;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {
    @RequestMapping("/envio-email")
    public String emailResponse(){
        return "Email enviado com sucesso.";
       
    }
}
