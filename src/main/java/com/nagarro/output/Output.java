package com.nagarro.output;

import java.util.ArrayList;

import com.nagarro.model.Product;

public class Output {

//	public void search(ArrayList<ArrayList<Product>> prod, String colour, String size, String gender, int output) {
//
//		ArrayList<Product> p = new ArrayList<>();
//		prod.forEach((arrayList) -> {
//			arrayList
//					.stream().filter((item) -> item.getColour().equalsIgnoreCase(colour)
//							&& item.getSize().equalsIgnoreCase(size) && item.getGender().equalsIgnoreCase(gender))
//					.forEach((item) -> p.add(item));

//			arrayList.forEach((item) -> {
//				if (item.getColour().equalsIgnoreCase(colour) && item.getSize().equalsIgnoreCase(size)
//						&& item.getGender().equalsIgnoreCase(gender)) {
//					p.add(item);
//				}
//			});

//		});
//
//		outpref(p, output);
//	}
//
//	@SuppressWarnings("unchecked")
//	public void outpref(ArrayList<Product> p, int output) {

//		if (output == 1) {
//			Collections.sort(p, new Comparator<Product>() {
//				public int compare(Product o1, Product o2) {
//					return Float.compare(o1.getPrice(), o2.getPrice());
//				}
//			});
//			System.out.println("\nSorted by Price");
//			for (int i = 0; i < p.size(); i++) {
//				System.out.print(" " + p.get(i).getId());
//				System.out.print("\t |\t" + p.get(i).getName());
//				System.out.print("\t |\t" + p.get(i).getColour());
//				System.out.print("\t |\t" + p.get(i).getGender());
//				System.out.print("\t |\t" + p.get(i).getSize());
//				System.out.print("\t |\t" + p.get(i).getPrice());
//				System.out.print("\t |\t" + p.get(i).getRating());
//				System.out.print("\t |\t" + p.get(i).getAvailability());
//				System.out.println("\n");
//			}
//		} else if (output == 2) {
//			Collections.sort(p, new Comparator<Product>() {
//				public int compare(Product o1, Product o2) {
//					return Float.compare(o1.getRating(), o2.getRating());
//				}
//			});
//			System.out.println("\nSorted by Rating");
//			for (int i = 0; i < p.size(); i++) {
//				System.out.print(" " + p.get(i).getId());
//				System.out.print("\t |\t" + p.get(i).getName());
//				System.out.print("\t |\t" + p.get(i).getColour());
//				System.out.print("\t |\t" + p.get(i).getGender());
//				System.out.print("\t |\t" + p.get(i).getSize());
//				System.out.print("\t |\t" + p.get(i).getPrice());
//				System.out.print("\t |\t" + p.get(i).getRating());
//				System.out.print("\t |\t" + p.get(i).getAvailability());
//				System.out.println("\n");
//			}
//		} else if (output == 3) {
//			Collections.sort(p, new Comparator() {
//
//				public int compare(Object o1, Object o2) {
//
//					Float y1 = ((Product) o1).getPrice();
//					Float y2 = ((Product) o2).getPrice();
//					int sComp = y1.compareTo(y2);
//
//					if (sComp != 0) {
//						return sComp;
//					}
//
//					Float x1 = ((Product) o1).getRating();
//					Float x2 = ((Product) o2).getRating();
//					return x1.compareTo(x2);
//				}
//			});
//			System.out.println("\nSorted by Rating and Price");
//			for (int i = 0; i < p.size(); i++) {
//				System.out.print(" " + p.get(i).getId());
//				System.out.print("\t |\t" + p.get(i).getName());
//				System.out.print("\t |\t" + p.get(i).getColour());
//				System.out.print("\t |\t" + p.get(i).getGender());
//				System.out.print("\t |\t" + p.get(i).getSize());
//				System.out.print("\t |\t" + p.get(i).getPrice());
//				System.out.print("\t |\t" + p.get(i).getRating());
//				System.out.print("\t |\t" + p.get(i).getAvailability());
//				System.out.println("\n");
//			}
//
//		} else {
//			System.out.print("Wrong Choice");
//		}
//	}
	public static void display(ArrayList<Product> p) {
		System.out.println();
		for (int i = 0; i < p.size(); i++) {
			System.out.print(" " + p.get(i).getId());
			System.out.print("\t |\t" + p.get(i).getName());
			System.out.print("\t |\t" + p.get(i).getColour());
			System.out.print("\t |\t" + p.get(i).getGender());
			System.out.print("\t |\t" + p.get(i).getSize());
			System.out.print("\t |\t" + p.get(i).getPrice());
			System.out.print("\t |\t" + p.get(i).getRating());
			System.out.print("\t |\t" + p.get(i).getAvailability());
			System.out.println("\n");
		}
	}
}
