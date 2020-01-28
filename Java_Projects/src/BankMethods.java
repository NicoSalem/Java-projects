import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BankMethods {

	Bank b = new Bank();
	
	Scanner scanner = new Scanner(System.in);
	
	Map <Integer, String> map = new HashMap<Integer, String>();

	public void create(int accn, String n) {
		map.put(b.accountNumber, b.name);
	}
	
	
}
