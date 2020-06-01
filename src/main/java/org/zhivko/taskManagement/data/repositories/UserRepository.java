package org.zhivko.taskManagement.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.zhivko.taskManagement.data.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
