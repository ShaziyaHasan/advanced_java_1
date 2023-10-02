package com.nagarro.Main;

import java.io.IOException;

import com.nagarro.controller.MainController;

class Threadforreading implements Runnable {
	public void run() {
		try {
			while (true) {
				MainController m = new MainController();
				m.parseCSVFileLineByLine();
				Thread.sleep(15000);
			}
		} catch (InterruptedException e) {
			System.out.println(e);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
