package com.yamani.spring.mongo.api.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

@Document(collection = "commande")
public class Commande {
	
	@Id
	private String _id;
	private Object produits;
	private String date;
	private int prixT;
	public Commande() {
	  }
	  public Commande(Object produits, String date, int prixT) {
	    this.produits = produits;
	    this.date = date;
	    this.prixT = prixT;
	  }
	public String getId() {
		return _id;
	}
	public Object getProduits() {
		return produits;
	}
	public void setProduits(Object produits) {
		this.produits = produits;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getPrixT() {
		return prixT;
	}
	public void setPrixT(int prixT) {
		this.prixT = prixT;
	}
	
	
}
