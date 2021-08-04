package com.example.ProblemStatement;
import java.sql.Time;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")

public class EmployeeController {
	@Autowired
	public Methods methods;
	@RequestMapping(value = "/Hs",method = RequestMethod.GET)
	public Integer Hs()
	{
		return methods.HighestSalary();
	}
	@RequestMapping(value = "/Ls",method = RequestMethod.GET)
	public Integer Ls()
	{
		return methods.LowestSalary();
	}
	@RequestMapping(value = "/AS",method = RequestMethod.GET)
	public double As()
	{
		return methods.AverageSalary();
	}
	@RequestMapping(value = "/SLTA",method = RequestMethod.GET)
	public List<Integer> SLTA()
	{
		return methods.SalaryLessThanAvg();
	}

	@RequestMapping(value = "/SGTA",method = RequestMethod.GET)
	public List<Integer> SGTA()
	{
		return methods.SalGreaterThanAvgSalary();
	}
	@RequestMapping(value = "/AGT30",method = RequestMethod.GET)
	public List<String> AGT30(@RequestParam int age)
	{
		return methods.AgeGreaterThan30(age);
	}
	@RequestMapping(value = "/SR",method = RequestMethod.GET)
	public List<String> SR()
	{
		return methods.SameRegion();
	}
	@RequestMapping(value = "/SWJ",method = RequestMethod.GET)
	public List<String> SWJ()
	{
		return methods.StartingwithJ();
	}
	@RequestMapping(value = "/AR",method = RequestMethod.GET)
	public List<String> AR()
	{
		return methods.AgeAndRegion();
	}
	@RequestMapping(value = "/LMT5",method = RequestMethod.GET)
	public List<String> LMT5()
	{
		return methods.lengthMoreThan5();
	}
	@RequestMapping(value = "/SMT11K",method = RequestMethod.GET)
	public List<String> SMT11K()
	{
		return methods.SalaryMorethan11k();
	}
	@RequestMapping(value = "/SC",method = RequestMethod.GET)
	public List<Character> SC()
	{
		return methods.SecondCharacter();
	}







}
