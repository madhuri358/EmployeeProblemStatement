import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
import java.util.stream.Collectors;

public class EmployeeProblemStatement3 {
    public static class Employee {
        int Age;
        Integer Salary;
        String Name,Region;
        public Employee(String Name,Integer Salary,int Age,String Region)
        {
            this.Age=Age;
            this.Name=Name;
            this.Region=Region;
            this.Salary=Salary;
        }

    }

    //HighestSalary
    public static void HighestSalary(List<Employee>list)
    {
        int HighestSalary= list.stream().map(x->x.Salary).max(Integer::compare).get();
        System.out.println("1.HighestSalary :" + HighestSalary);
        System.out.println();
    }

    //LowestSalary
    public static void LowestSalary(List<Employee>list)
    {
        int LowestSalary= list.stream().map(x->x.Salary).min(Integer::compare).get();
        System.out.println("2.LowestSalary :"+ LowestSalary);
        System.out.println();
    }

    //Average Salary
    public static double AverageSalary(List<Employee>list)
    {
        double Sum= list.stream().map(x->x.Salary).reduce(0,(a,b)->a+b);
        double AverageSalary = Sum/list.size();
        System.out.println("3.Average Salary :"+AverageSalary);
        System.out.println();
        return AverageSalary;
    }

    //salaries greater and lower than average salary
    public static void SalaryGreatAndLessThanAvg(List<Employee>list,double AverageSalary)
    {
        List<Integer>LessThanAvgSalary= list.stream().map(x->x.Salary).filter(a->a<AverageSalary).collect(Collectors.toList());
        System.out.println("4.salaries lower than average salary :"+LessThanAvgSalary);
        List<Integer>GreaterThanAvgSalary= list.stream().map(x->x.Salary).filter(a->a>AverageSalary).collect(Collectors.toList());
        System.out.println("    salaries Greater than average salary :"+ GreaterThanAvgSalary);
        System.out.println();
    }

    //Employees age greater than 30
    public static void AgeGreaterThan30(List<Employee>list)
    {
        List<String>temp = new ArrayList<>();
        List<Employee> tempList = list.stream().filter(e ->e.Age > 30).collect(Collectors.toList());
        System.out.print("5.Employees age greater than 30 :");
        for (Employee i: tempList) {
            temp.add(i.Name);
        }
        System.out.println(temp);
        System.out.println();
    }

    //Name of all employees belonging to one particular region e.g. Bangalore
    public static void SameRegion(List<Employee>list)
    {
        List<String>temp=new ArrayList<>();
        List<Employee> tempList2 = list.stream().filter(e ->e.Region=="Bangalore").collect(Collectors.toList());
        System.out.print("6.Employees belongs to Bangalore :");
        for (Employee i: tempList2) {
            temp.add(i.Name);
        }
        System.out.println(temp);
        System.out.println();
    }

    //List of employees whose name begin with a given alphabet “J”
    public static void StartingwithJ(List<Employee>list)
    {
        List<String>temp=new ArrayList<>();
        List<Employee> tempList3 = list.stream().filter(e ->e.Name.charAt(0)=='J').collect(Collectors.toList());
        System.out.print("7.Employees whose name begin with a given alphabet “J” :");
        for (Employee i: tempList3) {
            temp.add(i.Name);
        }
        System.out.println(temp);
        System.out.println();
    }

    //List of employees whose age is less than 30 and region is Bangalore
    public static void AgeAndRegion(List<Employee>list)
    {
        List<String>temp=new ArrayList<>();
        List<Employee> tempList4 = list.stream().filter(e ->e.Age < 30 && e.Region=="Bangalore").collect(Collectors.toList());
        System.out.print("8.Employees whose age is less than 30 and region is Bangalore :");
        for (Employee i: tempList4) {
            temp.add(i.Name);
        }
        System.out.println(temp);
    }

    //List of employees with length of name more than 5
    public static void lengthMoreThan5(List<Employee>list)
    {
        List<String>temp=new ArrayList<>();
        List<Employee> tempList5 = list.stream().filter(e ->e.Name.length()>5).collect(Collectors.toList());
        System.out.print("1.List of employees with length of name more than 5 :");
        for (Employee i: tempList5) {
            temp.add(i.Name);
        }
        System.out.println(temp);
        System.out.println();
    }

    //List of employees with Salary greater than 11000
    public static void SalaryMorethan11k(List<Employee>list)
    {
        List<String>temp=new ArrayList<>();
        List<Employee> tempList6 = list.stream().filter(e ->e.Salary>11000).collect(Collectors.toList());
        System.out.print("2.List of employees with Salary greater than 11000 :");
        for (Employee i: tempList6) {
            temp.add(i.Name);
        }
        System.out.println(temp);
    }

    //second character of the names of all employees
    public static void SecondCharacter(List<Employee>list)
    {
        System.out.println();
        List<Character>temp=new ArrayList<>();
        System.out.print("3.second character of the names of all employees: ");
        for (Employee i: list)
        {
            temp.add(i.Name.charAt(1));
        }
        System.out.println(temp);
    }
    public static void main(String[] args) {
        Employee e1 = new Employee("Jade", 10000,24,"Bangalore");
        Employee e2 = new Employee("Judy",11000,25,"Delhi");
        Employee e3 = new Employee("Dexter",20000,26,"Mumbai");
        Employee e4 = new Employee("Suzy",23000,22,"Delhi");
        Employee e5 = new Employee("Lex",5000,34,"Bangalore");
        Employee e6 = new Employee("John",45000,33,"Delhi");
        Employee e7 = new Employee("Danish",25000,32,"Bangalore");
        Employee e8 = new Employee("Dinesh",32000,30,"Bangalore");
        Employee e9 = new Employee("Rajesh",48000,27,"Mumbai");

        ArrayList<Employee> list = new ArrayList<>();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);
        list.add(e6);
        list.add(e7);
        list.add(e8);
        list.add(e9);

        System.out.println("Problem(Statement 1):");
        HighestSalary(list);
        LowestSalary(list);
        double AvgSal =AverageSalary(list);
        SalaryGreatAndLessThanAvg(list,AvgSal);
        AgeGreaterThan30(list);
        SameRegion(list);
        StartingwithJ(list);
        AgeAndRegion(list);

        System.out.println();
        System.out.println("Problem(Statement 2): ");
        System.out.println();

        lengthMoreThan5(list);
        SalaryMorethan11k(list);
        SecondCharacter(list);


    }




}


