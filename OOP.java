
import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args){
		Person p = new Person("Neal", 24);

		// Polymorphism demo (Runtime)
		p.walk(1);
		p.walk();


	}
}
class Person{
	String name = "None";
	int age = 0; 
	// static makes it a class variable meaning it can be accessed without the need for instantiating an object of tat partiular class
	// but how do i access it ???
	// Simply by doing Classname.variable
	// you can use a static method without instantiating an object !!!
	static int cnt = 0;

	// Constructor
	// special method called automatically after object creation.
	// Used to instantiate object attributes
	
	// constructor 1
	Person(){
		cnt++;
	}

	// constructor 2
	Person(String name){
		this.name = name;
	}

	Person(String name, int age)
	{
		this(); // calls construtor 1
		this(name); // calls constructor 2

		this.name = name;
		this.age = age;
		cnt += 1;
	}

	// Runtime Polymorphism
	void walk(){
		System.out.println(name + " is walking.");
	}
	void walk(int steps){
		System.out.println(name + " is walking "  + steps + " steps.");
	}
}

// Inheritance
// SubscribedPerson is one of the users(or a Person) who has paid extra money to avail premium features
// It inherits all the existing methods and attributes as well as can also provide some of its own
class SubscribedPerson extends Person{

	SubscribedPerson(String name, int age, double amount){
		super(name, age); // super calls the parent constructor
		this.amt = amount; // this can access curent attributes
	}


	// runtime polymorphism and method overriding
	void walk(){
		super.walk();
		System.out.println("SubscribedPerson is walking");
	}





}
