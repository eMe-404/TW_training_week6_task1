package com.example.demo.controller;

import com.example.demo.entity.Employee2;
import com.example.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {

    private final
    EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }


    @RequestMapping(value = "/employees", method = RequestMethod.GET)
    public List<Employee2> employees() {
        return employeeRepository.findAll();
    }

    @RequestMapping(value = "/employees/{id}", method = RequestMethod.GET)
    public Optional<Employee2> getOneEmployee(@PathVariable Long id) {
        return employeeRepository.findById(id);
    }

    @RequestMapping
    public void createEmployee() {

    }

}
