/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.infsci2560.services;

import edu.infsci2560.models.Movie;
import edu.infsci2560.models.Movie.VideoType;
import edu.infsci2560.repositories.MovieRepository;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Ysun
 */
@RestController
@RequestMapping("/public/api/movie")
public class MovieService {

    @Autowired
    private MovieRepository repository;

    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<Iterable<Movie>> list() {
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<>(repository.findAll(), headers, HttpStatus.OK);
    }

    @RequestMapping(value = "/{mid}", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<Movie> list(@PathVariable("mid") Long mid) {
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<>(repository.findOne(mid), headers, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST, consumes="application/json", produces = "application/json")
    public ResponseEntity<Movie> create(@RequestBody Movie movie) {
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<>(repository.save(movie), headers, HttpStatus.OK);
    }
}
