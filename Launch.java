package com.hunteryavitz.bookr;

public class Launch {

	public static void main(String[] args) {

		View view = new View();
		Model model = new Model();
		Controller controller = new Controller(view, model);
		view.setVisible(true);
	}

}
