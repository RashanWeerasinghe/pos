package com.bootcamp.pos.EzyPOS.enitiy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Account {
    @Id
    private int accno;
    private String firstName;
    private String lastName;
    private int bal;
}
