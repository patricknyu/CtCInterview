import java.util.Scanner;

public class one_point_four{
	public static void main(String args[]){
	System.out.println("Question : Write a method to replace all spaces in a string with a %20?");
	System.out.println("Give me a string:");
	Scanner sc = new Scanner(System.in);
	String s = sc.nextLine();
	System.out.println("Give me a true length (integer):");
	int i = sc.nextInt();
	one_point_four instance = new one_point_four();
	char[] c = s.toCharArray();
	String answer = instance.my_solution(c,i);
	System.out.println(answer);
	
	}
	public String my_solution(char[] str, int len){
		int num_spaces = 0;
		for(int i = 0; i < len;i++){
			if (str[i]  == ' '){
				num_spaces ++;
			}
		}
		int real_len = len + num_spaces*2;
		for(int i = len-1; i>=0;i--){
			if (str[i] == ' '){
				str[real_len - 1] = '0';
				str[real_len - 2] = '2';
				str[real_len - 3] = '%';
				real_len-=3;
			}
			else{
				str[real_len - 1] = str[i];
				real_len --;
			}
		}
		String answer = new String(str);
		return answer;
	}
}
