import java.util.Scanner;

/*
Implement an algorithm to determine if a string has all unique characters.  What if you cannot use additional data structures?"
*/

public class one_point_one{
        public static void main(String args[]){
                System.out.println("Question : Implement an algorithm to determine if a string has all unique characters.  What if you cannot use additional data structures?");
                System.out.println("Give me a string:");
                Scanner sc = new Scanner(System.in);
                String s = sc.nextLine();
                
                one_point_one instance = new one_point_one();

                System.out.println(instance.my_solution(s));

                //System.out.println(result);
        }
        
        public boolean my_solution(String str){
                
                int len = str.length();

                if (len >128){
                        return false;
                }

                for (int i = 0; i < len; i ++){
                        for (int j = 0; j <len; j++){
                                if (j != i){
                                        if (str.charAt(j) == str.charAt(i)){
                                                return false;}
                                }
                        }
                }
                return true;
        }
        //Their solution is faster, but takes more space (I think) 
        public boolean their_solution(String str){

                if (str.length() >128){
                        return false;
                }

                boolean[] char_set = new boolean[256];

                for (int i = 0; i <str.length();i++){
                        int val = str.charAt(i);
                        if (char_set[val]){
                                return false;
                        }
                        char_set[val] = true;
                }
                return true;
        }

        //Their second solution uses less space.  It assumes that we only get lower cased letters.
        public boolean their_solution2(String str){
                int checker = 0;
                for (int i = 0;i<str.length();i++){
                        int val = str.charAt(i) - 'a';
                        if ((checker & (1 << val)) > 0){
                                return false;
                        }
                        checker |= (1 << val);
                }
                return true;
        }
}
