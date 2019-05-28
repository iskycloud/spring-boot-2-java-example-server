package com.skt.example.user;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserVO, Long> {
    UserVO findById(String id);
}
