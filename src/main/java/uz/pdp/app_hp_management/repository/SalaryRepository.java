package uz.pdp.app_hp_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import uz.pdp.app_hp_management.entity.Role;
import uz.pdp.app_hp_management.entity.Salary;
import uz.pdp.app_hp_management.entity.enums.RoleName;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface SalaryRepository extends JpaRepository<Salary, Integer> {


    List<Salary> findAllByUserId(UUID user_id);


    @Query(value = "select * from salary where user_id=:userId and for_period between fromdate=:fromDate and todate=:toDate", nativeQuery = true)
    List<Salary> findByUserIdAndPeriod(UUID userId, Date fromDate, Date toDate);


    @Query(value = "select * from salary where for_period between fromdate=:fromDate and todate=:toDate", nativeQuery = true)
    List<Salary> findByPeriod(Date fromDate, Date toDate);
}
