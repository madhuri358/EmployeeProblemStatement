package com.example.practiceMongo;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString
@Document(collection="Employee")
public class Employee {
    @JsonProperty("age")
    private int empage;
   @JsonProperty("name")
    private String Name;
   @JsonProperty("salary")
    private int Salary;
   @JsonProperty("region")
    private String Region;

    public String getName() {
        return Name;
    }
    public void setName(String name) {
        this.Name = name;
    }
    public int getAge() {
        return empage;
    }
    public void setAge(int age) {
        this.empage = age;
    }
    public String getRegion() {
        return Region;
    }
    public void setRegion(String region) {
        this.Region = region;
    }
    public int getSalary() {
        return Salary;
    }
    public void setSalary(int salary) {
        this.Salary = salary;
    }
}

