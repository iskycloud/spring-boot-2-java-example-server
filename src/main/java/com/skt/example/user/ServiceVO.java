package com.skt.example.user;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.Data;
import lombok.experimental.Accessors;

@Entity
@Table(name = "service")
@Data
@Accessors(chain = true)
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class, 
        property = "id")
public class ServiceVO {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    Long id;
    String title;
    
    @ManyToMany(mappedBy = "services")
    Set<UserVO> users;
}