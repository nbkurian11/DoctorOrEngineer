package doe;

import java.util.Scanner;

public class Main {
	
	static Scanner s;
	static Scanner x;
	
	public static void main (String[] args) {
		
		System.out.println("What do you want to be when you grow up? \n" +
		"1. Doctor \n2. Engineer");
		
		s = new Scanner(System.in);
		int n = s.nextInt();
		
		switch(n) {		
		case 1: doctor();
		break;
		case 2: engineer();
		break;
		default: System.out.println("Error, wrong input.");
		}
		
		
		
		
	}

	private static void engineer() {
		// TODO Auto-generated method stub
		System.out.println("What type of engineer do you want to be? \n" +
				"1. Electrical Engineer  \n2. Mechanical Engineer  \n3. Civil Engineer  \n4. Computer Engineer \n5. Software Engineer");
		x = new Scanner(System.in);
		int y = x.nextInt();
		
		switch(y) {
		case 1: electrical();
		case 2: mech();
		case 3: civil();
		case 4: comp();
		case 5: soft();
		}
		}

	private static void soft() {
		// TODO Auto-generated method stub
		System.out.println("Great, you want to be a software engineer, go get a degree!");
		
	}

	private static void comp() {
		// TODO Auto-generated method stub
		System.out.println("Great, you want to be a computer engineer, go get a degree!");
		
		
	}

	private static void civil() {
		// TODO Auto-generated method stub
		System.out.println("Great, you want to be a civil engineer, go get a degree!");
		
		
	}

	private static void mech() {
		// TODO Auto-generated method stub
		System.out.println("Great, you want to be a mechanical engineer, go get a degree!");
		
		
	}
	

	private static void electrical() {
		// TODO Auto-generated method stub
		System.out.println("Great, you want to be a electrical engineer, go get a degree!");
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

	private static void doctor() {
		// TODO Auto-generated method stub
		System.out.println("This tutorial is coming soon.");
	}
	
	

}
