package com.example.practiceMongo;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;
@Repository
public interface EmpRepo extends MongoRepository<Employee,Integer> {

    @Query("{Salary:-1}.limit(1)")
    List<Employee>EmpWithMaxSal();

    @Query("{empage:{$gt:?0}}")
    List<Employee>EmpAgeGT(int empage);

    @Query("{Region:{$eq:?0}}")
    List<Employee>SameRegion(String Region);

    @Query("{Name:{$regex:?0}}")
    List<Employee>EmpNameStartWith(Character c);

    @Query("{Region:{$eq:?0},empage:{$lt:?1}}")
    List<Employee>EmpWithAgeAndRegion(String Region, int empage);

//	List<Employee> EmpList();



}