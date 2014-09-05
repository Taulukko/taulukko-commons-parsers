package com.evon.jsonParser;

import com.google.gson.Gson;

public class JSONParser {

	private JSONParser() {
	}

	public static <T> T convert(String json, Class<T> classOfT) {
		Gson gson = new Gson();
		T ret = gson.fromJson(json, classOfT);
		return ret;
	}
}
