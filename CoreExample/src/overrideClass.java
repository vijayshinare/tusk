
public class overrideClass {

	public static void main(String[] args) {
		class Animal{  
			void eat(){System.out.println("eating...");}  
			}  
			class Dog extends Animal{  
			void eat(){System.out.println("eating bread...");}  
			}  
Animal a=new Dog();
a.eat();
	}

}
