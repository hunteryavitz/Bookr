package com.hunteryavitz.bookr;

public class Model {

	private Bluebook bluebook = Bluebook.getBluebookInstance();
	private Advertisement advertisement;

	public void generateVehicleBookr(Vehicle vehicle) {
		double appraisal = bluebook.getAppraisal(vehicle);
		advertisement = AdvertisementFactory.getAdvertisement(vehicle, appraisal);
	}

	public String getVehicleAdvertisementContent() {
		return advertisement.getAdvertisementContent();
	}
}