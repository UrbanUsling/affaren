package com.example.customer;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

    private final CustomerRepository repo;
    private static final Logger log = LoggerFactory.getLogger(CustomerController.class);

    CustomerController(CustomerRepository repo){
        this.repo = repo;
    }

    @RequestMapping("customers")

    public List<Customers> getAllCustomers(){

        return repo.findAll();
    }
    @RequestMapping("customers/{id}")
    public Customers findById(@PathVariable long id){
        log.info("Costumer found with id "+id);
        return repo.findById(id).get();
    }


    @RequestMapping("customers/add")
    public List<Customers> addCustomers(@RequestParam String name, @RequestParam String PersonNr){
        repo.save(new Customers(name, PersonNr));
        log.info("Customers added");
        return repo.findAll();

    }


}