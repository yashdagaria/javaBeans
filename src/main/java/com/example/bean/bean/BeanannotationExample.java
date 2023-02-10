package com.example.bean.bean;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.bean.bean.service.UserService;
@SpringBootApplication
public class BeanannotationExample {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(BeanannotationExample.class);
        //By its type
        UserService user = ctx.getBean(UserService.class);
        System.out.println("Printing user:"+user.getList());
    }
}
