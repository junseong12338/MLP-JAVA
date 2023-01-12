package api06.Bank;

import java.util.ArrayList;
import java.util.Scanner;

public class AccountManager {
	
	private ArrayList<Account> list;
	private Scanner sc;

	public AccountManager() {
		list = new ArrayList<Account>();
		sc   = new Scanner(System.in);
	}
	
	public void makeAccount() {
		Account account = new Account();
		
		System.out.println("계좌번호");
		account.setId(sc.nextInt());	
		
		System.out.println("이름:");
		account.setName(sc.next());
		
		System.out.println("잔액:");
		account.setBalance(sc.nextLong());	
		
		list.add(account);
		
		System.out.println("계좌가 계설되었습니다.");
		
	
	}
	
	public void disp() {
		for(int i = 0; i < list.size(); i++) {
			Account account = list.get(i);
			System.out.println(account.getId()+"\t"+account.getName()+"\t"+account.getBalance());
		}
	}
	
	public void inquire()
	{
		System.out.println("계좌 번호");
		int id = sc.nextInt();
		
		for(int i = 0; i<list.size(); i++) 
		{
			Account account = list.get(i);
			if(id == account.getId())
			{
				System.out.println(account.getId()+"\t"+account.getBalance());
				return;
			}
		}
		System.out.println("해당 계좌번호가 존재하지 않습니다.");
	}
	
	
	
	public void deposit() 
	{
		System.out.println("계좌 번호:");
		int id = sc.nextInt();
		
		for(int i = 0; i < list.size(); i++) 
		{
			Account account = list.get(i);
			if(id == account.getId())
			{
				System.out.println("입금액 :");
				long money = sc.nextLong();
				long result = account.getBalance() + money;
				account.setBalance(result);
				System.out.println("입금완료");
				return;
			}
		}
		System.out.println("유효 하지 않은 계좌번호 입니다.");
	}
	
	public void withdraw() 
	{
		System.out.println("계좌 번호:");
		int id = sc.nextInt();
		
		for(int i = 0; i < list.size(); i++) 
		{
			Account account = list.get(i);
			if(id == account.getId())
			{
				System.out.println("출금액 :");
				long money = sc.nextLong();
				
				if(account.getBalance() < money) 
				{
					System.out.println("잔액부족 입니다.");
					return;
				}
				
				long result = account.getBalance() - money;
				account.setBalance(result);
				System.out.println("출금완료");
				return;
			}
		}
		System.out.println("유효 하지 않은 계좌번호 입니다.");
	}
	
	
	
}
