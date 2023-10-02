package com.nagarro.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.StringJoiner;

import com.nagarro.model.Product;

public class Utility {

	public static String joinstring(String a, String b, String c) {
		StringJoiner joiner = new StringJoiner("");
		joiner.add(a).add(b).add(c);
		String joinedString = joiner.toString();
		return joinedString;
	}
}
