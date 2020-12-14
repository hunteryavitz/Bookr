package com.hunteryavitz.bookr;

public class AdvertisementFactory {

	public static Advertisement getAdvertisement(Vehicle vehicle, double appraisal) {

		String advertisementType = vehicle.getVehicleClass();
		switch (advertisementType) {
		case "Utility":
			return new UtilityAdvertisement(vehicle, appraisal);
		case "Sport":
			return new SportAdvertisement(vehicle, appraisal);
		case "Luxury":
			return new LuxuryAdvertisement(vehicle, appraisal);
		default:
			return null;
		}
	}
}