package com.brodniak.masterproject.controller;

import com.brodniak.masterproject.entity.test;
import com.brodniak.masterproject.repository.testRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
//@RequestMapping("/api")
public class testController {

    @Autowired
    testRepo testRepo;

    @PostMapping(path = "/add")
    public String addToDataBase(@RequestParam long id){
        test test = new test();
        test.setId(id);
        test.setName("test");
        testRepo.save(test);
        return "OK";
    }
}
