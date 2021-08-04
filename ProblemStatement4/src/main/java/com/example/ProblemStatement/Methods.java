package com.example.ProblemStatement;
//import java.awt.List;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

@Service
public class Methods {
	public List<Employee>list = new ArrayList<>();
	public Methods() {
		// TODO Auto-generated constructor stub
		Employee e1 = new Employee("Jade", 10000,24,"Bangalore");
	    Employee e2 = new Employee("Judy",11000,25,"Delhi");
	    Employee e3 = new Employee("Dexter",20000,26,"Mumbai");
	    Employee e4 = new Employee("Suzy",23000,22,"Delhi");
	    Employee e5 = new Employee("Lex",5000,34,"Bangalore");
	    Employee e6 = new Employee("John",45000,33,"Delhi");
	    Employee e7 = new Employee("Danish",25000,32,"Bangalore");
	    Employee e8 = new Employee("Dinesh",32000,30,"Bangalore");
	    Employee e9 = new Employee("Rajesh",48000,27,"Mumbai");
	    
	    list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);
        list.add(e6);
        list.add(e7);
        list.add(e8);
        list.add(e9);
	}
	public Integer HighestSalary()
	{
		int HighestSalary= list.stream().map(x->x.Salary).max(Integer::compare).get();
//		System.out.println("1.HighestSalary :" + HighestSalary);
//		System.out.println();
		return HighestSalary;
	}
	//LowestSalary
	public Integer LowestSalary()
	{
//		this.list=lis1;
		int LowestSalary= list.stream().map(x->x.Salary).min(Integer::compare).get();
		return LowestSalary;
	}

	//Average Salary
	public double AverageSalary()
	{
		double Sum= list.stream().map(x->x.Salary).reduce(0,(a,b)->a+b);
		double AverageSalary = Sum/list.size();
		return AverageSalary;
	}

	//salaries greater and lower than average salary
	public List<Integer> SalaryLessThanAvg()
	{
		List<Integer>LessThanAvgSalary= list.stream().map(x->x.Salary).filter(a->a<AverageSalary()).collect(Collectors.toList());
		return LessThanAvgSalary;
	}
	public List<Integer> SalGreaterThanAvgSalary()
	{
		List<Integer>GreaterThanAvgSalary= list.stream().map(x->x.Salary).filter(a->a>AverageSalary()).collect(Collectors.toList());
		return GreaterThanAvgSalary;
	}
	public List<String> AgeGreaterThan30(int age)
	{
		List<String>temp6 = new ArrayList<>();
		List<Employee> tempList = list.stream().filter(e ->e.Age > age).collect(Collectors.toList());
		for (Employee i: tempList) {
			temp6.add(i.Name);
		}
		return temp6;
	}

	//Name of all employees belonging to one particular region e.g. Bangalore
	public List<String> SameRegion()
	{
		List<String>temp5=new ArrayList<>();
		List<Employee> tempList2 = list.stream().filter(e ->e.Region=="Bangalore").collect(Collectors.toList());
		for (Employee i: tempList2) {
			temp5.add(i.Name);
		}
		return temp5;

	}

	//List of employees whose name begin with a given alphabet “J”
	public List<String> StartingwithJ()
	{
		List<String>temp4=new ArrayList<>();
		List<Employee> tempList3 = list.stream().filter(e ->e.Name.charAt(0)=='J').collect(Collectors.toList());
		for (Employee i: tempList3) {
			temp4.add(i.Name);
		}
		return temp4;
	}

	//List of employees whose age is less than 30 and region is Bangalore
	public List<String> AgeAndRegion()
	{
		List<String>temp3=new ArrayList<>();
		List<Employee> tempList4 = list.stream().filter(e ->e.Age < 30 && e.Region=="Bangalore").collect(Collectors.toList());
		for (Employee i: tempList4) {
			temp3.add(i.Name);

		}
		return temp3;
	}

	//List of employees with length of name more than 5
	public List<String> lengthMoreThan5()
	{
		List<String>temp2=new ArrayList<>();
		List<Employee> tempList5 = list.stream().filter(e ->e.Name.length()>5).collect(Collectors.toList());
		for (Employee i: tempList5) {
			temp2.add(i.Name);
		}
		return temp2;
	}

	//List of employees with Salary greater than 11000
	public List<String> SalaryMorethan11k()
	{
		List<String>temp1=new ArrayList<>();
		List<Employee> tempList6 = list.stream().filter(e ->e.Salary>11000).collect(Collectors.toList());
		for (Employee i: tempList6) {
			temp1.add(i.Name);
		}
		return temp1;
	}

	//second character of the names of all employees
	public List<Character> SecondCharacter()
	{
		List<Character>temp=new ArrayList<>();
		for (Employee i: list)
		{
			temp.add(i.Name.charAt(1));
		}
		return temp;
	}



}
