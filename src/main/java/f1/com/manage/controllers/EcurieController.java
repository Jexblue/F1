package f1.com.manage.controllers;

import f1.com.manage.models.EcurieModel;
import f1.com.manage.repositories.EcurieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EcurieController {

    @Autowired
    EcurieRepository ecurieRepository;

    @RequestMapping(value = "ecurie", method = RequestMethod.GET)
    public String getAllEcurie(Model model){
        model.addAttribute("ecuries", ecurieRepository.findAll());
        return "ecurie";
    }

    @GetMapping("/addEcurie")
    public ModelAndView addEcurie(){
        ModelAndView mav = new ModelAndView("add-ecurie");
        EcurieModel newEcurieModel = new EcurieModel();
        mav.addObject("ecurie", newEcurieModel);
        return mav;
    }

    @PostMapping("/saveEcurie")
    public String saveEcurie(@ModelAttribute EcurieModel ecurieModel){
        ecurieRepository.save(ecurieModel);
        return "redirect:/ecurie";
    }

}
