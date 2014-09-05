package com.evon.htmlparser;

public interface IDocument {

	public abstract IElements select(String cssQuery);
	public abstract String text();

}