package com.shopping.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity

@AllArgsConstructor
@NoArgsConstructor
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "mens_dress_id")
    private MensDress mensDress;

    @ManyToOne
    @JoinColumn(name = "womens_dress_id")
    private WomensDress womensDress;

    @ManyToOne
    @JoinColumn(name = "kids_dress_id")
    private KidsDress kidsDress;

    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus = OrderStatus.CONFIRMED;

    @ManyToOne
    @JoinColumn(name = "register_details_id")
    private RegisterDetails registerDetails;

    // Override toString() method to avoid circular references
    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", orderStatus=" + orderStatus +
                '}';
        
        
        
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
	public MensDress getMensDress() {
		return mensDress;
	}

	/**
	 * @param mensDress the mensDress to set
	 */
	public void setMensDress(MensDress mensDress) {
		this.mensDress = mensDress;
	}

	/**
	 * @return the womensDress
	 */
	public WomensDress getWomensDress() {
		return womensDress;
	}

	/**
	 * @param womensDress the womensDress to set
	 */
	public void setWomensDress(WomensDress womensDress) {
		this.womensDress = womensDress;
	}

	/**
	 * @return the kidsDress
	 */
	public KidsDress getKidsDress() {
		return kidsDress;
	}

	/**
	 * @param kidsDress the kidsDress to set
	 */
	public void setKidsDress(KidsDress kidsDress) {
		this.kidsDress = kidsDress;
	}

	/**
	 * @return the orderStatus
	 */
	public OrderStatus getOrderStatus() {
		return orderStatus;
	}

	/**
	 * @param orderStatus the orderStatus to set
	 */
	public void setOrderStatus(OrderStatus orderStatus) {
		this.orderStatus = orderStatus;
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
