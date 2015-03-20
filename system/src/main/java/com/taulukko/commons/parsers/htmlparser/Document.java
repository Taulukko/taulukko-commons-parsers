package com.taulukko.commons.parsers.htmlparser;

public class Document implements IDocument {

	org.jsoup.nodes.Document doc;

	public IElements select(String cssQuery) {
		org.jsoup.select.Elements elements = doc.select(cssQuery);
		IElements ret = new Elements(elements);
		return ret;
	}

	public Document(org.jsoup.nodes.Document doc) {
		this.doc = doc;
	}
	
	public String text()
	{
		return this.doc.text();
	}

}
