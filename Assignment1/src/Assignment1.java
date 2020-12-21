import java.util.*;
public class Assignment1 {

	public static void main(String[] args) {
		
		//the program should ask detail personal background of the customer
		
		String name1 = "Ahmad Faris";
		int age1 = 28;
		String occupation1 = "Teacher";
		int salary1 = 3000;
		
		String name2 = "Iris";
		int age2 = 21;
		String occupation2 = "Student";
		int salary2 = 0;
	
		
		//the program should ask what product or services they provide
		Scanner in = new Scanner (System.in);
		
		String route1 = "Batu Cave to Pulau Sebang";
		String route2 = "Tanjung Malim to Pelabuhan Klang";
		String route3 = "Padang Rengas to Bukit Mertajam";
		String route4 = "Butterworth to Padang Besar";
		String route5 = "Pulau Sebang to Batu Cave";
		String route6 = "Pelabuhan Klang to Tanjung Malim";
		String route7 = "Bukit Mertajam to Padang Rengas";
		String route8 = "Padang Besar to Butterworth";
		
		String route = in.toString();
		route = route1 + route5;
		
		
		
		
		//determine what price per quantity or how much the service charge per hour
		
		int fee1 = 35;
		int fee2 = 30;
		int fee3 = 32;
		int fee4 = 40;
		int fee5 = 33;
		int fee6 = 31;
		int fee7 = 34;
		int fee8 = 38;
		
		
		//the program should ask the customer how many item and quantity or how many services they would like to order
		
		
		//calculate the total price need to be paid
		
		System.out.println("Enter customer background: " + name1 + "\n\t\t " + age1 + "\n\t\t " + occupation1 + "\n\t\t " + salary1);
		System.out.print("What route path that you want to go: " + route);
		System.out.println();
		System.out.print("Fee that customer need to pay: " + (fee1 + fee5));
		System.out.println();
		System.out.println("Enter customer background: " + name2 + "\n\t\t " + age2 + "\n\t\t " + occupation2 + "\n\t\t " + salary2);
		System.out.print("What route path that you want to go: " + route2);
		System.out.print("Fee that customer need to pay: " + fee2);

	}

}
