package f1.com.manage.controllers;

import f1.com.manage.models.EcurieModel;
import f1.com.manage.models.FanModel;
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
        //System.out.println("Ecurie name: "+ecurieModel.getNameEcurie()+" ecurie id: "+ecurieModel.getIdEcurie());
        //ecurieModel.setIdEcurie(11);
        //System.out.println("Ambany -> Ecurie name: "+ecurieModel.getNameEcurie()+" ecurie id: "+ecurieModel.getIdEcurie());
        ecurieRepository.save(ecurieModel);
        return "redirect:/ecurie";
    }

    @GetMapping("updateEcurie")
    public ModelAndView updateEcurie(@RequestParam Integer idEcurie){
        ModelAndView mav = new ModelAndView("update-ecurie");
        EcurieModel ecurieModel = ecurieRepository.findById(idEcurie).get();
        mav.addObject("ecurie", ecurieModel);
        return mav;
    }

    @PostMapping("saveUpdateEcurie")
    public String saveUpdateEcurie(@ModelAttribute EcurieModel ecurieModel){
        ecurieRepository.save(ecurieModel);
        return "redirect:/ecurie";
    }

    @GetMapping("deleteEcurie")
    public String deleteEcurie(@RequestParam Integer idEcurie){
        EcurieModel ecurieModel = ecurieRepository.findById(idEcurie).get();
        ecurieRepository.delete(ecurieModel);
        return "redirect:/ecurie";
    }

}
