package ch06.inheritance11;

/**
 * @Date : 2023. 1. 9.
 * @Author :이준성
 * @Description :  추상함수, 추상 클래스
 *  
 */
public class Exam {

	public static void main(String[] args) {
		
		// Animal a = new Animal(); ERROR
		
		Animal cat = new Cat();
		cat.breathe();
		cat.sound();
		System.out.println();
		
		Animal dog = new Dog();
		dog.breathe();
		dog.sound();
	}
}
