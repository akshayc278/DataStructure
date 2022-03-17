import java.util.Stack;

public class RemoveConsecutiveEqualCharacters{
	//aab
	public void reduceString(String str) {
		Stack<Character> st=new Stack<>();
		int i=0;
		//System.out.println(str+" str here");
//		int j=1;
//		if(str.length()<2)return str;
//		if(str.length()==2 && str.charAt(i)!=str.charAt(j))return str;
		StringBuilder sb=new StringBuilder();
		//System.out.println(i+" hi ");
		st.add(str.charAt(i));
		//System.out.println(str.charAt(i));
		i++;
		boolean flag=false;
		while(i<str.length()) {
			
			//System.out.println(flag+" "+str);
			if(st.peek().equals(str.charAt(i)))
			{
				flag=true;
				st.pop();
				while(!st.empty()) {
					sb.insert(0,String.valueOf(st.pop()));
				}
				i++;
				while(i<str.length()) {
					sb.append(String.valueOf(str.charAt(i)));
					i++;
				}
				//System.out.println(sb.toString());
			}else {
				st.push(str.charAt(i));
				i++;
			}
		}
		if(flag && sb.toString()!="" && str.length()!=2) {
			//System.out.println(sb.toString());
			reduceString(sb.toString());
		}
		else
		{
			if(str.length()==2 && str.charAt(0)==str.charAt(1)) {
				System.out.println("No value");
			}
			else { if(str.length()<2){
				System.out.println(str);
				}
			else {
				System.out.println(sb.toString());
			}
				
			}
		}
		//
		
	}
	public static void main(String[] args) {
		RemoveConsecutiveEqualCharacters testClass=new RemoveConsecutiveEqualCharacters();
		testClass.reduceString("ccaabbdhh");
	}
}
