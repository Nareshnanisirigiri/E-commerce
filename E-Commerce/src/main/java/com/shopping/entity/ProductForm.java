package com.shopping.entity;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;


public class ProductForm {
	private MensDress product;
	private WomensDress womensDress;
	private KidsDress kidsDress;
    private MultipartFile image;
	/**
	 * @return the product
	 */
	public MensDress getProduct() {
		return product;
	}
	/**
	 * @param product the product to set
	 */
	public void setProduct(MensDress product) {
		this.product = product;
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
	 * @return the image
	 */
	public MultipartFile getImage() {
		return image;
	}
	/**
	 * @param image the image to set
	 */
	public void setImage(MultipartFile image) {
		this.image = image;
	}	
    
    
}
