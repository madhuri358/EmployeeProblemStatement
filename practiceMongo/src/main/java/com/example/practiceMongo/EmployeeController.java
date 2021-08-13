package com.example.practiceMongo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
//@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmpRepo empRepo;
    @Autowired
    private methods empmethods;
    @RequestMapping(value = "/postEmp", method = RequestMethod.POST)
    public ResponseEntity<String> postemployee(@RequestBody Employee employee)
    {
        this.empRepo.save(employee);
        return new ResponseEntity<>("Added", HttpStatus.OK);
    }
    @GetMapping("/Emplist")
    public List<Employee> EmpListi()
    {
        return empmethods.EmpList();
    }

    @GetMapping("/MaxSal")
    public List<Employee> EmpWithMaxSal()
    {
        return empmethods.EmpWithMaxSal();
    }
    @GetMapping("/EmpAgeGT")
    public List<Employee> EmpAgeGT(@RequestParam int empage)
    {
        return empmethods.EmpAgeGT(empage);
    }

    @GetMapping("/SameRegion")
    public List<Employee> SameRegion(@RequestParam String Region) {
        return empmethods.SameRegion(Region);
    }

    @GetMapping("/EmpNameStartWith")
    public List<Employee> EmpNameStartWith(@RequestParam Character c) {
        return empmethods.EmpNameStartWith(c);
    }

    @GetMapping("EmpWithAgeAndRegion")
    public List<Employee> EmpWithAgeAndRegion(@RequestParam String Region, int empage)
    {
        return empmethods.EmpWithAgeAndRegion(Region, empage);
    }


}
