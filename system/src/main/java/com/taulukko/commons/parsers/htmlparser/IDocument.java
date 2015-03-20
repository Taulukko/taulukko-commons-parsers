package com.taulukko.commons.parsers.htmlparser;

public interface IDocument {

	public abstract IElements select(String cssQuery);
	public abstract String text();

}