package doc;

import java.util.Scanner;

/**
 * 
 * @author radhetians
 * E->TE'
 * E'->+TE'|NULL
 * T->FT'
 * T'->*FT'|NULL
 * F->(E)|a
 */


public class RecursiveDescent {
	
	private static char lookahead='$';
	private static String InputString="a*a+a$";
	private static int len=0;
	
	public static void main(String[] args) throws Exception {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the String = ");
		String number= input.nextLine();
		System.out.println(Descent(number) );
	}
	
	public static String Descent(String Input) {
		InputString = Input;
		Match();
		E();
		if(lookahead == '$') 
			return "Accept";
			
		else 
			return "Error";
	}
	
	static void Match() {
		lookahead = InputString.charAt(len++);
	}
	static void E() {
		T();
		EDS();
		
	}
	static void EDS() {
		if(lookahead == '+') {
			Match();
			T();
			EDS();
		} else
			return;
	}
	static void T() {
		F();
		TDS();
	}
	static void TDS() {
		if(lookahead == '*') {
			Match();
			F();
			TDS();
		} else 
			return;
		
	}
	static void F() {
		if(lookahead == '(') {
			Match();
			E();
			if(lookahead == ')') 
					Match();
			} else 
				Match();
		}
	
}
