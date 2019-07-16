package com.skt.example.user;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import lombok.Data;
import lombok.experimental.Accessors;

@Entity
@Table(name = "user_service")
@IdClass(UserServiceId.class)
@Data
@Accessors(chain = true)
public class UserServiceVO {
    @Id
    Long userId;
    @Id
    Long serviceId;
}
