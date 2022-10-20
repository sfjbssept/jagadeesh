package com.user.repo;

import org.springframework.data.jpa.repository.JpaRepository;


import com.user.entity.User;

public interface UserRegisterRepository extends JpaRepository<User, Integer>{

}
