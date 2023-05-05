package com.p2p.lender.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Builder
@Entity
@Table(name = "tbl_lender")
@AllArgsConstructor
@NoArgsConstructor
public class LenderModel {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="email")
    private String email;

    @Column(name="account_number")
    private Integer account_number;

    @Column(name="bank_name")
    private String bank_name;

    @Column(name="balance")
    private Integer balance;

    @Column(name="lender_type")
    private String lender_type;


}
