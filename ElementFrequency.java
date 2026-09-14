
import java.util.*;

public class ElementFrequency {
    public static void main(String[] args) {
        
    
    Scanner sc=new Scanner(System.in);
    
    String str=sc.nextLine();

     str=str.toLowerCase();
     int arr[]=new int[26];
    for(int i=0;i<str.length();i++){
        int index=str.charAt(i)-'a';
        arr[index]=arr[index]+1;
        
    }
    for(int i=0;i<26;i++){
        char ch=(char)(97+i);
        System.out.println(ch+"->"+arr[i]);
    }
}
}