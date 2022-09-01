package com.example.cachetask.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    @OneToOne(cascade = CascadeType.ALL)
    private Balance balance;
    @OneToOne(cascade = CascadeType.ALL)
    private Tariff tariff;

}
