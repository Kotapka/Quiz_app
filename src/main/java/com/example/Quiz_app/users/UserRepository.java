package com.example.Quiz_app.users;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Users,Integer> {
    @Query(value = "SELECT * FROM public.users WHERE login = :login", nativeQuery = true)
    Users findByLogin(@Param("login") String login);
}
