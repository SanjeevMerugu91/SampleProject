package coreJavaTraining;

public class Dog {
	//data member
	String color="White";
	int leg;
	// method
	void jump()
	{
		System.out.println("Dogs are jumping");

	}
	void look()
	{
		System.out.println("My dog color is "+color);
	}
	public static void main(String[] args) {
		//how to create an object of the class
		Dog d1=new Dog();
		d1.look();
		d1.jump();
	}
}
