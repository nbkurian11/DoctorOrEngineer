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
		break;
		case 2: mech();
		break;
		case 3: civil();
		break;
		case 4: comp();
		break;
		case 5: soft();
		break;
		}
		}

	private static void soft() {
		// TODO Auto-generated method stub
		System.out.println("Great, you want to be a software engineer! As a software engineer\n"
				+ " you develop, design, and test software applications. \n"
				+ "The most common path for someone  to become a Software Engineer \n"
				+ "is through university. However, there are people that "
				+ "educated themselves through alternative resources. \n"
				+ "Software Engineering involves programming and building software applications \n"
				+ "If you want to begin to learn how to code, you can start by setting a goal, \n"
				+ "ask yourself what you want to build. It could be a game or an app. Start small \n"
				+ "and then build up from there.\n");
		
	}

	private static void comp() {
		// TODO Auto-generated method stub
		System.out.println("Great, you want to be a computer engineer. A computer engineer designs, develops, researches systems relating to computers. \n"
				+ "The skills you have include problem solving, programming, and teamwork. Like SWEs you can self study concepts or go to university.");
		
		
	}

	private static void civil() {
		// TODO Auto-generated method stub
		System.out.println("Great, you want to be a civil engineer. A civil engineeer is responsible for planning, designing and managing \n"
				+ "buildings. The skills you need possesion of specific knowledge relating to topics like structural anaylsis. Other skills \n"
				+ "communication, teamwork and building regulations. You need to earn a bachelors degree for this career path.");
		
		
	}

	private static void mech() {
		// TODO Auto-generated method stub
		System.out.println("Great, you want to be a mechanical engineer, a mechanical engineer designs, tests, develops, and maintains mechanical systems. \n"
				+ "They can work in different industries such as manufacturing, maintenance, automotive, and even aersospace. \n"
				+ "You need a bachelors degree for this position.");
		
		
	}
	

	private static void electrical() {
		// TODO Auto-generated method stub
		System.out.println("Great, you want to be a electrical engineer, an electrical engineer develops, designs, tests and manages electrical systems and equipment. \n"
				+ "They can work in different industries, like telecommunication and power generation. EE also use programming languages like \n"
				+ "MATLAB, C++ and Python. ");
		
		
	}

	private static void doctor() {
		// TODO Auto-generated method stub
		System.out.println("To become a doctor you must go through a lot of schooling. \n"
				+ "Get a bachelors degree, pass the MCAT, get into medical school, complete your resisdancy, and then you are \n"
				+ "a doctor.");
	}
	
	

}

