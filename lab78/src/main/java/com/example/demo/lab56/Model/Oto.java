package com.example.demo.lab56.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;

@Entity
@Table(name = "product")
@Getter
public class Oto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "productid")
    private Integer productId;

    @Column(name = "tenoto")
    private String tenOtoa;

    @Column(name = "thuonghieu")
    private String thuongHieua;

    @Column(name = "dungtich")
    private String dungTicha;

    @Column(name = "sochongoi")
    private Integer soChoNgoia;

    public Oto() {
    }

    public Oto(Integer productId, String tenOtoa, String thuongHieua, String dungTicha, Integer soChoNgoia) {
        this.productId = productId;
        this.tenOtoa = tenOtoa;
        this.thuongHieua = thuongHieua;
        this.dungTicha = dungTicha;
        this.soChoNgoia = soChoNgoia;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getTenOtoa() {
        return tenOtoa;
    }

    public void setTenOtoa(String tenOtoa) {
        this.tenOtoa = tenOtoa;
    }

    public String getThuongHieua() {
        return thuongHieua;
    }

    public void setThuongHieua(String thuongHieua) {
        this.thuongHieua = thuongHieua;
    }

    public String getDungTicha() {
        return dungTicha;
    }

    public void setDungTicha(String dungTicha) {
        this.dungTicha = dungTicha;
    }

    public Integer getSoChoNgoia() {
        return soChoNgoia;
    }

    public void setSoChoNgoia(Integer soChoNgoia) {
        this.soChoNgoia = soChoNgoia;
    }
}
