package com.company.entity;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Entity
@Table(name = "Users",schema = "charity")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private final long id;

    public Users(long id) {
        this.id = id;
    }

}
