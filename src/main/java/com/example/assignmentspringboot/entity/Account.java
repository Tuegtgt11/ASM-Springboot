package com.example.assignmentspringboot.entity;

import com.example.assignmentspringboot.entity.base.BaseEntity;
import com.example.assignmentspringboot.entity.myenum.AccountStatus;
import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "accounts")
public class Account extends BaseEntity {
    @Id
//    @GeneratedValue(generator = "uuid")
//    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String address;
    private String thumbnail;
    @Lob
    private String detail;
    @Enumerated(EnumType.ORDINAL)
    private AccountStatus status;
    private String role;

}
