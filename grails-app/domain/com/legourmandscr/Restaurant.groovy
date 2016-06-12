package com.legourmandscr

import java.util.ArrayList;

class Restaurant {
	String name
	String address
	ArrayList<String> telephones
	long lattitude
	long longitude
	ArrayList<byte[]> photos
	ArrayList<RestaurantType> restaurantType;
	
    static constraints = {
		name blank:false
		address blank:false
		telephones nullable: false
		lattitude blank:true
		longitude blank:true
		photos nullable:true
		restaurantType nullable: false
    }


	public Restaurant(String name, String address,
			ArrayList<String> telephones, long lattitude, long longitude,
			ArrayList<byte[]> photos, ArrayList<RestaurantType> restaurantType) {
		super();
		this.name = name;
		this.address = address;
		this.telephones = telephones;
		this.lattitude = lattitude;
		this.longitude = longitude;
		this.photos = photos;
		this.restaurantType = restaurantType;
	}	
	
	public Restaurant() {
		
	}

	@Override
	public String toString() {
		return "Restaurant [name=" + name + ", address=" + address
				+ ", telephones=" + telephones + ", lattitude=" + lattitude
				+ ", longitude=" + longitude + ", photos=" + photos
				+ ", restaurantType=" + restaurantType + "]";
	}
}
