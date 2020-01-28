import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class BankMethods1 {

	Scanner scanner = new Scanner(System.in);
	
//	String name;
	int password;
	int accountNumber;
//	double balance = 0;
	
	Map <Integer, Accounts1> map = new HashMap<Integer, Accounts1>();
	
	public void createAccount(int accn, int pass, String n, double b){
	
		map.put(accn, new Accounts1(accn, pass, n, b));
		
		accountNumber = accn;
		password = pass;
//		name = n;
//		balance = b;

	}
	
	public void checkBlance(int mya) {		
		System.out.printf("your balance is %f ", map.get(mya).balance);
	}
	
	public void deposit(int mya){
		System.out.println("enter the amount you would like to deposit or withdraw.");
		double amount = scanner.nextDouble();
		map.get(mya).balance += amount;
	}
	
	public void transfer (int mya) {
		System.out.println("enter the amount you would like to transfer.");
		double transferSUM = scanner.nextDouble();
		
		System.out.println("to which account?");
		int reciever = scanner.nextInt();
		
		map.get(mya).balance -= transferSUM;
		map.get(reciever).balance += transferSUM;
		
	}
	
}
