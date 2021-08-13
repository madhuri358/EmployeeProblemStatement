package com.example.practiceMongo;
import java.util.*;
import java.util.stream.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class methods {
    @Autowired
    private EmpRepo empRepo;

    public List<Employee> EmpList()
    {
        return empRepo.findAll();
    }

    public List<Employee> EmpWithMaxSal() {
        return empRepo.EmpWithMaxSal();
    }

    public List<Employee> EmpAgeGT(int empage) {
        return empRepo.EmpAgeGT(empage);
    }

    public List<Employee> SameRegion(String Region) {
        return empRepo.SameRegion(Region);
    }

    public List<Employee> EmpNameStartWith(Character c) {
        return empRepo.EmpNameStartWith(c);
    }

    public List<Employee> EmpWithAgeAndRegion(String Region, int empage)
    {
      return empRepo.EmpWithAgeAndRegion(Region, empage);
    }

}