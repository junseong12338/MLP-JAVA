package api04.Math;

public class AppleEx {
	public static void main(String[] args) {
		Apple apple = new Apple();
		System.out.println(apple.hashCode());
	}
	
	
	public static void sub(Object obj) {
		if(obj instanceof Integer) {
			Integer i = (Integer) obj;
		}

		if(obj instanceof String) {
			String s = (String) obj;
		}
	}
}
