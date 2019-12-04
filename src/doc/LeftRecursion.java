package doc;

import java.util.Vector;
import java.util.HashSet;
import java.util.Set;
public class LeftRecursion {
	
	public Vector<String> Right(String NT,Vector<String> production){
	    Vector<String> result = new Vector<String>();
	    for(String i : production){
	        if(i.substring(0,i.indexOf("#")).contains(NT)){
	            result.add(i.substring(i.indexOf("#")+1));
	        }
	    }
	    return result;
	}
	public Vector<String> Left_Recusrion(Vector<String> production){

		  Set<String> left= new HashSet<String>(); 
		  Vector<String> right = new Vector<String>();
		  Vector<String> result = new Vector<String>();
		  Vector<String> temp = new Vector<String>();
		  for(String s : production){
		      
		      left.add(s.substring(0,s.indexOf("#")));
		      right.add(s.substring(s.indexOf("#")+1)); 
		  } 
		  for(String NT : left){ 
		      
		      Vector<String> a = new Vector<String>();
		      Vector<String> b = new Vector<String>();
		      temp = Right(NT,production);
		      if(NT.charAt(0)==temp.get(0).charAt(0)){
		        for(String s : temp){
		          if(NT.charAt(0)==s.charAt(0))
		            a.add(s.substring(1));
		          else
		            b.add(s);
		        }
		        
		        for(String s : b){
		          
		          result.add(NT+"->"+s+NT+"'");
		        } 
		        for(String s : a){
		          result.add(NT+"'->"+s+NT+"'");
		          result.add(NT+"'->@");        
		        }
		      } else {
		        for(String s : temp)
		          result.add(NT+"->"+s);
		      }
		      
		  }
		 return result;

		}
}
