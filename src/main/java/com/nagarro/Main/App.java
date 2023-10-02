package com.nagarro.Main;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.nagarro.ProductController;
import com.nagarro.ProductModel;
import com.nagarro.controller.CsvReader;
import com.nagarro.controller.MainController;
import com.nagarro.model.*;
import com.opencsv.CSVReader;

public class App {

	public static void main(String[] args) throws IOException {
		Threadforreading R1 = new Threadforreading();
		Thread x = new Thread(R1);
		x.start();
		try (Scanner sc = new Scanner(System.in)) {
			Input i = new Input();
			i.inputdata(sc);
		}
	}
}
