package com.springbootcrud.Urun.model;

import java.util.UUID;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.Table;


@Entity
@Table
public class Urun  
{  

@Column
@Id
@GeneratedValue(strategy = GenerationType.UUID)
private  UUID id;  
@Column
private String urunadi;  
@Column
private int  fiyat;  
@Column
private int miktar;


public UUID getId() {
	return id;
}
public void setId(UUID id) {
	this.id = id;
}
public String getUrunadi() {
	return urunadi;
}
public void setUrunadi(String urunadi) {
	this.urunadi = urunadi;
}

public int getMiktar() {
	return miktar;
}
public void setMiktar(int miktar) {
	this.miktar = miktar;
}
public int getFiyat() {
	return fiyat;
}
public void setFiyat(int fiyat) {
	this.fiyat = fiyat;
}  


}  
