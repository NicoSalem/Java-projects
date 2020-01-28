import java.util.Scanner;

public class Bank1 {

	int accountNumber = 0;
	int password;
	String name;
	String contin = "yes";
	String contin2;

	public static void main(String [] args) {

		BankMethods1 bm = new BankMethods1();
		Bank1 b = new Bank1();
		Accounts1 a = new Accounts1(0, 1, "hi", 0.1);

		Scanner scanner = new Scanner(System.in);

		try {
		do {
			System.out.println("hello, welcome to nsalem bank! \n Do you already have an account?");
			String answer = scanner.next();

			if (answer.equals("yes")) {
				
				System.out.println("enter account number");
				int myaccount = scanner.nextInt();
				
				System.out.println("now enter you password");
				int mypassword = scanner.nextInt();

				if (myaccount <= bm.map.size() && mypassword == bm.map.get(myaccount).password) {
					System.out.printf("welcome client %s \n", bm.map.get(myaccount).name);
					
					do {
						System.out.println("what do you want to do? 1) check balance 2) deposit 3) transfer");

						int answer2 = scanner.nextInt();

						if (answer2 == 1) {
							bm.checkBlance(myaccount);						
						}
						else if (answer2 == 2) {
							bm.deposit(myaccount);
							System.out.print("your current balance is ");
							bm.checkBlance(myaccount);
						}
						else if (answer2 ==3) {
							bm.transfer(myaccount);
							System.out.print("your current balance is ");
							bm.checkBlance(myaccount);
						}
						System.out.println("anything else?");
						b.contin2 = scanner.next();
					}
					while (b.contin2.equals("yes"));
				}
				else {
					System.out.println("sorry, I cant find your account");
				}

			}
			else if (answer.equals("no")) {
				System.out.println("then lets create one for you! \n Tell me your name and design a password that an account number be assigned for you.");

				b.name = scanner.next();
				System.out.println("choose your password");
				
				b.password = scanner.nextInt();
//				a.name = b.name;

				bm.createAccount(b.accountNumber, b.password, b.name, 0);

				System.out.printf("Dear %s, your account number is %d. \n welcome to the bank! \n", b.name, b.accountNumber);
				b.accountNumber++;
			}

			System.out.println("do you wish to continue?");
			b.contin = scanner.next();

			if (b.contin.equals("no")) {
				System.out.println("thats fine. Have a nice day!");
			}

		} while (b.contin.equals("yes"));
		System.out.println(bm.map.get(0).name);
		System.out.println(bm.map.get(1).name);
		
		} catch (Exception e) {
			System.out.println("invalid input. try again");
		}
	}
}