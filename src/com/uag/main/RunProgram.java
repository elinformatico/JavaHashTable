package com.uag.main;

import com.uag.model.AddressBookVO;
import com.uag.utils.Utils;

public class RunProgram {

	public static void main(String[] args) {
		
		HashTable hash = new HashTable();
		
		// Adding values
		hash.addAddressElement(new AddressBookVO("Jose Noe Hernandez Vivanco", "This is the Address", "+5233457851"));
		hash.addAddressElement(new AddressBookVO("Antonio de las Calandrias", "This is the Address", "+5254854574"));
		hash.addAddressElement(new AddressBookVO("Maria Antonieta de la Flores", "La vecindad del chavo del 8", "Mexico"));
		hash.addAddressElement(new AddressBookVO("Armando Perez", "", ""));
		hash.addAddressElement(new AddressBookVO("Alejandro Cazares Diaz", "", ""));
		hash.addAddressElement(new AddressBookVO("Anita Lava la Tina", "", ""));
		hash.addAddressElement(new AddressBookVO("James Bond Cero Cero siete", "", ""));
		hash.addAddressElement(new AddressBookVO("Arnold el de la pelicula", "", ""));
		hash.addAddressElement(new AddressBookVO("Paquita la del Barrio", "", ""));
		hash.addAddressElement(new AddressBookVO("Paquita la del Barrio", "", ""));
		hash.addAddressElement(new AddressBookVO("Paquita la del Barrio", "", ""));
		hash.addAddressElement(new AddressBookVO("Paquita la del Barrio", "", ""));
		hash.addAddressElement(new AddressBookVO("Paquita la del Barrio", "", ""));
		hash.addAddressElement(new AddressBookVO("Paquita la del Barrio", "", ""));
		hash.addAddressElement(new AddressBookVO("Marimar de la Plaza", "", ""));
		hash.addAddressElement(new AddressBookVO("Juan de las Pitayas", "", ""));
		hash.addAddressElement(new AddressBookVO("El Señor Mofles", "", ""));
		hash.addAddressElement(new AddressBookVO("Don Tachas", "", ""));
		hash.addAddressElement(new AddressBookVO("Cesar Costa Lazos", "", ""));
		hash.addAddressElement(new AddressBookVO("Benito Camelo", "", ""));
		hash.addAddressElement(new AddressBookVO("Alejandra Silva de Alegria", "", ""));
		hash.addAddressElement(new AddressBookVO("Juan del hoyo perez", "", ""));
		hash.addAddressElement(new AddressBookVO("Predito fernandez", "", ""));
		hash.addAddressElement(new AddressBookVO("Victoria Soriano", "", ""));
		hash.addAddressElement(new AddressBookVO("Pedro Paramo", "", ""));
		hash.addAddressElement(new AddressBookVO("Angelina Fernandez Gonzales", "", ""));
		hash.addAddressElement(new AddressBookVO("Evelyn Fletes", "", ""));
		
		// Print the HashTable
		hash.getUtils().printHashTable();
		
		// Balance the results
		hash.getUtils().balanceHashTree();
		System.out.println("\n--------------- After balance tree for each hash index  \n");
		hash.getUtils().printHashTable();
		
		// --------------------------------------------------------------------------------------
		// Find a element
		Utils findElement = hash.getUtils().findElementByName("Victoria Soriano");
		if(findElement.foundElement()){
			
			AddressBookVO addressElement = findElement.getFoundElement();
			System.out.println("The address element: [" + addressElement.getName() + "] "
					+ "was located on hash position[" + findElement.getHashPosition() + ", " 
					+ findElement.getIndexPosition() + "]");
		} else {
			System.err.println("The element was not found on the HashTable");
		}
	
		// --------------------------------------------------------------------------------------
		// Delete a Element
		hash.getUtils().deleteElementByName("Don Tachas");
		System.out.println("\n------------------ afert deleting the element: \n");
		hash.getUtils().printHashTable();

		hash.getUtils().deleteElementByName("Predito fernandez");
		System.out.println("------------------ afert deleting the element: \n");
		hash.getUtils().printHashTable();
		
		// --------------------------------------------------------------------------------------
		
	}
}
