/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.infsci2560.controllers;

import edu.infsci2560.models.Game;
import edu.infsci2560.repositories.GameRepository;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Ysun
 */
@Controller
public class GameController {
    @Autowired
    private GameRepository repository;
    
    @RequestMapping(value = "game", method = RequestMethod.GET)
    public ModelAndView index() {        
        return new ModelAndView("game", "game", repository.findAll());
    }
    
    @RequestMapping(value = "game/add", method = RequestMethod.POST, consumes="application/x-www-form-urlencoded", produces = "application/json")
    public ModelAndView create(@ModelAttribute @Valid Game game, BindingResult result) {
        repository.save(game);
        return new ModelAndView("game", "game", repository.findAll());
    }
    
    @RequestMapping(value = "game/delete", method = RequestMethod.GET)
    public ModelAndView deleteGame(@RequestParam(value = "id", required=true) Long id) {
        Game game = repository.findOne(id);
        
        if (game != null) {
            repository.delete(id);
        }

        return new ModelAndView("game", "game", repository.findAll());
    }
    
    @RequestMapping(value = "game/{id}", method = RequestMethod.GET)
    public ModelAndView index(@PathVariable Long id) { 
        Game game = repository.findOne(id);
        return new ModelAndView("gameEdit", "game", game);
    }
    
    
    @RequestMapping(value = "game/{id}", method = RequestMethod.PUT, consumes="application/x-www-form-urlencoded", produces = "application/json")
    public String update( @Valid Game game, BindingResult result) {
        repository.save(game);
        return "redirect:/game";
    }        

}
