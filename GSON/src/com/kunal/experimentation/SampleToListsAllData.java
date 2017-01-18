package com.kunal.experimentation;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

public class SampleToListsAllData {

	public static void main(String[] args) {

		System.out.println("Main");
		String inputString = "{ 'emp_no':101, 'name':'John', 'roles':['DBA','PM','Volunteer'] }";
		displayAllValuesFromJsonString(new JsonParser().parse(inputString).getAsJsonObject());
	}

	private static void displayAllValuesFromJsonString(JsonElement data) {
		if (data.isJsonNull())
			System.out.println("Error in translating JSON string");
		else if (data.isJsonPrimitive())
			System.out.println("Attribute Value.: " + data);
		else if (data.isJsonArray()) {
			// Array Found, further traversing
			data.getAsJsonArray().forEach(innerdata -> {
				displayAllValuesFromJsonString(innerdata);
			});
		} else if (data.isJsonObject())
			// Object Found
			data.getAsJsonObject().entrySet().stream().forEach(innerdata -> {
				displayAllValuesFromJsonString(data.getAsJsonObject().get(innerdata.getKey().toString()));
			});
		else
			System.out.println("Scenario not possible");
	}
}
