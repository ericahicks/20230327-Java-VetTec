package com.skillstorm.training.day5;

import java.util.Scanner;

public class YesNoPetStoreExample {

	public static void main(String[] args) {
		System.out.println("Welcome to the Exotic Pet Store!");
		System.out.println("-----------Yes No Question Response-------------"); 
		Scanner in = new Scanner(System.in);
		System.out.println("Do you want a cat?");
		
		System.out.println("Here's your cat: \n" + "      |\\      _,,,---,,_\r\n"
				+ "ZZZzz /,`.-'`'    -.  ;-;;,_\r\n"
				+ "     |,4-  ) )-,_. ,\\ (  `'-'\r\n"
				+ "    '---''(_/--'  `-'\\_)  Felix Lee ");
		
		System.out.println("Do you want a dog?");
		
		System.out.println("Here's your dog: \n" + "(\\,--------'()'--o\r\n"
				+ " (_    ___    /~\"\r\n"
				+ "  (_)_)  (_)_)");
		
		System.out.println("Do you want a otter?");
		
		System.out.println("Here's your otter: \n" + "  .-\"\"\"-.\r\n"
				+ " /      o\\\r\n"
				+ "|    o   0).-.\r\n"
				+ "|       .-;(_/     .-.\r\n"
				+ " \\     /  /)).---._|  `\\   ,\r\n"
				+ "  '.  '  /((       `'-./ _/|\r\n"
				+ "    \\  .'  )        .-.;`  /\r\n"
				+ "     '.             |  `\\-'\r\n"
				+ "       '._        -'    /\r\n"
				+ " jgs      ``\"\"--`------`");
		
		System.out.println("Do you want a shark? ");
		
		System.out.println("Here's your shark: \n" + "      .            \r\n"
				+ "\\_____)\\_____\r\n"
				+ "/--v____ __`<         \r\n"
				+ "        )/           \r\n"
				+ "        '");

		System.out.println("Do you want a rabbit? ");
		
		System.out.println("Here's your rabbit: \n" + "                     /\\    .-\" /\r\n"
				+ "                    /  ; .'  .' \r\n"
				+ "                   :   :/  .'   \r\n"
				+ "                    \\  ;-.'     \r\n"
				+ "       .--\"\"\"\"--..__/     `.    \r\n"
				+ "     .'           .'    `o  \\   \r\n"
				+ "    /                    `   ;  \r\n"
				+ "   :                  \\      :  \r\n"
				+ " .-;        -.         `.__.-'  \r\n"
				+ ":  ;          \\     ,   ;       \r\n"
				+ "'._:           ;   :   (        \r\n"
				+ "    \\/  .__    ;    \\   `-.     \r\n"
				+ " bug ;     \"-,/_..--\"`-..__)    \r\n"
				+ "     '\"\"--.._:");
		
		// Else
		System.out.println("Okay, have a nice day."); 
		
		in.close();

	}

}
