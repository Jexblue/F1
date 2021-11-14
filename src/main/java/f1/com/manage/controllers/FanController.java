package f1.com.manage.controllers;

import f1.com.manage.models.FanModel;
import f1.com.manage.repositories.FanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FanController {

    @Autowired
    FanRepository fanRepository;

    /*@GetMapping("/fan")
    public ModelAndView getAllFan(){
        ModelAndView mav = new ModelAndView("listFan");
        mav.addObject("fans", fanRepository.findAll());
        return mav;
    }*/

    @RequestMapping(value = "fan", method = RequestMethod.GET)
    public String getAllFan(Model model){
        model.addAttribute("fans", fanRepository.findAll());
        return "fan";
    }

    @GetMapping("/addFan")
    public ModelAndView addFan(){
        ModelAndView mav = new ModelAndView("add-fan");
        FanModel fanModel = new FanModel();
        mav.addObject("fan", fanModel);
        return mav;
    }

    @PostMapping("/saveFan")
    public String saveFan(@ModelAttribute FanModel fanModel){
        fanRepository.save(fanModel);
        return "redirect:/fan";
    }

}
