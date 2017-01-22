package com.coderkonnect.experimentation;

import java.io.IOException;
import java.util.Arrays;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

public class SampleDisplaysAllDataOfJson {

	public static void main(String[] args) throws JsonParseException, IOException {

		System.out.println("Main");
		String inputString = "{ \"emp_no\":101,\"name\":\"John\"}";

		JsonFactory factory = new JsonFactory();
		JsonParser parser = factory.createParser(inputString);
		parser.nextToken();
		int i = 0;
		while (parser.hasCurrentToken()) {
			i++;
			JsonToken tt1 = parser.currentToken();
				System.out.println(tt1.name() +tt1.isScalarValue());
			parser.nextToken();
		}

		System.out.println(i);
		/*
		 * System.out.println(parser.getCurrentToken());
		 * System.out.println(parser.hasCurrentToken());
		 * 
		 * System.out.println(parser.canReadObjectId());
		 * 
		 * System.out.println(parser.getValueAsString());
		 * System.out.println(parser.getCurrentName());
		 * 
		 * parser.nextToken();
		 * 
		 * System.out.println(parser.getValueAsString());
		 * System.out.println(parser.getCurrentName()); //
		 * displayAllValuesFromJsonString(new //
		 * JsonParser().parse(inputString).getAsJsonObject());
		 * 
		 */

	}

}
