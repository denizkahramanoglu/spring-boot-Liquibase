package com.example.LiquiBaseTest.entity;

import jakarta.persistence.*;

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
        public TestEntity() {
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getIsim() {
            return isim;
        }

        public void setIsim(String isim) {
            this.isim = isim;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }
    }

