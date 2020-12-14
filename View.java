package com.hunteryavitz.bookr;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class View extends JFrame {

	private static final long serialVersionUID = 1L;
	private JLabel logoImageLabel = new JLabel(new ImageIcon("D:\\hyavi\\Documents\\java\\src\\com\\hunteryavitz\\com.hunteryavitz.bookr\\src\\com\\hunteryavitz\\bookr\\logo.png"));
	private JLabel vehicleNameLabel = new JLabel("PROJECT NAME");
	private JTextField vehicleNameTextField = new JTextField(20);
	private JLabel vehicleMakeLabel = new JLabel("MAKE");
	private JTextField vehicleMakeTextField = new JTextField(20);
	private JLabel vehicleModelLabel = new JLabel("MODEL");
	private JTextField vehicleModelTextField = new JTextField(20);
	private JLabel vehicleBaseCostLabel = new JLabel("BASE COST");
	private JTextField vehicleBaseCostTextField = new JTextField(10);
	private JLabel vehicleYearLabel = new JLabel("YEAR");
	private JTextField vehicleYearTextField = new JTextField(4);
	private JLabel vehicleTransmissionLabel = new JLabel("TRANSMISSION");
	private JRadioButton vehicleTransmissionManualRadioButton = new JRadioButton("Manual");
	private JRadioButton vehicleTransmissionAutomaticRadioButton = new JRadioButton("Automatic");
	private JRadioButton vehicleTransmissionEVRadioButton = new JRadioButton("EV");
	private ButtonGroup vehicleTransmissionButtonGroup = new ButtonGroup();
	private JLabel vehicleDriveLabel = new JLabel("DRIVE");
	private JRadioButton vehicleDriveFWDRadioButton = new JRadioButton("Front-Wheel");
	private JRadioButton vehicleDriveRWDRadioButton = new JRadioButton("Rear-Wheel");
	private JRadioButton vehicleDriveAWDRadioButton = new JRadioButton("All-Wheel");
	private ButtonGroup vehicleDriveButtonGroup = new ButtonGroup();
	private JLabel vehicleSafetyFeaturesLabel = new JLabel("SAFETY FEATURES");
	private JCheckBox vehicleAirBagsCheckBox = new JCheckBox("Air Bags");
	private JCheckBox vehicleABSCheckBox = new JCheckBox("ABS");
	private JCheckBox vehicleRearViewCameraCheckBox = new JCheckBox("Rear-View Camera");
	private JLabel vehicleGradeLabel = new JLabel("GRADE");
	private JRadioButton vehicleGradeEconomyRadioButton = new JRadioButton("Economy");
	private JRadioButton vehicleGradeStandardRadioButton = new JRadioButton("Standard");
	private JRadioButton vehicleGradePerformanceRadioButton = new JRadioButton("Performance");
	private ButtonGroup vehicleGradeButtonGroup = new ButtonGroup();
	private JLabel vehicleMileageLabel = new JLabel("MILEAGE");
	private JTextField vehicleMileageTextField = new JTextField(10);
	private JCheckBox vehiclePreviousOwnersCheckBox = new JCheckBox("PREVIOUS OWNERS");
	private JTextField vehiclePreviousOwnersTextField = new JTextField(2);
	private JLabel vehicleLuxuryFeaturesLabel = new JLabel("LUXURY FEATURES");
	private JCheckBox vehicleKeylessEntryCheckBox = new JCheckBox("Keyless Entry");
	private JCheckBox vehiclePremiumSoundCheckBox = new JCheckBox("Premium Sound");
	private JCheckBox vehicleGPSNavigationCheckBox = new JCheckBox("GPS Navigation");
	private JLabel vehicleClassLabel = new JLabel("CLASS");
	private JRadioButton vehicleClassUtilityRadioButton = new JRadioButton("Utility");
	private JRadioButton vehicleClassSportRadioButton = new JRadioButton("Sport");
	private JRadioButton vehicleClassLuxuryRadioButton = new JRadioButton("Luxury");
	private ButtonGroup vehicleClassButtonGroup = new ButtonGroup();
	private JCheckBox vehicleAccidentHistoryCheckBox = new JCheckBox("ACCIDENT HISTORY");
	private JLabel vehicleCommissionRateLabel = new JLabel("COMMISSION [%]");
	private JTextField vehicleCommissionRateTextField = new JTextField(3);
	private JButton vehicleGenerateAdButton = new JButton("Generate Ad");
	private JButton vehicleNewButton = new JButton("New Project");
	private JButton vehicleSaveButton = new JButton("Save Project");
	private JButton vehicleLoadButton = new JButton("Load Project");
	private JTextArea vehicleAdvertisementTextArea = new JTextArea();

	View() {

		this.setTitle("BOOKR - Vehicle Appraisal Application");
		JPanel viewPanel = new JPanel(new GridBagLayout());
		GridBagConstraints constraints = new GridBagConstraints();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(720, 720);

		constraints.gridwidth = 4;
		constraints.insets = new Insets(10, 10, 10, 10);
		viewPanel.add(logoImageLabel, constraints);

		constraints.gridwidth = 1;
		constraints.gridx = 0;
		constraints.gridy = 1;
		constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.insets = new Insets(5, 5, 5, 5);
		viewPanel.add(vehicleNameLabel, constraints);
		constraints.gridx = 1;
		constraints.gridy = 1;
		viewPanel.add(vehicleNameTextField, constraints);

		constraints.gridx = 2;
		constraints.gridy = 1;
		viewPanel.add(vehicleNewButton, constraints);

		constraints.gridx = 3;
		constraints.gridy = 1;
		viewPanel.add(vehicleLoadButton, constraints);

		constraints.gridx = 0;
		constraints.gridy = 2;
		viewPanel.add(vehicleMakeLabel, constraints);
		constraints.gridx = 1;
		constraints.gridy = 2;
		viewPanel.add(vehicleMakeTextField, constraints);

		constraints.gridx = 2;
		constraints.gridy = 2;
		viewPanel.add(vehicleModelLabel, constraints);
		constraints.gridx = 3;
		constraints.gridy = 2;
		viewPanel.add(vehicleModelTextField, constraints);

		constraints.gridx = 0;
		constraints.gridy = 3;
		viewPanel.add(vehicleYearLabel, constraints);
		constraints.gridx = 1;
		constraints.gridy = 3;
		viewPanel.add(vehicleYearTextField, constraints);

		constraints.gridx = 2;
		constraints.gridy = 3;
		viewPanel.add(vehicleBaseCostLabel, constraints);
		constraints.gridx = 3;
		constraints.gridy = 3;
		viewPanel.add(vehicleBaseCostTextField, constraints);

		constraints.gridx = 0;
		constraints.gridy = 4;
		viewPanel.add(vehicleTransmissionLabel, constraints);
		constraints.gridx = 1;
		constraints.gridy = 4;
		viewPanel.add(vehicleTransmissionManualRadioButton, constraints);
		constraints.gridx = 2;
		constraints.gridy = 4;
		viewPanel.add(vehicleTransmissionAutomaticRadioButton, constraints);
		constraints.gridx = 3;
		constraints.gridy = 4;
		viewPanel.add(vehicleTransmissionEVRadioButton, constraints);
		
		vehicleTransmissionButtonGroup.add(vehicleTransmissionManualRadioButton);
		vehicleTransmissionButtonGroup.add(vehicleTransmissionAutomaticRadioButton);
		vehicleTransmissionButtonGroup.add(vehicleTransmissionEVRadioButton);

		constraints.gridx = 0;
		constraints.gridy = 5;
		viewPanel.add(vehicleDriveLabel, constraints);
		constraints.gridx = 1;
		constraints.gridy = 5;
		viewPanel.add(vehicleDriveFWDRadioButton, constraints);
		constraints.gridx = 2;
		constraints.gridy = 5;
		viewPanel.add(vehicleDriveRWDRadioButton, constraints);
		constraints.gridx = 3;
		constraints.gridy = 5;
		viewPanel.add(vehicleDriveAWDRadioButton, constraints);

		vehicleDriveButtonGroup.add(vehicleDriveFWDRadioButton);
		vehicleDriveButtonGroup.add(vehicleDriveRWDRadioButton);
		vehicleDriveButtonGroup.add(vehicleDriveAWDRadioButton);

		constraints.gridx = 0;
		constraints.gridy = 6;
		viewPanel.add(vehicleSafetyFeaturesLabel, constraints);
		constraints.gridx = 1;
		constraints.gridy = 6;
		viewPanel.add(vehicleAirBagsCheckBox, constraints);
		constraints.gridx = 2;
		constraints.gridy = 6;
		viewPanel.add(vehicleABSCheckBox, constraints);
		constraints.gridx = 3;
		constraints.gridy = 6;
		viewPanel.add(vehicleRearViewCameraCheckBox, constraints);

		constraints.gridx = 0;
		constraints.gridy = 7;
		viewPanel.add(vehicleGradeLabel, constraints);
		constraints.gridx = 1;
		constraints.gridy = 7;
		viewPanel.add(vehicleGradeEconomyRadioButton, constraints);
		constraints.gridx = 2;
		constraints.gridy = 7;
		viewPanel.add(vehicleGradeStandardRadioButton, constraints);
		constraints.gridx = 3;
		constraints.gridy = 7;
		viewPanel.add(vehicleGradePerformanceRadioButton, constraints);

		vehicleGradeButtonGroup.add(vehicleGradeEconomyRadioButton);
		vehicleGradeButtonGroup.add(vehicleGradeStandardRadioButton);
		vehicleGradeButtonGroup.add(vehicleGradePerformanceRadioButton);

		constraints.gridx = 0;
		constraints.gridy = 8;
		viewPanel.add(vehicleMileageLabel, constraints);
		constraints.gridx = 1;
		constraints.gridy = 8;
		viewPanel.add(vehicleMileageTextField, constraints);

		constraints.gridx = 2;
		constraints.gridy = 8;
		viewPanel.add(vehiclePreviousOwnersCheckBox, constraints);
		constraints.gridx = 3;
		constraints.gridy = 8;
		viewPanel.add(vehiclePreviousOwnersTextField, constraints);
		vehiclePreviousOwnersTextField.setEnabled(false);

		constraints.gridx = 0;
		constraints.gridy = 9;
		viewPanel.add(vehicleLuxuryFeaturesLabel, constraints);
		constraints.gridx = 1;
		constraints.gridy = 9;
		viewPanel.add(vehicleKeylessEntryCheckBox, constraints);
		constraints.gridx = 2;
		constraints.gridy = 9;
		viewPanel.add(vehiclePremiumSoundCheckBox, constraints);
		constraints.gridx = 3;
		constraints.gridy = 9;
		viewPanel.add(vehicleGPSNavigationCheckBox, constraints);

		constraints.gridx = 0;
		constraints.gridy = 10;
		viewPanel.add(vehicleClassLabel, constraints);
		constraints.gridx = 1;
		constraints.gridy = 10;
		viewPanel.add(vehicleClassUtilityRadioButton, constraints);
		constraints.gridx = 2;
		constraints.gridy = 10;
		viewPanel.add(vehicleClassSportRadioButton, constraints);
		constraints.gridx = 3;
		constraints.gridy = 10;
		viewPanel.add(vehicleClassLuxuryRadioButton, constraints);

		vehicleClassButtonGroup.add(vehicleClassUtilityRadioButton);
		vehicleClassButtonGroup.add(vehicleClassSportRadioButton);
		vehicleClassButtonGroup.add(vehicleClassLuxuryRadioButton);

		constraints.gridx = 0;
		constraints.gridy = 11;
		viewPanel.add(vehicleCommissionRateLabel, constraints);
		constraints.gridx = 1;
		constraints.gridy = 11;
		viewPanel.add(vehicleCommissionRateTextField, constraints);
		constraints.gridx = 2;
		constraints.gridy = 11;
		viewPanel.add(vehicleAccidentHistoryCheckBox, constraints);

		constraints.gridx = 1;
		constraints.gridy = 12;
		viewPanel.add(vehicleGenerateAdButton, constraints);
		constraints.gridx = 2;
		constraints.gridy = 12;
		viewPanel.add(vehicleSaveButton, constraints);

		constraints.gridx = 0;
		constraints.gridy = 13;
		constraints.gridwidth = 4;
		constraints.gridheight = 6;
		constraints.fill = GridBagConstraints.BOTH;
		viewPanel.add(vehicleAdvertisementTextArea, constraints);
		vehicleAdvertisementTextArea.setLineWrap(true);
		vehicleAdvertisementTextArea.setWrapStyleWord(true);
		vehicleAdvertisementTextArea.setVisible(false);

		this.add(viewPanel);
	}

	public void clearProject() {
		vehicleNameTextField.setText("");
		vehicleMakeTextField.setText("");
		vehicleModelTextField.setText("");
		vehicleBaseCostTextField.setText("");
		vehicleYearTextField.setText("");
		vehicleTransmissionButtonGroup.clearSelection();
		vehicleDriveButtonGroup.clearSelection();
		vehicleAirBagsCheckBox.setSelected(false);
		vehicleABSCheckBox.setSelected(false);
		vehicleRearViewCameraCheckBox.setSelected(false);
		vehicleGradeButtonGroup.clearSelection();
		vehicleMileageTextField.setText("");
		vehiclePreviousOwnersCheckBox.setSelected(false);
		vehiclePreviousOwnersTextField.setEnabled(false);
		vehiclePreviousOwnersTextField.setText("");
		vehicleKeylessEntryCheckBox.setSelected(false);
		vehiclePremiumSoundCheckBox.setSelected(false);
		vehicleGPSNavigationCheckBox.setSelected(false);
		vehicleClassButtonGroup.clearSelection();
		vehicleAccidentHistoryCheckBox.setSelected(false);
		vehicleCommissionRateTextField.setText("");
		vehicleAdvertisementTextArea.setText("");
		vehicleAdvertisementTextArea.setVisible(false);
	}

	public String getVehicleName() {
		return vehicleNameTextField.getText();
	}

	public String getVehicleMake() {
		return vehicleMakeTextField.getText();
	}

	public String getVehicleModel() {
		return vehicleModelTextField.getText();
	}

	public double getVehicleBaseCost() {
		return Double.parseDouble(vehicleBaseCostTextField.getText());
	}

	public int getVehicleYear() {
		return Integer.parseInt(vehicleYearTextField.getText());
	}

	public String getVehicleTransmission() {
		if (vehicleTransmissionManualRadioButton.isSelected()) {
			return "Manual";
		} else if (vehicleTransmissionAutomaticRadioButton.isSelected()) {
			return "Automatic";
		} else if (vehicleTransmissionEVRadioButton.isSelected()) {
			return "EV";
		}
		return null;
	}

	public String getVehicleDrive() {
		if (vehicleDriveFWDRadioButton.isSelected()) {
			return "Front-Wheel Drive";
		} else if (vehicleDriveRWDRadioButton.isSelected()) {
			return "Rear-Wheel Drive";
		} else if (vehicleDriveAWDRadioButton.isSelected()) {
			return "All-Wheel Drive";
		}
		return null;
	}

	public boolean getVehicleAirBags() {
		return vehicleAirBagsCheckBox.isSelected();
	}

	public boolean getVehicleABS() {
		return vehicleABSCheckBox.isSelected();
	}

	public boolean getVehicleRearViewCamera() {
		return vehicleRearViewCameraCheckBox.isSelected();
	}

	public String getVehicleGrade() {
		if (vehicleGradeEconomyRadioButton.isSelected()) {
			return "Economy";
		} else if (vehicleGradeStandardRadioButton.isSelected()) {
			return "Standard";
		} else if (vehicleGradePerformanceRadioButton.isSelected()) {
			return "Performance";
		}
		return null;
	}

	public int getVehicleMileage() {
		return Integer.parseInt(vehicleMileageTextField.getText());
	}

	public boolean getVehiclePreviousOwnersEnabled() {
		 if (vehiclePreviousOwnersCheckBox.isSelected()) {
			 return true;
		 } else {
			 return false;
		 }
	}

	public int getVehiclePreviousOwners() {
		if (vehiclePreviousOwnersCheckBox.isSelected()) {
			return Integer.parseInt(vehiclePreviousOwnersTextField.getText());
		}
		return 0;
	}

	public boolean getVehicleKeylessEntry() {
		return vehicleKeylessEntryCheckBox.isSelected();
	}

	public boolean getVehiclePremiumSound() {
		return vehiclePremiumSoundCheckBox.isSelected();
	}

	public boolean getVehicleGPSNavigation() {
		return vehicleGPSNavigationCheckBox.isSelected();
	}

	public String getVehicleClass() {
		if (vehicleClassUtilityRadioButton.isSelected()) {
			return "Utility";
		} else if (vehicleClassSportRadioButton.isSelected()) {
			return "Sport";
		} else if (vehicleClassLuxuryRadioButton.isSelected()) {
			return "Luxury";
		}
		return null;
	}

	public boolean getVehicleAccidentHistory() {
		if (vehicleAccidentHistoryCheckBox.isSelected()) {
			return true;
		}
		return false;
	}

	public double getVehicleCommissionRate() {
		return Double.parseDouble(vehicleCommissionRateTextField.getText()) / 100;
	}

	public String getVehicleAdvertisement() {
		return vehicleAdvertisementTextArea.getText();
	}

	public void setVehicleName(String vehicleName) {
		vehicleNameTextField.setText(vehicleName);
	}

	public void setVehicleMake(String vehicleMake) {
		vehicleMakeTextField.setText(vehicleMake);
	}

	public void setVehicleModel(String vehicleModel) {
		vehicleModelTextField.setText(vehicleModel);
	}

	public void setVehicleBaseCost(Double vehicleBaseCost) {
		vehicleBaseCostTextField.setText(String.valueOf(vehicleBaseCost));
	}

	public void setVehicleYear(int vehicleYear) {
		vehicleYearTextField.setText(String.valueOf(vehicleYear));
	}

	public void setVehicleTransmission(String vehicleTransmission) {
		if (vehicleTransmission.equals("Automatic")) {
			vehicleTransmissionAutomaticRadioButton.doClick();;
		} else if (vehicleTransmission.equals("EV")) {
			vehicleTransmissionEVRadioButton.doClick();
		} else {
			vehicleTransmissionManualRadioButton.doClick();
		}
	}

	public void setVehicleDrive(String vehicleDrive) {
		if (vehicleDrive.equals("Rear-Wheel Drive")) {
			vehicleDriveRWDRadioButton.doClick();;
		} else if (vehicleDrive.equals("All-Wheel Drive")) {
			vehicleDriveAWDRadioButton.doClick();
		} else {
			vehicleDriveFWDRadioButton.doClick();
		}
	}

	public void setVehicleAirBags(boolean vehicleAirBags) {
		if (vehicleAirBags) {
			vehicleAirBagsCheckBox.doClick();
		} else {
			vehicleAirBagsCheckBox.doClick();
		}
	}

	public void setVehicleABS(boolean vehicleABS) {
		if (vehicleABS) {
			vehicleABSCheckBox.doClick();
		} else {
			vehicleABSCheckBox.doClick();
		}
	}

	public void setVehicleRearViewCamera(boolean vehicleRearViewCamera) {
		if (vehicleRearViewCamera) {
			vehicleRearViewCameraCheckBox.doClick();
		} else {
			vehicleRearViewCameraCheckBox.doClick();
		}
	}

	public void setVehicleGrade(String vehicleGrade) {
		if (vehicleGrade.equals("Standard")) {
			vehicleGradeStandardRadioButton.doClick();
		} else if (vehicleGrade.equals("Performance")) {
			vehicleGradePerformanceRadioButton.doClick();
		} else {
			vehicleGradeEconomyRadioButton.doClick();
		}
	}

	public void setVehicleMileage(int vehicleMileage) {
		vehicleMileageTextField.setText(String.valueOf(vehicleMileage));
	}

	public void setVehiclePreviousOwnersEnabled(boolean vehiclePreviousOwners) {
		vehiclePreviousOwnersCheckBox.setSelected(vehiclePreviousOwners);
		vehiclePreviousOwnersTextField.setEnabled(vehiclePreviousOwners);
	}

	public void setVehiclePreviousOwners(int vehiclePreviousOwners) {
		vehiclePreviousOwnersTextField.setText(String.valueOf(vehiclePreviousOwners));
		if (vehiclePreviousOwners != 0) {
			setVehiclePreviousOwnersEnabled(true);
		} else {
			setVehiclePreviousOwnersEnabled(false);
		}
	}

	public void setVehicleKeylessEntry(boolean vehicleKeylessEntry) {
		if (vehicleKeylessEntry) {
			vehicleKeylessEntryCheckBox.doClick();
		} else {
			vehicleKeylessEntryCheckBox.doClick();
		}
	}

	public void setVehiclePremiumSound(boolean vehiclePremiumSound) {
		if (vehiclePremiumSound) {
			vehiclePremiumSoundCheckBox.doClick();
		} else {
			vehiclePremiumSoundCheckBox.doClick();
		}
	}

	public void setVehicleGPSNavigation(boolean vehicleGPSNavigation) {
		if (vehicleGPSNavigation) {
			vehicleGPSNavigationCheckBox.doClick();
		} else {
			vehicleGPSNavigationCheckBox.doClick();
		}
	}

	public void setVehicleClass(String vehicleClass) {
		if (vehicleClass.equals("Sport")) {
			vehicleClassSportRadioButton.doClick();
		} else if (vehicleClass.equals("Luxury")) {
			vehicleClassLuxuryRadioButton.doClick();
		} else {
			vehicleClassUtilityRadioButton.doClick();
		}
	}

	public void setVehicleAccidentHistory(boolean vehicleAccidentHistory) {
		if (vehicleAccidentHistory) {
			vehicleAccidentHistoryCheckBox.doClick();
		} else {
			vehicleAccidentHistoryCheckBox.doClick();
		}
	}

	public void setVehicleCommissionRate(double vehicleCommissionRate) {
		vehicleCommissionRateTextField.setText(String.valueOf(vehicleCommissionRate * 100));
	}

	public void setVehicleAdvertisement(String vehicleAdvertisement) {
		vehicleAdvertisementTextArea.setVisible(true);
		vehicleAdvertisementTextArea.setText(vehicleAdvertisement);
		if (vehicleAdvertisement.isEmpty()) {
			vehicleAdvertisementTextArea.setVisible(false);
		}
	}

	void vehiclePreviousOwnersCheckBoxListener(ActionListener listener) {
		vehiclePreviousOwnersCheckBox.addActionListener(listener);
	}
	
	void vehicleGenerateAdButtonListener(ActionListener listener) {
		vehicleGenerateAdButton.addActionListener(listener);
	}

	void vehicleNewButtonListener(ActionListener listener) {
		vehicleNewButton.addActionListener(listener);
	}

	void vehicleSaveButtonListener(ActionListener listener) {
		vehicleSaveButton.addActionListener(listener);
	}

	void vehicleLoadButtonListener(ActionListener listener) {
		vehicleLoadButton.addActionListener(listener);
	}

	void displayAlert(String alert) {
		JOptionPane.showMessageDialog(this, alert);
	}
}