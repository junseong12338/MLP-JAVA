package ch06.inheritance02;

/**
 * @Date : 2023. 1. 9.
 * @Author :이준성
 * @Description : 
 * 
 */
public class Exam {
	public static void main(String[] args) {
		BusinessMan bm = new BusinessMan("이준성","네이버","사장");
		bm.info();

	}
}

/*
 	
 	클래스
 			변수(멤버변수) : 지역 변수 , 매개변수, static변수, final 상수,
 			함수 : 함수 중복
 			생성자 : 생성자 중복
 			
 	객체를 통해서 데이터 전달 방식 .(점),함수 , 생성자 - 접근 제한자.
 
 	상속 : ex) 은행 : 이름 ,전화번호, 주민번호 - 공통으로 사용되는 변수
 			   대출 extends 개인정보 super,protected, 생성자(상속), 함수재정의
 			   적금 extends 개인정보
 			   예금 통장 extends 개인정보 
 			   블럭단위로 코드의 재활용을 하기 위해서
 			  
 			   중복성 없애고, 가독성 좋게 코드 짜기 ,의존성 없애기 
 			   
 			    
	  추상클래스 - 함수 재정의
	 interface - 함수 재정의
	
	   나머진 API
 
 	함수의 매개변수,리턴 변수 ---> 객체로 주고 받는 것, 맴버 obj
 	private int x -> X
 	private AA a  -> O
	
 
 */
 