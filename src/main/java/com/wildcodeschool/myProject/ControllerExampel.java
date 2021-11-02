package com.wildcodeschool.myProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@SpringBootApplication
public class ControllerExampel {

    public static void main(String[] args) {
        SpringApplication.run(ControllerExampel.class, args);
    }

    @RequestMapping("/doctor/{id}")
    @ResponseBody
    public String index(@PathVariable int id) {

        switch (id) {
            case 1:
                return "William Hartnell";

            case 2:
                return "Patrick Troughton";

            case 3:
                return "Jon Pertwee";

            case 4:
                return "Tom Baker";

            default: return "Donald";
        }
    }
    @RequestMapping("/")
    @ResponseBody
    public String index() {
       return "<ul>" + "<li><a href = '/doctor/1'>Doctor 1</a></li>" +
               "<li><a href = '/doctor/2'>Doctor 2</a></li>" +
               "<li><a href = '/doctor/3'>Doctor 3</a></li>" +
               "<li><a href = '/doctor/4'>Doctor 4</a></li></ul> ";
    }


}