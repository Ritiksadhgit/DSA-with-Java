import java.util.*;
public class RansomNote {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int arr[]=new int[26];
       String str1=sc.nextLine();
       String str2=sc.nextLine();
     
       for(int i=0;i<str1.length();i++){
          arr[str1.charAt(i)-'a']++;
       }
        for(int i=0;i<str2.length();i++){
          arr[str2.charAt(i)-'a']--;
          if(arr[str2.charAt(i)-'a']<0){
             System.out.println("false");
              return;
          }
         
        
       }
       System.out.println("true");
    }
}