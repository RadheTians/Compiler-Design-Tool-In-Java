package doc;


import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Vector;

public class Laxical {
	
	public static void main(String[] args) {
			
			Scanner input = new Scanner(System.in);
			System.out.println("Enter the path of File= ");
			String number= input.nextLine();
			Vector<String> str = Main(number);
			for(String s:str)
			System.out.print(s);
		}
	
	public static Vector<String> Main(String path){
		String line;	
		Vector<String> result = new Vector<String>();
		int l=1;
		
		try {
			BufferedReader br = new BufferedReader( new FileReader(path));
			while( (line = br.readLine()) != null){
				result.add("LINE : "+l+"\n");
				
				result.add("---KEYWORDS---\n");
				String t="";
				for(String temp : keyword(line))
					t+= temp+"  ";
				t+="\n";
				result.add(t);
				result.add("---OPERATORS---\n");
				String o="";
				for(String temp : operator(line))
					o+=temp+"  ";
				o+="\n";
				result.add(o);
				
				result.add("---DELIMITER---\n");
				String d="";
				for(String temp : delimiter(line))
					d+=temp+"  ";
				d+="\n";
				result.add(d);
				
				l++;
				 
		    }
		}catch(Exception e) {
			System.out.println(e);
		}
		
		return result;
	}
	
	public static Vector<String> keyword(String s) {
		
		Vector<String> temp = new Vector<String>();
		String keys[] = {"asm","else","new","this","auto","enum","operator","throw","bool",
				"explicit","private","true","break","export","protected","try",
				"case","extern","public","typedef","catch","false","register",
				"typeid","char","float","reinterpret_cast","typename","class",
				"for","return","union","const","friend","short","unsigned",
				"const_cast","goto","signed","using","continue","if","sizeof",
				"virtual","default","inline","static","void","delete","int",
				"static_cast","volatile","do","long","struct","wchar_t",
				"double","mutable","switch","while","dynamic_cast",
				"namespace","template","include","iostream","std","printf"};
		for(String key:keys) {
			if(s.contains(key)) {
				temp.add(key);
				
			}
			
		}
		return temp;
	}
	
	public static Vector<String> operator(String s) {
		
		Vector<String> temp = new Vector<String>();
		String keys[] = {"+", "-", "*", "/", "%", "=", "++",
							"--", "==", "+=", "-=", "*=", "/=", "!=", ">",
							"<", ">=", "<=", "&&","||","!","<<",">>","&",
							"^","|","%=","&=","^=","|=",",","?","?:"};
		for(String key:keys) {
			if(s.contains(key)) {
				temp.add(key);
				
			}
			
		}
		return temp;
	}

	public static Vector<String> delimiter(String s) {
	
		Vector<String> temp = new Vector<String>();
		String keys[]= {";",")","(","}","{","]","[","'"};
		for(String key:keys) {
			if(s.contains(key)) {
				temp.add(key);
			
			}
		
		}
		return temp;
	}


}