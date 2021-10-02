package f1.com.manage.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.lang.String;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import f1.com.manage.models.Tutorial;
import f1.com.manage.repositories.TutorialRepository;

//@CrossOrigin(origins = "http://localhost:8081")
@Controller
//@RequestMapping("/api")
public class TutorialController {
    
    @Autowired
    TutorialRepository tutorialRepository;
    
    @GetMapping("/tutorials")
    public ResponseEntity<List<Tutorial>> getAllTutorials(@RequestParam(required = false) String title){
        try{
            List<Tutorial> tutorials = new ArrayList<Tutorial>();
            if(title == null){
                tutorialRepository.findAll().forEach(tutorials::add);
            }
            else{
                //tutorialRepository.findTitleContaining(title).forEach(tutorials::add);
            }
            if (tutorials.isEmpty()){
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        catch(Exception e){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
    
}
