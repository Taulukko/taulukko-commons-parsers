package com.taulukko.commons.parsers.jsonParser;

import java.lang.invoke.MethodHandleImpl.BindCaller.T

import com.google.gson.Gson;

public class JSONParser {

	private static Gson gson = new Gson();
	public static Closure converter;
	public static Closure unconverter;

	static {
		converter = { String json,Class<T> classOfT ->
			T ret = gson.fromJson(json, classOfT);
			return ret;
		};
		unconverter = { Object object ->
			return gson.toJson(object);
		};
	}

	private JSONParser() {
	}

	static <T> T convert(String json, Class<T> classOfT) {
		return converter(json,classOfT);
	}

	static String unconvert(Object o) {
		return unconverter(o);
	}
}
