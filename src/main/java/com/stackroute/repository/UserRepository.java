package com.stackroute.repository;

import com.stackroute.domain.User.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //to scan the classpath and create a bean.
public interface UserRepository extends JpaRepository<User, Integer> {


}
