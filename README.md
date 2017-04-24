Simple Java Hashtable

# Create the object:
HashTable hash = new HashTable();
		
# To add Elements:
hash.addAddressElement(new AddressBookVO("This is the name", "This is the Address", "This is the Phone"));

# Find a Element
Utils findElement = hash.getUtils().findElementByName("Victoria Soriano");
if(findElement.foundElement()){
	AddressBookVO addressElement = findElement.getFoundElement();
	System.out.println("The address element: [" + addressElement.getName() + "] "
			+ "was located on hash position[" + findElement.getHashPosition() + ", " 
			+ findElement.getIndexPosition() + "]");
} 


# Deleting a Element:
hash.getUtils().deleteElementByName("Don Tachas");

# Show the hash Table
hash.getUtils().printHashTable();

			