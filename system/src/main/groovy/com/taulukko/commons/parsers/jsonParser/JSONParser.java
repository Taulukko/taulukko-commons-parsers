package com.taulukko.commons.parsers.jsonParser;

import java.util.function.BiFunction;
import java.util.function.Function;

import com.google.gson.Gson;

public class JSONParser {

	private static Gson gson = new Gson();

	private static BiFunction<String, Class<?>, Object> converter ;
	private static Function<Object, String> unconverter;

	static {
		converter = JSONParser::converterDefault;
		unconverter = (object) -> gson.toJson(object);

	}

	private JSONParser() {
	}

	static <T> T convert(String json, Class<T> classOfT) {
		return classOfT.cast( converter.apply(json,  classOfT));
	}

	public static <T> T converterDefault(String json, Class<T> classOfT) {
		return  gson.fromJson(json, classOfT);
	}

	static String unconvert(Object o) {
		return unconverter.apply(o);
	}
}
