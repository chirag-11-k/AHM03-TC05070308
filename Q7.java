
/*
							Author : Chirag Kuriya
							DOC    : 5-june
							Subject: To make Animal abstract class
*/

package EclipseProject;
abstract class Animal{
		String name;
		int age;
		public Animal(String name, int age){
			this.name = name;
			this.age = age;
		}
		abstract void makesound();
}

class Dog extends Animal{
	public Dog(String name,int age){
		super(name, age);
	}
	public void makesound(){
		System.out.println(name+ " says Wooff!!");
	}
}

class Cat extends Animal{
	public Cat(String name,int age){
		super(name, age);
	}
	public void makesound(){
		System.out.println(name+ " says Meow!!");
	}
}

public class Q7 {
	public static void main(String[] args) {
		Dog d1 = new Dog("Casper",3);
		d1.makesound();	
		Cat c1 = new Cat("Buddy",2);
		c1.makesound();

	}
}
