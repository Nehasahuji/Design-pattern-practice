package important_concepts.immutable;

import java.util.HashMap;
import java.util.Map;

// Step 1: Class must be final so that child class can not be created 
public final class Student {
	
	/*
	 * Step 2: All data member must declared as private so that direct access is not allowed
	 * All data member must be final so that we are not able to modify it once object is created
	 */
	
	private final String name; //-> immutable
	private final Integer regNo; // -> immutable
	private final Map<String,String> metaData; //=> mutable
	
	
	
	/*
	 *  Step 4: A parameterized constructor should initialize all the fields performing a deep copy
	 *         so that data members can’t be modified with an object reference.
	*/
	public Student(String name, Integer regNo, Map<String, String> metaData) {
		  
		    this.name = name;
	        this.regNo = regNo;
	 
	        // Creating Map object with reference to HashMap
	        // Declaring object of string type
	        Map<String, String> tempMap = new HashMap<>();
	 
	        // Iterating using for-each loop
	        // Create deep copy of map 
	        for (Map.Entry<String, String> entry :
	        	 metaData.entrySet()) {
	            tempMap.put(entry.getKey(), entry.getValue());
	        }
	 
	        this.metaData = tempMap;
	}



	public String getName() {
		return name;
	}



	public int getRegNo() {
		return regNo;
	}



	public Map<String, String> getMetaData() {
		 Map<String, String> tempMap = new HashMap<>();
		 
	        // Iterating using for-each loop
	        // Create deep copy of map 
	        for (Map.Entry<String, String> entry :
	        	 metaData.entrySet()) {
	            tempMap.put(entry.getKey(), entry.getValue());
	        }
	 
	        return tempMap;
	}
	
	/*  
	 * Step 5: Deep Copy of objects should be performed in the getter
	 *  methods to return a copy rather than returning the actual object reference)  
	*/

}

/*
 * There should be no setters or in simpler terms, 
 * there should be no option to change the value of the instance variable.
 */
