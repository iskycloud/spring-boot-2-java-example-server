package com.skt.example.user;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserVO, Long> {
    @Override
    List<UserVO> findAll();
}
