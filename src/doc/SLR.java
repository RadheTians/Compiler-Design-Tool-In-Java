package doc;



public class SLR {
	static String[][] ir=new String[15][10];
	static String[][] il=new String[15][10];
	static String gl[]=new String[10],tempr[]=new String[15];
	static int in[]=new int[15];
	static String dfa[][]=new String[15][15];
	static String gr[]=new String[10],read[]=new String[15];
	static int n=0,a,l=0,i=0,rr=0,j=0,ns=0,p1,k,p,tn=0; 
	static String temp="\0",t1=null,temp2,templ,ptr;
	static String[] production;
	static String result;
	
	public static void slrMain(String[] production,int no){
    for(int z=0;z<no;z++) {
        gl[n]=production[z].substring(0,1);
        gr[n]=production[z].substring(2);
        n++;
    }  
    
    il[0][0]="Z";
    ir[0][0]=".S";
    in[0]++;
    l = 0;
    for(i=0;i<n;i++){
    	temp=ir[0][l].substring(1,2);
    	l++;
    	for(j=0;j<rr;j++)
    		{if(temp.equals(read[j].substring(0,1)))
    			{ 
    			break;}}
    if(j==rr){
    	read[rr]=temp;
    	rr++;}
    else
    	{
		  continue;}
    
	  for(j=0;j<n;j++){
		  
		  if(temp.equals(gl[j].trim())){
			  
			  ir[0][in[0]]=".";
			  ir[0][in[0]]=ir[0][in[0]].concat(gr[j]);
			  il[0][in[0]]=gl[j];
			  in[0]++;
			  
		  }
	  }
}
ns++;

result+="\nI"+(ns-1)+":";
for(int i=0;i<in[0];i++) 
	 
	 result+="\t"+(il[0][i])+"->"+(ir[0][i]);


for(l=0;l<ns;l++)

	 
	 canonical(l);

result+="\n\t\tDFA TABLE IS AS FOLLOWS\n\n\n";
for(i=0;i<ns;i++){
	result+="I"+i+":  ";
	for(j=0;j<ns;j++)
		if(dfa[i][j]!=(null))
			result+="'"+dfa[i][j]+"'->I"+j;
	result+="\n";

}
	//System.out.println(result);
	
	}
	@SuppressWarnings("null")
	private static void canonical(int l) {
		int t1=0,rr1=0,b;
		String read1[] = new String[15],ptr1;
		
		for(int i=0;i<in[l];i++){
			temp2=".";
			ir[l][i].trim();
	        b=ir[l][i].indexOf('.');
			ptr1=ir[l][i].substring(b,ir[l][i].length());
			t1=ir[l][i].length()-ptr1.length();
			if(t1+1==ir[l][i].length())
				continue;
			temp2=temp2+ir[l][i].charAt(t1+1);
			for(j=0;j<rr1;j=j+1)
				 if(temp2.equals(read1[j]))
                	  break;
			
			if(j==rr1){
				read1[rr1]=temp2;
			    rr1++;
			} else
				continue;
     		for(j=0;j<in[0];j++){
				if(ir[l][j]==null){
					p1=-1;
				    ptr=null;
				} else
					p1=ir[l][j].indexOf(temp2);
				
				if(p1==-1)
					ptr=null;
				else
					ptr=ir[l][j].substring(p1, temp2.length());
				if(ptr != null){
					if(templ==null)
						templ=il[l][j].substring(0,1);
					else
						templ=templ+il[l][j].charAt(0);
	                tempr[tn]=ir[l][j];
	                tn++;
			}
		}
			
		for(j=0;j<tn;j++){
			
			b=tempr[j].indexOf('.');
			ptr=tempr[j].substring(b);
			p=tempr[j].length()-ptr.length();
			StringBuffer str1=new StringBuffer(tempr[j]);
			str1.setCharAt(p,tempr[j].charAt(p+1));
			tempr[j]=str1.toString();
			str1.setCharAt(p+1,'.');
			tempr[j]=str1.toString();
	
			if(il[ns][in[ns]]==null)
				il[ns][in[ns]]=templ.substring(j,j+1);
		    else
		    	il[ns][in[ns]]=templ.substring(j,j+1);
			
			ir[ns][in[ns]]=tempr[j];
			in[ns]++;
		}
		
		moreprod();
		
		for(j=0;j<ns;j++){
			int g=compstruct(ns,j);
			if(g==1){
				il[ns][0]= null;
				StringBuffer str3,str4;
				for(k=0;k<in[ns];k++){
					str3=new StringBuffer(ir[ns][k]);
					str3.setCharAt(0, '\0');
					ir[ns][k]=str3.toString();
				}
				in[ns]=0;

				dfa[l][j]=temp2.substring(1,2);
				break;
			}
		}
		StringBuffer str5,str6;
		if(j<ns){   
			tn=0;
			for(j=0;j<15;j++){
				templ=null;
			    tempr[j]=null;
			}
			continue;
		}
		dfa[l][j]=temp2.substring(1,2);
		
		result+="\n\nI"+ns+":";
		for(j=0;j<in[ns];j++) 
			result+="\n\t"+il[ns][j]+"->"+ir[ns][j];
		ns++;
		tn=0;
		for(j=0;j<15;j++){
			templ=null;
			tempr[j]=null;
		}
	}
	}

	private static int compstruct(int y,int u) {

		int t;
		if(in[y]!=in[u])
			return 0;
		if(!il[y][0].equals(il[u][0]))
			return 0;
		for(t=0;t<in[y];t++)
			if(!ir[y][t].equals(ir[u][t]))
				return 0;
		return 1;
	}

	@SuppressWarnings("unused")
	private static void moreprod() {
		
		int t=0,r,s,l1=0,rr1=0,b;
		String read1[] = new String[15],ptr1;
		
		for(r=0;r<in[ns];r++){
			b=ir[ns][l1].indexOf('.');
			ptr1=ir[ns][l1].substring(b,ir[ns][l1].length());
			t=ir[ns][l1].length()-ptr1.length();
			if(t+1==ir[ns][l1].length()){
				l1++;
				continue;
			}
			temp=ir[ns][l1].substring(t+1,t+2);
			l1++;
			for(s=0;s<rr1;s++)
                  if(temp.equals(read1[s]))
                	  break;
			if(s==rr1){
				read1[rr1]=temp;
			    rr1++;
			}
			else
				continue;
			for(s=0;s<n;s++){
				if(gl[s].equals(temp)){
					ir[ns][in[ns]]=".";
					ir[ns][in[ns]]=ir[ns][in[ns]].concat(gr[s]);
                    il[ns][in[ns]]=gl[s];
                    in[ns]++;
				}
			}		
	   }
			
	}
}
