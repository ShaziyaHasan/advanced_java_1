package com.nagarro.controller;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

import com.nagarro.model.Product;
import com.opencsv.CSVReader;

public class CsvReader {

//	public void parseCSVFileLineByLine() throws IOException {
//		File dir = new File(
//				"C:\\Users\\shubhanshusharma01\\eclipse-workspace\\advancejava1\\src\\main\\resources\\Assigment Links\\");
//		File[] file = dir.listFiles();
//	//	Map<String, ArrayList<Product>> m = new HashMap<>();
//	//	ArrayList<ArrayList<Product>> x = new ArrayList<ArrayList<Product>>();
//		for (File f : file) {
//			// System.out.println(f.getName());
//			CSVReader reader = new CSVReader(new FileReader((f.getAbsolutePath())), '|');
//
//		//	ArrayList<Product> px = new ArrayList<Product>();
//
//			String[] record = null;
//			reader.readNext();
//
//			while ((record = reader.readNext()) != null) {
//				Product p = new Product();
//				String str = Utility.joinstring(record[2]+"_", record[3]+"_", record[4]+"_");
//				p.setId(record[0]);
//				p.setName(record[1]);
//				p.setColour(record[2]);
//				p.setGender(record[3]);
//				p.setSize(record[4]);
//				p.setPrice(Float.parseFloat(record[5]));
//				p.setRating(Float.parseFloat(record[6]));
//				p.setAvailability(record[7]);
//		//		px.add(p);
//				if (MainController.mainmap.containsKey(str)) {
//					MainController.mainmap.get(str).add(p);
//				} else {
//					List<Product> l = new ArrayList<>();
//					l.add(p);
//					MainController.mainmap.put(str, (ArrayList<Product>) l);
//				}
//				System.out.println(str);
//			}
//			System.out.print(MainController.mainmap);
//		//	x.add(px);
//			
//			reader.close();
//	//	return x;
//	}
//	}
//	public static  void viewProducts(ArrayList<Product> productList)
//    {
//        System.out.println(" \t\t  \t\t  \t\t ***** PRODUCT INFORMATION *****");
//        System.out.println("\t Id\t|\tName\t\t \t\t\t|\tColor\t |\tGender\t |\t Size\t |\tPrice\t |\tRating\t |\tAvailability");
//        for(Product p:productList)
//        {
//        	 System.out.print(" "+p.getId());
//             System.out.print("\t |\t"+p.getName());
//             System.out.print("\t |\t"+p.getColour());
//             System.out.print("\t |\t"+p.getGender());
//             System.out.print("\t |\t"+p.getSize());
//             System.out.print("\t |\t"+p.getPrice());
//             System.out.print("\t |\t"+p.getRating());
//             System.out.print("\t |\t"+p.getAvailability());
//             System.out.println("\n");
//    }     
//    if(productList.isEmpty())
//    {
//        System.out.println("Products Are Not Available.");
//    }
//    }

}