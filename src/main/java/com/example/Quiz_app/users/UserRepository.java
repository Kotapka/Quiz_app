package com.example.Quiz_app.users;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Class containing repository.
 */
@Repository
public interface UserRepository extends JpaRepository<Users,Integer> {
}
