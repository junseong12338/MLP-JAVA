package api06.Bank;

import java.util.Scanner;

public class AccountMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		AccountManager jbank = new AccountManager();
		
		while(true) {
			printMenu();
			System.out.print("선택 :");
			int choice =sc.nextInt();
			
			switch (choice) {
			case 1:
				// 계좌계설
				jbank.makeAccount();
				break;
			case 2:
				// 입금
				jbank.deposit();
				break;	
			case 3:
				// 출금
				jbank.withdraw();
				break;	
			case 4:
				// 잔액 조회
				jbank.inquire();
				break;	
			case 5:
				// 전체 조회
				jbank.disp();
				break;	
			case 6:
				// 프로그램 종료
				System.out.println("프로그램 종료");
				sc.close();
				System.exit(0);
				break;	
			default:
				System.out.println("잘못 선택 하셨습니다.");
				System.out.println();
				break;
			}
		}
		
	}
	
	public static void printMenu() {
		System.out.println("-----Menu-----");
		System.out.println("1.계좌계설");
		System.out.println("2.입급");
		System.out.println("3.출금");
		System.out.println("4.잔액조회");
		System.out.println("5.전체출력");
		System.out.println("6.프로그램 종료");
	}
}
