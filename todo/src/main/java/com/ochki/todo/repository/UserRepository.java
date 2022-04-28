package com.ochki.todo.repository;

import com.ochki.todo.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<Users, Integer> {


  //  List<Users> findById();
}
