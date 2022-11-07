import java.util.Scanner;
public class main {
		public static void main(String[] args){
		Scanner input = new Scanner(System.in);
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
		System.out.print("\nCreate reservation algorithm goes here..");
	}
	public static void op3(){
		System.out.print("\nDelete reservation algorithm goes here..");
	}
	

}
