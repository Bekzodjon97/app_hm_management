package uz.pdp.app_hp_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.app_hp_management.entity.Role;
import uz.pdp.app_hp_management.entity.User;
import uz.pdp.app_hp_management.entity.enums.RoleName;

import javax.validation.constraints.Email;
import java.util.UUID;

public interface RoleRepository extends JpaRepository<Role, Integer> {
    Role findByRoleName(RoleName roleName);

}
