
public class RemoveConsecutiveEqualCharacters2ptr {
	
	public void stringOps(String str) {
		if(str.length()>2) {
			int i=0;int j=1;
			
			StringBuilder sb=new StringBuilder();
			while(j<str.length()) {
				//System.out.println(j);
				if(str.charAt(i)==str.charAt(j)) {
					if(i>0)
						sb.append(str.substring(0, i));
					//System.out.println("hi"+str.substring(j+1));
					sb.append(str.substring(j+1));
					//System.out.println(sb.toString());
					break;
				}else {
					i++;
					j++;
				}
			}
			if(j==str.length()) {
				System.out.println(str);
			}else {
				//System.out.println(sb.toString());
				stringOps(sb.toString());
			}
		}else {
			if(str.length()==2 && str.charAt(0)==str.charAt(1)) {
				System.out.println("no value");
			}
			else {
				System.out.println(str);
			}
		}
	}
	
	public static void main(String[] args) {
		RemoveConsecutiveEqualCharacters2ptr t2=new RemoveConsecutiveEqualCharacters2ptr();
	t2.stringOps("ccaabbdhh");
	}

}
