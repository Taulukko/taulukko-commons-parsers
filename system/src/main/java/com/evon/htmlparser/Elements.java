package com.evon.htmlparser;

public class Elements implements IElements {
	private org.jsoup.select.Elements elements;

	public Elements(org.jsoup.select.Elements elements) {
		this.elements = elements;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.evon.htmlparser.IElements#get(int)
	 */
	@Override
	public IElement get(int index) {
		org.jsoup.nodes.Element element = elements.get(index);
		IElement ret = new Element(element);
		return ret;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.evon.htmlparser.IElements#size()
	 */
	@Override
	public int size() {
		return elements.size();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.evon.htmlparser.IElements#select(java.lang.String)
	 */
	@Override
	public IElements select(String query) {
		org.jsoup.select.Elements e = elements.select(query);
		Elements ret = new Elements(e);
		return ret;
	}
}
