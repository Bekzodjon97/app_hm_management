package uz.pdp.app_hp_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.app_hp_management.entity.Role;
import uz.pdp.app_hp_management.entity.User;

import javax.validation.constraints.Email;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {


    boolean existsByEmail(@Email String email);

    Optional<User> findByEmailAndEmailCode(@Email String email, String emailCode);


    Optional<User> findByEmail(@Email String email);
}
