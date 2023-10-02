package com.nagarro.controller;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.nagarro.model.Product;
import com.nagarro.output.Output;
import com.opencsv.CSVReader;

public class MainController {
	public static Map<String, ArrayList<Product>> mainmap =null;

	public void parseCSVFileLineByLine() throws IOException {
		File dir = new File(
				"C:\\Users\\shubhanshusharma01\\eclipse-workspace\\advancejava1\\src\\main\\resources\\Assigment Links\\");
		File[] file = dir.listFiles();

		MainController.mainmap = new HashMap<>();
//		System.out.print("reading");
		for (File f : file) {
	//		System.out.print(f.getName());
			CSVReader reader = new CSVReader(new FileReader((f.getAbsolutePath())), '|');

			String[] record = null;
			reader.readNext();

			while ((record = reader.readNext()) != null) {
				Product p = new Product();
				String str = Utility.joinstring(record[2] + "_", record[4] + "_", record[3] + "_");
				p.setId(record[0]);
				p.setName(record[1]);
				p.setColour(record[2]);
				p.setGender(record[3]);
				p.setSize(record[4]);
				p.setPrice(Float.parseFloat(record[5]));
				p.setRating(Float.parseFloat(record[6]));
				p.setAvailability(record[7]);
			//	System.out.print("reading");
				if (MainController.mainmap.containsKey(str)) {
					MainController.mainmap.get(str).add(p);
				} else {
					List<Product> l = new ArrayList<>();
					l.add(p);
					MainController.mainmap.put(str, (ArrayList<Product>) l);
				}

			}
		//	System.out.println(MainController.mainmap);

			reader.close();
			
		}
	//	return MainController.mainmap;
	}

	public static void search(String colour, String size, String gender, int output) {
		String str = Utility.joinstring(colour + "_", size + "_", gender + "_");
		System.out.println(str);
	//	MainController m= new MainController();
		System.out.print(MainController.mainmap);
		ArrayList<Product> pro = new ArrayList<>();
		for (Entry<String, ArrayList<Product>> x : MainController.mainmap.entrySet()) {
			if (x.getKey().equalsIgnoreCase(str)) {
				pro.addAll(x.getValue());
			}
		}
		if (pro.size() == 0) {
			return;
		} else {
			sortacc(pro, output);
		}
	}

	public static void sortacc(ArrayList<Product> p, int output) {
		if (output == 1) {
			Collections.sort(p, new Comparator<Product>() {
				public int compare(Product o1, Product o2) {
					return Float.compare(o1.getPrice(), o2.getPrice());
				}
			});

			Output.display(p);
		} else if (output == 2) {
			Collections.sort(p, new Comparator<Product>() {

				public int compare(Product o1, Product o2) {
					return Float.compare(o2.getRating(), o1.getRating());
				}
			});
			Output.display(p);
		} else if (output == 3) {
			Collections.sort(p, new Comparator<Product>() {

				public int compare(Product o1, Product o2) {

					Float y1 = ((Product) o1).getPrice();
					Float y2 = ((Product) o2).getPrice();
					int sComp = y1.compareTo(y2);
					if (sComp != 0) {
						return sComp;
					}
					Float x1 = ((Product) o1).getRating();
					Float x2 = ((Product) o2).getRating();
					return x1.compareTo(x2);
				}
			});
			Output.display(p);
		}
	}
}
