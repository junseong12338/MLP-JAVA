package api11.Exception;

import java.io.IOException;
import java.io.InputStream;
import java.util.InputMismatchException;
import java.util.Scanner;


class AA {
	public void sub() throws Throwable{ // throws Throwable여기서 try 안쓴다는 뜻
		// 해당 함수 호출시  RuntimeException에러 발생
		Throwable ex = new Throwable();
		throw ex;
	}
	public void fun() throws Throwable{
		sub();
		
	}
}

public class Ex09 {
	public static void main(String[] args) {
		AA a = new AA();
		
		
		try {
			InputStream is = System.in;
			int value = is.read();
		}catch (Exception e) {
			
		}

	
	}
		
	
}

