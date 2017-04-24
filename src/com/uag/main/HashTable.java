package com.uag.main;

import com.uag.model.AddressBookVO;
import com.uag.model.StackTable;
import com.uag.utils.Utils;

public class HashTable {

	private StackTable[] stackTable;
	private Utils utils;
	
	public HashTable() 
	{	
		createStackTable();
		utils = new Utils(this.stackTable);
	}
	
	private void createStackTable()
	{
		this.stackTable = new StackTable[5];
		for (int i = 0; i < stackTable.length; i++) {
			this.stackTable[i] = new StackTable();
		}	
	}
	
	public Utils getUtils(){
		return this.utils;
	}
	
	public void addAddressElement(AddressBookVO element)
	{
		// Check if the name not exits in the HashTable
		if(!getUtils().findElementByName(element.getName()).foundElement())
		{
			int hashKey = calculateHashValue(element.getName());
			
			//System.out.println("The hashKey[" + hashKey + "]: " + element.getName());
			element.setHashValue(hashKey);
			this.stackTable[hashKey].addElement(element);
		} else {
			//System.err.println("The element [" + element.getName() + "] cannot be added because exists other element with the same name");
		}	
	}

	/*
	 * This function calculate the hash value
	 * */
	public int calculateHashValue(String value)
	{
		final int prime = this.stackTable.length;
		int key = 0;
		key = (value.length() & 0x7fffffff) % prime; 
		return key;		
	}

}
