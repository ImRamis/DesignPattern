package com.week2;
public class Program {
	public static void main(String[] args){
		ICalculator obj = new Calculator(); //Using a interface to cloak everything and expose only the needed
		Utilities.display(obj.add(2, 5));
		Utilities.display(obj.sub(2, 5));
		Utilities.display(obj.div(2, 5));
		Utilities.display(obj.mul(2, 5));
		
		ICalculator obj2 = new Scientific(); // Holding a child class in a base class shows only the parent method.
		Utilities.display(obj2.add(2, 5));
		Utilities.display(obj2.sub(2, 5));
		Utilities.display(obj2.div(2, 5));
		Utilities.display(obj2.mul(2, 5));
		//Utilities.display(obj2.remainder(2, 5)); cannot access due to the object being a Calculator.
		
		Singleton obj3 = Singleton.getObject(); //Singleton only one instance of a object
		Singleton obj4 = Singleton.getObject(); //The old one will be used, no more then one can be created
		
		Singleton2 obj5 = Singleton2.getObject(); //In this Singleton Practice we can only create 3 objects then it'll cycle thru 
		Singleton2 obj6 = Singleton2.getObject(); //In this Singleton Practice we can only create 3 objects then it'll cycle thru 
		Singleton2 obj7 = Singleton2.getObject(); //In this Singleton Practice we can only create 3 objects then it'll cycle thru 
		Singleton2 obj8 = Singleton2.getObject(); //In this Singleton Practice we can only create 3 objects then it'll cycle thru 
		
		
	}
}
