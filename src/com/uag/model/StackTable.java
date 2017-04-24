package com.uag.model;

import java.util.ArrayList;

public class StackTable {

	private ArrayList<AddressBookVO> elements;
	
	public StackTable(){
		elements = new ArrayList<AddressBookVO>();
	}
	
	public void addElement(AddressBookVO element)
	{	
		this.elements.add(element);
	}
	
	public void removeElement(int indexElement){
		this.elements.remove(indexElement);
	}
	
	public ArrayList<AddressBookVO> getStackAddresBookObject(){
		return this.elements;
	}

	public int getIndexElement(String name){
		for(int i=0; i < this.elements.size(); i++){
			if(this.elements.get(i).getName().contains(name)){
				return i;
			}
		}
		return -1;
	}
	
	public AddressBookVO getElement(int element)
	{
		return this.elements.get(element);
	}
}
