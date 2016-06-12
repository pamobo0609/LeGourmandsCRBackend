package com.legourmandscr

import java.util.ArrayList;

class AppUser {
	String emailOrUsername
	RegisterType registerType
	ArrayList<Restaurant> favorites
	
    static constraints = {
		emailOrUsername blank:false
		registerType nullable:false
		favorites nullable:true
    }

	public AppUser(String emailOrUsername, RegisterType registerType,
			ArrayList<Restaurant> favorites) {
		super();
		this.emailOrUsername = emailOrUsername;
		this.registerType = registerType;
		this.favorites = favorites;
	}	
	
	public AppUser() {}

	@Override
	public String toString() {
		return "AppUser [emailOrUsername=" + emailOrUsername
				+ ", registerType=" + registerType + ", favorites=" + favorites
				+ "]";
	}
}
