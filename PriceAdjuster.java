package com.hunteryavitz.bookr;

import java.time.LocalDate;

public class PriceAdjuster {

	private static PriceAdjuster priceAdjuster = new PriceAdjuster();
	private PriceAdjuster() {
	};

	public static PriceAdjuster getInstance() {
		if (priceAdjuster != null) {
			return priceAdjuster;
		} else {
			return new PriceAdjuster();
		}
	}

	public int calculateAge(int year) {
		LocalDate currentDate = LocalDate.now();
		int currentYear = currentDate.getYear();
		int age = currentYear - year + 1;
		return age;
	}

	public double yearPriceAdjustment(int year, double price) {
		double adjustment = 0;
		int age = calculateAge(year);
		if (age <= 10) {
			adjustment = (price * (.05 * age));
		} else {
			adjustment = price * .9;
		}
		price -= adjustment;
		return price;
	}

	public double transmissionPriceAdjust(String vehicleTransmission, double price) {
		switch (vehicleTransmission) {
		case "Manual":
			price -= price * .05;
			break;
		case "Automatic":
			price += price * .05;
			break;
		case "EV":
			price += price * .25;
		}
		return price;
	}

	public double drivePriceAdjust(String vehicleDrive, double price) {
		double adjustment = price * .15;
		switch (vehicleDrive) {
		case "Front-Wheel Drive":
			price -= adjustment;
			break;
		case "Rear-Wheel Drive":
			break;
		case "All-Wheel Drive":
			price += adjustment;
			break;
		}
		return price;
	}

	public double safetyFeaturePriceAdjust(boolean airBags, boolean abs, boolean rearViewCamera, double price) {
		double adjustment = 0;
		if (airBags & abs & rearViewCamera) {
			adjustment = price * .2;
		} else if (airBags & abs | abs & rearViewCamera | airBags & rearViewCamera) {
			adjustment = price * .15;
		} else if (airBags | abs | rearViewCamera) {
			adjustment = price * .1;
		}
		return price += adjustment;
	}

	public double gradePriceAdjust(String vehicleGrade, double price) {
		double adjustment = price * .2;
		switch (vehicleGrade) {
		case "Economy":
			price -= adjustment;
			break;
		case "Standard":
			break;
		case "Performance":
			price += adjustment;
			break;
		}
		return price;
	}

	public double mileagePriceAdjust(int mileage, int year, double price) {
		double adjustment = 0;
		int age = calculateAge(year);
		int mileageAverage = age * 10000;
		int mileageOverage = mileage - mileageAverage;
		if (mileageOverage <= 1000 && mileageOverage > 1) {
			adjustment = price * .05;
		}
		if (mileageOverage > 1000 && mileageOverage <= 10000) {
			adjustment = price * .1;
		}
		if (mileageOverage > 10000 && mileageOverage <= 30000) {
			adjustment = price * .15;
		}
		if (mileageOverage > 30000) {
			adjustment = price * .2;
		}
		price -= adjustment;
		return price;
	}

	public double previousOwnersPriceAdjust(int previousOwners, double price) {
		if (previousOwners > 0) {
			double adjustment = price * (Math.pow((1 - .7), previousOwners));
			price -= adjustment;
		}
		return price;
	}

	public double luxoryFeaturePriceAdjust(boolean keylessEntry, boolean premiumSound, boolean gpsNavigation,
			double price) {
		double adjustment = 0;
		if (keylessEntry & premiumSound & gpsNavigation) {
			adjustment = price * .2;
		} else if (keylessEntry & premiumSound || premiumSound & gpsNavigation || keylessEntry & gpsNavigation) {
			adjustment = price * .15;
		} else if (keylessEntry | premiumSound | gpsNavigation) {
			adjustment = price * .1;
		}
		price += adjustment;
		return price;
	}

	public double accidentHistoryPriceAdjust(boolean accidentHistory, double price) {
		double adjustment = 0;
		if (accidentHistory) {
			adjustment = price * .15;
			price -= adjustment;
		}
		return price;
	}

	public double commissionPriceAdjust(double commission, double price) {
		return price + price * commission;
	}
}