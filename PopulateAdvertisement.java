package com.hunteryavitz.bookr;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

public class PopulateAdvertisement {

	private static DecimalFormat df = new DecimalFormat("#,###,###");
	private static Map<String, String> vehiclePropertyValues = new HashMap<String, String>();

	public static String parseAdvertisement(String templateAdvertisement, Vehicle vehicle, double appraisal) {

		vehiclePropertyValues.put("[name]", vehicle.getVehicleName());
		vehiclePropertyValues.put("[make]", vehicle.getVehicleMake());
		vehiclePropertyValues.put("[model]", vehicle.getVehicleModel());
		vehiclePropertyValues.put("[year]", String.valueOf(vehicle.getVehicleYear()));
		vehiclePropertyValues.put("[transmission]", vehicle.getVehicleTransmission());
		vehiclePropertyValues.put("[drive]", vehicle.getVehicleDrive());
		vehiclePropertyValues.put("[air_bags]", (vehicle.isVehicleAirBags()) ? "Air Bags" : "No Air Bags");
		vehiclePropertyValues.put("[abs]", (vehicle.isVehicleABS()) ? "ABS" : "No ABS");
		vehiclePropertyValues.put("[rear_view_camera]",
				(vehicle.isVehicleRearViewCamera()) ? "Rear-View Camera" : "No Rear-View Camera");
		vehiclePropertyValues.put("[grade]", vehicle.getVehicleGrade());
		vehiclePropertyValues.put("[mileage]", df.format(vehicle.getVehicleMileage()));
		vehiclePropertyValues.put("[previous_owners]", (vehicle.getVehiclePreviousOwners() == 0) ? "No"
				: String.valueOf(vehicle.getVehiclePreviousOwners()));
		vehiclePropertyValues.put("[keyless_entry]",
				(vehicle.isVehicleKeylessEntry()) ? "Keyless Entry" : "No Keyless Entry");
		vehiclePropertyValues.put("[premium_sound]",
				(vehicle.isVehiclePremiumSound()) ? "Premium Sound" : "No Premium Sound");
		vehiclePropertyValues.put("[gps_navigation]",
				(vehicle.isVehicleGPSNavigation()) ? "GPS Navigation" : "No GPS Navigation");
		vehiclePropertyValues.put("[accident_history]",
				(vehicle.isVehicleAccidentHistory()) ? "Accident History" : "No Accident History");
		vehiclePropertyValues.put("[price]", df.format((((appraisal + vehicle.getVehicleCommission())))));

		for (Map.Entry<String, String> property : vehiclePropertyValues.entrySet()) {
			templateAdvertisement = templateAdvertisement.replace(property.getKey(), property.getValue());
		}

		return templateAdvertisement;
	}
}