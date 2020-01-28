import java.util.Scanner;

public class Bank {

	int accountNumber = 0;
	String name;
	String contin = "yes";

	public static void main(String [] args) {

		BankMethods bm = new BankMethods();
		Bank b = new Bank();

		Scanner scanner = new Scanner(System.in);

		do {
			System.out.println("hello, welcome to nsalem bank! \n Do you already have an account?");
			String answer = scanner.next();

			if (answer.equals("yes")) {
				System.out.println("enter account number");
				int myaccount = scanner.nextInt();
				
				if (bm.map.containsKey(myaccount)) {
					System.out.printf("welcome %s", bm.map.get(myaccount));
				}
				else {
					System.out.println("sorry, I cant find your account");
				}

			}
			else if (answer.equals("no")) {
				System.out.println("then lets create one for you! \n Tell me your name and an account number will be assigned for you.");

				b.name = scanner.next();

				bm.create(b.accountNumber, b.name);

				System.out.printf("Dear %s, your account number is %d. \n welcome to the bank! \n", b.name, b.accountNumber);
			}
			//System.out.println(bm.map.get(0));
			b.accountNumber++;
			
			System.out.println("do you wish to continue?");
			b.contin = scanner.next();
			
			if (b.contin.equals("no")) {
				System.out.println("thats fine. Have a nice day!");
			}

		} while (b.contin.equals("yes"));
	}
}