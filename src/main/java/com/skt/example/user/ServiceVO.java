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
@Table(name = "service")
@Data
@Accessors(chain = true)
public class ServiceVO {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    Long id;
    String title;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "serviceId")
    Set<UserServiceVO> users;
}