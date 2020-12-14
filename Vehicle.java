package com.hunteryavitz.bookr;

public class Vehicle {

	private String vehicleName;
	private String vehicleMake;
	private String vehicleModel;
	private double vehicleBaseCost;
	private int vehicleYear;
	private String vehicleTransmission;
	private String vehicleDrive;
	private boolean vehicleAirBags;
	private boolean vehicleABS;
	private boolean vehicleRearViewCamera;
	private String vehicleGrade;
	private int vehicleMileage;
	private int vehiclePreviousOwners;
	private boolean vehicleKeylessEntry;
	private boolean vehiclePremiumSound;
	private boolean vehicleGPSNavigation;
	private String vehicleClass;
	private boolean vehicleAccidentHistory;
	private double vehicleCommission;

	public Vehicle(String vehicleName, String vehicleMake, String vehicleModel, double vehicleBaseCost, int vehicleYear,
			String vehicleTransmission, String vehicleDrive, boolean vehicleAirBags, boolean vehicleABS,
			boolean vehicleRearViewCamera, String vehicleGrade, int vehicleMileage, int vehiclePreviousOwners,
			boolean vehicleKeylessEntry, boolean vehiclePremiumSound, boolean vehicleGPSNavigation, String vehicleClass,
			boolean vehicleAccidentHistory, double vehicleCommission) {

		this.vehicleName = vehicleName;
		this.vehicleMake = vehicleMake;
		this.vehicleModel = vehicleModel;
		this.vehicleBaseCost = vehicleBaseCost;
		this.vehicleYear = vehicleYear;
		this.vehicleTransmission = vehicleTransmission;
		this.vehicleDrive = vehicleDrive;
		this.vehicleAirBags = vehicleAirBags;
		this.vehicleABS = vehicleABS;
		this.vehicleRearViewCamera = vehicleRearViewCamera;
		this.vehicleGrade = vehicleGrade;
		this.vehicleMileage = vehicleMileage;
		this.vehiclePreviousOwners = vehiclePreviousOwners;
		this.vehicleKeylessEntry = vehicleKeylessEntry;
		this.vehiclePremiumSound = vehiclePremiumSound;
		this.vehicleGPSNavigation = vehicleGPSNavigation;
		this.vehicleClass = vehicleClass;
		this.vehicleAccidentHistory = vehicleAccidentHistory;
		this.vehicleCommission = vehicleCommission;
	}

	public String getVehicleName() {
		return vehicleName;
	}

	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}

	public String getVehicleMake() {
		return vehicleMake;
	}

	public void setVehicleMake(String vehicleMake) {
		this.vehicleMake = vehicleMake;
	}

	public String getVehicleModel() {
		return vehicleModel;
	}

	public void setVehicleModel(String vehicleModel) {
		this.vehicleModel = vehicleModel;
	}

	public double getVehicleBaseCost() {
		return vehicleBaseCost;
	}

	public void setVehicleBaseCost(double vehicleBaseCost) {
		this.vehicleBaseCost = vehicleBaseCost;
	}

	public int getVehicleYear() {
		return vehicleYear;
	}

	public void setVehicleYear(int vehicleYear) {
		this.vehicleYear = vehicleYear;
	}

	public String getVehicleTransmission() {
		return vehicleTransmission;
	}

	public void setVehicleTransmission(String vehicleTransmission) {
		this.vehicleTransmission = vehicleTransmission;
	}

	public String getVehicleDrive() {
		return vehicleDrive;
	}

	public void setVehicleDrive(String vehicleDrive) {
		this.vehicleDrive = vehicleDrive;
	}

	public boolean isVehicleAirBags() {
		return vehicleAirBags;
	}

	public void setVehicleAirBags(boolean vehicleAirBags) {
		this.vehicleAirBags = vehicleAirBags;
	}

	public boolean isVehicleABS() {
		return vehicleABS;
	}

	public void setVehicleABS(boolean vehicleABS) {
		this.vehicleABS = vehicleABS;
	}

	public boolean isVehicleRearViewCamera() {
		return vehicleRearViewCamera;
	}

	public void setVehicleRearViewCamera(boolean vehicleRearViewCamera) {
		this.vehicleRearViewCamera = vehicleRearViewCamera;
	}

	public String getVehicleGrade() {
		return vehicleGrade;
	}

	public void setVehicleGrade(String vehicleGrade) {
		this.vehicleGrade = vehicleGrade;
	}

	public int getVehicleMileage() {
		return vehicleMileage;
	}

	public void setVehicleMileage(int vehicleMileage) {
		this.vehicleMileage = vehicleMileage;
	}

	public int getVehiclePreviousOwners() {
		return vehiclePreviousOwners;
	}

	public void setVehiclePreviousOwners(int vehiclePreviousOwners) {
		this.vehiclePreviousOwners = vehiclePreviousOwners;
	}

	public boolean isVehicleKeylessEntry() {
		return vehicleKeylessEntry;
	}

	public void setVehicleKeylessEntry(boolean vehicleKeylessEntry) {
		this.vehicleKeylessEntry = vehicleKeylessEntry;
	}

	public boolean isVehiclePremiumSound() {
		return vehiclePremiumSound;
	}

	public void setVehiclePremiumSound(boolean vehiclePremiumSound) {
		this.vehiclePremiumSound = vehiclePremiumSound;
	}

	public boolean isVehicleGPSNavigation() {
		return vehicleGPSNavigation;
	}

	public void setVehicleGPSNavigation(boolean vehicleGPSNavigation) {
		this.vehicleGPSNavigation = vehicleGPSNavigation;
	}

	public String getVehicleClass() {
		return vehicleClass;
	}

	public void setVehicleClass(String vehicleClass) {
		this.vehicleClass = vehicleClass;
	}

	public boolean isVehicleAccidentHistory() {
		return vehicleAccidentHistory;
	}

	public void setVehicleAccidentHistory(boolean vehicleAccidentHistory) {
		this.vehicleAccidentHistory = vehicleAccidentHistory;
	}

	public double getVehicleCommission() {
		return vehicleCommission;
	}

	public void setVehicleCommission(double vehicleCommission) {
		this.vehicleCommission = vehicleCommission;
	}
}