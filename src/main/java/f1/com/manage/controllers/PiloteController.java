package f1.com.manage.controllers;

import f1.com.manage.models.PiloteModel;
import f1.com.manage.repositories.PiloteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class PiloteController {

    @Autowired
    PiloteRepository piloteRepository;

    @RequestMapping(value = "pilote", method = RequestMethod.GET)
    public String messages(Model model){
        model.addAttribute("pilotes", piloteRepository.findAll());
        return "pilote";
    }

}
