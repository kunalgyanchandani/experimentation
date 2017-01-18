package com.coderkonnect.experimentation;

import net.minidev.json.JSONObject;
import net.minidev.json.parser.JSONParser;
import net.minidev.json.parser.ParseException;

public class SampleDisplaysAllDataOfJson {

	public static void main(String[] args) throws ParseException {

		System.out.println("Main");
		String inputString = "{ 'emp_no':101, 'name':'John', 'roles':['DBA','PM','Volunteer'] }";

		JSONParser parser = new JSONParser(JSONParser.MODE_PERMISSIVE);
		JSONObject data = (JSONObject) parser.parse(inputString);

		displayAllValuesFromJsonString(data);
	}

	private static void displayAllValuesFromJsonString(JSONObject data) {
		data.values().stream().forEach(action -> {
			System.out.println(action);
		});
	}
}
