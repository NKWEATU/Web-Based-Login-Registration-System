package net.javaguides.Registration_login_system_project.repository;

import net.javaguides.Registration_login_system_project.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);

}
