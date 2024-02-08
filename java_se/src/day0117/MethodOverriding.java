package day0117;

public class MethodOverriding {

	public static void main(String[] args) {

		System.out.println("----Parent parent = new Parent();----------");
		Parent parent = new Parent(); 
		System.out.println(parent.str);  //Parent의 str
		System.out.println(parent.str3); //Parent의 str3
		parent.method1();//  Parent의 method1()
		parent.method3();//  Parent의 method3()

		System.out.println("----Parent parent2 = new Child();----------");
		Parent parent2 = new Child();
		System.out.println(parent2.str); //Parent의 str -> method에 대해서만 오버라이딩이 적용된다.
		System.out.println(parent2.str3);//Parent의 str3 -> method에 대해서만 오버라이딩이 적용된다.
		parent2.method1();// Parent의 method1()
		parent2.method3();// Child의 method3() -> Child클래스에 의해 오버라이딩 되었음.


		System.out.println("----Child child = new Child();-----------");
		Child child = new Child();
		child.method1(); //Parent의 method1()
		child.method2(); //Child의 method2()
		child.method3(); //Child의 method3()
		System.out.println(child.str);
		System.out.println(child.str2);
		System.out.println(child.str3);



		System.out.println("----Child child2 = (Child) parent2;---------");

		Child child2 = (Child) parent2;
		System.out.println(child2.str); //Parent의 str
		System.out.println(child2.str2); //Child의 str2
		System.out.println(child2.str3); //Child의 str3
		child2.method1(); //Parent의 method1()
		child2.method2(); //Child의 method2()
		child2.method3(); //Child의 method3()
	}

}

class Parent {
	String str = "Parent의 str";
	String str3 = "Parent의 str3";

	void method1() {
		System.out.println("Parent의 method1()");
	}

	void method3() {
		System.out.println("Parent의 method3()");
	}

}

class Child extends Parent {
	String str2 = "Child의 str2";
	String str3 = "Child의 str3";

	
	void method2() {
		System.out.println("Child의 method2()");
	}

	void method3() {
		System.out.println("Child의 method3()");
	}

}