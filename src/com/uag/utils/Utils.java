package com.uag.utils;

import java.util.ArrayList;
import java.util.Collections;

import com.uag.model.AddressBookVO;
import com.uag.model.StackTable;

public class Utils {

	private StackTable[] stackTable;
	private int hashPosition=-1, indexPosition=-1;
	private boolean foundElement;
	private AddressBookVO elementAddressFound;
	
	public Utils(StackTable[] stackTable){
		this.stackTable = stackTable;
		this.foundElement = false;
	}
	
	private void printElementByStack(int stack)
	{	
		if(stack < stackTable.length)
		{
			ArrayList<AddressBookVO> elementsStack = this.stackTable[stack].getStackAddresBookObject();
			for(AddressBookVO element : elementsStack){
				System.out.println("Position [" + stack + "] element: " + element.getName() + ", ID: " + element.hashCode());
			}
			
		} else {
			System.err.println("Does not exists this position on the Hashtable");
		}
	}
	
	public AddressBookVO getFoundElement(){
		return this.elementAddressFound;
	}
	
	public boolean foundElement(){
		return this.foundElement;
	}
	
	public int getHashPosition(){
		return this.hashPosition;
	}
	
	public int getIndexPosition(){
		return this.indexPosition;
	}
	
	public void printHashTable()
	{	
		for(int i=0; i < stackTable.length; i++){
			System.out.println("--> Elements on HashPosition [" + i + "]: ");
			printElementByStack(i);
			System.out.println();
		}
	}
	
	public Utils findElementByName(String name)
	{
		this.foundElement = false;
		this.hashPosition = -1;
		this.indexPosition = -1;
		
		for(StackTable stack : this.stackTable)
		{		
			for(AddressBookVO address : stack.getStackAddresBookObject())
			{	
				if(address.getName().contains(name))
				{	
					this.elementAddressFound = address;
					foundElement = true;
					break;
				}
			}
			if(foundElement)
				break;
		}
		
		if(foundElement){
			this.hashPosition = this.elementAddressFound.getHashValue();
			this.indexPosition = stackTable[this.hashPosition].getIndexElement(name);
		}
		return this;
	}
	
	public boolean deleteElementByName(String name){
		
		if(findElementByName(name).foundElement())
		{	
			// To get the index position you need yo call the findElementByName and Also foundElement
			this.stackTable[ getHashPosition() ].removeElement( getIndexPosition() );
			return true;
		}
		return false;
	}
	
	public void balanceHashTree()
	{
		for(int i=0; i < stackTable.length; i++)
		{
			ArrayList<AddressBookVO> elementHash = stackTable[i].getStackAddresBookObject();
			Collections.sort(elementHash);	
		}
	}
}
