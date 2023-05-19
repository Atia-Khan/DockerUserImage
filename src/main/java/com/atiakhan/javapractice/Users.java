package com.atiakhan.javapractice;

// import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter

public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    // @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    @Column(unique = true)
    private String uName;
    private String password;
    @Column(columnDefinition = "varchar")
    private String cDate;

    public Users() {
    }

    public Users(long id, String uName, String password, String cDate) {
        this.id = id;
        this.uName = uName;
        this.password = password;
        this.cDate = cDate;
    }

    public String getuName() {
        return uName;
    }

}
