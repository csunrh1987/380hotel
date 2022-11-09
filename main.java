import java.util.Scanner;
public class main {
		public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		Hotel hotel = new Hotel();
		int choice = 0;
			
			
		while(choice < 4){
			System.out.print("\n1. Create users \n2. Make Reservation \n3. Delete reservation..\n");
			choice = input.nextInt();
			
			switch(choice){
					
				case 1: op1(); break;	
				case 2: op2(); break;
				case 3: op3(); break;
				default: System.out.print("\nbye");
			}
		}
	}
	public static void op1(){
		System.out.print("\nCreate new user algorithm goes here..");
	}
	public static void op2(){
		System.out.print("\nEnter user ID: ");
		String user_id = input.nextInt();
		System.out.print("\nEnter hotel id: "); //should this be id or name?
		String hotel_id = hotel.getName();
		System.out.print("\nEnter stay duration: ");
		int stay_durantion = input.nextInt();
		System.out.print("\nEnter number of guests: ");
		int guest_count = input.nextInt();
		boolean paid = false; //user has not paid at initial reservation creation
		String currDate = //Date logic
		hotel.makeReservation(user_id, hotel_id, stay_duration, guest_count, paid, curDate);
		System.out.print("Reservation has been created.");
		
	}
	public static void op3(){
		System.out.print("\nDelete reservation algorithm goes here..");
	}
	

}
