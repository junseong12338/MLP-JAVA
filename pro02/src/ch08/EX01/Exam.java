package ch08.EX01;

/**
 * @Date : 2023. 1. 10.
 * @Author :이준성
 * @Description : 객체 활용 멤버 변수 (필드,object), 매개변수(object) 지역변수(object)
 * 
 */
public class Exam {
	
	
	public static void main(String[] args) {
		Apple apple = new Apple();
		apple.setData(1, 2);
		
		Banana b = new Banana();
		b.setData(70, apple);
		b.disp();
	}
	
}
