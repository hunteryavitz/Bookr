package com.hunteryavitz.bookr;

public class Bluebook {

	private static Bluebook instance = new Bluebook();
	private Bluebook() {}

	public static Bluebook getBluebookInstance() {
		return Bluebook.instance;
	}

	public double getAppraisal(Vehicle vehicle) {
		return getFinalPrice(vehicle);
	}

	public static double getFinalPrice(Vehicle vehicle) {
		PriceAdjuster priceAdjuster = PriceAdjuster.getInstance();
		double finalPrice = vehicle.getVehicleBaseCost();
		finalPrice = priceAdjuster.yearPriceAdjustment(vehicle.getVehicleYear(), finalPrice);
		finalPrice = priceAdjuster.transmissionPriceAdjust(vehicle.getVehicleTransmission(), finalPrice);
		finalPrice = priceAdjuster.drivePriceAdjust(vehicle.getVehicleDrive(), finalPrice);
		finalPrice = priceAdjuster.safetyFeaturePriceAdjust(vehicle.isVehicleAirBags(), vehicle.isVehicleABS(), vehicle.isVehicleRearViewCamera(), finalPrice);
		finalPrice = priceAdjuster.gradePriceAdjust(vehicle.getVehicleGrade(), finalPrice);
		finalPrice = priceAdjuster.mileagePriceAdjust(vehicle.getVehicleMileage(), vehicle.getVehicleYear(), finalPrice);
		finalPrice = priceAdjuster.previousOwnersPriceAdjust(vehicle.getVehiclePreviousOwners(), finalPrice);
		finalPrice = priceAdjuster.luxoryFeaturePriceAdjust(vehicle.isVehicleKeylessEntry(), vehicle.isVehiclePremiumSound(), vehicle.isVehicleGPSNavigation(), finalPrice);
		finalPrice = priceAdjuster.accidentHistoryPriceAdjust(vehicle.isVehicleAccidentHistory(), finalPrice);
		finalPrice = priceAdjuster.commissionPriceAdjust(vehicle.getVehicleCommission(), finalPrice);
		return finalPrice;
	}
}