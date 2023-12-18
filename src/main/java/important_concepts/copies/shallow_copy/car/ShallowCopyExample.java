package important_concepts.copies.shallow_copy.car;

public class ShallowCopyExample {
	public static void main(String[] args) {
		Person p = new Person( "sizic","Person-A");
		System.out.println("orignal values " + p);
		
		Person q =  (Person) p.clone();
		System.out.println("clone before changes " + q);
		
		q.setName("Person - B");
		q.getCar().setName("Accord");
		
		System.out.println("clone after changes " + q);
		
		//Value of the car will change for A as we are sharing the shame reference for Car
		System.out.println("Orignal  after changes " + p);
	}
}



/*
	In shallow copy only references are copied. 
	Therefore, both original and object point to the same reference. 
	Creating a new reference that points to the same memory location. 
	Note that when we try to alter data in the copied object, 
	the changes are also reflected in the original one.
*/


/*
	Note: The clone() method of the Object class creates a shallow copy, by default.
*/