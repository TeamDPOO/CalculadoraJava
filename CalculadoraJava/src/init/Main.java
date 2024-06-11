package init;

import gui.mainframes.MainApp;

import java.awt.EventQueue;

public class Main {

	public static void main(String[] args) {
		
	/**
	* Launch main frame.
	*/
	EventQueue.invokeLater(new Runnable() {
		public void run() {
			try {
				MainApp frame = new MainApp();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
	});
	
	
	}

}
