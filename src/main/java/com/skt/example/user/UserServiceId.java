package com.skt.example.user;

import java.io.Serializable;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class UserServiceId implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 7092607728125241216L;
    Long userId;
    Long serviceId;
    
    public UserServiceId() {
        
    }
    
    public UserServiceId(Long userId, Long serviceId) {
        this.userId = userId;
        this.serviceId = serviceId;
    }
}
