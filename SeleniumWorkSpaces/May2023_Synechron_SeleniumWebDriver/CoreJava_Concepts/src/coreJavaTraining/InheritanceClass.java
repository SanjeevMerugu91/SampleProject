package coreJavaTraining;

public class InheritanceClass {
	public static void main(String[] args) 
	{
       B b1=new B();
       A a1=new A();
       b1.eat();
       System.out.println(a1.salary);
       a1.process();
       b1.run();
    }
}

class A  //parent class
{
	int salary=10000;
		void run()
	{
		System.out.println("I am running--Parent class");
	}
		void process()
		{
			System.out.println("My salary is "+salary);
		}
}

class B extends A//child class
{
	void eat()
	{
		System.out.println("I am eating---Child class");
	}
}
