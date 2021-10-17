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

    /*@GetMapping("/pilote")
    public String getAllPilote(PiloteModel piloteModel){
        List<PiloteModel> pilote = piloteRepository.findAll();
        return "";
    }*/

    /*@GetMapping("/pilote")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        // model.addAttribute("name", name);
        List<PiloteModel> pilotes = piloteRepository.findAll();

        model.addAttribute("pilote", pilotes);
        return "pilote";
    }*/

    @RequestMapping(value = "pilote", method = RequestMethod.GET)
    public String messages(Model model){
        model.addAttribute("pilotes", piloteRepository.findAll());
        return "pilote/listPilote";
    }

}
