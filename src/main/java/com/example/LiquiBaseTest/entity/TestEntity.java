package com.example.LiquiBaseTest.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Entity
    @Table(name = "kullanicilar")
    public class TestEntity {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;

        @Column(name = "isim", nullable = false, length = 50)
        private String isim;

        @Column(name = "email", nullable = false, unique = true, length = 100)
        private String email;
    }

