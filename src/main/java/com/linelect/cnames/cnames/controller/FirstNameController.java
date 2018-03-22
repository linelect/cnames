package com.linelect.cnames.cnames.controller;

import com.linelect.cnames.cnames.model.FirstName;
import com.linelect.cnames.cnames.service.FirstNameService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/names")
public class FirstNameController {

    private final FirstNameService firstNameService;

    public FirstNameController(FirstNameService firstNameService) {
        this.firstNameService = firstNameService;
    }

    @PutMapping()
    public FirstName save(@RequestBody FirstName firstName) {
        return firstNameService.save(firstName);
    }

    @GetMapping("/{id}")
    public FirstName getById(@PathVariable long id) {
        return firstNameService.getById(id);
    }

    @GetMapping
    public List<FirstName> getAll() {
        return firstNameService.getAll();
    }
}
