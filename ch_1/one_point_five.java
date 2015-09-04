import java.util.Scanner;

public class one_point_five{
	public static void main(String args[]){
		System.out.println("Give me a string:");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		one_point_five instance = new one_point_five();
		System.out.println("Here's your output:");
		System.out.println(instance.their_solution_1(str));
		System.out.println(instance.my_attempt(str));
	}
	//My solution kind of sucked.
	//it was super slow.
	/*public String my_solution(String str){
		String answer = "";
		int count = 0;
		char last = '';
		str.toCharArray();
		for (int i = 0;i<str.length();i++){
			if(last ==str[i]){
				count++;
			}
			else{
				answer+=str[i-1] + String(count);
				count = 1;
				last = str[i];
			}

		}
		return answer;
	}*/
	public String my_attempt(String str){
		int count = 0;
		char current = ' ';
		StringBuffer sb = new StringBuffer();
		for (int i = 0;i<str.length();i++){
			if(str.charAt(i) == current){
				count++;}
			else{
				if (count !=0){
					sb.append(current);
					sb.append(count);
				}
				current = str.charAt(i);
				count = 1;
			}
		}
		sb.append(current);
		sb.append(count);
		if (sb.length()>=str.length()){
			return str;
		}
		return sb.toString();
	}
	//Simple helper method to count how big our compressed string will be.  
	//This runs quickly to ensure that we won't go thorugh our whole solution if the compressed string is too long.
	public int countCompression(String str){
		if (str == null||str.isEmpty()){
			return 0;
		}
		char last = str.charAt(0);
		int size = 0;
		int count = 1;
		for (int i = 0;i<str.length();i++){
			if (str.charAt(i) == last){
				count++;
			}
			else{
				last = str.charAt(i);
				size += 1 + String.valueOf(count).length();
				count = 1;
			}
		}
		size += 1 + String.valueOf(count).length();
		return size;
	}
	//Their solution runs faster than mine and uses a StringBuffer.
	//I really need to become more comfortable with using the Stringbuffer.
	public String their_solution_1(String str){
		int size = countCompression(str);
		if (size >= str.length()){
			return str;
		}

		StringBuffer mystr = new StringBuffer();
		char last = str.charAt(0);
		int count = 1;
		for (int i = 0;i< str.length();i++){
			if (str.charAt(i) == last){
				count++;
			}
			else{
				mystr.append(last);
				mystr.append(count);
				last = str.charAt(i);
				count = 1;
			}
		}
		mystr.append(last);
		mystr.append(count);
		return mystr.toString();
	}
}
