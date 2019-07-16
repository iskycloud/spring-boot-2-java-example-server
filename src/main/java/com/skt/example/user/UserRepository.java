package com.skt.example.user;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserVO, Long> {
    @Query(value = "SELECT u FROM UserVO u JOIN FETCH u.services")
    List<UserVO> findAllWithServices();
}
