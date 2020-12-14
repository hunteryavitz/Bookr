package com.hunteryavitz.bookr;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class DataStore {

	private static Scanner in = new Scanner(System.in);

	public static boolean fileExists(String file) {
		File mFile = new File(file);
		if (mFile.exists()) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean saveData(String[] data, String file) {
		try (FileWriter writer = new FileWriter(file)) {
			for (int i = 0; i < data.length; i++) {
				writer.write(data[i] + "\n");
			}
			return true;
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
	}

	public static ArrayList<String> loadData(String file) {
		ArrayList<String> data = new ArrayList<>();
		try {
			File mFile = new File(file);
			if (mFile.exists()) {
				in = new Scanner(mFile);
				while (in.hasNextLine()) {
					data.add(in.nextLine());
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return data;
	}
}