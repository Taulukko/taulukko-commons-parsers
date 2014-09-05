package com.evon.htmlparser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Entities.EscapeMode;

public class HTMLParser {

	private static boolean NOT_USE_HTML_ENCODE = true;

	public static IDocument parse(String s) {
		org.jsoup.nodes.Document doc = Jsoup.parse(s);
		
		if (NOT_USE_HTML_ENCODE) {
			doc.outputSettings().escapeMode(EscapeMode.xhtml);
		}

		return new Document(doc);
	}

}
