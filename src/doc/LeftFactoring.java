package doc;
import java.util.Vector;
public class LeftFactoring {
	public Vector<String> Left_Factoring(Vector<String> production){
	 Vector<String> left = new Vector<String>();
	 Vector<String>	right = new Vector<String>();
	 Vector<String>	result = new Vector<String>();
	 Vector<String>	temp = new Vector<String>();
	 for(String s : production){
	  left.add(s.substring(0,s.indexOf("#")));
	  right.add(s.substring(s.indexOf("#")+1,s.length())); 
	 } 
	 char c = right.get(0).charAt(0);
	 for(int i = 0; i < right.size(); i++){
	      if(c != right.get(i).charAt(0)) {
	           result.add(left.get(i)+"->"+right.get(i));  
	      } else {
	           temp.add(right.get(i));
	      }
	 }
	 String str="";
	 int x=0;
	 for(int i = 0; i < temp.get(0).length(); i++){
	      char d = temp.get(0).charAt(i);
	      int flag = 0;
	      for(int j=0;j < temp.size();j++){
	          if(temp.get(j).charAt(i) == d){
	        	  
	          }else
	          {
	               str = temp.get(0).substring(0,i);
	               flag = 1;
	               x = i;
	               break;
	          }
	      }
	      if(flag == 1)
	          break;
	 }
	 result.add(left.get(0)+"->"+str+left.get(0)+"'");
	 for(int i=0;i<temp.size();i++){
	      if(x==temp.get(i).length()){
	          result.add(left.get(i)+"'->@");
	      }else
	      {
	          result.add(left.get(i)+"'->"+temp.get(i).substring(x,temp.get(i).length()));
	      }
	 }
	 return result;
	}
}
