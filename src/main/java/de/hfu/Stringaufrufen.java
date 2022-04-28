package de.hfu;

import java.util.*;
public class Stringaufrufen {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Eingabe: ");
		String Eingabe = scan.next();
		for(char c : Eingabe.toCharArray()){
	        if(Character.isLowerCase(c)){
	            System.out.print( Character.toUpperCase(c));
	        } else {
	            System.out.println("Deine Eingabe ist: "  + Eingabe + c);
	        }
	    }
		
	}

}