package nazansonal_211805027_lab2;


import java.util.Scanner;

public class homework2 {

	public static void main(String[] args) {
		boolean[]seats=new boolean[10];
		Scanner scan= new Scanner(System.in);
		while(true) {
			System.out.println("Please type 1 for Buying First Class Ticket");
			System.out.println("Please type 2 for Buying Economy Class Ticket");
			System.out.println("Please type 3 for Ticket Validation");
			int choice= scan.nextInt();
			switch(choice) {
			case 1:int firstclass= declareseat(seats,1,5);
			if(firstclass!=-1 ) {
				System.out.println("First class ticket is bought."+" Seat #"+firstclass);
			}
			else {
				System.out.println("first class is full.Would you like to be placed in Economy Class (y/n)");
				char input = scan.next().charAt(0);
				
				if (input== 'y' || input == 'Y') {
					int economyseat=declareseat(seats,6,10);
					if(economyseat!= -1) {
						System.out.println("Economy class ticket is bought."+" Seat #" + economyseat);
					}
					else { System.out.println("Next Flight lives in 3 hours.");
					
				}
				
			}
			}
			break;
			case 2: int economyseat =declareseat(seats,6,10);
			if (economyseat!= -1) {
				System.out.println("Economy class ticket is bought."+" Seat #" + economyseat);
				}
			else {System.out.println("Economy Class is full.Would you liked to be placed in First class(y/n)");
			char input = scan.next().charAt(0);
			if (input == 'y' || input == 'Y') {
				int firstclass1=declareseat(seats,1,5);
				if(firstclass1!= -1) {
					System.out.println("First class ticket is bought."+" Seat #"+firstclass1);
				} else { System.out.println("The plane is full.Next Flight lives in 3 hours.");
			}
			} else {System.out.println("Next Flight lives in 3 hours.");
		}
			}
break;
			case 3: System.out.println("Enter the seat number for validaiton:  ");
			    
				int validateseat= scan.nextInt();
				
			if(validateseat >=1 && validateseat<=10)  {
				if(seats[validateseat -1]) {
					System.out.println("Ticket is sold.");
				} else {
					System.out.println("Ticket is available.");
				}
			} else {
				System.out.println("Invalid seat number.");
			}
			break;
			default: System.out.println("Invalid choice.please select 1-2 or 3.");
				break;
	}

}
}
	public static int declareseat(boolean[]seats, int start , int end) {
		for(int i=start-1; i<end; i++ ) {
			if(!seats[i]) {
				seats[i]= true;
				return i+1;
				}
			}

	return -1; 
}
}