
import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        
        ArrayList <Integer> li=new ArrayList<>();
        li.add(10);
        li.add(20);
        li.add(1,19);

         ArrayList <Integer> li2=new ArrayList<>();
         li2.add(25);
         li2.addAll(li);

        for(int i=0;i<li.size();i++){
           System.out.print(li.get(i)+ " ");
        }

        

        System.out.println(li);
         System.out.println(li2);
    }
}
