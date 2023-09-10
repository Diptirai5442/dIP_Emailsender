package org.dipti;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {
    @Autowired
    private Obj1 obj1;

    @Autowired
    private Obj2 obj2;

    @Autowired
    private EmailHandler emailHandler;

    @GetMapping("/getObjects")

    public String getObjects() {
        return "Object1 :" + obj1.toString() + "\nObject2 :" + obj2.toString();
    }

    @GetMapping("/sendEmail")

    @Bean
    public String sendEmail() {
        String object1String = obj1.toString();
        String object2String = obj2.toString();

        String subject = "Objects as Strings";
        String body = "Dipti rai Mail : " + object1String + "\nWeek test Assignment : " + object2String;

        emailHandler.sendEmail("drai5442@gmail.com", subject, body);

        return "Email sent!";
    }
}
