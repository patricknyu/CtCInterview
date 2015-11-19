import java.util.Arrays;
import java.util.Scanner;

//For their first soltuion, they sorted the strings.

//For their second solution was similar to mine.
public class one_point_three{
        public static void main(String args[]){
                Scanner sc = new Scanner(System.in);
                String[] strs = new String[2];

                for(int i = 0; i < strs.length; i++) {
                        System.out.println("Input string #" + i + ":");
                        strs[i] = sc.nextLine();
                }
                
                one_point_three instance = new one_point_three();
                boolean answer1 = instance.my_solution(strs[0],strs[1]);
                boolean answer2 = instance.their_solution(strs[0],strs[1]);

                System.out.println(answer1);
                System.out.println(answer2);
        }

        public boolean my_solution(String s1,String s2){
                if (s1 == s2){
                        return true;
                }

                else if (s1.length() != s2.length()){
                        return false;
                }

                else{
                        int[] counts1 = new int[256];
                        int[] counts2 = new int[256];
                        int val1,val2 = 0;
                        for (int i = 0;i<s1.length();i++){
                                val1 = s1.charAt(i);
                                val2 = s2.charAt(i);
                                counts1[val1]+= 1;
                                counts2[val2]+= 1;
                        }
                        return Arrays.equals(counts1,counts2);
                }
        }

        public boolean their_solution(String s1,String s2){
                if (s1.length() != s2.length()){
                        return false;
                }

                char[] content1 = s1.toCharArray();
                char[] content2 = s2.toCharArray();
                java.util.Arrays.sort(content1);
                java.util.Arrays.sort(content2);
                String str1 = new String(content1);
                String str2 = new String(content2);
                return str1.equals(str2);
        }
}
