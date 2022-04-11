package com.bethealt.daikichiroutes.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import jakarta.servlet.http.HttpSession;
import org.springframework.ui.Model;
//import com.bethealt.daikichiroutes.models.Omikuji;
//model not required as not building an array list

@Controller
@RequestMapping("/omikuji")

public class OmikujiController {

    @GetMapping("/")
    public String index() {
        return "form.jsp";
    }

    @PostMapping("/send")
    public String send(
        @RequestParam(value="random") Integer random,
        @RequestParam(value="city") String city,
        @RequestParam(value="name") String name,
        @RequestParam(value="hobby") String hobby,
        @RequestParam(value="living") String living,
        @RequestParam(value="nice") String nice,
        HttpSession session, 
        Model model) {
            //retrieves data from session
            /*session.getAttribute("random");
            session.getAttribute("city");
            session.getAttribute("name");
            session.getAttribute("hobby");
            session.getAttribute("living");
            session.getAttribute("nice");*/
            //data is retrieved from request and saved to session

            //saves data to session
            session.setAttribute("random", random);
            session.setAttribute("city", city);
            session.setAttribute("name", name);
            session.setAttribute("hobby", hobby);
            session.setAttribute("living", living);
            session.setAttribute("nice", nice);

            //sends data to the jsp
            model.addAttribute("random", random);
            model.addAttribute("city", city);
            model.addAttribute("name", name);
            model.addAttribute("hobby", hobby);
            model.addAttribute("living", living);
            model.addAttribute("nice", nice);
            return "redirect:/show";
        }

    @GetMapping("/show")
    public String display() {
        return "display.jsp";
    }
    
}



