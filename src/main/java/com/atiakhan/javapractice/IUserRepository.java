package com.atiakhan.javapractice;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.data.repository.CrudRepository;

public interface IUserRepository extends JpaRepository<Users, Long> {
    
    List<Users> findAll();

    

}
