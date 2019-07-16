package com.skt.example.user;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.experimental.Accessors;

@Entity
@Table(name = "user")
@Data
@Accessors(chain = true)
public class UserVO {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    Long id;
    String loginId;
    String name;
    String mobile;
    String address;
    
    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId")
    Set<UserServiceVO> services;
}

/*
CREATE TABLE IF NOT EXISTS `user` (
`sid` bigint(20) NOT NULL AUTO_INCREMENT,
`id` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
`name` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
`mobile` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
`address` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
PRIMARY KEY (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

DELETE FROM `user`;

INSERT INTO `user` (`sid`, `id`, `name`, `mobile`, `address`) VALUES
  (1, 'test', '테스트', '01000000000', 'seoul');
*/