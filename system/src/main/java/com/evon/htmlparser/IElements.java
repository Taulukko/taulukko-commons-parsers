package com.evon.htmlparser;
 

public interface IElements {

	public abstract IElement get(int index);

	public abstract int size();

	public abstract IElements select(String query);

}