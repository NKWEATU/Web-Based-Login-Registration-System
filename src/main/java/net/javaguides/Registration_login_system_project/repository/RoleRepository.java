package net.javaguides.Registration_login_system_project.repository;

import net.javaguides.Registration_login_system_project.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,Long> {

    Role findByName(String name);
}
