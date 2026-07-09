package com.example.LiquiBaseTest.entity;


import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "urunler") // Veritabanında oluşmasını istediğimiz tablo adı
public class UrunEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "urun_adi", nullable = false, length = 100)
    private String urunAdi;

    @Column(name = "fiyat", nullable = false)
    private BigDecimal fiyat;

    @Column(name = "stok_adedi")
    private Integer stokAdedi;

    @Column(name = "indirim_orani")
    private Integer indirimOrani;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getUrunAdi() { return urunAdi; }
    public void setUrunAdi(String urunAdi) { this.urunAdi = urunAdi; }

    public BigDecimal getFiyat() { return fiyat; }
    public void setFiyat(BigDecimal fiyat) { this.fiyat = fiyat; }

    public Integer getStokAdedi() { return stokAdedi; }
    public void setStokAdedi(Integer stokAdedi) { this.stokAdedi = stokAdedi; }
}