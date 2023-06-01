package com.revature.tasking.repositories;

import com.revature.tasking.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
}
