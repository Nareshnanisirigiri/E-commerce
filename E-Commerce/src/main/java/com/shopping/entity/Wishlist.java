package com.shopping.entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity

@AllArgsConstructor
@NoArgsConstructor
public class Wishlist {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private Set<MensDress> mensDress = new HashSet<>();

	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private Set<WomensDress> womensDress = new HashSet<>();

	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private Set<KidsDress> kidsDress = new HashSet<>();

	@OneToOne
	private RegisterDetails registerDetails;


	// Override toString() method to avoid circular references
	@Override
	public String toString() {
		return "Wishlist{" + "id=" + id + '}';
		
		
		
	}


	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}


	/**
	 * @return the mensDress
	 */
	public Set<MensDress> getMensDress() {
		return mensDress;
	}


	/**
	 * @param mensDress the mensDress to set
	 */
	public void setMensDress(Set<MensDress> mensDress) {
		this.mensDress = mensDress;
	}


	/**
	 * @return the womensDress
	 */
	public Set<WomensDress> getWomensDress() {
		return womensDress;
	}


	/**
	 * @param womensDress the womensDress to set
	 */
	public void setWomensDress(Set<WomensDress> womensDress) {
		this.womensDress = womensDress;
	}


	/**
	 * @return the kidsDress
	 */
	public Set<KidsDress> getKidsDress() {
		return kidsDress;
	}


	/**
	 * @param kidsDress the kidsDress to set
	 */
	public void setKidsDress(Set<KidsDress> kidsDress) {
		this.kidsDress = kidsDress;
	}


	/**
	 * @return the registerDetails
	 */
	public RegisterDetails getRegisterDetails() {
		return registerDetails;
	}


	/**
	 * @param registerDetails the registerDetails to set
	 */
	public void setRegisterDetails(RegisterDetails registerDetails) {
		this.registerDetails = registerDetails;
	}
}
