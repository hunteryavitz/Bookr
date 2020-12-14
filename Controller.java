package com.hunteryavitz.bookr;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFileChooser;

public class Controller {

	private View view;
	private Model model;
	private Vehicle vehicle;

	public Controller(View view, Model model) {

		this.view = view;
		this.model = model;

		this.view.vehiclePreviousOwnersCheckBoxListener(new VehicleEnablePreviousOwnersTextFieldListener());
		this.view.vehicleSaveButtonListener(new VehicleSaveListener());
		this.view.vehicleLoadButtonListener(new VehicleLoadListener());
		this.view.vehicleGenerateAdButtonListener(new VehicleGenerateAdListener());
		this.view.vehicleNewButtonListener(new VehicleNewListener());
	}

	class VehicleNewListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			view.clearProject();
		}
	}

	class VehicleEnablePreviousOwnersTextFieldListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (!view.getVehiclePreviousOwnersEnabled()) {
				view.setVehiclePreviousOwnersEnabled(false);
			} else {
				view.setVehiclePreviousOwnersEnabled(true);
			}
		}
	}

	class VehicleSaveListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent event) {

			JFileChooser saveFileChooser = new JFileChooser(
					"D:\\hyavi\\Documents\\java\\src\\com\\hunteryavitz\\com.hunteryavitz.bookr\\src\\com\\hunteryavitz\\bookr");
			int rVal = saveFileChooser.showSaveDialog(view);
			if (rVal == JFileChooser.APPROVE_OPTION) {
				String[] data = new String[] { view.getVehicleName(), view.getVehicleMake(), view.getVehicleModel(),
						String.valueOf(view.getVehicleBaseCost()), String.valueOf(view.getVehicleYear()),
						view.getVehicleTransmission(), view.getVehicleDrive(), String.valueOf(view.getVehicleAirBags()),
						String.valueOf(view.getVehicleABS()), String.valueOf(view.getVehicleRearViewCamera()),
						view.getVehicleGrade(), String.valueOf(view.getVehicleMileage()),
						String.valueOf(view.getVehiclePreviousOwners()), String.valueOf(view.getVehicleKeylessEntry()),
						String.valueOf(view.getVehiclePremiumSound()), String.valueOf(view.getVehicleGPSNavigation()),
						view.getVehicleClass(), String.valueOf(view.getVehicleAccidentHistory()),
						String.valueOf(view.getVehicleCommissionRate()) };
				if (DAO.saveData(data, saveFileChooser.getSelectedFile().getName())) {
					view.displayAlert(saveFileChooser.getSelectedFile().getName() + " save successful.");
				} else {
					view.displayAlert(saveFileChooser.getSelectedFile().getName() + " could not save.");
				}
			}
			if (rVal == JFileChooser.CANCEL_OPTION) {
				view.displayAlert("Save Canceled.");
			}
		}
	}

	class VehicleLoadListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent event) {

			JFileChooser loadFileChooser = new JFileChooser(
					"D:\\hyavi\\Documents\\java\\src\\com\\hunteryavitz\\com.hunteryavitz.bookr");
			int rVal = loadFileChooser.showOpenDialog(view);
			if (rVal == JFileChooser.APPROVE_OPTION) {
				ArrayList<String> vehicleProperties = DAO.loadData(loadFileChooser.getSelectedFile().getAbsolutePath());
				if (!vehicleProperties.isEmpty()) {
					view.setVehicleName(vehicleProperties.get(0));
					view.setVehicleMake(vehicleProperties.get(1));
					view.setVehicleModel(vehicleProperties.get(2));
					view.setVehicleBaseCost(Double.parseDouble(vehicleProperties.get(3)));
					view.setVehicleYear(Integer.parseInt(vehicleProperties.get(4)));
					view.setVehicleTransmission(vehicleProperties.get(5));
					view.setVehicleDrive(vehicleProperties.get(6));
					view.setVehicleAirBags(Boolean.parseBoolean(vehicleProperties.get(7)));
					view.setVehicleABS(Boolean.parseBoolean(vehicleProperties.get(8)));
					view.setVehicleRearViewCamera(Boolean.parseBoolean(vehicleProperties.get(9)));
					view.setVehicleGrade(vehicleProperties.get(10));
					view.setVehicleMileage(Integer.parseInt(vehicleProperties.get(11)));
					view.setVehiclePreviousOwners(Integer.parseInt(vehicleProperties.get(12)));
					view.setVehicleKeylessEntry(Boolean.parseBoolean(vehicleProperties.get(13)));
					view.setVehiclePremiumSound(Boolean.parseBoolean(vehicleProperties.get(14)));
					view.setVehicleGPSNavigation(Boolean.parseBoolean(vehicleProperties.get(15)));
					view.setVehicleClass(vehicleProperties.get(16));
					view.setVehicleAccidentHistory(Boolean.parseBoolean(vehicleProperties.get(17)));
					view.setVehicleCommissionRate(Double.parseDouble(vehicleProperties.get(18)));
					view.setVehicleAdvertisement("");
				} else {
					view.displayAlert(loadFileChooser.getSelectedFile().getName() + " has no data.");
				}
			}
			if (rVal == JFileChooser.CANCEL_OPTION) {
				view.displayAlert("Load Canceled.");
			}
		}
	}

	class VehicleGenerateAdListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent event) {

			String vehicleName, vehicleMake, vehicleModel = "";
			double vehicleBaseCost = 0.0;
			int vehicleYear = 0;
			String vehicleTransmission, vehicleDrive = "";
			boolean vehicleAirBags, vehicleABS, vehicleRearViewCamera = false;
			String vehicleGrade = "";
			int vehicleMileage, vehiclePreviousOwners = 0;
			boolean vehicleKeylessEntry, vehiclePremiumSound, vehicleGPSNavigation = false;
			String vehicleClass = "";
			boolean vehicleAccidentHistory = false;
			double vehicleCommission = 0.0;

			try {
				vehicleName = view.getVehicleName();
				vehicleMake = view.getVehicleMake();
				vehicleModel = view.getVehicleModel();
				vehicleBaseCost = view.getVehicleBaseCost();
				vehicleYear = view.getVehicleYear();
				vehicleTransmission = view.getVehicleTransmission();
				vehicleDrive = view.getVehicleDrive();
				vehicleAirBags = view.getVehicleAirBags();
				vehicleABS = view.getVehicleABS();
				vehicleRearViewCamera = view.getVehicleRearViewCamera();
				vehicleGrade = view.getVehicleGrade();
				vehicleMileage = view.getVehicleMileage();
				vehiclePreviousOwners = view.getVehiclePreviousOwners();
				vehicleKeylessEntry = view.getVehicleKeylessEntry();
				vehiclePremiumSound = view.getVehiclePremiumSound();
				vehicleGPSNavigation = view.getVehicleGPSNavigation();
				vehicleClass = view.getVehicleClass();
				vehicleAccidentHistory = view.getVehicleAccidentHistory();
				vehicleCommission = view.getVehicleCommissionRate();

				// Construct vehicle
				vehicle = new Vehicle(vehicleName, vehicleMake, vehicleModel, vehicleBaseCost, vehicleYear,
						vehicleTransmission, vehicleDrive, vehicleAirBags, vehicleABS, vehicleRearViewCamera,
						vehicleGrade, vehicleMileage, vehiclePreviousOwners, vehicleKeylessEntry, vehiclePremiumSound,
						vehicleGPSNavigation, vehicleClass, vehicleAccidentHistory, vehicleCommission);

				// Perform calculations (getBluebookValue, generateAd)
				model.generateVehicleBookr(vehicle);

				// Display results
				view.setVehicleAdvertisement(model.getVehicleAdvertisementContent());

			} catch (Exception exception) {
				exception.printStackTrace();
				view.displayAlert("Something went wrong.");
			}
		}
	}
}