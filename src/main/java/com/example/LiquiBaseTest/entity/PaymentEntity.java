package com.example.LiquiBaseTest.entity;

import com.example.LiquiBaseTest.enums.PaymentType;
import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "Payments")
public class PaymentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "police_no", nullable = false, length = 50)
    private String policeNo;

    @Enumerated(EnumType.STRING)
    @Column(name = "payment_type", nullable = false, length = 30)
    private PaymentType paymentType;

    @Column(name = "tutar", nullable = false, precision = 15, scale = 2)
    private BigDecimal tutar;

    @Column(name = "islem_tarihi", nullable = false)
    private LocalDateTime islemTarihi;

    public PaymentEntity() {
    }

    public PaymentEntity(String policeNo, PaymentType paymentType, BigDecimal tutar, LocalDateTime islemTarihi) {
        this.policeNo = policeNo;
        this.paymentType = paymentType;
        this.tutar = tutar;
        this.islemTarihi = islemTarihi;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPoliceNo() {
        return policeNo;
    }

    public void setPoliceNo(String policeNo) {
        this.policeNo = policeNo;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    public BigDecimal getTutar() {
        return tutar;
    }

    public void setTutar(BigDecimal tutar) {
        this.tutar = tutar;
    }

    public LocalDateTime getIslemTarihi() {
        return islemTarihi;
    }

    public void setIslemTarihi(LocalDateTime islemTarihi) {
        this.islemTarihi = islemTarihi;
    }
}
