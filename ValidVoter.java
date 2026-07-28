import java.util.*;

       public class ValidVoter { 
            public static void main(String args[] ) throws Exception {
                Scanner sc=new Scanner(System.in);
                int num=sc.nextInt();
                if(num>=18) {
                    System.out.print("Valid Voter");
                }
                else if(num>=18) {
                    System.out.print("Invalid Voter");
                }
                else {
                    System.out.print("Wrong Input");
                }
            }
        }

