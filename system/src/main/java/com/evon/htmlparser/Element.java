package com.evon.htmlparser;

public class Element implements IElement {
	private org.jsoup.nodes.Element element = null;

	public Element(org.jsoup.nodes.Element element) {
		this.element = element;
	}

	/* (non-Javadoc)
	 * @see com.evon.htmlparser.IElement#html()
	 */
	@Override
	public String html() {
		return element.html();
	}

	
}
