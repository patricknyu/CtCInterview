import java.util.*;

public class one_point_eight{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Give me a string:");
		String s1 = sc.nextLine();
		System.out.println("Give me a second string:");
		String s2 = sc.nextLine();

		one_point_eight instance = new one_point_eight();
		System.out.println(instance.their_solution(s1,s2));

	}
	public boolean isSubstring(String s1, String s2){
		int s1_len = s1.length();
		int s2_len = s2.length();
		if (s1_len > s2_len){
			for (int i = 0;i<= s1_len-s2_len;i++){
				if(s1.substring(i,s2_len+i).equals(s2)){
					return true;
				}
			}
		}
		else{
			for(int i =0;i<=s2_len-s1_len;i++){
				if(s2.substring(i,s1_len+i).equals(s1)){
					return true;
				}
			}
		}
		return false;
	}
	public boolean their_solution(String s1,String s2){
		int s1_len = s1.length();

		if(s1_len ==s2.length() && s1_len >0){
			String s1s1 = s1+s1;
			return isSubstring(s1s1,s2);
		}
		return false;
	}
}
