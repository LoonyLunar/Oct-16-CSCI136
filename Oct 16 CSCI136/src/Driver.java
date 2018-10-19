import java.util.ArrayList;
import java.util.Scanner;


public class Driver {
	public static void main(String[] args) {
		String answer;
		
		Scanner scan = new Scanner(System.in);
		do {
			
			System.out.println("Who is your phone's manufacturer?");
			String manufacturer = scan.nextLine();
			
			System.out.println("What is the model of your phone?");
			String model = scan.nextLine();
			
			System.out.println("What is the price of your phone?");
			String price = scan.nextLine();
			
			System.out.println("What is your carrier?");
			String carrier = scan.nextLine();
			
			System.out.println("What is your phone number?");
			String phoneNumber = scan.nextLine();
			
			System.out.println("Write a message.");
			String message = scan.nextLine();
			
			ArrayList<String> arrayPhone = new ArrayList<String>();
			
			arrayPhone.add(manufacturer);
			arrayPhone.add(model);
			arrayPhone.add(price);
			arrayPhone.add(carrier);
			
			
			System.out.println("Type \"yes\" if you wish to go again.");
			answer = scan.nextLine();
			
			MobilePhone myPhone = new MobilePhone(manufacturer, model, price,carrier);
			System.out.println(myPhone.toString());
			
			
			System.out.println(myPhone.call(phoneNumber));
			System.out.println(myPhone.text(message));
			}
			while (answer.equals("yes"));
		
		
	}

}
