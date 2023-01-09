package ch06.inheritance09;

public class Exam {
	
	// animal = cat animal = dog 
	public static void sub (Animal animal) { 
	
		// 공통적인거 사용가능
		System.out.println("1. 중첩 기능 엄청 많이씀 ");
		animal.breathe();
		animal.sound();
	
		// 자식 객체의 고유 기능 사용 불가 
		// 명시적 형변환 다운캐스팅 하면 사용가능 그래서 다운 캐스팅 쓰는거
//		animal.eat();
//		animal.play();
		System.out.println("2.자식 객체 고유 기능 사용 ");
		// 지금 넘어온 객체가 cat 클래시의 객체임?? upcasting 되었기 때문에 가능
		// 필요하니까 뽑아서 쓰는 중
		
// 		객체 지향에서 코드 재활용을 하기위해서 사용하는거다 
		if(animal instanceof Cat) {
			Cat  cat = (Cat) animal;
			cat.eat();
			
		}
		if(animal instanceof Dog) {
			Dog  dog = (Dog) animal;
			dog.play();
			
		}
		System.out.println();
		
}
//	public static void sub (Cat cat) {
//		
//	}
//	
//	public static void sub (Dog dog) {
//		
//	}
	
	public static void main(String[] args) {
		
		Cat cat =new Cat();
		cat.breathe();
		cat.sound();
		cat.eat();
		System.out.println();
		
		Dog dog = new Dog();
		dog.breathe();
		dog.sound();
		dog.play();
		System.out.println();
		
		// 미친듯이 많으면 일일히 다만들꺼임?????
		sub(cat);
		sub(dog);
	}
}
