package lk.uva.uvateafactory.dao.employee;

import lk.uva.uvateafactory.entity.employee.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeDao extends JpaRepository<Employee,Integer> {

     Employee findByNumber(String number);
     Employee findByNic(String nic);
     Employee findByMobile(String mobile);

     @Query("select e from Employee e where e.id = :id")
     Employee findByMyId(@Param("id") Integer id);


     List<Employee> findAllByDesignationId(Integer desigId);
}
