package br.com.rooster.rider.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import br.com.rooster.rider.repository.RiderRepository;
import br.com.rooster.rider.model.Rider;

@RestController
@RequestMapping
public class RiderController {
    
    @Autowired
    public RiderRepository riderRepo;

    @GetMapping(value = "/riders")
    public List<Rider> get(){
        return riderRepo.findAll();
    }

    @PostMapping(value = "/riders")
    @ResponseStatus(HttpStatus.CREATED)
    public Rider post( @RequestBody Rider cliente ){
        return riderRepo.save(cliente);
    }    

    @DeleteMapping(value = "/riders/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete( @PathVariable Long id ){
        try{
            riderRepo.deleteById(id);
        } catch (Exception e) {
            throw  new ResponseStatusException (HttpStatus.EXPECTATION_FAILED);
        }
    }
}