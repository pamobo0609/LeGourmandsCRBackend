package com.legourmandscr;

public enum RestaurantType {
	ETHNIC, FAST_FOOD, FAST_CASUAL, CASUAL_DINING, FINE_DINING, BBQ, BRASSIERE_AND_BISTRO, BUFFET, CAFE, CAFETERIA, COFFEEHOUSE, TABLE_TOP, OTHER_BBQ, PUB;
	
	@Override
	public String toString() {
		switch(this) {
		case ETHNIC: return "Ethnic";
		case FAST_FOOD: return "Fast food";
		case FAST_CASUAL: return "Fast casual";
		case CASUAL_DINING: return "Casual dining";
		case FINE_DINING: return "Fine dining";
		case BBQ: return "Barbecue";
		case BRASSIERE_AND_BISTRO: return "Brassiere and bristro";
		case BUFFET: return "Buffet";
		case CAFE: return "Cafe";
		case CAFETERIA: return "Cafeteria";
		case COFFEEHOUSE: return "Coffeehouse";
		case TABLE_TOP: return "Table top";
		case OTHER_BBQ: return "Other barbecue type";
		case PUB: return "Pub";
		
		default:return "Not found";
		}
	}
}