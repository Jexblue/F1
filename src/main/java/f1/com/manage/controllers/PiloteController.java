package f1.com.manage.controllers;

import f1.com.manage.models.PiloteModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PiloteController {

    @GetMapping("/pilote")
    public String getAllPilote(PiloteModel piloteModel){
        
    }

}
