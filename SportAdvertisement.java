package com.hunteryavitz.bookr;

import java.util.ArrayList;

public class SportAdvertisement implements Advertisement {

	private String advertisementContent;

	public SportAdvertisement (Vehicle vehicle, double appraisal) {
		// Generate ad content
		ArrayList<String> templateAdvertisementFile = DAO.loadData("D:\\hyavi\\Documents\\java\\src\\com\\hunteryavitz\\com.hunteryavitz.bookr\\advertisement.txt");
		String templateAdvertisement = templateAdvertisementFile.get(1);
		
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
