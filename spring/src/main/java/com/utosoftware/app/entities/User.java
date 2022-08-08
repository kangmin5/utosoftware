package com.utosoftware.app.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name="users")

public class User {
    @Id @Column(name="userid")
    @GeneratedValue private Long userid;
    @Column private String name;
    @Column private String username;
    @Column private String password;
    @Column private String email;
    @Column private String mobile;
    @Column private String token;
    @Column(name ="reg_date") private String regDate;


    @JsonManagedReference
    @OneToMany(mappedBy = "user")
    List<Setting> settings = new ArrayList<>();

    @JsonManagedReference
    @OneToMany(mappedBy = "user")
    List<Orders> orders = new ArrayList<>();
}
