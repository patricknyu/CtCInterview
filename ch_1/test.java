import java.util.Scanner;

public class test{
        public static void main(String args[]){
                Scanner sc = new Scanner(System.in);
                String str = sc.nextLine();

                String[] parts = str.split(" ");

                for (String s:parts){
                        System.out.println(s);
                }
        }
}
