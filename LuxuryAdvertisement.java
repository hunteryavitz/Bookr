package com.hunteryavitz.bookr;

import java.util.ArrayList;

public class LuxuryAdvertisement implements Advertisement {

	private String advertisementContent;

	public LuxuryAdvertisement (Vehicle vehicle, double appraisal) {
		// Generate ad content
		ArrayList<String> templateAdvertisementFile = DAO.loadData("D:\\hyavi\\Documents\\java\\src\\com\\hunteryavitz\\com.hunteryavitz.bookr\\advertisement.txt");
		String templateAdvertisement = templateAdvertisementFile.get(2);
		
		setAdvertisementContent(PopulateAdvertisement.parseAdvertisement(templateAdvertisement, vehicle, appraisal));
	}

	@Override
	public String getAdvertisementContent() {
		return advertisementContent; 
	}

	@Override
	public void setAdvertisementContent(String advertisementContent) {
		this.advertisementContent = advertisementContent; // Set ad content
	}
}