package doc;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
*
* @author radhetians
* E->aEa
* E->bEb
* E->c
*/

public class SLRConanical {
	static int z = 0, i = 0, j = 0, c = 0;
	static String a[], ac, stk[]=new String[50], act;
	static String result="";

	

	public static void check()
	{

	    ac="R E -> ";
	    for(z = 0; z < c; z++)
	    {
	        if(stk[z].equals("c"))
	        {
	        	
	            result=result+ac+"c";
	            stk[z] = "E";
	            stk[z + 1] = "\0";
	            String s="",y="";
	            for(String str:stk)
	            	if(str!=null)
	            		s+=str;
	            for(String str:a)
	            	y+=str;
	            result=result+"\n$"+s+"\t"+y+"$\t";
	        }
	    }

	    for(z = 0; z < c - 2; z++)
	    {
	        if(stk[z].equals("a")&& stk[z + 1].equals("E")&& stk[z + 2].equals("a"))
	        {
	            result = result+ac+"aEa";
	            stk[z] = "E";
	            stk[z + 1] = "\0";
	            stk[z + 2] = "\0";
	            String s="",y="";
	            for(String str:stk)
	            	if(str!=null)
	            		s+=str;
	            for(String str:a)
	            	y+=str;
	            result=result+"\n$"+s+"\t"+y+"$\t";
	           
	            i = i - 2;
	        }
	    }

	    for(z=0; z<c-2; z++)
	    {

	        if(stk[z].equals("b") && stk[z + 1].equals("E")&& stk[z + 2].equals("b"))
	        {
	            result=result+ac+"bEb";
	            stk[z]="E";
	            stk[z + 1]="\0";
	            stk[z + 1]="\0";
	            String s="",y="";
	            for(String str:stk)
	            	if(str!=null)
	            		s+=str;
	            for(String str:a)
	            	y+=str;
	            result=result+"\n$"+s+"\t"+y+"$\t";
	            
	            i = i - 2;
	        }
	    }
	    return ;
	}

	public static String SLR()
	{
		
	    c=a.length;
	    act="S";
	    result = result+"\nstack \t input \t action";
	    for(i = 0; j < c; i++, j++)
	    {
	        result = result+act;
	        stk[i] = a[j];
	        stk[i + 1] = "\0";
	        a[j]="";
	        String s="",y="";
            for(String str:stk) 
            	if(str!=null) 
            		s=s+str;
            for(String str:a) 
            	y=y+str;
            result=result+"\n$"+s+"\t"+y+"$\t";
	        check();
	    }
	    check();
	    if(stk[0].equals("E")&& stk[1].equals("\0"))
	        result = result+"Accept\n";
	    else
	        result = result+"Reject\n";
	    return result;
	}
	public static String ValidString(String s) {
		a=s.split("");
		return SLR();
	}

	public static void main(String[] args) throws Exception{
		System.out.print("Enter the String : ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		a=s.split("");
		System.out.println(SLR());
	}

}
