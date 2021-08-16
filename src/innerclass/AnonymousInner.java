package innerclass;

abstract class Person {
	abstract void eat();
}

interface Person1{
	void drink();
}

public class AnonymousInner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person=new Person() {
			void eat() {
				System.out.println("Eat fruits");
			}
		};
		person.eat();
		Person1 person1=new Person1() {
			public void drink() {
				System.out.println("Drink Water");
			}
		};
		person1.drink();
	}

}
