package com.hunteryavitz.bookr;

import java.util.ArrayList;

public class DAO {

	private static DAO instance = new DAO();

	private DAO() {}

	public DAO getDAOInstance() {
		return DAO.instance;
	}

	public static ArrayList<String> loadData(String fileName) {
		return DataStore.loadData(fileName);
	}

	public static boolean saveData(String[] data, String fileName) {
		return DataStore.saveData(data, fileName);
	}

	public static boolean fileExists(String fileName) {
		if (DataStore.fileExists(fileName)) {
			return true;
		} else {
			return false;
		}
	}
}